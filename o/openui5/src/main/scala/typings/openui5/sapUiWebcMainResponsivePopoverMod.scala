package typings.openui5

import typings.openui5.anon.EscPressed
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiWebcMainLibraryMod.PopoverHorizontalAlign
import typings.openui5.sapUiWebcMainLibraryMod.PopoverPlacementType
import typings.openui5.sapUiWebcMainLibraryMod.PopoverVerticalAlign
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainResponsivePopoverMod {
  
  @JSImport("sap/ui/webc/main/ResponsivePopover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ResponsivePopover`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsivePopover {
    def this(/**
      * Initial settings for the new control
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
      * Initial settings for the new control
      */
    mSettings: ResponsivePopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ResponsivePopoverSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/ResponsivePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.ResponsivePopover with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.main.ResponsivePopover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ResponsivePopover
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
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
      * Adds some footer to the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFooter(
      /**
      * The footer to add; if empty, nothing is inserted
      */
    oFooter: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some header to the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeader(
      /**
      * The header to add; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Focuses the element denoted by `initialFocus`, if provided, or the first focusable element otherwise.
      */
    def applyFocus(): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired after the component is closed. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired after the component is closed. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired after the component is opened. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired after the component is opened. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired before the component is closed. This event can be cancelled, which will prevent the popup from
      * closing. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired before the component is closed. This event can be cancelled, which will prevent the popup from
      * closing. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired before the component is opened. This event can be cancelled, which will prevent the popup from
      * opening. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.ResponsivePopover` itself.
      *
      * Fired before the component is opened. This event can be cancelled, which will prevent the popup from
      * opening. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.ResponsivePopover`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the popover/dialog.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys all the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.ui.webc.main.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.ui.webc.main.ResponsivePopover`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.main.ResponsivePopover`.
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
    mParameters: js.Object): this.type = js.native
    
    /**
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
      * Fires event {@link #event:beforeClose beforeClose} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeClose(): Boolean = js.native
    def fireBeforeClose(/**
      * Parameters to pass along with the event
      */
    mParameters: EscPressed): Boolean = js.native
    
    /**
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeOpen(): Boolean = js.native
    def fireBeforeOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible name of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAllowTargetOverlap allowTargetOverlap}.
      *
      * Determines if there is no enough space, the component can be placed over the target.
      *
      * Default value is `false`.
      *
      * @returns Value of property `allowTargetOverlap`
      */
    def getAllowTargetOverlap(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the Popup.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * Defines the footer HTML Element.
      */
    def getFooter(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the header HTML Element.
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * Defines the header text.
      *
      *  **Note:** If `header` slot is provided, the `headerText` is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `headerText`
      */
    def getHeaderText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHideArrow hideArrow}.
      *
      * Determines whether the component arrow is hidden.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideArrow`
      */
    def getHideArrow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideBackdrop hideBackdrop}.
      *
      * Defines whether the block layer will be shown if modal property is set to true.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideBackdrop`
      */
    def getHideBackdrop(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHorizontalAlign horizontalAlign}.
      *
      * Determines the horizontal alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Stretch`
      *
      * Default value is `Center`.
      *
      * @returns Value of property `horizontalAlign`
      */
    def getHorizontalAlign(): PopoverHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverHorizontalAlign * / any */ String) = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * Gets current value of property {@link #getModal modal}.
      *
      * Defines whether the component should close when clicking/tapping outside of the popover. If enabled,
      * it blocks any interaction with the background.
      *
      * Default value is `false`.
      *
      * @returns Value of property `modal`
      */
    def getModal(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOpen open}.
      *
      * Indicates if the element is open
      *
      * Default value is `false`.
      *
      * @returns Value of property `open`
      */
    def getOpen(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getOpener opener}, or `null`.
      */
    def getOpener(): ID = js.native
    
    /**
      * Gets current value of property {@link #getPlacementType placementType}.
      *
      * Determines on which side the component is placed at.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Top`
      * 	 - `Bottom`
      *
      * Default value is `Right`.
      *
      * @returns Value of property `placementType`
      */
    def getPlacementType(): PopoverPlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverPlacementType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getPreventFocusRestore preventFocusRestore}.
      *
      * Defines if the focus should be returned to the previously focused element, when the popup closes.
      *
      * Default value is `false`.
      *
      * @returns Value of property `preventFocusRestore`
      */
    def getPreventFocusRestore(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVerticalAlign verticalAlign}.
      *
      * Determines the vertical alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Top`
      * 	 - `Bottom`
      * 	 - `Stretch`
      *
      * Default value is `Center`.
      *
      * @returns Value of property `verticalAlign`
      */
    def getVerticalAlign(): PopoverVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverVerticalAlign * / any */ String) = js.native
    
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFooter footer}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFooter(
      /**
      * The footer whose index is looked for
      */
    oFooter: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeader header}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeader(
      /**
      * The header whose index is looked for
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
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
      * Inserts a footer into the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFooter(
      /**
      * The footer to insert; if empty, nothing is inserted
      */
    oFooter: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the footer should be inserted at; for a negative value of `iIndex`, the footer is
      * inserted at position 0; for a value greater than the current size of the aggregation, the footer is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a header into the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeader(
      /**
      * The header to insert; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the header should be inserted at; for a negative value of `iIndex`, the header is
      * inserted at position 0; for a value greater than the current size of the aggregation, the header is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Tells if the responsive popover is open
      */
    def isOpen(): Unit = js.native
    
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
      * Removes all the controls from the aggregation {@link #getFooter footer}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFooter(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeader header}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    def removeFooter(/**
      * The footer to remove or its index or id
      */
    vFooter: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a footer from the aggregation {@link #getFooter footer}.
      *
      * @returns The removed footer or `null`
      */
    def removeFooter(/**
      * The footer to remove or its index or id
      */
    vFooter: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeFooter(
      /**
      * The footer to remove or its index or id
      */
    vFooter: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a header from the aggregation {@link #getHeader header}.
      *
      * @returns The removed header or `null`
      */
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeader(
      /**
      * The header to remove or its index or id
      */
    vHeader: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAllowTargetOverlap allowTargetOverlap}.
      *
      * Determines if there is no enough space, the component can be placed over the target.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllowTargetOverlap(): this.type = js.native
    def setAllowTargetOverlap(/**
      * New value for property `allowTargetOverlap`
      */
    bAllowTargetOverlap: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * Defines the header text.
      *
      *  **Note:** If `header` slot is provided, the `headerText` is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderText(): this.type = js.native
    def setHeaderText(/**
      * New value for property `headerText`
      */
    sHeaderText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideArrow hideArrow}.
      *
      * Determines whether the component arrow is hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideArrow(): this.type = js.native
    def setHideArrow(/**
      * New value for property `hideArrow`
      */
    bHideArrow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideBackdrop hideBackdrop}.
      *
      * Defines whether the block layer will be shown if modal property is set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideBackdrop(): this.type = js.native
    def setHideBackdrop(/**
      * New value for property `hideBackdrop`
      */
    bHideBackdrop: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHorizontalAlign horizontalAlign}.
      *
      * Determines the horizontal alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Stretch`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Center`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHorizontalAlign(): this.type = js.native
    def setHorizontalAlign(
      /**
      * New value for property `horizontalAlign`
      */
    sHorizontalAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverHorizontalAlign * / any */ String
    ): this.type = js.native
    def setHorizontalAlign(/**
      * New value for property `horizontalAlign`
      */
    sHorizontalAlign: PopoverHorizontalAlign): this.type = js.native
    
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
      * Defines whether the component should close when clicking/tapping outside of the popover. If enabled,
      * it blocks any interaction with the background.
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
      * Sets a new value for property {@link #getOpen open}.
      *
      * Indicates if the element is open
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpen(): this.type = js.native
    def setOpen(/**
      * New value for property `open`
      */
    bOpen: Boolean): this.type = js.native
    
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
      * Sets a new value for property {@link #getPlacementType placementType}.
      *
      * Determines on which side the component is placed at.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Top`
      * 	 - `Bottom`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Right`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlacementType(): this.type = js.native
    def setPlacementType(
      /**
      * New value for property `placementType`
      */
    sPlacementType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverPlacementType * / any */ String
    ): this.type = js.native
    def setPlacementType(/**
      * New value for property `placementType`
      */
    sPlacementType: PopoverPlacementType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPreventFocusRestore preventFocusRestore}.
      *
      * Defines if the focus should be returned to the previously focused element, when the popup closes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreventFocusRestore(): this.type = js.native
    def setPreventFocusRestore(/**
      * New value for property `preventFocusRestore`
      */
    bPreventFocusRestore: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVerticalAlign verticalAlign}.
      *
      * Determines the vertical alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Top`
      * 	 - `Bottom`
      * 	 - `Stretch`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Center`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVerticalAlign(): this.type = js.native
    def setVerticalAlign(
      /**
      * New value for property `verticalAlign`
      */
    sVerticalAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverVerticalAlign * / any */ String
    ): this.type = js.native
    def setVerticalAlign(/**
      * New value for property `verticalAlign`
      */
    sVerticalAlign: PopoverVerticalAlign): this.type = js.native
    
    /**
      * Shows popover on desktop and dialog on mobile.
      */
    def showAt(
      /**
      * the element that the popover is shown at
      */
    opener: HTMLElement,
      /**
      * Prevents applying the focus inside the popup
      */
    preventInitialFocus: Boolean
    ): Unit = js.native
  }
  
  trait ResponsivePopoverSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired after the component is closed. **This event does not bubble.**
      */
    var afterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired after the component is opened. **This event does not bubble.**
      */
    var afterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines if there is no enough space, the component can be placed over the target.
      */
    var allowTargetOverlap: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Fired before the component is closed. This event can be cancelled, which will prevent the popup from
      * closing. **This event does not bubble.**
      */
    var beforeClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired before the component is opened. This event can be cancelled, which will prevent the popup from
      * opening. **This event does not bubble.**
      */
    var beforeOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the content of the Popup.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the footer HTML Element.
      */
    var footer: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the header HTML Element.
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the header text.
      *
      *  **Note:** If `header` slot is provided, the `headerText` is ignored.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the component arrow is hidden.
      */
    var hideArrow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the block layer will be shown if modal property is set to true.
      */
    var hideBackdrop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the horizontal alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Stretch`
      */
    var horizontalAlign: js.UndefOr[
        PopoverHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverHorizontalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the ID of the HTML Element, which will get the initial focus.
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Defines whether the component should close when clicking/tapping outside of the popover. If enabled,
      * it blocks any interaction with the background.
      */
    var modal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the element is open
      */
    var open: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the opener id of the element that the popover is shown at
      */
    var opener: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Determines on which side the component is placed at.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      * 	 - `Top`
      * 	 - `Bottom`
      */
    var placementType: js.UndefOr[
        PopoverPlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverPlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines if the focus should be returned to the previously focused element, when the popup closes.
      */
    var preventFocusRestore: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the vertical alignment of the component.
      *
      *  Available options are:
      * 	 - `Center`
      * 	 - `Top`
      * 	 - `Bottom`
      * 	 - `Stretch`
      */
    var verticalAlign: js.UndefOr[
        PopoverVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverVerticalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ResponsivePopoverSettings {
    
    inline def apply(): ResponsivePopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsivePopoverSettings]
    }
    
    extension [Self <: ResponsivePopoverSettings](x: Self) {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAfterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAllowTargetOverlap(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allowTargetOverlap", value.asInstanceOf[js.Any])
      
      inline def setAllowTargetOverlapUndefined: Self = StObject.set(x, "allowTargetOverlap", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFooter(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHideArrow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      inline def setHideBackdrop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHideBackdropUndefined: Self = StObject.set(x, "hideBackdrop", js.undefined)
      
      inline def setHorizontalAlign(
        value: PopoverHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverHorizontalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setModal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOpen(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpener(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
      
      inline def setOpenerUndefined: Self = StObject.set(x, "opener", js.undefined)
      
      inline def setPlacementType(
        value: PopoverPlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverPlacementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "placementType", value.asInstanceOf[js.Any])
      
      inline def setPlacementTypeUndefined: Self = StObject.set(x, "placementType", js.undefined)
      
      inline def setPreventFocusRestore(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "preventFocusRestore", value.asInstanceOf[js.Any])
      
      inline def setPreventFocusRestoreUndefined: Self = StObject.set(x, "preventFocusRestore", js.undefined)
      
      inline def setVerticalAlign(
        value: PopoverVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopoverVerticalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
}
