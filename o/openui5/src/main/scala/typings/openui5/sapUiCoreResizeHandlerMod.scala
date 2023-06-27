package typings.openui5

import typings.openui5.anon.OldSize
import typings.openui5.sap.ClassInfo
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreResizeHandlerMod {
  
  @JSImport("sap/ui/core/ResizeHandler", JSImport.Default)
  @js.native
  open class default ()
    extends typings.openui5.sapUiBaseObjectMod.default
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ResizeHandler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deregisters a previously registered handler for resize events with the given registration ID.
      */
    inline def deregister(
      /**
      * The registration ID of the handler to deregister. The ID was provided by function {@link sap.ui.core.ResizeHandler.register }
      * when the handler was registered.
      */
    sId: String
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregister")(sId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @deprecated (since 1.110) - As the class nature of ResizeHandler is deprecated since 1.103, the `extend`
      * method shouldn't be called either
      *
      * Creates a new subclass of class `sap.ui.core.ResizeHandler`.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
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
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResizeHandler]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResizeHandler],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * @deprecated (since 1.110) - As the class nature of ResizeHandler is deprecated since 1.103, the `getMetadata`
      * method shouldn't be called either
      *
      * Returns a metadata object for class `sap.ui.core.ResizeHandler`.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    inline def register(
      /**
      * The control or the DOM reference for which the given event handler should be registered (beside the window)
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The event handler which should be called whenever the size of the given reference is changed. The event
      * object is passed as first argument to the event handler. See the description of this function for more
      * details about the available parameters of this event.
      */
    fnHandler: js.Function1[/* p1 */ OldSize, Unit]
    ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(oRef.asInstanceOf[js.Any], fnHandler.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    /**
      * Registers the given event handler for resize events on the given DOM element or control.
      *
      * **Note:** This function must not be used before the UI5 framework is initialized. Please use the {@link sap.ui.core.Core#attachInit init event }
      * of UI5 if you are not sure whether this is the case.
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
    inline def register(
      /**
      * The control or the DOM reference for which the given event handler should be registered (beside the window)
      */
    oRef: Element,
      /**
      * The event handler which should be called whenever the size of the given reference is changed. The event
      * object is passed as first argument to the event handler. See the description of this function for more
      * details about the available parameters of this event.
      */
    fnHandler: js.Function1[/* p1 */ OldSize, Unit]
    ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(oRef.asInstanceOf[js.Any], fnHandler.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
  type ResizeHandler = typings.openui5.sapUiBaseObjectMod.default
}
