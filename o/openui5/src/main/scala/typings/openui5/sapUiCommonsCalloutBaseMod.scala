package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreLibraryMod.Dock
import typings.openui5.sapUiCoreTooltipBaseMod.TooltipBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsCalloutBaseMod {
  
  @JSImport("sap/ui/commons/CalloutBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CalloutBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalloutBase {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CalloutBaseSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: CalloutBaseSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CalloutBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/CalloutBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.CalloutBase with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.TooltipBase.extend}.
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
    oClassInfo: ClassInfo[T, CalloutBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalloutBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.CalloutBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalloutBase
    extends typings.openui5.sapUiCoreTooltipBaseMod.default {
    
    /**
      * Adjust position of the already opened Callout window. Call this method each time when the size of the
      * opened Callout window may be changed due to new or changed contents.
      */
    def adjustPosition(): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Event is fired before a Callout is displayed. Call the preventDefault method of the event object to postpone
      * opening. Application may use this event to start asynchronous Ajax call to load the Callout content
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Event is fired before a Callout is displayed. Call the preventDefault method of the event object to postpone
      * opening. Application may use this event to start asynchronous Ajax call to load the Callout content
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Event is fired when the Callout window is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Event is fired when the Callout window is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * The event is fired when the popup is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * The event is fired when the popup is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.11.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Is fired when the Callout has been opened
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.11.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.commons.CalloutBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.CalloutBase` itself.
      *
      * Is fired when the Callout has been opened
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.CalloutBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes Callout
      */
    def close(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.commons.CalloutBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit]
    ): this.type = js.native
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseBeforeOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.commons.CalloutBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:open open} event of this `sap.ui.commons.CalloutBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit]
    ): this.type = js.native
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ CalloutBaseOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.11.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:opened opened} event of this `sap.ui.commons.CalloutBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeOpen(): Boolean = js.native
    def fireBeforeOpen(
      /**
      * Parameters to pass along with the event
      */
    mParameters: CalloutBase$BeforeOpenEventParameters
    ): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:open open} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpen(): this.type = js.native
    def fireOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: CalloutBase$OpenEventParameters): this.type = js.native
    
    /**
      * @since 1.11.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:opened opened} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpened(): this.type = js.native
    def fireOpened(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Set position of the Callout window relative to the parent control. This function automatically calculates
      * and sets the correct offset, use it instead of `setMyPosition/setAtPosition`.
      *
      * @returns `this` to allow method chaining
      */
    def setPosition(
      /**
      * docking position of the Callout
      */
    myPosition: Dock,
      /**
      * docking position of the parent control
      */
    atPosition: Dock
    ): this.type = js.native
  }
  
  trait CalloutBase$BeforeOpenEventParameters extends StObject {
    
    /**
      * Parent control that has this Callout as a tooltip
      */
    var parent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object CalloutBase$BeforeOpenEventParameters {
    
    inline def apply(): CalloutBase$BeforeOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalloutBase$BeforeOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalloutBase$BeforeOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setParent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  trait CalloutBase$CloseEventParameters extends StObject
  
  trait CalloutBase$OpenEventParameters extends StObject {
    
    /**
      * Parent control that has this Callout as a tooltip
      */
    var parent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object CalloutBase$OpenEventParameters {
    
    inline def apply(): CalloutBase$OpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalloutBase$OpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalloutBase$OpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setParent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  trait CalloutBase$OpenedEventParameters extends StObject
  
  type CalloutBaseBeforeOpenEvent = typings.openui5.sapUiBaseEventMod.default[CalloutBase$BeforeOpenEventParameters]
  
  type CalloutBaseBeforeOpenEventParameters = CalloutBase$BeforeOpenEventParameters
  
  type CalloutBaseCloseEvent = typings.openui5.sapUiBaseEventMod.default[CalloutBase$CloseEventParameters]
  
  type CalloutBaseCloseEventParameters = CalloutBase$CloseEventParameters
  
  type CalloutBaseOpenEvent = typings.openui5.sapUiBaseEventMod.default[CalloutBase$OpenEventParameters]
  
  type CalloutBaseOpenEventParameters = CalloutBase$OpenEventParameters
  
  type CalloutBaseOpenedEvent = typings.openui5.sapUiBaseEventMod.default[CalloutBase$OpenedEventParameters]
  
  type CalloutBaseOpenedEventParameters = CalloutBase$OpenedEventParameters
  
  trait CalloutBaseSettings
    extends StObject
       with TooltipBaseSettings {
    
    /**
      * Event is fired before a Callout is displayed. Call the preventDefault method of the event object to postpone
      * opening. Application may use this event to start asynchronous Ajax call to load the Callout content
      */
    var beforeOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[CalloutBase$BeforeOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event is fired when the Callout window is closed.
      */
    var close: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The event is fired when the popup is opened.
      */
    var open: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[CalloutBase$OpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.11.0
      *
      * Is fired when the Callout has been opened
      */
    var opened: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
  }
  object CalloutBaseSettings {
    
    inline def apply(): CalloutBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalloutBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalloutBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setBeforeOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[CalloutBase$BeforeOpenEventParameters] => Unit
      ): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[CalloutBase$OpenEventParameters] => Unit
      ): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpened(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    }
  }
}
