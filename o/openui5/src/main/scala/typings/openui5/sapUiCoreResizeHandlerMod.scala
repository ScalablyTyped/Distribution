package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreResizeHandlerMod extends Shortcut {
  
  @JSImport("sap/ui/core/ResizeHandler", JSImport.Default)
  @js.native
  val default: ResizeHandler = js.native
  
  /**
    * The resize handling API provides firing of resize events on all browsers by regularly checking the width
    * and height of registered DOM elements or controls and firing events accordingly.
    *
    * **Note**: The public usage of the constructor is deprecated since 1.103.0. Please use the static module
    * export directly.
    */
  @js.native
  trait ResizeHandler extends StObject {
    
    /**
      * Deregisters a previously registered handler for resize events with the given registration ID.
      */
    def deregister(
      /**
      * The registration ID of the handler to deregister. The ID was provided by function {@link sap.ui.core.ResizeHandler.register}
      * when the handler was registered.
      */
    sId: String
    ): Unit = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.ResizeHandler with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    def extend(/**
      * Name of the class being created
      */
    sClassName: String): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    
    /**
      * Returns a metadata object for class sap.ui.core.ResizeHandler.
      *
      * @returns Metadata object describing this class
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
    
    def register(
      /**
      * The control or the DOM reference for which the given event handler should be registered (beside the window)
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The event handler which should be called whenever the size of the given reference is changed. The event
      * object is passed as first argument to the event handler. See the description of this function for more
      * details about the available parameters of this event.
      */
    fHandler: js.Function
    ): String | Null = js.native
    /**
      * Registers the given event handler for resize events on the given DOM element or control.
      *
      * **Note:** This function must not be used before the UI5 framework is initialized. Please use the {@link
      * sap.ui.core.Core#attachInit init event} of UI5 if you are not sure whether this is the case.
      *
      * The resize handler periodically checks the dimensions of the registered reference. Whenever it detects
      * changes, an event is fired. Be careful when changing dimensions within the event handler which might
      * cause another resize event and so on.
      *
      * The available parameters of the resize event are:
      * 	 - `oEvent.target`: The DOM element of which the dimensions were checked
      * 	 - `oEvent.size.width`: The current width of the DOM element in pixels
      * 	 - `oEvent.size.height`: The current height of the DOM element in pixels
      * 	 - `oEvent.oldSize.width`: The previous width of the DOM element in pixels
      * 	 - `oEvent.oldSize.height`: The previous height of the DOM element in pixels
      * 	 - `oEvent.control`: The control which was given during registration of the event handler (if present)
      *
      *
      * @returns A registration ID which can be used for deregistering the event handler, see {@link sap.ui.core.ResizeHandler.deregister}.
      * If the UI5 framework is not yet initialized `null` is returned.
      */
    def register(
      /**
      * The control or the DOM reference for which the given event handler should be registered (beside the window)
      */
    oRef: Element,
      /**
      * The event handler which should be called whenever the size of the given reference is changed. The event
      * object is passed as first argument to the event handler. See the description of this function for more
      * details about the available parameters of this event.
      */
    fHandler: js.Function
    ): String | Null = js.native
  }
  
  type _To = ResizeHandler
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreResizeHandlerMod.foo` */
  override def _to: ResizeHandler = default
}
