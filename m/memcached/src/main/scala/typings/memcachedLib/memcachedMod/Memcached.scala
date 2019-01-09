package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memcached
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Add the value, only if it's not in memcached already.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def add(
    key: java.lang.String,
    value: js.Any,
    lifetime: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Add the given value string to the value of an existing item.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def append(
    key: java.lang.String,
    value: js.Any,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Inspect cache, see examples for a detailed explanation.
    */
  def cachedump(
    server: java.lang.String,
    slabid: scala.Double,
    number: scala.Double,
    cb: js.Function2[
      /* err */ js.Any, 
      /* cachedump */ memcachedLib.memcachedMod.MemcachedNs.CacheDumpData | js.Array[memcachedLib.memcachedMod.MemcachedNs.CacheDumpData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Add the value, only if it matches the given CAS value.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def cas(
    key: java.lang.String,
    value: js.Any,
    cas: java.lang.String,
    lifetime: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Decrement a given key.
    * @param key The key
    * @param amount The decrement
    */
  def decr(
    key: java.lang.String,
    amount: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean | scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Remove the key from memcached.
    * @param key The key
    */
  def del(
    key: java.lang.String,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Closes all active memcached connections.
    */
  def end(): scala.Unit = js.native
  /**
    * Flushes the memcached server.
    */
  def flush(
    cb: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* err */ js.Any, 
      /* results */ js.Array[scala.Boolean], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the value for the given key.
    * @param key The key
    */
  def get(
    key: java.lang.String,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves a bunch of values from multiple keys.
    * @param keys all the keys that needs to be fetched
    */
  def getMulti(
    keys: js.Array[java.lang.String],
    cb: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* err */ js.Any, 
      /* data */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the value and the CAS id.
    * @param key The key
    */
  def gets(
    key: java.lang.String,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* data */ memcachedLib.Anon_Cas, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Increment a given key.
    * @param key The key
    * @param amount The increment
    */
  def incr(
    key: java.lang.String,
    amount: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean | scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves stats items information.
    */
  def items(
    cb: js.Function2[
      /* err */ js.Any, 
      /* stats */ js.Array[memcachedLib.memcachedMod.MemcachedNs.StatusData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Register event listener
    */
  def on(
    event: memcachedLib.memcachedMod.MemcachedNs.EventNames,
    cb: js.Function1[/* err */ memcachedLib.memcachedMod.MemcachedNs.IssueData, scala.Unit]
  ): this.type = js.native
  /**
    * Add the given value string to the value of an existing item.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def prepend(
    key: java.lang.String,
    value: js.Any,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Replaces the value in memcached.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def replace(
    key: java.lang.String,
    value: js.Any,
    lifetime: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Stores a new value in Memcached.
    *
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def set(
    key: java.lang.String,
    value: js.Any,
    lifetime: scala.Double,
    cb: js.ThisFunction2[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      /* result */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves your stats settings.
    */
  def settings(
    cb: js.Function2[
      /* err */ js.Any, 
      /* settings */ js.Array[memcachedLib.memcachedMod.MemcachedNs.StatusData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves stats slabs information.
    */
  def slabs(
    cb: js.Function2[
      /* err */ js.Any, 
      /* stats */ js.Array[memcachedLib.memcachedMod.MemcachedNs.StatusData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves stats from your memcached server.
    */
  def stats(
    cb: js.Function2[
      /* err */ js.Any, 
      /* stats */ js.Array[memcachedLib.memcachedMod.MemcachedNs.StatusData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Touches the given key.
    * @param key The key
    * @param lifetime After how long should the key expire measured in seconds
    */
  def touch(
    key: java.lang.String,
    lifetime: scala.Double,
    cb: js.ThisFunction1[
      /* this */ memcachedLib.memcachedMod.MemcachedNs.CommandData, 
      /* err */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves the version number of your server.
    */
  def version(
    cb: js.Function2[
      /* err */ js.Any, 
      /* version */ js.Array[memcachedLib.memcachedMod.MemcachedNs.VersionData], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

