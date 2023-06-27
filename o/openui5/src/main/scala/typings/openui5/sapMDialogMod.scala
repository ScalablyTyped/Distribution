package typings.openui5

import typings.openui5.anon.Reject
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.DialogType
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDialogMod {
  
  @JSImport("sap/m/Dialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Dialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/dialog/ Dialog}
    */
  open class default () extends Dialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DialogSettings) = this()
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
    mSettings: DialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DialogSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Dialog with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Dialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Dialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Dialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Dialog
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the custom header instance when the `customHeader` aggregation is set. Otherwise, it returns
      * the internal managed header instance. This method can be called within composite controls which use `sap.m.Dialog`
      * inside.
      */
    def _getAnyHeader(): Unit = js.native
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default
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
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired after the Dialog is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired after the Dialog is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired after the Dialog is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired after the Dialog is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
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
    def attachAfterOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired before the Dialog is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired before the Dialog is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired before the Dialog is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Dialog` itself.
      *
      * This event will be fired before the Dialog is opened.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Close the dialog.
      *
      * @returns `this` to allow method chaining
      */
    def close(): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Destroys the beginButton in the aggregation {@link #getBeginButton beginButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBeginButton(): this.type = js.native
    
    /**
      * @since 1.21.1
      *
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
      * @since 1.15.1
      *
      * Destroys the customHeader in the aggregation {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomHeader(): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Destroys the endButton in the aggregation {@link #getEndButton endButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndButton(): this.type = js.native
    
    /**
      * @since 1.110
      *
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * @since 1.12.2
      *
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.Dialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit]
    ): this.type = js.native
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogAfterCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.Dialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachAfterOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.Dialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit]
    ): this.type = js.native
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DialogBeforeCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Dialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachBeforeOpen(
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
      * Fires event {@link #event:afterClose afterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterClose(): this.type = js.native
    def fireAfterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: Dialog$AfterCloseEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:afterOpen afterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterOpen(): this.type = js.native
    def fireAfterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeClose beforeClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeClose(): this.type = js.native
    def fireBeforeClose(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Dialog$BeforeCloseEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeOpen(): this.type = js.native
    def fireBeforeOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets content of aggregation {@link #getBeginButton beginButton}.
      *
      * The button which is rendered to the left side (right side in RTL mode) of the `endButton` in the footer
      * area inside the Dialog. As of version 1.21.1, there's a new aggregation `buttons` created with which
      * more than 2 buttons can be added to the footer area of the Dialog. If the new `buttons` aggregation is
      * set, any change made to this aggregation has no effect anymore. With the Belize themes when running on
      * a phone, this `button` (and the `endButton` together when set) is (are) rendered at the center of the
      * footer area. While with the Quartz themes when running on a phone, this `button` (and the `endButton`
      * together when set) is (are) rendered on the right side of the footer area. When running on other platforms,
      * this `button` (and the `endButton` together when set) is (are) rendered at the right side (left side
      * in RTL mode) of the footer area.
      */
    def getBeginButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * Buttons can be added to the footer area of the Dialog through this aggregation. When this aggregation
      * is set, any change to the `beginButton` and `endButton` has no effect anymore. Buttons which are inside
      * this aggregation are aligned at the right side (left side in RTL mode) of the footer instead of in the
      * middle of the footer. The buttons aggregation can not be used together with the footer aggregation.
      */
    def getButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @since 1.72
      *
      * Gets current value of property {@link #getCloseOnNavigation closeOnNavigation}.
      *
      * Indicates whether the Dialog will be closed automatically when a routing navigation occurs.
      *
      * Default value is `true`.
      *
      * @returns Value of property `closeOnNavigation`
      */
    def getCloseOnNavigation(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content inside the Dialog.
      * **Note:** When the content of the Dialog is comprised of controls that use `position: absolute`, such
      * as `SplitContainer`, the Dialog has to have either `stretch: true` or `contentHeight` set.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.12.1
      *
      * Gets current value of property {@link #getContentHeight contentHeight}.
      *
      * Preferred height of the content in the Dialog. If the preferred height is bigger than the available space
      * on a screen, it will be overwritten by the maximum available height on a screen in order to make sure
      * that the Dialog isn't cut off.
      *
      * @returns Value of property `contentHeight`
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * @since 1.12.1
      *
      * Gets current value of property {@link #getContentWidth contentWidth}.
      *
      * Preferred width of the content in the Dialog. This property affects the width of the Dialog on a phone
      * in landscape mode, a tablet or a desktop, because the Dialog has a fixed width on a phone in portrait
      * mode. If the preferred width is less than the minimum width of the Dialog or more than the available
      * width of the screen, it will be overwritten by the min or max value. The current mininum value of the
      * Dialog width on tablet is 400px.
      *
      * @returns Value of property `contentWidth`
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets content of aggregation {@link #getCustomHeader customHeader}.
      *
      * When it is set, the `icon`, `title` and `showHeader` properties are ignored. Only the `customHeader`
      * is shown as the header of the Dialog.
      * **Note:** To improve accessibility, titles with heading level `H1` should be used inside the custom header.
      */
    def getCustomHeader(): IBar = js.native
    
    /**
      * @since 1.30
      *
      * Gets current value of property {@link #getDraggable draggable}.
      *
      * Indicates whether the Dialog is draggable. If this property is set to `true`, the Dialog will be draggable
      * by its header. This property has a default value `false`. The Dialog can be draggable only in desktop
      * mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `draggable`
      */
    def getDraggable(): Boolean = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets content of aggregation {@link #getEndButton endButton}.
      *
      * The button which is rendered to the right side (left side in RTL mode) of the `beginButton` in the footer
      * area inside the Dialog. As of version 1.21.1, there's a new aggregation `buttons` created with which
      * more than 2 buttons can be added to the footer area of Dialog. If the new `buttons` aggregation is set,
      * any change made to this aggregation has no effect anymore. With the Belize themes when running on a phone,
      * this `button` (and the `beginButton` together when set) is (are) rendered at the center of the footer
      * area. While with the Quartz themes when running on a phone, this `button` (and the `beginButton` together
      * when set) is (are) rendered on the right side of the footer area. When running on other platforms, this
      * `button` (and the `beginButton` together when set) is (are) rendered at the right side (left side in
      * RTL mode) of the footer area.
      */
    def getEndButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets current value of property {@link #getEscapeHandler escapeHandler}.
      *
      * This property expects a function with one parameter of type Promise. In the function, you should call
      * either `resolve()` or `reject()` on the Promise object. The function allows you to define custom behavior
      * which will be executed when the Escape key is pressed. By default, when the Escape key is pressed, the
      * dialog is immediately closed.
      *
      * @returns Value of property `escapeHandler`
      */
    def getEscapeHandler(): (js.Function1[/* p1 */ Reject, Unit]) | Null = js.native
    
    /**
      * @since 1.110
      *
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * The footer of this dialog. It is always located at the bottom of the dialog. The footer aggregation can
      * not be used together with the buttons aggregation.
      */
    def getFooter(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets current value of property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * Indicates if the user can scroll horizontally inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of the property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `horizontalScrolling`
      */
    def getHorizontalScrolling(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon displayed in the Dialog header. This `icon` is invisible on the iOS platform and it is density-aware.
      * You can use the density convention (@2, @1.5, etc.) to provide higher resolution image for higher density
      * screen.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @since 1.15.0
      *
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * @deprecated (since 1.15.1) - `LeftButton` has been deprecated since 1.15.1. Please use the `beginButton`
      * instead which is more RTL friendly.
      *
      * ID of the element which is the current target of the association {@link #getLeftButton leftButton}, or
      * `null`.
      */
    def getLeftButton(): ID = js.native
    
    /**
      * @since 1.30
      *
      * Gets current value of property {@link #getResizable resizable}.
      *
      * Indicates whether the Dialog is resizable. If this property is set to `true`, the Dialog will have a
      * resize handler in its bottom right corner. This property has a default value `false`. The Dialog can
      * be resizable only in desktop mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * @deprecated (since 1.15.1) - `RightButton` has been deprecated since 1.15.1. Please use the `endButton`
      * instead which is more RTL friendly.
      *
      * ID of the element which is the current target of the association {@link #getRightButton rightButton},
      * or `null`.
      */
    def getRightButton(): ID = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * Determines whether the header is shown inside the Dialog. If this property is set to `false`, the `text`
      * and `icon` properties are ignored. This property has a default value `true`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * @since 1.11.2
      *
      * Gets current value of property {@link #getState state}.
      *
      * Affects the `icon` and the `title` color.
      *
      * If a value other than `None` is set, a predefined icon will be added to the Dialog. Setting the `icon`
      * property will overwrite the predefined icon.
      *
      * Default value is `None`.
      *
      * @returns Value of property `state`
      */
    def getState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @since 1.13.1
      *
      * Gets current value of property {@link #getStretch stretch}.
      *
      * Determines if the Dialog will be stretched to full screen on mobile. On desktop, the Dialog will be stretched
      * to approximately 90% of the viewport. This property is only applicable to a Standard Dialog. Message-type
      * Dialog ignores it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stretch`
      */
    def getStretch(): Boolean = js.native
    
    /**
      * @since 1.11.2
      * @deprecated (since 1.13.1) - Please use the new stretch property instead. This enables a stretched Dialog
      * even on tablet and desktop. If you want to achieve the same effect as `stretchOnPhone`, please set the
      * stretch with `Device.system.phone`, then the Dialog is only stretched when it runs on a phone.
      *
      * Gets current value of property {@link #getStretchOnPhone stretchOnPhone}.
      *
      * Determines whether the Dialog will be displayed on full screen on a phone.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stretchOnPhone`
      */
    def getStretchOnPhone(): Boolean = js.native
    
    /**
      * @since 1.12.2
      *
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * When a `subHeader` is assigned to the Dialog, it's rendered directly after the main header in the Dialog.
      * The `subHeader` is out of the content area and won't be scrolled when the content size is bigger than
      * the content area size.
      */
    def getSubHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text appears in the Dialog header.
      * **Note:** The heading level of the Dialog is `H1`. Headings in the Dialog content should start with `H2`
      * heading level.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.72
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * The `type` of the Dialog. In some themes, the type Message will limit the Dialog width within 480px on
      * tablet and desktop.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `type`
      */
    def getType(): DialogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogType * / any */ String) = js.native
    
    /**
      * @since 1.15.1
      *
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Indicates if the user can scroll vertically inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of this property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `verticalScrolling`
      */
    def getVerticalScrolling(): Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getButtons buttons}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(/**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapMButtonMod.default): int = js.native
    
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
      * @since 1.21.1
      *
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default,
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
      * @since 1.9.1
      *
      * The method checks if the Dialog is open.
      *
      * It returns `true` when the Dialog is currently open (this includes opening and closing animations), otherwise
      * it returns `false`.
      *
      * @returns Whether the dialog is open.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Open the dialog.
      *
      * @returns `this` to allow method chaining
      */
    def open(): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.21.1
      *
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @since 1.21.1
      *
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
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
      * @since 1.15.1
      *
      * Sets the aggregated {@link #getBeginButton beginButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBeginButton(/**
      * The beginButton to set
      */
    oBeginButton: typings.openui5.sapMButtonMod.default): this.type = js.native
    
    /**
      * @since 1.72
      *
      * Sets a new value for property {@link #getCloseOnNavigation closeOnNavigation}.
      *
      * Indicates whether the Dialog will be closed automatically when a routing navigation occurs.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseOnNavigation(): this.type = js.native
    def setCloseOnNavigation(/**
      * New value for property `closeOnNavigation`
      */
    bCloseOnNavigation: Boolean): this.type = js.native
    
    /**
      * @since 1.12.1
      *
      * Sets a new value for property {@link #getContentHeight contentHeight}.
      *
      * Preferred height of the content in the Dialog. If the preferred height is bigger than the available space
      * on a screen, it will be overwritten by the maximum available height on a screen in order to make sure
      * that the Dialog isn't cut off.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentHeight(): this.type = js.native
    def setContentHeight(/**
      * New value for property `contentHeight`
      */
    sContentHeight: CSSSize): this.type = js.native
    
    /**
      * @since 1.12.1
      *
      * Sets a new value for property {@link #getContentWidth contentWidth}.
      *
      * Preferred width of the content in the Dialog. This property affects the width of the Dialog on a phone
      * in landscape mode, a tablet or a desktop, because the Dialog has a fixed width on a phone in portrait
      * mode. If the preferred width is less than the minimum width of the Dialog or more than the available
      * width of the screen, it will be overwritten by the min or max value. The current mininum value of the
      * Dialog width on tablet is 400px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentWidth(): this.type = js.native
    def setContentWidth(/**
      * New value for property `contentWidth`
      */
    sContentWidth: CSSSize): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Sets the aggregated {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomHeader(/**
      * The customHeader to set
      */
    oCustomHeader: IBar): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Sets a new value for property {@link #getDraggable draggable}.
      *
      * Indicates whether the Dialog is draggable. If this property is set to `true`, the Dialog will be draggable
      * by its header. This property has a default value `false`. The Dialog can be draggable only in desktop
      * mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDraggable(): this.type = js.native
    def setDraggable(/**
      * New value for property `draggable`
      */
    bDraggable: Boolean): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Sets the aggregated {@link #getEndButton endButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEndButton(/**
      * The endButton to set
      */
    oEndButton: typings.openui5.sapMButtonMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #setEscapeHandler escapeHandler}.
      *
      * This property expects a function with one parameter of type Promise. In the function, you should call
      * either `resolve()` or `reject()` on the Promise object. The function allows you to define custom behavior
      * which will be executed when the Escape key is pressed. By default, when the Escape key is pressed, the
      * dialog is immediately closed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEscapeHandler(): this.type = js.native
    def setEscapeHandler(
      /**
      * New value for property `escapeHandler`
      */
    fnEscapeHandler: js.Function1[/* p1 */ Reject, Unit]
    ): this.type = js.native
    
    /**
      * @since 1.110
      *
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Sets a new value for property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * Indicates if the user can scroll horizontally inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of the property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHorizontalScrolling(): this.type = js.native
    def setHorizontalScrolling(/**
      * New value for property `horizontalScrolling`
      */
    bHorizontalScrolling: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon displayed in the Dialog header. This `icon` is invisible on the iOS platform and it is density-aware.
      * You can use the density convention (@2, @1.5, etc.) to provide higher resolution image for higher density
      * screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.15.0
      *
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
    
    def setLeftButton(
      /**
      * ID of an element which becomes the new target of this leftButton association; alternatively, an element
      * instance may be given
      */
    oLeftButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    /**
      * @deprecated (since 1.15.1) - `LeftButton` has been deprecated since 1.15.1. Please use the `beginButton`
      * instead which is more RTL friendly.
      *
      * Sets the associated {@link #getLeftButton leftButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLeftButton(
      /**
      * ID of an element which becomes the new target of this leftButton association; alternatively, an element
      * instance may be given
      */
    oLeftButton: ID
    ): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Sets a new value for property {@link #getResizable resizable}.
      *
      * Indicates whether the Dialog is resizable. If this property is set to `true`, the Dialog will have a
      * resize handler in its bottom right corner. This property has a default value `false`. The Dialog can
      * be resizable only in desktop mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResizable(): this.type = js.native
    def setResizable(/**
      * New value for property `resizable`
      */
    bResizable: Boolean): this.type = js.native
    
    def setRightButton(
      /**
      * ID of an element which becomes the new target of this rightButton association; alternatively, an element
      * instance may be given
      */
    oRightButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    /**
      * @deprecated (since 1.15.1) - `RightButton` has been deprecated since 1.15.1. Please use the `endButton`
      * instead which is more RTL friendly.
      *
      * Sets the associated {@link #getRightButton rightButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRightButton(
      /**
      * ID of an element which becomes the new target of this rightButton association; alternatively, an element
      * instance may be given
      */
    oRightButton: ID
    ): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * Determines whether the header is shown inside the Dialog. If this property is set to `false`, the `text`
      * and `icon` properties are ignored. This property has a default value `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * @since 1.11.2
      *
      * Sets a new value for property {@link #getState state}.
      *
      * Affects the `icon` and the `title` color.
      *
      * If a value other than `None` is set, a predefined icon will be added to the Dialog. Setting the `icon`
      * property will overwrite the predefined icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: ValueState): this.type = js.native
    
    /**
      * @since 1.13.1
      *
      * Sets a new value for property {@link #getStretch stretch}.
      *
      * Determines if the Dialog will be stretched to full screen on mobile. On desktop, the Dialog will be stretched
      * to approximately 90% of the viewport. This property is only applicable to a Standard Dialog. Message-type
      * Dialog ignores it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStretch(): this.type = js.native
    def setStretch(/**
      * New value for property `stretch`
      */
    bStretch: Boolean): this.type = js.native
    
    /**
      * @since 1.11.2
      * @deprecated (since 1.13.1) - Please use the new stretch property instead. This enables a stretched Dialog
      * even on tablet and desktop. If you want to achieve the same effect as `stretchOnPhone`, please set the
      * stretch with `Device.system.phone`, then the Dialog is only stretched when it runs on a phone.
      *
      * Sets a new value for property {@link #getStretchOnPhone stretchOnPhone}.
      *
      * Determines whether the Dialog will be displayed on full screen on a phone.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStretchOnPhone(): this.type = js.native
    def setStretchOnPhone(/**
      * New value for property `stretchOnPhone`
      */
    bStretchOnPhone: Boolean): this.type = js.native
    
    /**
      * @since 1.12.2
      *
      * Sets the aggregated {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubHeader(/**
      * The subHeader to set
      */
    oSubHeader: IBar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text appears in the Dialog header.
      * **Note:** The heading level of the Dialog is `H1`. Headings in the Dialog content should start with `H2`
      * heading level.
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
    
    /**
      * @since 1.72
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: TitleAlignment): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * The `type` of the Dialog. In some themes, the type Message will limit the Dialog width within 480px on
      * tablet and desktop.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: DialogType): this.type = js.native
    
    /**
      * @since 1.15.1
      *
      * Sets a new value for property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Indicates if the user can scroll vertically inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of this property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVerticalScrolling(): this.type = js.native
    def setVerticalScrolling(/**
      * New value for property `verticalScrolling`
      */
    bVerticalScrolling: Boolean): this.type = js.native
  }
  
  trait Dialog$AfterCloseEventParameters extends StObject {
    
    /**
      * This indicates the trigger of closing the Dialog. If the Dialog is closed by either the `beginButton`
      * or the `endButton`, the button that closes the Dialog is set to this parameter. Otherwise, the parameter
      * is set to `null`.
      */
    var origin: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object Dialog$AfterCloseEventParameters {
    
    inline def apply(): Dialog$AfterCloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dialog$AfterCloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dialog$AfterCloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOrigin(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait Dialog$AfterOpenEventParameters extends StObject
  
  trait Dialog$BeforeCloseEventParameters extends StObject {
    
    /**
      * This indicates the trigger of closing the Dialog. If the Dialog is closed by either the `beginButton`
      * or the `endButton`, the button that closes the Dialog is set to this parameter. Otherwise, the parameter
      * is set to `null`.
      */
    var origin: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object Dialog$BeforeCloseEventParameters {
    
    inline def apply(): Dialog$BeforeCloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dialog$BeforeCloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dialog$BeforeCloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOrigin(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait Dialog$BeforeOpenEventParameters extends StObject
  
  type DialogAfterCloseEvent = typings.openui5.sapUiBaseEventMod.default[Dialog$AfterCloseEventParameters]
  
  type DialogAfterCloseEventParameters = Dialog$AfterCloseEventParameters
  
  type DialogAfterOpenEvent = typings.openui5.sapUiBaseEventMod.default[Dialog$AfterOpenEventParameters]
  
  type DialogAfterOpenEventParameters = Dialog$AfterOpenEventParameters
  
  type DialogBeforeCloseEvent = typings.openui5.sapUiBaseEventMod.default[Dialog$BeforeCloseEventParameters]
  
  type DialogBeforeCloseEventParameters = Dialog$BeforeCloseEventParameters
  
  type DialogBeforeOpenEvent = typings.openui5.sapUiBaseEventMod.default[Dialog$BeforeOpenEventParameters]
  
  type DialogBeforeOpenEventParameters = Dialog$BeforeOpenEventParameters
  
  trait DialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event will be fired after the Dialog is closed.
      */
    var afterClose: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Dialog$AfterCloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event will be fired after the Dialog is opened.
      */
    var afterOpen: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Association to controls/IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls/IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * This event will be fired before the Dialog is closed.
      */
    var beforeClose: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Dialog$BeforeCloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event will be fired before the Dialog is opened.
      */
    var beforeOpen: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * The button which is rendered to the left side (right side in RTL mode) of the `endButton` in the footer
      * area inside the Dialog. As of version 1.21.1, there's a new aggregation `buttons` created with which
      * more than 2 buttons can be added to the footer area of the Dialog. If the new `buttons` aggregation is
      * set, any change made to this aggregation has no effect anymore. With the Belize themes when running on
      * a phone, this `button` (and the `endButton` together when set) is (are) rendered at the center of the
      * footer area. While with the Quartz themes when running on a phone, this `button` (and the `endButton`
      * together when set) is (are) rendered on the right side of the footer area. When running on other platforms,
      * this `button` (and the `endButton` together when set) is (are) rendered at the right side (left side
      * in RTL mode) of the footer area.
      */
    var beginButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * Buttons can be added to the footer area of the Dialog through this aggregation. When this aggregation
      * is set, any change to the `beginButton` and `endButton` has no effect anymore. Buttons which are inside
      * this aggregation are aligned at the right side (left side in RTL mode) of the footer instead of in the
      * middle of the footer. The buttons aggregation can not be used together with the footer aggregation.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.72
      *
      * Indicates whether the Dialog will be closed automatically when a routing navigation occurs.
      */
    var closeOnNavigation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content inside the Dialog.
      * **Note:** When the content of the Dialog is comprised of controls that use `position: absolute`, such
      * as `SplitContainer`, the Dialog has to have either `stretch: true` or `contentHeight` set.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.12.1
      *
      * Preferred height of the content in the Dialog. If the preferred height is bigger than the available space
      * on a screen, it will be overwritten by the maximum available height on a screen in order to make sure
      * that the Dialog isn't cut off.
      */
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.12.1
      *
      * Preferred width of the content in the Dialog. This property affects the width of the Dialog on a phone
      * in landscape mode, a tablet or a desktop, because the Dialog has a fixed width on a phone in portrait
      * mode. If the preferred width is less than the minimum width of the Dialog or more than the available
      * width of the screen, it will be overwritten by the min or max value. The current mininum value of the
      * Dialog width on tablet is 400px.
      */
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * When it is set, the `icon`, `title` and `showHeader` properties are ignored. Only the `customHeader`
      * is shown as the header of the Dialog.
      * **Note:** To improve accessibility, titles with heading level `H1` should be used inside the custom header.
      */
    var customHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * @since 1.30
      *
      * Indicates whether the Dialog is draggable. If this property is set to `true`, the Dialog will be draggable
      * by its header. This property has a default value `false`. The Dialog can be draggable only in desktop
      * mode.
      */
    var draggable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * The button which is rendered to the right side (left side in RTL mode) of the `beginButton` in the footer
      * area inside the Dialog. As of version 1.21.1, there's a new aggregation `buttons` created with which
      * more than 2 buttons can be added to the footer area of Dialog. If the new `buttons` aggregation is set,
      * any change made to this aggregation has no effect anymore. With the Belize themes when running on a phone,
      * this `button` (and the `beginButton` together when set) is (are) rendered at the center of the footer
      * area. While with the Quartz themes when running on a phone, this `button` (and the `beginButton` together
      * when set) is (are) rendered on the right side of the footer area. When running on other platforms, this
      * `button` (and the `beginButton` together when set) is (are) rendered at the right side (left side in
      * RTL mode) of the footer area.
      */
    var endButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * @since 1.44
      *
      * This property expects a function with one parameter of type Promise. In the function, you should call
      * either `resolve()` or `reject()` on the Promise object.
      *  The function allows you to define custom behavior which will be executed when the Escape key is pressed.
      * By default, when the Escape key is pressed, the Dialog is immediately closed.
      */
    var escapeHandler: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.110
      *
      * The footer of this dialog. It is always located at the bottom of the dialog. The footer aggregation can
      * not be used together with the buttons aggregation.
      */
    var footer: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * Indicates if the user can scroll horizontally inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of the property.
      */
    var horizontalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Icon displayed in the Dialog header. This `icon` is invisible on the iOS platform and it is density-aware.
      * You can use the density convention (@2, @1.5, etc.) to provide higher resolution image for higher density
      * screen.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.15.0
      *
      * In the Dialog focus is set first on the `beginButton` and then on `endButton`, when available. If another
      * control needs to get the focus, set the `initialFocus` with the control which should be focused on. Setting
      * `initialFocus` to input controls doesn't open the On-Screen keyboard on mobile device as, due to browser
      * restriction, the On-Screen keyboard can't be opened with JavaScript code. The opening of On-Screen keyboard
      * must be triggered by real user action.
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @deprecated (since 1.15.1) - `LeftButton` has been deprecated since 1.15.1. Please use the `beginButton`
      * instead which is more RTL friendly.
      *
      * `LeftButton` is shown at the left edge of the bar in iOS, and at the right side of the bar for the other
      * platforms. Please set this to `null` if you want to remove the Left button from the bar. And the button
      * is only removed from the bar, not destroyed. When `showHeader` is set to `false`, this property will
      * be ignored. Setting `leftButton` will also set the `beginButton` internally.
      */
    var leftButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * @since 1.30
      *
      * Indicates whether the Dialog is resizable. If this property is set to `true`, the Dialog will have a
      * resize handler in its bottom right corner. This property has a default value `false`. The Dialog can
      * be resizable only in desktop mode.
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.15.1) - `RightButton` has been deprecated since 1.15.1. Please use the `endButton`
      * instead which is more RTL friendly.
      *
      * `RightButton` is always shown at the right edge of the bar. Please set this to null if you want to remove
      * the Right button from the bar. And the button is only removed from the bar, not destroyed. When `showHeader`
      * is set to false, this property will be ignored. Setting `rightButton` will also set the `endButton` internally.
      */
    var rightButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * Determines whether the header is shown inside the Dialog. If this property is set to `false`, the `text`
      * and `icon` properties are ignored. This property has a default value `true`.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.2
      *
      * Affects the `icon` and the `title` color.
      *
      * If a value other than `None` is set, a predefined icon will be added to the Dialog. Setting the `icon`
      * property will overwrite the predefined icon.
      */
    var state: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.13.1
      *
      * Determines if the Dialog will be stretched to full screen on mobile. On desktop, the Dialog will be stretched
      * to approximately 90% of the viewport. This property is only applicable to a Standard Dialog. Message-type
      * Dialog ignores it.
      */
    var stretch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.2
      * @deprecated (since 1.13.1) - Please use the new stretch property instead. This enables a stretched Dialog
      * even on tablet and desktop. If you want to achieve the same effect as `stretchOnPhone`, please set the
      * stretch with `Device.system.phone`, then the Dialog is only stretched when it runs on a phone.
      *
      * Determines whether the Dialog will be displayed on full screen on a phone.
      */
    var stretchOnPhone: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.12.2
      *
      * When a `subHeader` is assigned to the Dialog, it's rendered directly after the main header in the Dialog.
      * The `subHeader` is out of the content area and won't be scrolled when the content size is bigger than
      * the content area size.
      */
    var subHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * Title text appears in the Dialog header.
      * **Note:** The heading level of the Dialog is `H1`. Headings in the Dialog content should start with `H2`
      * heading level.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The `type` of the Dialog. In some themes, the type Message will limit the Dialog width within 480px on
      * tablet and desktop.
      */
    var `type`: js.UndefOr[
        DialogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.15.1
      *
      * Indicates if the user can scroll vertically inside the Dialog when the content is bigger than the content
      * area. The Dialog detects if there's `sap.m.NavContainer`, `sap.m.Page`, `sap.m.ScrollContainer` or `sap.m.SplitContainer`
      * as a direct child added to the Dialog. If there is, the Dialog will turn off `scrolling` by setting this
      * property to `false`, automatically ignoring the existing value of this property.
      */
    var verticalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DialogSettings {
    
    inline def apply(): DialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Dialog$AfterCloseEventParameters] => Unit
      ): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Dialog$BeforeCloseEventParameters] => Unit
      ): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setBeginButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "beginButton", value.asInstanceOf[js.Any])
      
      inline def setBeginButtonUndefined: Self = StObject.set(x, "beginButton", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCloseOnNavigation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeOnNavigation", value.asInstanceOf[js.Any])
      
      inline def setCloseOnNavigationUndefined: Self = StObject.set(x, "closeOnNavigation", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setCustomHeader(value: IBar): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setDraggable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEndButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "endButton", value.asInstanceOf[js.Any])
      
      inline def setEndButtonUndefined: Self = StObject.set(x, "endButton", js.undefined)
      
      inline def setEscapeHandler(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "escapeHandler", value.asInstanceOf[js.Any])
      
      inline def setEscapeHandlerUndefined: Self = StObject.set(x, "escapeHandler", js.undefined)
      
      inline def setFooter(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHorizontalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setLeftButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
      
      inline def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
      
      inline def setResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRightButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
      
      inline def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStretch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchOnPhone(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stretchOnPhone", value.asInstanceOf[js.Any])
      
      inline def setStretchOnPhoneUndefined: Self = StObject.set(x, "stretchOnPhone", js.undefined)
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setSubHeader(value: IBar): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(
        value: DialogType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerticalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
      
      inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
    }
  }
}
