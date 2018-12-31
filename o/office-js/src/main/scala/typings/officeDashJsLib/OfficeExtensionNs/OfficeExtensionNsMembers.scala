package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeExtension")
@js.native
object OfficeExtensionNsMembers extends js.Object {
  /**
    * A Promise object that represents a deferred interaction with the host Office application. 
    * The publicly-consumable {@link Office.OfficeExtension.Promise} is available starting in ExcelApi 1.2 and WordApi 1.2. 
    * Promises can be chained via ".then", and errors can be caught via ".catch". 
    * Remember to always use a ".catch" on the outer promise, and to return intermediary promises so as not to break the promise chain. 
    * When a browser-provided native Promise implementation is available, OfficeExtension.Promise will switch to use the native Promise instead.
    */
  val Promise: officeDashJsLib.OfficeNs.IPromiseConstructor = js.native
  /** Configuration */
  var config: officeDashJsLib.Anon_ExtendedErrorLogging = js.native
}

