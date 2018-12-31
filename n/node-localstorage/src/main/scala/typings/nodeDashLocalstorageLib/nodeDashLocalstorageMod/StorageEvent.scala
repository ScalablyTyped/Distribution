package typings
package nodeDashLocalstorageLib.nodeDashLocalstorageMod

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
  def this(key: java.lang.String, oldValue: java.lang.String, newValue: java.lang.String, url: java.lang.String, storageArea: java.lang.String) = this()
  /**
    * Affected `key`.
    */
  var key: java.lang.String = js.native
  /**
    * Current `value` associated with the `key`.
    */
  var newValue: java.lang.String = js.native
  /**
    * Previous `value` associated with the `key`.
    */
  var oldValue: java.lang.String = js.native
  /**
    * The location of the storage area. Defaults to `localStorage`.
    */
  var storageArea: java.lang.String = js.native
  /**
    * The current `process.pid` for the calling process.
    */
  var url: java.lang.String = js.native
}

