package typings.openui5

import typings.openui5.anon.OpenBy
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PlacementType
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPopoverMod {
  
  @JSImport("sap/m/Popover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Popover.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/popover/ Popover}
    */
  open class default () extends Popover {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PopoverSettings) = this()
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
    mSettings: PopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PopoverSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Popover with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Popover]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Popover],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Popover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Calculate outerHeight of the element; used as hook for SVG elements
      *
      * @returns The outer height of the element
      */
    inline def outerHeight(/**
      * An Element for which outerHeight will be calculated.
      */
    oElement: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerHeight")(oElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def outerHeight(
      /**
      * An Element for which outerHeight will be calculated.
      */
    oElement: HTMLElement,
      /**
      * Determines if the margins should be included in the calculated outerHeight
      */
    bIncludeMargin: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("outerHeight")(oElement.asInstanceOf[js.Any], bIncludeMargin.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Calculate outerWidth of the element; used as hook for SVG elements
      *
      * @returns The outer width of the element
      */
    inline def outerWidth(/**
      * An Element for which outerWidth will be calculated
      */
    oElement: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerWidth")(oElement.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def outerWidth(
      /**
      * An Element for which outerWidth will be calculated
      */
    oElement: HTMLElement,
      /**
      * Determines if the margins should be included in the calculated outerWidth
      */
    bIncludeMargin: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("outerWidth")(oElement.asInstanceOf[js.Any], bIncludeMargin.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @js.native
  trait Popover
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook called after adjusment of the Popover position.
      */
    def _afterAdjustPositionAndArrowHook(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook called before adjusment of the Popover position.
      */
    def _beforeAdjustPositionAndArrowHook(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * If customHeader is set, this will return the customHeaer. Otherwise it creates a header and put the title
      * and buttons if needed inside, and finally return this newly create header.
      *
      * @returns The created header
      */
    def _getAnyHeader(): typings.openui5.sapUiCoreControlMod.default | typings.openui5.sapMBarMod.default = js.native
    
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
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired after the popover is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired after the popover is closed.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired after the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired after the popover is opened.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired before the popover is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired before the popover is closed.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired before the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Popover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Popover` itself.
      *
      * This event will be fired before the popover is opened.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Popover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the popover when it's already opened.
      *
      * @returns Reference to the control instance for chaining
      */
    def close(): this.type = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Destroys the beginButton in the aggregation {@link #getBeginButton beginButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBeginButton(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the customHeader in the aggregation {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomHeader(): this.type = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Destroys the endButton in the aggregation {@link #getEndButton endButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndButton(): this.type = js.native
    
    /**
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.Popover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.Popover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.Popover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.Popover`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeOpen(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterClose afterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterClose(): this.type = js.native
    def fireAfterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenBy): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterOpen afterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterOpen(): this.type = js.native
    def fireAfterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenBy): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforeClose beforeClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeClose(): this.type = js.native
    def fireBeforeClose(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenBy): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeOpen(): this.type = js.native
    def fireBeforeOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenBy): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Gets content of aggregation {@link #getBeginButton beginButton}.
      *
      * BeginButton is shown at the left side (right side in RTL mode) inside the header. When showHeader is
      * set to false, the property is ignored.
      */
    def getBeginButton(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content inside the popover.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Gets current value of property {@link #getContentHeight contentHeight}.
      *
      * Set the height of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
      *
      * @returns Value of property `contentHeight`
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getContentMinWidth contentMinWidth}.
      *
      * Sets the minimum width of the content area inside popover.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `contentMinWidth`
      */
    def getContentMinWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Gets current value of property {@link #getContentWidth contentWidth}.
      *
      * Set the width of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
      *
      * @returns Value of property `contentWidth`
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomHeader customHeader}.
      *
      * Any control that needed to be displayed in the header area. When this is set, the showHeader property
      * is ignored, and only this customHeader is shown on the top of popover.
      */
    def getCustomHeader(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @deprecated (since 1.15.0)
      *
      * Gets current value of property {@link #getEnableScrolling enableScrolling}.
      *
      * This property is deprecated. Please use properties verticalScrolling and horizontalScrolling instead.
      * If you still use this property it will be mapped on the new properties verticalScrolling and horizontalScrolling.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableScrolling`
      */
    def getEnableScrolling(): Boolean = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Gets content of aggregation {@link #getEndButton endButton}.
      *
      * EndButton is always shown at the right side (left side in RTL mode) inside the header. When showHeader
      * is set to false, the property is ignored.
      */
    def getEndButton(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * This is optional footer which is shown on the bottom of the popover.
      */
    def getFooter(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * This property indicates if user can scroll horizontally inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `horizontalScrolling`
      */
    def getHorizontalScrolling(): Boolean = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the beginButton
      * instead.
      *
      * ID of the element which is the current target of the association {@link #getLeftButton leftButton}, or
      * `null`.
      */
    def getLeftButton(): ID = js.native
    
    /**
      * Gets current value of property {@link #getModal modal}.
      *
      * If the popover will not be closed when tapping outside the popover. It also blocks any interaction with
      * the background. The default value is false.
      *
      * Default value is `false`.
      *
      * @returns Value of property `modal`
      */
    def getModal(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOffsetX offsetX}.
      *
      * The offset for the popover placement in the x axis. It's with unit pixel.
      *
      * Default value is `0`.
      *
      * @returns Value of property `offsetX`
      */
    def getOffsetX(): int = js.native
    
    /**
      * Gets current value of property {@link #getOffsetY offsetY}.
      *
      * The offset for the popover placement in the y axis. It's with unit pixel.
      *
      * Default value is `0`.
      *
      * @returns Value of property `offsetY`
      */
    def getOffsetY(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlacement placement}.
      *
      * This is the information about on which side will the popover be placed at. Possible values are sap.m.PlacementType.Left,
      * sap.m.PlacementType.Right, sap.m.PlacementType.Top, sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal,
      * sap.m.PlacementType.HorizontalPreferredLeft, sap.m.PlacementType.HorizontalPreferredRight, sap.m.PlacementType.Vertical,
      * sap.m.PlacementType.VerticalPreferredTop, sap.m.PlacementType.VerticalPreferredBottom, sap.m.PlacementType.Auto.
      * The default value is sap.m.PlacementType.Right. Setting this property while popover is open won't cause
      * any rerendering of the popover, but it will take effect when it's opened again.
      *
      * Default value is `Right`.
      *
      * @returns Value of property `placement`
      */
    def getPlacement(): PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) = js.native
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on Popover while in experimental mode!
      *
      * Gets current value of property {@link #getResizable resizable}.
      *
      * Whether resize option is enabled. Note:* This property is effective only on Desktop
      *
      * Default value is `false`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the endButton
      * instead.
      *
      * ID of the element which is the current target of the association {@link #getRightButton rightButton},
      * or `null`.
      */
    def getRightButton(): ID = js.native
    
    /**
      * @SINCE 1.31
      *
      * Gets current value of property {@link #getShowArrow showArrow}.
      *
      * Whether Popover arrow should be visible
      *
      * Default value is `true`.
      *
      * @returns Value of property `showArrow`
      */
    def getShowArrow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * If a header should be shown at the top of the popover. Note:* The heading level of the popover is H1.
      * Headings in the popover content should start with H2 heading level.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * When subHeader is assigned to Popover, it's rendered directly after the main header if there is, or at
      * the beginning of Popover when there's no main header. SubHeader is out of the content area and won't
      * be scrolled when content's size is bigger than the content area's size.
      */
    def getSubHeader(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text appears in the header. This property will be ignored when `showHeader` is set to `false`.
      * If you want to show a header in the `sap.m.Popover`, don't forget to set the {@link #setShowHeader showHeader}
      * property to `true`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.72
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
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * This property indicates if user can scroll vertically inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `verticalScrolling`
      */
    def getVerticalScrolling(): Boolean = js.native
    
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
      * @SINCE 1.9.1
      *
      * The method checks if the Popover is open. It returns true when the Popover is currently open (this includes
      * opening and closing animations), otherwise it returns false.
      *
      * @returns whether the Popover is currently opened
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the Popover and sets the Popover position according to the {@link #getPlacement() placement} property
      * around the `oControl` parameter.
      *
      * @returns Reference to the control instance for chaining
      */
    def openBy(
      /**
      * This is the control to which the Popover will be placed. It can be not only a UI5 control, but also an
      * existing DOM reference. The side of the placement depends on the placement property set in the Popover.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    def openBy(
      /**
      * This is the control to which the Popover will be placed. It can be not only a UI5 control, but also an
      * existing DOM reference. The side of the placement depends on the placement property set in the Popover.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Indicates whether popover should be managed by InstanceManager or not.
      */
    bSkipInstanceManager: Boolean
    ): this.type = js.native
    def openBy(
      /**
      * This is the control to which the Popover will be placed. It can be not only a UI5 control, but also an
      * existing DOM reference. The side of the placement depends on the placement property set in the Popover.
      */
    oControl: HTMLElement
    ): this.type = js.native
    def openBy(
      /**
      * This is the control to which the Popover will be placed. It can be not only a UI5 control, but also an
      * existing DOM reference. The side of the placement depends on the placement property set in the Popover.
      */
    oControl: HTMLElement,
      /**
      * Indicates whether popover should be managed by InstanceManager or not.
      */
    bSkipInstanceManager: Boolean
    ): this.type = js.native
    
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
      * @SINCE 1.15.1
      *
      * Sets the aggregated {@link #getBeginButton beginButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBeginButton(/**
      * The beginButton to set
      */
    oBeginButton: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Setter for property `bounce`.
      *
      * Default value is empty
      *
      * @returns Reference to the control instance for chaining
      */
    def setBounce(/**
      * New value for property `bounce`
      */
    bBounce: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Sets a new value for property {@link #getContentHeight contentHeight}.
      *
      * Set the height of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
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
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getContentMinWidth contentMinWidth}.
      *
      * Sets the minimum width of the content area inside popover.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentMinWidth(): this.type = js.native
    def setContentMinWidth(/**
      * New value for property `contentMinWidth`
      */
    sContentMinWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Sets a new value for property {@link #getContentWidth contentWidth}.
      *
      * Set the width of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
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
      * Sets the aggregated {@link #getCustomHeader customHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomHeader(/**
      * The customHeader to set
      */
    oCustomHeader: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @deprecated (since 1.15.0)
      *
      * Sets a new value for property {@link #getEnableScrolling enableScrolling}.
      *
      * This property is deprecated. Please use properties verticalScrolling and horizontalScrolling instead.
      * If you still use this property it will be mapped on the new properties verticalScrolling and horizontalScrolling.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableScrolling(): this.type = js.native
    def setEnableScrolling(/**
      * New value for property `enableScrolling`
      */
    bEnableScrolling: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.15.1
      *
      * Sets the aggregated {@link #getEndButton endButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEndButton(/**
      * The endButton to set
      */
    oEndButton: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @SINCE 1.16.8
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The followOf feature closes the Popover when the position of the control that opened the Popover changes
      * by at least 32 pixels (on desktop browsers). This may lead to unwanted closing of the Popover.
      *
      * This function is for enabling/disabling the followOf feature.
      *
      * @returns Reference to the control instance for chaining
      */
    def setFollowOf(/**
      * Enables the followOf feature
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Sets a new value for property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * This property indicates if user can scroll horizontally inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
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
    
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.15.0
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
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the beginButton
      * instead.
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
      * Setter for property `modal`. This overwrites the default setter of the property `modal` to avoid rerendering
      * the whole popover control.
      *
      * Default value is `false`
      *
      * @returns Reference to the control instance for chaining
      */
    def setModal(/**
      * New value for property `modal`.
      */
    bModal: Boolean): this.type = js.native
    def setModal(
      /**
      * New value for property `modal`.
      */
    bModal: Boolean,
      /**
      * A CSS class (or space-separated list of classes) that should be added to the block layer.
      */
    sModalCSSClass: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOffsetX offsetX}.
      *
      * The offset for the popover placement in the x axis. It's with unit pixel.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOffsetX(): this.type = js.native
    def setOffsetX(/**
      * New value for property `offsetX`
      */
    iOffsetX: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOffsetY offsetY}.
      *
      * The offset for the popover placement in the y axis. It's with unit pixel.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOffsetY(): this.type = js.native
    def setOffsetY(/**
      * New value for property `offsetY`
      */
    iOffsetY: int): this.type = js.native
    
    def setPlacement(
      /**
      * The position of the Popover
      */
    sPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String
    ): this.type = js.native
    /**
      * Set the placement of the Popover.
      *
      * @returns Reference to the control instance for chaining
      */
    def setPlacement(/**
      * The position of the Popover
      */
    sPlacement: PlacementType): this.type = js.native
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on Popover while in experimental mode!
      *
      * Sets a new value for property {@link #getResizable resizable}.
      *
      * Whether resize option is enabled. Note:* This property is effective only on Desktop
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
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the endButton
      * instead.
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
      * @SINCE 1.31
      *
      * Sets a new value for property {@link #getShowArrow showArrow}.
      *
      * Whether Popover arrow should be visible
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowArrow(): this.type = js.native
    def setShowArrow(/**
      * New value for property `showArrow`
      */
    bShowArrow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * If a header should be shown at the top of the popover. Note:* The heading level of the popover is H1.
      * Headings in the popover content should start with H2 heading level.
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
      * @SINCE 1.15.1
      *
      * Sets the aggregated {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubHeader(/**
      * The subHeader to set
      */
    oSubHeader: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text appears in the header. This property will be ignored when `showHeader` is set to `false`.
      * If you want to show a header in the `sap.m.Popover`, don't forget to set the {@link #setShowHeader showHeader}
      * property to `true`.
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
      * @SINCE 1.72
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
      * @SINCE 1.15.0
      *
      * Sets a new value for property {@link #getVerticalScrolling verticalScrolling}.
      *
      * This property indicates if user can scroll vertically inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
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
  
  trait PopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event will be fired after the popover is closed.
      */
    var afterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired after the popover is opened.
      */
    var afterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * This event will be fired before the popover is closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired before the popover is opened.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.15.1
      *
      * BeginButton is shown at the left side (right side in RTL mode) inside the header. When showHeader is
      * set to false, the property is ignored.
      */
    var beginButton: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.16.5
      * @deprecated (since 1.42) - This parameter is obsolete and has no effect.
      *
      * Whether bouncing is enabled.
      */
    var bounce: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content inside the popover.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.0
      *
      * Set the height of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
      */
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * Sets the minimum width of the content area inside popover.
      */
    var contentMinWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.0
      *
      * Set the width of the content area inside Popover. When controls which adapt their size to the parent
      * control are added directly into Popover, for example sap.m.Page control, a size needs to be specified
      * to the content area of the Popover. Otherwise, Popover control isn't able to display the content in the
      * right way. This values isn't necessary for controls added to Popover directly which can decide their
      * size by themselves, for exmaple sap.m.List, sap.m.Image etc., only needed for controls that adapt their
      * size to the parent control.
      */
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Any control that needed to be displayed in the header area. When this is set, the showHeader property
      * is ignored, and only this customHeader is shown on the top of popover.
      */
    var customHeader: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @deprecated (since 1.15.0)
      *
      * This property is deprecated. Please use properties verticalScrolling and horizontalScrolling instead.
      * If you still use this property it will be mapped on the new properties verticalScrolling and horizontalScrolling.
      */
    var enableScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.15.1
      *
      * EndButton is always shown at the right side (left side in RTL mode) inside the header. When showHeader
      * is set to false, the property is ignored.
      */
    var endButton: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * This is optional footer which is shown on the bottom of the popover.
      */
    var footer: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * This property indicates if user can scroll horizontally inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
      */
    var horizontalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Focus on the popover is set in the sequence of `beginButton` and `endButton`, when available. But if
      * a control other than these two buttons needs to get the focus, set the `initialFocus` with the control
      * which should be focused on.
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the beginButton
      * instead.
      *
      * LeftButton is shown at the left edge of the bar in iOS, and at the right side of the bar for the other
      * platforms. Please set this to null if you want to remove the left button from the bar. And the button
      * is only removed from the bar, not destroyed. When showHeader is set to false, this property will be ignored.
      */
    var leftButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * If the popover will not be closed when tapping outside the popover. It also blocks any interaction with
      * the background. The default value is false.
      */
    var modal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The offset for the popover placement in the x axis. It's with unit pixel.
      */
    var offsetX: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The offset for the popover placement in the y axis. It's with unit pixel.
      */
    var offsetY: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This is the information about on which side will the popover be placed at. Possible values are sap.m.PlacementType.Left,
      * sap.m.PlacementType.Right, sap.m.PlacementType.Top, sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal,
      * sap.m.PlacementType.HorizontalPreferredLeft, sap.m.PlacementType.HorizontalPreferredRight, sap.m.PlacementType.Vertical,
      * sap.m.PlacementType.VerticalPreferredTop, sap.m.PlacementType.VerticalPreferredBottom, sap.m.PlacementType.Auto.
      * The default value is sap.m.PlacementType.Right. Setting this property while popover is open won't cause
      * any rerendering of the popover, but it will take effect when it's opened again.
      */
    var placement: js.UndefOr[
        PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on Popover while in experimental mode!
      *
      * Whether resize option is enabled. *Note:* This property is effective only on Desktop
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.15.1) - This property has been deprecated since 1.15.1. Please use the endButton
      * instead.
      *
      * RightButton is always shown at the right edge of the bar. Please set this to null if you want to remove
      * the right button from the bar. And the button is only removed from the bar, not destroyed. When showHeader
      * is set to false, this property will be ignored.
      */
    var rightButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.31
      *
      * Whether Popover arrow should be visible
      */
    var showArrow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If a header should be shown at the top of the popover. *Note:* The heading level of the popover is H1.
      * Headings in the popover content should start with H2 heading level.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.15.1
      *
      * When subHeader is assigned to Popover, it's rendered directly after the main header if there is, or at
      * the beginning of Popover when there's no main header. SubHeader is out of the content area and won't
      * be scrolled when content's size is bigger than the content area's size.
      */
    var subHeader: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Title text appears in the header. This property will be ignored when `showHeader` is set to `false`.
      * If you want to show a header in the `sap.m.Popover`, don't forget to set the {@link #setShowHeader showHeader}
      * property to `true`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * This property indicates if user can scroll vertically inside popover when the content is bigger than
      * the content area. However, when scrollable control (sap.m.ScrollContainer, sap.m.Page) is in the popover,
      * this property needs to be set to false to disable the scrolling in popover in order to make the scrolling
      * in the child control work properly. Popover detects if there's sap.m.NavContainer, sap.m.Page, or sap.m.ScrollContainer
      * as direct child added to Popover. If there is, Popover will turn off scrolling by setting this property
      * to false automatically ignoring the existing value of this property.
      */
    var verticalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PopoverSettings {
    
    inline def apply(): PopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setBeginButton(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "beginButton", value.asInstanceOf[js.Any])
      
      inline def setBeginButtonUndefined: Self = StObject.set(x, "beginButton", js.undefined)
      
      inline def setBounce(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setContentMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentMinWidth", value.asInstanceOf[js.Any])
      
      inline def setContentMinWidthUndefined: Self = StObject.set(x, "contentMinWidth", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setCustomHeader(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setEnableScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableScrolling", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollingUndefined: Self = StObject.set(x, "enableScrolling", js.undefined)
      
      inline def setEndButton(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "endButton", value.asInstanceOf[js.Any])
      
      inline def setEndButtonUndefined: Self = StObject.set(x, "endButton", js.undefined)
      
      inline def setFooter(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHorizontalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setLeftButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
      
      inline def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
      
      inline def setModal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOffsetX(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPlacement(
        value: PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRightButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
      
      inline def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
      
      inline def setShowArrow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setSubHeader(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVerticalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
      
      inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
    }
  }
}
