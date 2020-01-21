package typings.microsoftAjax

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$addHandler")
@js.native
object addHandler extends js.Object {
  /*
  * Provides a shortcut to the addHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311019(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the event.
  * @param handler The event handler to add.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  def apply(element: HTMLElement, eventName: java.lang.String, handler: js.Function1[/* e */ DomEvent, Unit]): Unit = js.native
  def apply(
    element: HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ DomEvent, Unit],
    autoRemove: Boolean
  ): Unit = js.native
}

