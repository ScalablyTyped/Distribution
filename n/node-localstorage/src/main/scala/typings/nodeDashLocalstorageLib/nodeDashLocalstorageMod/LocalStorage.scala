package typings
package nodeDashLocalstorageLib.nodeDashLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-localstorage", "LocalStorage")
@js.native
class LocalStorage protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Creates a new LocalStorage instance
       * @param location The location in which the local storage resides
       * @param quota The partitioned size of the local storage
       */
  def this(location: java.lang.String) = this()
  /**
       * Creates a new LocalStorage instance
       * @param location The location in which the local storage resides
       * @param quota The partitioned size of the local storage
       */
  def this(location: java.lang.String, quota: scala.Double) = this()
  /**
       * The number of keys in the local storage.
       */
  var length: scala.Double = js.native
  /**
       * Clears the local storage
       */
  def clear(): scala.Unit = js.native
  /**
       * Gets the value of the given [key]
       * @param key The key whose value you want to retrieve.
       */
  def getItem(key: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * Retrieves the value of the key at the [index].
       * @param index The index of the key in which you want to return the value of.
       */
  def key(index: scala.Double): java.lang.String = js.native
  /**
       * Internal event `storage` is fired on the `removeItem`, `setItem` and `clear` methods, if subscribed.
       * @param eventName The only `eventName` that is supported is `storage`.
       * @param callback The call back type is of `StorageEvent`.
       */
  @JSName("on")
  def on_storage(
    eventName: nodeDashLocalstorageLib.nodeDashLocalstorageLibStrings.storage,
    callback: js.Function1[/* event */ StorageEvent, scala.Unit]
  ): this.type = js.native
  /**
       * Removes the specified [key] from local storage.
       * @param key The key you want to remove.
       */
  def removeItem(key: java.lang.String): scala.Unit = js.native
  /**
       * Stores a `key` and it's `value` in to the local store.
       * @param key Unique identifier for the new local storage item
       * @param value The value of the item
       */
  def setItem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

