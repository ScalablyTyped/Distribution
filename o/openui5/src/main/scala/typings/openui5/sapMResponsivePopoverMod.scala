package typings.openui5

import typings.openui5.anon.OpenBy
import typings.openui5.anon.OpenByOrigin
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.PlacementType
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMResponsivePopoverMod {
  
  @JSImport("sap/m/ResponsivePopover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ResponsivePopover.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/popover/ Responsive Popover}
    */
  open class default () extends ResponsivePopover {
    def this(/**
      * Initial settings for the new control A popover-based control that behaves differently according to the
      * device it is on.
      */
    mSettings: ResponsivePopoverSettings) = this()
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
      * Initial settings for the new control A popover-based control that behaves differently according to the
      * device it is on.
      */
    mSettings: ResponsivePopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control A popover-based control that behaves differently according to the
      * device it is on.
      */
    mSettings: ResponsivePopoverSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ResponsivePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ResponsivePopover with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ResponsivePopover]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsivePopover],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ResponsivePopover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsivePopover
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Adds content to the ResponsivePopover
      */
    def addContent(
      /**
      * The control to be added to the content
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired after popover or dialog is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired after popover or dialog is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired after popover or dialog is open.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired after popover or dialog is open.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired before popover or dialog is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired before popover or dialog is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired before popover or dialog is open.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ResponsivePopover` itself.
      *
      * Event is fired before popover or dialog is open.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ResponsivePopover` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the ResponsivePopover.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def close(): this.type = js.native
    
    /**
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
      * Destroys the endButton in the aggregation {@link #getEndButton endButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndButton(): this.type = js.native
    
    /**
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ResponsivePopover`.
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
      * Fires event {@link #event:afterClose afterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterClose(): this.type = js.native
    def fireAfterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenByOrigin): this.type = js.native
    
    /**
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
      * Fires event {@link #event:beforeClose beforeClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeClose(): this.type = js.native
    def fireBeforeClose(/**
      * Parameters to pass along with the event
      */
    mParameters: OpenByOrigin): this.type = js.native
    
    /**
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
      * Getter for beginButton aggregation
      *
      * @returns The button that is set as a beginButton aggregation
      */
    def getBeginButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content is supported by both variants. Please see the documentation on sap.m.Popover#content and sap.m.Dialog#content
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getContentHeight contentHeight}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentHeight
      * and sap.m.Dialog#contentHeight
      *
      * @returns Value of property `contentHeight`
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getContentWidth contentWidth}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentWidth
      * and sap.m.Dialog#contentWidth
      *
      * @returns Value of property `contentWidth`
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomHeader customHeader}.
      *
      * CustomHeader is supported by both variants. Please see the documentation on sap.m.Popover#customHeader
      * and sap.m.Dialog#customHeader
      */
    def getCustomHeader(): IBar = js.native
    
    /**
      * Getter for endButton aggregation
      *
      * @returns The button that is set as an endButton aggregation
      */
    def getEndButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#horizontalScrolling
      * and sap.m.Dialog#horizontalScrolling
      *
      * Default value is `true`.
      *
      * @returns Value of property `horizontalScrolling`
      */
    def getHorizontalScrolling(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * This property only takes effect on phone. Please see the documentation sap.m.Dialog#icon.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * Gets current value of property {@link #getModal modal}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#modal.
      *
      * @returns Value of property `modal`
      */
    def getModal(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOffsetX offsetX}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetX.
      *
      * @returns Value of property `offsetX`
      */
    def getOffsetX(): int = js.native
    
    /**
      * Gets current value of property {@link #getOffsetY offsetY}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetY.
      *
      * @returns Value of property `offsetY`
      */
    def getOffsetY(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlacement placement}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#placement.
      *
      * Default value is `Right`.
      *
      * @returns Value of property `placement`
      */
    def getPlacement(): PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) = js.native
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on ResponsivePopover while in experimental mode!
      *
      * Gets current value of property {@link #getResizable resizable}.
      *
      * Whether resize option is enabled.
      *
      * Default value is `false`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowArrow showArrow}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#showArrow.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showArrow`
      */
    def getShowArrow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowCloseButton showCloseButton}.
      *
      * Determines if a close button should be inserted into the dialog's header dynamically to close the dialog.
      * This property only takes effect on phone. **Note:** The close button could be placed only in a sap.m.Bar
      * if a sap.m.Toolbar is passed as a header - the property will not take effect.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCloseButton`
      */
    def getShowCloseButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#showHeader
      * and sap.m.Dialog#showHeader
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * SubHeader is supported by both variants. Please see the documentation on sap.m.Popover#subHeader and
      * sap.m.Dialog#subHeader
      */
    def getSubHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#title and
      * sap.m.Dialog#title
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
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#verticalScrolling
      * and sap.m.Dialog#verticalScrolling
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
      * Checks whether the ResponsivePopover is currently open.
      *
      * @returns whether the ResponsivePopover is currently opened
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the ResponsivePopover. The ResponsivePopover is positioned relatively to the control parameter
      * on tablet or desktop and is full screen on phone. Therefore the control parameter is only used on tablet
      * or desktop and is ignored on phone.
      *
      * @returns Reference to the opening control
      */
    def openBy(
      /**
      * When this control is displayed on tablet or desktop, the ResponsivePopover is positioned relative to
      * this UI5 control or DOM element.
      */
    oParent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapMPopoverMod.default | typings.openui5.sapMDialogMod.default = js.native
    def openBy(
      /**
      * When this control is displayed on tablet or desktop, the ResponsivePopover is positioned relative to
      * this UI5 control or DOM element.
      */
    oParent: HTMLElement
    ): typings.openui5.sapMPopoverMod.default | typings.openui5.sapMDialogMod.default = js.native
    
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
      * Setter for beginButton aggregation
      *
      * @returns Pointer to the control instance for chaining
      */
    def setBeginButton(
      /**
      * The button that will be set as an aggregation
      */
    oButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentHeight contentHeight}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentHeight
      * and sap.m.Dialog#contentHeight
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
      * Sets a new value for property {@link #getContentWidth contentWidth}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentWidth
      * and sap.m.Dialog#contentWidth
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
    oCustomHeader: IBar): this.type = js.native
    
    /**
      * Setter for endButton aggregation
      *
      * @returns Pointer to the control instance for chaining
      */
    def setEndButton(
      /**
      * The button that will be set as an aggregation
      */
    oButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#horizontalScrolling
      * and sap.m.Dialog#horizontalScrolling
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
      * This property only takes effect on phone. Please see the documentation sap.m.Dialog#icon.
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
      * Sets a new value for property {@link #getModal modal}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#modal.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModal(): this.type = js.native
    def setModal(/**
      * New value for property `modal`
      */
    bModal: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOffsetX offsetX}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetX.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
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
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetY.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOffsetY(): this.type = js.native
    def setOffsetY(/**
      * New value for property `offsetY`
      */
    iOffsetY: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlacement placement}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#placement.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Right`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlacement(): this.type = js.native
    def setPlacement(
      /**
      * New value for property `placement`
      */
    sPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String
    ): this.type = js.native
    def setPlacement(/**
      * New value for property `placement`
      */
    sPlacement: PlacementType): this.type = js.native
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on ResponsivePopover while in experimental mode!
      *
      * Sets a new value for property {@link #getResizable resizable}.
      *
      * Whether resize option is enabled.
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
    
    /**
      * Sets a new value for property {@link #getShowArrow showArrow}.
      *
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#showArrow.
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
      * Determines if the close button to the ResponsivePopover is shown or not. Works only when ResponsivePopover
      * is used as a dialog
      *
      * @returns Pointer to the control instance for chaining
      */
    def setShowCloseButton(/**
      * Defines whether the close button is shown
      */
    bShowCloseButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#showHeader
      * and sap.m.Dialog#showHeader
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
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#title and
      * sap.m.Dialog#title
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
      * Sets a new value for property {@link #getVerticalScrolling verticalScrolling}.
      *
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#verticalScrolling
      * and sap.m.Dialog#verticalScrolling
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
  
  trait ResponsivePopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired after popover or dialog is closed.
      */
    var afterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired after popover or dialog is open.
      */
    var afterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Event is fired before popover or dialog is closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired before popover or dialog is open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * BeginButton is supported by both variants. It is always show in the left part (right part in RTL mode)
      * of the footer which is located at the bottom of the ResponsivePopover. If buttons need to be displayed
      * in header, please use customHeader instead.
      */
    var beginButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * Content is supported by both variants. Please see the documentation on sap.m.Popover#content and sap.m.Dialog#content
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentHeight
      * and sap.m.Dialog#contentHeight
      */
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#contentWidth
      * and sap.m.Dialog#contentWidth
      */
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * CustomHeader is supported by both variants. Please see the documentation on sap.m.Popover#customHeader
      * and sap.m.Dialog#customHeader
      */
    var customHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * EndButton is supported by both variants. It is always show in the right part (left part in RTL mode)
      * of the footer which is located at the bottom of the ResponsivePopover. If buttons need to be displayed
      * in header, please use customHeader instead.
      */
    var endButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#horizontalScrolling
      * and sap.m.Dialog#horizontalScrolling
      */
    var horizontalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property only takes effect on phone. Please see the documentation sap.m.Dialog#icon.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * InitialFocus is supported by both variants. Please see the documentation on sap.m.Popover#initialFocus
      * and sap.m.Dialog#initialFocus
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#modal.
      */
    var modal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetX.
      */
    var offsetX: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#offsetY.
      */
    var offsetY: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#placement.
      */
    var placement: js.UndefOr[
        PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.36.4
      * @EXPERIMENTAL (since 1.36.4) - Do not use directly on ResponsivePopover while in experimental mode!
      *
      * Whether resize option is enabled.
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property only takes effect on desktop or tablet. Please see the documentation sap.m.Popover#showArrow.
      */
    var showArrow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if a close button should be inserted into the dialog's header dynamically to close the dialog.
      * This property only takes effect on phone. **Note:** The close button could be placed only in a sap.m.Bar
      * if a sap.m.Toolbar is passed as a header - the property will not take effect.
      */
    var showCloseButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#showHeader
      * and sap.m.Dialog#showHeader
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * SubHeader is supported by both variants. Please see the documentation on sap.m.Popover#subHeader and
      * sap.m.Dialog#subHeader
      */
    var subHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#title and
      * sap.m.Dialog#title
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
      * This property is supported by both variants. Please see the documentation on sap.m.Popover#verticalScrolling
      * and sap.m.Dialog#verticalScrolling
      */
    var verticalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ResponsivePopoverSettings {
    
    inline def apply(): ResponsivePopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsivePopoverSettings]
    }
    
    extension [Self <: ResponsivePopoverSettings](x: Self) {
      
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
      
      inline def setBeginButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "beginButton", value.asInstanceOf[js.Any])
      
      inline def setBeginButtonUndefined: Self = StObject.set(x, "beginButton", js.undefined)
      
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
      
      inline def setEndButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "endButton", value.asInstanceOf[js.Any])
      
      inline def setEndButtonUndefined: Self = StObject.set(x, "endButton", js.undefined)
      
      inline def setHorizontalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
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
      
      inline def setShowArrow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setShowCloseButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setSubHeader(value: IBar): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
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
