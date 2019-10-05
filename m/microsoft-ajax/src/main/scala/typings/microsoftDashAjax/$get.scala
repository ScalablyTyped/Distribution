package typings.microsoftDashAjax

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$get")
@js.native
object $get extends js.Object {
  /**
  * Provides a shortcut to the getElementById method of the HTMLElement class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397717(v=vs.100).aspx}
  * @param id
  *           The ID of the DOM element to find.
  * @param element
  *           The parent element to search. The default is the document element.
  * @return
  *   The  HTMLElement
  */
  def apply(id: java.lang.String): HTMLElement = js.native
  def apply(id: java.lang.String, element: HTMLElement): HTMLElement = js.native
}

