package typings.openui5

import typings.openui5.anon.Origin
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PlacementType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMActionSheetMod {
  
  @JSImport("sap/m/ActionSheet", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionSheet.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/action-sheet/ Action Sheet}
    */
  open class default () extends ActionSheet {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ActionSheetSettings) = this()
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
    mSettings: ActionSheetSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ActionSheetSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ActionSheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ActionSheet with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ActionSheet]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionSheet],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ActionSheet.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionSheet
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
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
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired after the ActionSheet is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired after the ActionSheet is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired after the ActionSheet is opened.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired after the ActionSheet is opened.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired before the ActionSheet is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired before the ActionSheet is closed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired before the ActionSheet is opened.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event will be fired before the ActionSheet is opened.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancelButtonPress cancelButtonPress} event of
      * this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event is fired when the cancelButton is clicked.
      *
      * **Note: ** For any device other than phones, this event would be fired always when the Popover closes.
      * To prevent this behavior, the `showCancelButton` property needs to be set to `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancelButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancelButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancelButtonPress cancelButtonPress} event of
      * this `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event is fired when the cancelButton is clicked.
      *
      * **Note: ** For any device other than phones, this event would be fired always when the Popover closes.
      * To prevent this behavior, the `showCancelButton` property needs to be set to `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancelButtonPress(
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
    def attachCancelButtonPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - This event is deprecated, use the cancelButtonPress event instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:cancelButtonTap cancelButtonTap} event of this
      * `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event is fired when the cancelButton is tapped. For iPad, this event is also fired when showCancelButton
      * is set to true, and Popover is closed by tapping outside.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancelButtonTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancelButtonTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.20.0) - This event is deprecated, use the cancelButtonPress event instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:cancelButtonTap cancelButtonTap} event of this
      * `sap.m.ActionSheet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ActionSheet` itself.
      *
      * This event is fired when the cancelButton is tapped. For iPad, this event is also fired when showCancelButton
      * is set to true, and Popover is closed by tapping outside.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancelButtonTap(
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
    def attachCancelButtonTap(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ActionSheet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Calling this method will make the ActionSheet disappear from the screen.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.ActionSheet`.
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
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.ActionSheet`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.ActionSheet`.
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.ActionSheet`.
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
      * Detaches event handler `fnFunction` from the {@link #event:cancelButtonPress cancelButtonPress} event
      * of this `sap.m.ActionSheet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancelButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancelButtonPress(
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
      * @deprecated (since 1.20.0) - This event is deprecated, use the cancelButtonPress event instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:cancelButtonTap cancelButtonTap} event of
      * this `sap.m.ActionSheet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancelButtonTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancelButtonTap(
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
    mParameters: Origin): this.type = js.native
    
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
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeClose(): this.type = js.native
    def fireBeforeClose(/**
      * Parameters to pass along with the event
      */
    mParameters: Origin): this.type = js.native
    
    /**
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
      * Fires event {@link #event:cancelButtonPress cancelButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancelButtonPress(): this.type = js.native
    def fireCancelButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - This event is deprecated, use the cancelButtonPress event instead.
      *
      * Fires event {@link #event:cancelButtonTap cancelButtonTap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancelButtonTap(): this.type = js.native
    def fireCancelButtonTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * These buttons are added to the content area in ActionSheet control. When button is tapped, the ActionSheet
      * is closed before the tap event listener is called.
      */
    def getButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getCancelButtonText cancelButtonText}.
      *
      * This is the text displayed in the cancelButton. Default value is "Cancel", and it's translated according
      * to the current locale setting. This property will be ignored when running either in iPad or showCancelButton
      * is set to false.
      *
      * @returns Value of property `cancelButtonText`
      */
    def getCancelButtonText(): String = js.native
    
    /**
      * Gets current value of property {@link #getPlacement placement}.
      *
      * The ActionSheet behaves as an sap.m.Popover in iPad and this property is the information about on which
      * side will the popover be placed at. Possible values are sap.m.PlacementType.Left, sap.m.PlacementType.Right,
      * sap.m.PlacementType.Top, sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal, sap.m.PlacementType.HorizontalPreferedLeft,
      * sap.m.PlacementType.HorizontalPreferedRight, sap.m.PlacementType.Vertical, sap.m.PlacementType.VerticalPreferedTop,
      * sap.m.PlacementType.VerticalPreferedBottom. The default value is sap.m.PlacementType.Bottom.
      *
      * Default value is `Bottom`.
      *
      * @returns Value of property `placement`
      */
    def getPlacement(): PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) = js.native
    
    /**
      * Gets the ID of the hidden label
      *
      * @returns ID of hidden text
      */
    def getPopupHiddenLabelId(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowCancelButton showCancelButton}.
      *
      * If this is set to true, there will be a cancel button shown below the action buttons. There won't be
      * any cancel button shown in iPad regardless of this property. The default value is set to true.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCancelButton`
      */
    def getShowCancelButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title will be shown in the header area in iPhone and every Android devices. This property will be ignored
      * in tablets and desktop browser.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
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
      * The method checks if the ActionSheet is open. It returns true when the ActionSheet is currently open
      * (this includes opening and closing animations), otherwise it returns false.
      *
      * @returns Whether the ActionSheet is open.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Calling this method will make the ActionSheet visible on the screen. The control parameter is the object
      * to which the ActionSheet will be placed. It can be not only a UI5 control, but also an existing DOM reference.
      * The side of the placement depends on the `placement` property set in the Popover (on tablet and desktop).
      * On other platforms, ActionSheet behaves as a standard dialog and this parameter is ignored because dialog
      * is aligned to the screen.
      */
    def openBy(/**
      * The control to which the ActionSheet is opened
      */
    oControl: js.Object): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
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
    
    /**
      * Sets a new value for property {@link #getCancelButtonText cancelButtonText}.
      *
      * This is the text displayed in the cancelButton. Default value is "Cancel", and it's translated according
      * to the current locale setting. This property will be ignored when running either in iPad or showCancelButton
      * is set to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCancelButtonText(): this.type = js.native
    def setCancelButtonText(/**
      * New value for property `cancelButtonText`
      */
    sCancelButtonText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlacement placement}.
      *
      * The ActionSheet behaves as an sap.m.Popover in iPad and this property is the information about on which
      * side will the popover be placed at. Possible values are sap.m.PlacementType.Left, sap.m.PlacementType.Right,
      * sap.m.PlacementType.Top, sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal, sap.m.PlacementType.HorizontalPreferedLeft,
      * sap.m.PlacementType.HorizontalPreferedRight, sap.m.PlacementType.Vertical, sap.m.PlacementType.VerticalPreferedTop,
      * sap.m.PlacementType.VerticalPreferedBottom. The default value is sap.m.PlacementType.Bottom.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Bottom`.
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
      * Sets a new value for property {@link #getShowCancelButton showCancelButton}.
      *
      * If this is set to true, there will be a cancel button shown below the action buttons. There won't be
      * any cancel button shown in iPad regardless of this property. The default value is set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCancelButton(): this.type = js.native
    def setShowCancelButton(/**
      * New value for property `showCancelButton`
      */
    bShowCancelButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title will be shown in the header area in iPhone and every Android devices. This property will be ignored
      * in tablets and desktop browser.
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
  
  trait ActionSheetSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event will be fired after the ActionSheet is closed.
      */
    var afterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired after the ActionSheet is opened.
      */
    var afterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired before the ActionSheet is closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired before the ActionSheet is opened.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * These buttons are added to the content area in ActionSheet control. When button is tapped, the ActionSheet
      * is closed before the tap event listener is called.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the cancelButton is clicked.
      *
      * **Note: ** For any device other than phones, this event would be fired always when the Popover closes.
      * To prevent this behavior, the `showCancelButton` property needs to be set to `false`.
      */
    var cancelButtonPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.20.0) - This event is deprecated, use the cancelButtonPress event instead.
      *
      * This event is fired when the cancelButton is tapped. For iPad, this event is also fired when showCancelButton
      * is set to true, and Popover is closed by tapping outside.
      */
    var cancelButtonTap: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This is the text displayed in the cancelButton. Default value is "Cancel", and it's translated according
      * to the current locale setting. This property will be ignored when running either in iPad or showCancelButton
      * is set to false.
      */
    var cancelButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The ActionSheet behaves as an sap.m.Popover in iPad and this property is the information about on which
      * side will the popover be placed at. Possible values are sap.m.PlacementType.Left, sap.m.PlacementType.Right,
      * sap.m.PlacementType.Top, sap.m.PlacementType.Bottom, sap.m.PlacementType.Horizontal, sap.m.PlacementType.HorizontalPreferedLeft,
      * sap.m.PlacementType.HorizontalPreferedRight, sap.m.PlacementType.Vertical, sap.m.PlacementType.VerticalPreferedTop,
      * sap.m.PlacementType.VerticalPreferedBottom. The default value is sap.m.PlacementType.Bottom.
      */
    var placement: js.UndefOr[
        PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If this is set to true, there will be a cancel button shown below the action buttons. There won't be
      * any cancel button shown in iPad regardless of this property. The default value is set to true.
      */
    var showCancelButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Title will be shown in the header area in iPhone and every Android devices. This property will be ignored
      * in tablets and desktop browser.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ActionSheetSettings {
    
    inline def apply(): ActionSheetSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetSettings]
    }
    
    extension [Self <: ActionSheetSettings](x: Self) {
      
      inline def setAfterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setBeforeClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCancelButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancelButtonPress", js.Any.fromFunction1(value))
      
      inline def setCancelButtonPressUndefined: Self = StObject.set(x, "cancelButtonPress", js.undefined)
      
      inline def setCancelButtonTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancelButtonTap", js.Any.fromFunction1(value))
      
      inline def setCancelButtonTapUndefined: Self = StObject.set(x, "cancelButtonTap", js.undefined)
      
      inline def setCancelButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setPlacement(
        value: PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowCancelButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
      
      inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
