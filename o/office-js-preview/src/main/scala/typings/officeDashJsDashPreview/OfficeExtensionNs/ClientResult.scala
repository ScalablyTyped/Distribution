package typings.officeDashJsDashPreview.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
@JSGlobal("OfficeExtension.ClientResult")
@js.native
class ClientResult[T] () extends js.Object {
  /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
  var value: T = js.native
}

