package typings.officeDashJsDashPreview.OfficeExtensionNs

import typings.officeDashJsDashPreview.OfficeNs.IPromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeExtension")
@js.native
object ^ extends js.Object {
  /**
    * A Promise object that represents a deferred interaction with the host Office application. 
    * The publicly-consumable OfficeExtension.Promise is available starting in ExcelApi 1.2 and WordApi 1.2. 
    * Promises can be chained via ".then", and errors can be caught via ".catch". 
    * Remember to always use a ".catch" on the outer promise, and to return intermediary promises so as not to break the promise chain. 
    * When a browser-provided native Promise implementation is available, OfficeExtension.Promise will switch to use the native Promise instead.
    */
  val Promise: IPromiseConstructor = js.native
}

