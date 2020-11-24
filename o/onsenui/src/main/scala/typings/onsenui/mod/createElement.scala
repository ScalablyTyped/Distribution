package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onsenui", "createElement")
@js.native
object createElement extends js.Object {
  
  /**
    * @description Create a new element from a template. Both inline HTML and external files are supported although the return value differs.
    * @return If the provided template was an inline HTML string, it returns the new element. Otherwise, it returns a promise that resolves to the new element.
    */
  def apply(args: js.Any*): HTMLElement | js.Promise[HTMLElement] = js.native
}
