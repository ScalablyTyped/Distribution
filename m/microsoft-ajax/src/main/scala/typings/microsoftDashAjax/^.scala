package typings.microsoftDashAjax

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftDashAjax.SysNs.Component
import typings.microsoftDashAjax.SysNs.UINs.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /*
  * Provides a shortcut to the addHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311019(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the event.
  * @param handler The event handler to add.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  @JSName("$addHandler")
  def $addHandler(element: HTMLElement, eventName: java.lang.String, handler: js.Function1[/* e */ DomEvent, Unit]): Unit = js.native
  @JSName("$addHandler")
  def $addHandler(
    element: HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ DomEvent, Unit],
    autoRemove: Boolean
  ): Unit = js.native
  /**
  * Provides a shortcut to the addHandlers method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384012(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param events A dictionary of events and their handlers.
  * @param handlerOwner (Optional) The object instance that is the context for the delegates that should be created from the handlers.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  @JSName("$addHandlers")
  def $addHandlers(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]]): Unit = js.native
  @JSName("$addHandlers")
  def $addHandlers(
    element: HTMLElement,
    events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]],
    handlerOwner: js.Any
  ): Unit = js.native
  @JSName("$addHandlers")
  def $addHandlers(
    element: HTMLElement,
    events: StringDictionary[js.Function1[/* e */ DomEvent, Unit]],
    handlerOwner: js.Any,
    autoRemove: Boolean
  ): Unit = js.native
  /**
  * Provides a shortcut to the clearHandlers method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * For details about the method that this shortcut represents, see Sys.UI.DomEvent clearHandlers Method.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310959(v=vs.100).aspx}
  * @param The DOM element that exposes the events.
  */
  @JSName("$clearHandlers")
  def $clearHandlers(element: HTMLElement): Unit = js.native
  //#endregion
  //#region Shortcuts to commonly used APIs
  /**
  * Creates and initializes a component of the specified type. This method is static and can be called without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397487(v=vs.100).aspx}
  *
  * @param type
  *           The type of the component to create.
  * @param properties
  *           (Optional) A JSON object that describes the properties and their values.
  * @param events
  *           (Optional) A JSON object that describes the events and their handlers.
  * @param references
  *           (Optional) A JSON object that describes the properties that are references to other components.
  * @param element
  *           (Optional) The DOM element that the component should be attached to.
  * @returns A new instance of a component that uses the specified parameters.
  */
  @JSName("$create")
  def $create(`type`: Type): Component = js.native
  @JSName("$create")
  def $create(`type`: Type, properties: js.Any): Component = js.native
  @JSName("$create")
  def $create(`type`: Type, properties: js.Any, events: js.Any): Component = js.native
  @JSName("$create")
  def $create(`type`: Type, properties: js.Any, events: js.Any, references: js.Any): Component = js.native
  @JSName("$create")
  def $create(`type`: Type, properties: js.Any, events: js.Any, references: js.Any, element: HTMLElement): Component = js.native
  /**
  * Returns the specified Component object. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397441(v=vs.100).aspx}
  * @param id A string that contains the ID of the component to find.
  * @param parent (Optional) The component or element that contains the component to find.
  * @return A Component object that contains the component requested by ID, if found; otherwise, null.
  */
  @JSName("$find")
  def $find(id: java.lang.String): Component = js.native
  @JSName("$find")
  def $find(id: java.lang.String, parent: Component): Component = js.native
  @JSName("$find")
  def $find(id: java.lang.String, parent: HTMLElement): Component = js.native
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
  @JSName("$get")
  def $get(id: java.lang.String): HTMLElement = js.native
  @JSName("$get")
  def $get(id: java.lang.String, element: HTMLElement): HTMLElement = js.native
  /**
  * Provides a shortcut to the removeHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397510(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the DOM event.
  * @param handler The event handler to remove.
  */
  @JSName("$removeHandler")
  def $removeHandler(element: HTMLElement, eventName: java.lang.String, handler: js.Function1[/* e */ DomEvent, Unit]): Unit = js.native
}

