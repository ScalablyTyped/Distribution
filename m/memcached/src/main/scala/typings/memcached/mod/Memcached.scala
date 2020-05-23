package typings.memcached.mod

import org.scalablytyped.runtime.StringDictionary
import typings.memcached.anon.Dictkey
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memcached extends EventEmitter {
  /**
    * Add the value, only if it's not in memcached already.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def add(
    key: String,
    value: js.Any,
    lifetime: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Add the given value string to the value of an existing item.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def append(
    key: String,
    value: js.Any,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Inspect cache, see examples for a detailed explanation.
    */
  def cachedump(
    server: String,
    slabid: Double,
    number: Double,
    cb: js.Function2[/* err */ js.Any, /* cachedump */ CacheDumpData | js.Array[CacheDumpData], Unit]
  ): Unit = js.native
  /**
    * Add the value, only if it matches the given CAS value.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def cas(
    key: String,
    value: js.Any,
    cas: String,
    lifetime: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Decrement a given key.
    * @param key The key
    * @param amount The decrement
    */
  def decr(
    key: String,
    amount: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean | Double, Unit]
  ): Unit = js.native
  /**
    * Remove the key from memcached.
    * @param key The key
    */
  def del(
    key: String,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Closes all active memcached connections.
    */
  def end(): Unit = js.native
  /**
    * Flushes the memcached server.
    */
  def flush(
    cb: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* err */ js.Any, 
      /* results */ js.Array[Boolean], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Get the value for the given key.
    * @param key The key
    */
  def get(
    key: String,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* data */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves a bunch of values from multiple keys.
    * @param keys all the keys that needs to be fetched
    */
  def getMulti(
    keys: js.Array[String],
    cb: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* err */ js.Any, 
      /* data */ StringDictionary[js.Any], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Get the value and the CAS id.
    * @param key The key
    */
  def gets(
    key: String,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* data */ Dictkey, Unit]
  ): Unit = js.native
  /**
    * Increment a given key.
    * @param key The key
    * @param amount The increment
    */
  def incr(
    key: String,
    amount: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean | Double, Unit]
  ): Unit = js.native
  /**
    * Retrieves stats items information.
    */
  def items(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
  /**
    * Register event listener
    */
  def on(event: EventNames, cb: js.Function1[/* err */ IssueData, Unit]): this.type = js.native
  /**
    * Add the given value string to the value of an existing item.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def prepend(
    key: String,
    value: js.Any,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Replaces the value in memcached.
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def replace(
    key: String,
    value: js.Any,
    lifetime: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Stores a new value in Memcached.
    *
    * @param key The key
    * @param value Either a buffer, JSON, number or string that you want to store.
    */
  def set(
    key: String,
    value: js.Any,
    lifetime: Double,
    cb: js.ThisFunction2[/* this */ CommandData, /* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
  /**
    * Retrieves your stats settings.
    */
  def settings(cb: js.Function2[/* err */ js.Any, /* settings */ js.Array[StatusData], Unit]): Unit = js.native
  /**
    * Retrieves stats slabs information.
    */
  def slabs(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
  /**
    * Retrieves stats from your memcached server.
    */
  def stats(cb: js.Function2[/* err */ js.Any, /* stats */ js.Array[StatusData], Unit]): Unit = js.native
  /**
    * Touches the given key.
    * @param key The key
    * @param lifetime After how long should the key expire measured in seconds
    */
  def touch(
    key: String,
    lifetime: Double,
    cb: js.ThisFunction1[/* this */ CommandData, /* err */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Retrieves the version number of your server.
    */
  def version(cb: js.Function2[/* err */ js.Any, /* version */ js.Array[VersionData], Unit]): Unit = js.native
}

