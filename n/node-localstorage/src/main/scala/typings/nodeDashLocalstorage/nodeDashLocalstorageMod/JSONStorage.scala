package typings.nodeDashLocalstorage.nodeDashLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-localstorage", "JSONStorage")
@js.native
class JSONStorage protected () extends LocalStorage {
  /**
    * Creates a new LocalStorage instance
    * @param location The location in which the local storage resides
    * @param quota The partitioned size of the local storage
    */
  def this(location: String) = this()
  def this(location: String, quota: Double) = this()
  /**
    * Stores a `key` and it's `value` in to the local store. The given `value` will have `JSON.stringify` performed on it prior to storing.
    * @param key Unique identifier for the new local storage item
    * @param value The value associated with the `key`. This `setItem` method performs a `JSON.stringify` on the value before storage. The `value` *must* be a valid `JSON` object.
    */
  def setItem(key: String, value: js.Any): Unit = js.native
}

