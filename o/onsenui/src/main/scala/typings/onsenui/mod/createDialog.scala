package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onsenui", "createDialog")
@js.native
object createDialog extends js.Object {
  /**
    * @description Create a dialog instance from a template.
    * @return Promise object that resolves to the dialog component object.
    */
  def apply(page: String): js.Promise[HTMLElement] = js.native
  def apply(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
}

