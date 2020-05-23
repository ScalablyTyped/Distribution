package typings.microsoftAjax.global

import typings.microsoftAjax.Sys.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$find")
@js.native
object find extends js.Object {
  /**
  * Returns the specified Component object. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397441(v=vs.100).aspx}
  * @param id A string that contains the ID of the component to find.
  * @param parent (Optional) The component or element that contains the component to find.
  * @return A Component object that contains the component requested by ID, if found; otherwise, null.
  */
  def apply(id: String): Component = js.native
  def apply(id: String, parent: Component): Component = js.native
  def apply(id: String, parent: HTMLElement): Component = js.native
}

