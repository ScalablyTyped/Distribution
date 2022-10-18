package typings.openui5

import typings.openui5.anon.OriginalEvent
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCorePopupMod.Dock
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ToolPopupMod {
  
  @JSImport("sap/ui/ux3/ToolPopup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ToolPopup.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ToolPopup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToolPopupSettings) = this()
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
    mSettings: ToolPopupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToolPopupSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ToolPopup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ToolPopup with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ToolPopup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ToolPopup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ToolPopup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ToolPopup
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Adds an ID to the Popup that should be focusable as well when using `autoclose`. Chaining is only possible
      * if a valid type (string) is given.
      */
    def addFocusableArea(): Unit = js.native
    def addFocusableArea(/**
      * ID of the corresponding element that should be focusable as well
      */
    sID: String): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when the popup closes because the user pressed Escape or the ToolPopup Button in the Shell.
      * This is called before the closing animation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when the popup closes because the user pressed Escape or the ToolPopup Button in the Shell.
      * This is called before the closing animation.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * This event is fired after the ToolPopup has finished its closing animation. It is called for EVERY close,
      * regardless of whether the user has triggered the close or whether the ToolPopup was closed via API call.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * This event is fired after the ToolPopup has finished its closing animation. It is called for EVERY close,
      * regardless of whether the user has triggered the close or whether the ToolPopup was closed via API call.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:enter enter} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired whenever the user clicks the Enter or the Enter key inside the pop up
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:enter enter} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired whenever the user clicks the Enter or the Enter key inside the pop up
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEnter(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachEnter(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconChanged iconChanged} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when one of the icon properties is modified (Note: The icon is not rendered by the ToolPopup).
      * To be used by other controls which want to update the icon in their UI.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachIconChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconChanged iconChanged} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when one of the icon properties is modified (Note: The icon is not rendered by the ToolPopup).
      * To be used by other controls which want to update the icon in their UI.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachIconChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when the popup opens
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is fired when the popup opens
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is being fired after the ToolPopup has been opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.19.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.ux3.ToolPopup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ToolPopup` itself.
      *
      * Event is being fired after the ToolPopup has been opened.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ToolPopup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the pop up. Can be called by the Shell when the pop up's button is clicked again; or by the application
      * when the interaction in the pop up has been completed or canceled.
      */
    def close(
      /**
      * If set, the focus is NOT restored to the element that had the focus before the ToolPopup was opened.
      * This makes sense when the ToolPopup is closed programmatically from a different area of the application
      * (outside the ToolPopup) and the focus should not move aways from that place.
      */
    bPreventRestoreFocus: Boolean
    ): this.type = js.native
    
    /**
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:enter enter} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachEnter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachEnter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:iconChanged iconChanged} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachIconChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachIconChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:open open} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:opened opened} event of this `sap.ui.ux3.ToolPopup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
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
    mParameters: js.Object): Boolean = js.native
    
    /**
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:enter enter} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireEnter(): this.type = js.native
    def fireEnter(/**
      * Parameters to pass along with the event
      */
    mParameters: OriginalEvent): this.type = js.native
    
    /**
      * Fires event {@link #event:iconChanged iconChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIconChanged(): this.type = js.native
    def fireIconChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:open open} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpen(): this.type = js.native
    def fireOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.19.0
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
      * @SINCE 1.13.2
      *
      * Gets current value of property {@link #getAutoClose autoClose}.
      *
      * Determines whether the ToolPopup will auto close when it loses focus. If the user e.g. clicks outside
      * of the ToolPopup it will be closed. Please don't use "modal" and "autoclose" at the same time. In this
      * case a warning will be prompted to the console and "autoclose" won't be used.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoClose`
      */
    def getAutoClose(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * Defines the buttons to appear in the popup
      */
    def getButtons(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Gets current value of property {@link #getCloseDuration closeDuration}.
      *
      * Time in milliseconds for the close animation.
      *
      * Default value is `400`.
      *
      * @returns Value of property `closeDuration`
      */
    def getCloseDuration(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the popup
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.20.1
      *
      * ID of the element which is the current target of the association {@link #getDefaultButton defaultButton},
      * or `null`.
      */
    def getDefaultButton(): ID = js.native
    
    /**
      * @SINCE 1.13.1
      *
      * Indicates whether the ToolPopup is currently enabled or not.
      *
      * Applications can't control the enabled state via a property. A ToolPopup is implicitly enabled depending
      * on its `openState`. Descendant controls that honor the enabled state of their ancestors will appear disabled
      * after the ToolPopup is closed.
      *
      * Since 1.13.1. Whether a dialog is regarded as "enabled" during the state transitions (OPENING, CLOSING)
      * is not fully decided. Currently, it is enabled during the OPENING phase and disabled during the CLOSING
      * phase. The only potential change would be to treat the OPENING phase as disabled as well. Applications
      * should be prepared to receive events from "enabled" controls after they called open() on the dialog until
      * close() is called on it. If the mentioned potential change should happen, the dialog will become enabled
      * only after the transition to OPEN. Events from "enabled" children then can still only arrive between
      * open() and close(), so applications that obey the previous rule should continue to work. Only end users
      * or code that explicitly triggers pseudo user events would notice a difference.
      *  A second aspect that might change is the visual behavior of the content: during the CLOSING phase it
      * 'looks' enabled but in fact it is already disabled. This avoids unnecessary redraws for content that
      * becomes hidden soon. Should this show to be confusing for end users, it might be changed.
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * This property is relevant for Shell use: The URL to the icon displayed in the tool area which is used
      * to open the ToolPopup. The recommended size is 32x32px, including some transparent border. Therefore,
      * the content will cover about 20x20px.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconHover iconHover}.
      *
      * This property is relevant for Shell use: The URL to the icon in hover state, displayed in the tool area
      * which is used to open the popup.
      *
      * @returns Value of property `iconHover`
      */
    def getIconHover(): URI = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Gets current value of property {@link #getInverted inverted}.
      *
      * Specifies whether the ToolPopup has a dark or bright background. If set to true the background and borders
      * will be dark. If false they will be bright. This property only has an effect for the GoldReflection-theme.
      *
      * Default value is `true`.
      *
      * @returns Value of property `inverted`
      */
    def getInverted(): Boolean = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Gets current value of property {@link #getMaxHeight maxHeight}.
      *
      * Forces a maximum height of the ToolPopup in pixels. If the ToolPopup content is higher than the ToolPopup,
      * the content will be scrollable.
      *
      * @returns Value of property `maxHeight`
      */
    def getMaxHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Forces a maximum width of the ToolPopup in pixels.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getModal modal}.
      *
      * Specifies whether the popup is modal and blocks any user-interaction with controls in the background.
      * Changing this property while the ToolPopup is open will not have any effect. Please don't use "modal"
      * and "autoclose" at the same time. In this case a warning will be prompted to the console and "autoclose"
      * won't be used.
      *
      * Default value is `false`.
      *
      * @returns Value of property `modal`
      */
    def getModal(): Boolean = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Gets current value of property {@link #getOpenDuration openDuration}.
      *
      * Time in milliseconds for the open animation.
      *
      * Default value is `400`.
      *
      * @returns Value of property `openDuration`
      */
    def getOpenDuration(): int = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getOpener opener}, or `null`.
      */
    def getOpener(): ID = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title displayed in the pop up window
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getButtons buttons}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(
      /**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Indicates whether the pop up is currently open
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the ToolPopup. It is checked which control wants to open the ToolPopup. The Shell was previously
      * set as parent so the corresponding parent element is used to set the correct position of the ToolPopup.
      * If another control (i.e. a button) opens the ToolPopup, the control must be previously set as `opener`
      * via `setOpener` to the ToolPopup. Corresponding to this opener the position of the ToolPopup will be
      * set. It's also possible to set the position above, below or left from the opener. This can be done via
      * the possible parameters `my` and `at`. These parameters refers to work the same way as they do of sap.ui.core.Popup.open.
      */
    def open(): this.type = js.native
    def open(
      /**
      * The ToolPopup's content reference position for docking
      */
    my: Unit,
      /**
      * The "of" element's reference point for docking to
      */
    at: Dock
    ): this.type = js.native
    def open(/**
      * The ToolPopup's content reference position for docking
      */
    my: Dock): this.type = js.native
    def open(
      /**
      * The ToolPopup's content reference position for docking
      */
    my: Dock,
      /**
      * The "of" element's reference point for docking to
      */
    at: Dock
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Removes an ID to the Popup that should be focusable as well when using `autoclose`. Chaining is only
      * possible if a valid type (string) is given.
      */
    def removeFocusableArea(): Unit = js.native
    def removeFocusableArea(/**
      * ID of the corresponding element
      */
    sID: String): Unit = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Sets a new value for property {@link #getAutoClose autoClose}.
      *
      * Determines whether the ToolPopup will auto close when it loses focus. If the user e.g. clicks outside
      * of the ToolPopup it will be closed. Please don't use "modal" and "autoclose" at the same time. In this
      * case a warning will be prompted to the console and "autoclose" won't be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoClose(): this.type = js.native
    def setAutoClose(/**
      * New value for property `autoClose`
      */
    bAutoClose: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * This is just a forward to the Popup's function (sap.ui.core.Popup.setAutoCloseAreas) with the same functionality.
      */
    def setAutoCloseAreas(aAutoCloseAreas: js.Array[Element]): Unit = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Sets a new value for property {@link #getCloseDuration closeDuration}.
      *
      * Time in milliseconds for the close animation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `400`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseDuration(): this.type = js.native
    def setCloseDuration(/**
      * New value for property `closeDuration`
      */
    iCloseDuration: int): this.type = js.native
    
    def setDefaultButton(
      /**
      * ID of an element which becomes the new target of this defaultButton association; alternatively, an element
      * instance may be given
      */
    oDefaultButton: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.20.1
      *
      * Sets the associated {@link #getDefaultButton defaultButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultButton(
      /**
      * ID of an element which becomes the new target of this defaultButton association; alternatively, an element
      * instance may be given
      */
    oDefaultButton: ID
    ): this.type = js.native
    
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialFocus initialFocus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Sets a new value for property {@link #getInverted inverted}.
      *
      * Specifies whether the ToolPopup has a dark or bright background. If set to true the background and borders
      * will be dark. If false they will be bright. This property only has an effect for the GoldReflection-theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInverted(): this.type = js.native
    def setInverted(/**
      * New value for property `inverted`
      */
    bInverted: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Sets a new value for property {@link #getMaxHeight maxHeight}.
      *
      * Forces a maximum height of the ToolPopup in pixels. If the ToolPopup content is higher than the ToolPopup,
      * the content will be scrollable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxHeight(): this.type = js.native
    def setMaxHeight(/**
      * New value for property `maxHeight`
      */
    sMaxHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getModal modal}.
      *
      * Specifies whether the popup is modal and blocks any user-interaction with controls in the background.
      * Changing this property while the ToolPopup is open will not have any effect. Please don't use "modal"
      * and "autoclose" at the same time. In this case a warning will be prompted to the console and "autoclose"
      * won't be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModal(): this.type = js.native
    def setModal(/**
      * New value for property `modal`
      */
    bModal: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.19.0
      *
      * Sets a new value for property {@link #getOpenDuration openDuration}.
      *
      * Time in milliseconds for the open animation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `400`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenDuration(): this.type = js.native
    def setOpenDuration(/**
      * New value for property `openDuration`
      */
    iOpenDuration: int): this.type = js.native
    
    def setOpener(
      /**
      * ID of an element which becomes the new target of this opener association; alternatively, an element instance
      * may be given
      */
    oOpener: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getOpener opener}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpener(
      /**
      * ID of an element which becomes the new target of this opener association; alternatively, an element instance
      * may be given
      */
    oOpener: ID
    ): this.type = js.native
    
    /**
      * Sets the position of the pop up, the same parameters as for sap.ui.core.Popup can be used.
      */
    def setPosition(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Determines the title displayed in the pop up window
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait ToolPopupSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.13.2
      *
      * Determines whether the ToolPopup will auto close when it loses focus. If the user e.g. clicks outside
      * of the ToolPopup it will be closed. Please don't use "modal" and "autoclose" at the same time. In this
      * case a warning will be prompted to the console and "autoclose" won't be used.
      */
    var autoClose: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the buttons to appear in the popup
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the popup closes because the user pressed Escape or the ToolPopup Button in the Shell.
      * This is called before the closing animation.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.19.0
      *
      * Time in milliseconds for the close animation.
      */
    var closeDuration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is fired after the ToolPopup has finished its closing animation. It is called for EVERY close,
      * regardless of whether the user has triggered the close or whether the ToolPopup was closed via API call.
      */
    var closed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the content of the popup
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.20.1
      *
      * Defines one of the buttons that have been provided via button aggregation to be the default button. This
      * default button is initially selected, if no control is set via the initialFocus association explicitly.
      * The default button is activated when Enter is pressed in the context of the dialog and when the currently
      * selected element does not handle the Enter event itself.
      */
    var defaultButton: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Event is fired whenever the user clicks the Enter or the Enter key inside the pop up
      */
    var enter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property is relevant for Shell use: The URL to the icon displayed in the tool area which is used
      * to open the ToolPopup. The recommended size is 32x32px, including some transparent border. Therefore,
      * the content will cover about 20x20px.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when one of the icon properties is modified (Note: The icon is not rendered by the ToolPopup).
      * To be used by other controls which want to update the icon in their UI.
      */
    var iconChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property is relevant for Shell use: The URL to the icon in hover state, displayed in the tool area
      * which is used to open the popup.
      */
    var iconHover: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This property is relevant for Shell use: The URL to the icon in selected state displayed in the tool
      * area which is used to open the popup. If no selected icon is given, the hover icon is used.
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the control that will get the focus when the ToolPopup is opened.
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.11.1
      *
      * Specifies whether the ToolPopup has a dark or bright background. If set to true the background and borders
      * will be dark. If false they will be bright. This property only has an effect for the GoldReflection-theme.
      */
    var inverted: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.13.2
      *
      * Forces a maximum height of the ToolPopup in pixels. If the ToolPopup content is higher than the ToolPopup,
      * the content will be scrollable.
      */
    var maxHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Forces a maximum width of the ToolPopup in pixels.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the popup is modal and blocks any user-interaction with controls in the background.
      * Changing this property while the ToolPopup is open will not have any effect. Please don't use "modal"
      * and "autoclose" at the same time. In this case a warning will be prompted to the console and "autoclose"
      * won't be used.
      */
    var modal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the popup opens
      */
    var open: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.19.0
      *
      * Time in milliseconds for the open animation.
      */
    var openDuration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.19.0
      *
      * Event is being fired after the ToolPopup has been opened.
      */
    var opened: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property is relevant for stand-alone use: This association needs to be set if the ToolPopup should
      * not be opened by/with the Shell. This association contains the instance of the control that assigns the
      * ToolPopup's position.
      */
    var opener: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Determines the title displayed in the pop up window
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ToolPopupSettings {
    
    inline def apply(): ToolPopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolPopupSettings]
    }
    
    extension [Self <: ToolPopupSettings](x: Self) {
      
      inline def setAutoClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
      
      inline def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDefaultButton(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "defaultButton", value.asInstanceOf[js.Any])
      
      inline def setDefaultButtonUndefined: Self = StObject.set(x, "defaultButton", js.undefined)
      
      inline def setEnter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "iconChanged", js.Any.fromFunction1(value))
      
      inline def setIconChangedUndefined: Self = StObject.set(x, "iconChanged", js.undefined)
      
      inline def setIconHover(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHover", value.asInstanceOf[js.Any])
      
      inline def setIconHoverUndefined: Self = StObject.set(x, "iconHover", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setInverted(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setMaxHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setModal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "openDuration", value.asInstanceOf[js.Any])
      
      inline def setOpenDurationUndefined: Self = StObject.set(x, "openDuration", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpened(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setOpener(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
      
      inline def setOpenerUndefined: Self = StObject.set(x, "opener", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
