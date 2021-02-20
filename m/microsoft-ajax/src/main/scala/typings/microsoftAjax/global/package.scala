package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  /*
  * Provides a shortcut to the addHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311019(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the event.
  * @param handler The event handler to add.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  @scala.inline
  def addHandler(
    element: typings.std.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addHandler(
    element: typings.std.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit],
    autoRemove: scala.Boolean
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
  * Provides a shortcut to the addHandlers method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384012(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param events A dictionary of events and their handlers.
  * @param handlerOwner (Optional) The object instance that is the context for the delegates that should be created from the handlers.
  * @param autoRemove (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
  */
  @scala.inline
  def addHandlers(
    element: typings.std.HTMLElement,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addHandlers(
    element: typings.std.HTMLElement,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]],
    handlerOwner: js.UndefOr[scala.Nothing],
    autoRemove: scala.Boolean
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addHandlers(
    element: typings.std.HTMLElement,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]],
    handlerOwner: js.Any
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addHandlers(
    element: typings.std.HTMLElement,
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]],
    handlerOwner: js.Any,
    autoRemove: scala.Boolean
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
  * Provides a shortcut to the clearHandlers method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * For details about the method that this shortcut represents, see Sys.UI.DomEvent clearHandlers Method.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310959(v=vs.100).aspx}
  * @param The DOM element that exposes the events.
  */
  @scala.inline
  def clearHandlers(element: typings.std.HTMLElement): scala.Unit = js.Dynamic.global.applyDynamic("$clearHandlers")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def create(`type`: typings.microsoftAjax.Type): typings.microsoftAjax.Sys.Component = js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.UndefOr[scala.Nothing],
    references: js.UndefOr[scala.Nothing],
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.UndefOr[scala.Nothing],
    references: js.Any
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.UndefOr[scala.Nothing],
    references: js.Any,
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(`type`: typings.microsoftAjax.Type, properties: js.UndefOr[scala.Nothing], events: js.Any): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.Any,
    references: js.UndefOr[scala.Nothing],
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.Any,
    references: js.Any
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.UndefOr[scala.Nothing],
    events: js.Any,
    references: js.Any,
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(`type`: typings.microsoftAjax.Type, properties: js.Any): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.Any,
    events: js.UndefOr[scala.Nothing],
    references: js.UndefOr[scala.Nothing],
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.Any,
    events: js.UndefOr[scala.Nothing],
    references: js.Any
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.Any,
    events: js.UndefOr[scala.Nothing],
    references: js.Any,
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(`type`: typings.microsoftAjax.Type, properties: js.Any, events: js.Any): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.Any,
    events: js.Any,
    references: js.UndefOr[scala.Nothing],
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(`type`: typings.microsoftAjax.Type, properties: js.Any, events: js.Any, references: js.Any): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def create(
    `type`: typings.microsoftAjax.Type,
    properties: js.Any,
    events: js.Any,
    references: js.Any,
    element: typings.std.HTMLElement
  ): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  
  /**
  * Returns the specified Component object. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397441(v=vs.100).aspx}
  * @param id A string that contains the ID of the component to find.
  * @param parent (Optional) The component or element that contains the component to find.
  * @return A Component object that contains the component requested by ID, if found; otherwise, null.
  */
  @scala.inline
  def find(id: java.lang.String): typings.microsoftAjax.Sys.Component = js.Dynamic.global.applyDynamic("$find")(id.asInstanceOf[js.Any]).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def find(id: java.lang.String, parent: typings.microsoftAjax.Sys.Component): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$find")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  @scala.inline
  def find(id: java.lang.String, parent: typings.std.HTMLElement): typings.microsoftAjax.Sys.Component = (js.Dynamic.global.applyDynamic("$find")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  
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
  @scala.inline
  def get(id: java.lang.String): typings.std.HTMLElement = js.Dynamic.global.applyDynamic("$get")(id.asInstanceOf[js.Any]).asInstanceOf[typings.std.HTMLElement]
  @scala.inline
  def get(id: java.lang.String, element: typings.std.HTMLElement): typings.std.HTMLElement = (js.Dynamic.global.applyDynamic("$get")(id.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.std.HTMLElement]
  
  /**
  * Provides a shortcut to the removeHandler method of the Sys.UI.DomEvent class. This member is static and can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397510(v=vs.100).aspx}
  * @param element The DOM element that exposes the event.
  * @param eventName The name of the DOM event.
  * @param handler The event handler to remove.
  */
  @scala.inline
  def removeHandler(
    element: typings.std.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("$removeHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
