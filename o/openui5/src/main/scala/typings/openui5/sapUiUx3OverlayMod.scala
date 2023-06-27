package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3OverlayMod {
  
  @JSImport("sap/ui/ux3/Overlay", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Overlay.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Overlay {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: OverlaySettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: OverlaySettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: OverlaySettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Overlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Overlay with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Overlay]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Overlay],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Overlay.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Overlay
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay starts closing.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay starts closing.
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
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the Overlay is opened.
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
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:openNew openNew} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the 'Open' button of the Overlay is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpenNew(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit]
    ): this.type = js.native
    def attachOpenNew(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:openNew openNew} event of this `sap.ui.ux3.Overlay`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Overlay` itself.
      *
      * Event is fired when the 'Open' button of the Overlay is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpenNew(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit]
    ): this.type = js.native
    def attachOpenNew(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Overlay` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the Overlay.
      */
    def close(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.ux3.Overlay`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit]
    ): this.type = js.native
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.ux3.Overlay`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit]
    ): this.type = js.native
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayClosedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:open open} event of this `sap.ui.ux3.Overlay`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit]
    ): this.type = js.native
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:openNew openNew} event of this `sap.ui.ux3.Overlay`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpenNew(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit]
    ): this.type = js.native
    def detachOpenNew(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ OverlayOpenNewEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireClose(): Boolean = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: Overlay$CloseEventParameters): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireClosed(): Boolean = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: Overlay$ClosedEventParameters): Boolean = js.native
    
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
    mParameters: Overlay$OpenEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:openNew openNew} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpenNew(): this.type = js.native
    def fireOpenNew(/**
      * Parameters to pass along with the event
      */
    mParameters: Overlay$OpenNewEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCloseButtonVisible closeButtonVisible}.
      *
      * Defines whether the 'Close' button shall be visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `closeButtonVisible`
      */
    def getCloseButtonVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOpenButtonVisible openButtonVisible}.
      *
      * Defines whether the 'Open' button shall be visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `openButtonVisible`
      */
    def getOpenButtonVisible(): Boolean = js.native
    
    /**
      * Checks whether Overlay is open.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the Overlay.
      */
    def open(
      /**
      * ID of the control that gets focused when the overlay is openend
      */
    initialFocusId: String
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getCloseButtonVisible closeButtonVisible}.
      *
      * Defines whether the 'Close' button shall be visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseButtonVisible(): this.type = js.native
    def setCloseButtonVisible(/**
      * New value for property `closeButtonVisible`
      */
    bCloseButtonVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOpenButtonVisible openButtonVisible}.
      *
      * Defines whether the 'Open' button shall be visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenButtonVisible(): this.type = js.native
    def setOpenButtonVisible(/**
      * New value for property `openButtonVisible`
      */
    bOpenButtonVisible: Boolean): this.type = js.native
  }
  
  trait Overlay$CloseEventParameters extends StObject {
    
    /**
      * The ID of the Overlay instance.
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object Overlay$CloseEventParameters {
    
    inline def apply(): Overlay$CloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overlay$CloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay$CloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Overlay$ClosedEventParameters extends StObject {
    
    /**
      * The ID of the Overlay instance.
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object Overlay$ClosedEventParameters {
    
    inline def apply(): Overlay$ClosedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overlay$ClosedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay$ClosedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Overlay$OpenEventParameters extends StObject {
    
    /**
      * The ID of the Overlay instance
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object Overlay$OpenEventParameters {
    
    inline def apply(): Overlay$OpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overlay$OpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay$OpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Overlay$OpenNewEventParameters extends StObject {
    
    /**
      * The ID of the Overlay instance.
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object Overlay$OpenNewEventParameters {
    
    inline def apply(): Overlay$OpenNewEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overlay$OpenNewEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay$OpenNewEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type OverlayCloseEvent = typings.openui5.sapUiBaseEventMod.default[Overlay$CloseEventParameters]
  
  type OverlayCloseEventParameters = Overlay$CloseEventParameters
  
  type OverlayClosedEvent = typings.openui5.sapUiBaseEventMod.default[Overlay$ClosedEventParameters]
  
  type OverlayClosedEventParameters = Overlay$ClosedEventParameters
  
  type OverlayOpenEvent = typings.openui5.sapUiBaseEventMod.default[Overlay$OpenEventParameters]
  
  type OverlayOpenEventParameters = Overlay$OpenEventParameters
  
  type OverlayOpenNewEvent = typings.openui5.sapUiBaseEventMod.default[Overlay$OpenNewEventParameters]
  
  type OverlayOpenNewEventParameters = Overlay$OpenNewEventParameters
  
  trait OverlaySettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired when the Overlay starts closing.
      */
    var close: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$CloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines whether the 'Close' button shall be visible.
      */
    var closeButtonVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the Overlay is closed.
      */
    var closed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$ClosedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event is fired when the Overlay is opened.
      */
    var open: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$OpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines whether the 'Open' button shall be visible.
      */
    var openButtonVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the 'Open' button of the Overlay is clicked.
      */
    var openNew: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$OpenNewEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object OverlaySettings {
    
    inline def apply(): OverlaySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlaySettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlaySettings] (val x: Self) extends AnyVal {
      
      inline def setClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$CloseEventParameters] => Unit
      ): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseButtonVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeButtonVisible", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonVisibleUndefined: Self = StObject.set(x, "closeButtonVisible", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setClosed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$ClosedEventParameters] => Unit
      ): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$OpenEventParameters] => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenButtonVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "openButtonVisible", value.asInstanceOf[js.Any])
      
      inline def setOpenButtonVisibleUndefined: Self = StObject.set(x, "openButtonVisible", js.undefined)
      
      inline def setOpenNew(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Overlay$OpenNewEventParameters] => Unit
      ): Self = StObject.set(x, "openNew", js.Any.fromFunction1(value))
      
      inline def setOpenNewUndefined: Self = StObject.set(x, "openNew", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
