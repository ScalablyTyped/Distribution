package typings.microsoftAjax.global

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$addHandlers")
@js.native
object addHandlers extends js.Object {
  /**
  * Provides a shortcut to the addHandlers method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384012(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param events A dictionary of events and their handlers.
  * @param handlerOwner (Optional) The object instance that is the context for the delegates that should be created from the handlers.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  def apply(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]]): Unit = js.native
  def apply(
    element: HTMLElement,
    events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]],
    handlerOwner: js.Any
  ): Unit = js.native
  def apply(
    element: HTMLElement,
    events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]],
    handlerOwner: js.Any,
    autoRemove: Boolean
  ): Unit = js.native
}

