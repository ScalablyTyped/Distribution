package typings.nanoajax.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoajax", "ajax")
@js.native
object ajax extends js.Object {
  def apply(params: RequestParameters, callback: Callback): XMLHttpRequest = js.native
}

