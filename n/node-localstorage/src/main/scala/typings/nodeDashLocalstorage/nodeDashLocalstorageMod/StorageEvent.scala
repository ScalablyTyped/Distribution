package typings.nodeDashLocalstorage.nodeDashLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-localstorage", "StorageEvent")
@js.native
class StorageEvent protected () extends js.Object {
  /**
    * Creates an object containing information regarding a `storage` event.
    * @param key Affected `key`.
    * @param oldValue Previous `value` associated with the `key`.
    * @param newValue Current `value` associated with the `key`.
    * @param url The current `process.pid` for the calling process.
    * @param storageArea The location of the storage area. Defaults to `localStorage`.
    */
  def this(key: String, oldValue: String, newValue: String, url: String, storageArea: String) = this()
  /**
    * Affected `key`.
    */
  var key: String = js.native
  /**
    * Current `value` associated with the `key`.
    */
  var newValue: String = js.native
  /**
    * Previous `value` associated with the `key`.
    */
  var oldValue: String = js.native
  /**
    * The location of the storage area. Defaults to `localStorage`.
    */
  var storageArea: String = js.native
  /**
    * The current `process.pid` for the calling process.
    */
  var url: String = js.native
}

