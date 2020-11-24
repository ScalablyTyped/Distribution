package typings.microsoftAjax.global

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("$removeHandler")
@js.native
object removeHandler extends js.Object {
  
  /**
  * Provides a shortcut to the removeHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397510(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the DOM event.
  * @param handler The event handler to remove.
  */
  def apply(element: HTMLElement, eventName: String, handler: js.Function1[/* e */ DomEvent, Unit]): Unit = js.native
}
