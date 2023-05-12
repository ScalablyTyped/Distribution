package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDialogMod.DialogSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nDialogMod {
  
  @JSImport("sap/m/P13nDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nDialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:a3c3c5eb54bc4cc38e6cfbd8e90c6a01 Personalization Dialog}
    */
  open class default () extends P13nDialog {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nDialogSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: P13nDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nDialog with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Dialog.extend}.
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
    oClassInfo: ClassInfo[T, P13nDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nDialog
    extends typings.openui5.sapMDialogMod.default {
    
    /**
      * Adds some panel to the aggregation {@link #getPanels panels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPanel(
      /**
      * The panel to add; if empty, nothing is inserted
      */
    oPanel: typings.openui5.sapMP13nPanelMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'cancel' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'cancel' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
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
    def attachCancel(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:ok ok} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'ok' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOk(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOk(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:ok ok} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'ok' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOk(
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
    def attachOk(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'reset' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.P13nDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nDialog` itself.
      *
      * Event fired if the 'reset' button in `P13nDialog` is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
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
    def attachReset(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getPanels panels} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindPanels(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the panels in the aggregation {@link #getPanels panels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPanels(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.P13nDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:ok ok} event of this `sap.m.P13nDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOk(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOk(
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
      * Detaches event handler `fnFunction` from the {@link #event:reset reset} event of this `sap.m.P13nDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachReset(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachReset(
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
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:ok ok} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOk(): this.type = js.native
    def fireOk(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:reset reset} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireReset(): this.type = js.native
    def fireReset(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getInitialVisiblePanelType initialVisiblePanelType}.
      *
      * This property determines which panel is initially shown when dialog is opened. If not defined then the
      * first visible panel of `panels` aggregation is taken. Setting value after the dialog is opened has no
      * effect anymore. Due to extensibility reason the type should be `string`. So it is feasible to add a custom
      * panel without expanding the type.
      *
      * @returns Value of property `initialVisiblePanelType`
      */
    def getInitialVisiblePanelType(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getPanels panels}.
      *
      * The dialog panels displayed in the dialog.
      */
    def getPanels(): js.Array[typings.openui5.sapMP13nPanelMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowReset showReset}.
      *
      * This property determines whether the 'Restore' button is shown inside the dialog. If this property is
      * set to true, clicking the 'Reset' button will trigger the `reset` event sending a notification that model
      * data must be reset.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showReset`
      */
    def getShowReset(): Boolean = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getShowResetEnabled showResetEnabled}.
      *
      * This property determines whether the 'Restore' button is enabled and is taken into account only if `showReset`
      * is set to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showResetEnabled`
      */
    def getShowResetEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getValidationExecutor validationExecutor}.
      *
      * Calls the validation listener once all panel-relevant validation checks have been done. This callback
      * function is called in order to perform cross-model validation checks.
      *
      * @returns Value of property `validationExecutor`
      */
    def getValidationExecutor(): js.Object = js.native
    
    /**
      * Returns visible panel.
      *
      * @returns panel
      */
    def getVisiblePanel(): typings.openui5.sapMP13nPanelMod.default | Null = js.native
    
    /**
      * Checks for the provided `sap.m.P13nPanel` in the aggregation {@link #getPanels panels}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPanel(/**
      * The panel whose index is looked for
      */
    oPanel: typings.openui5.sapMP13nPanelMod.default): int = js.native
    
    /**
      * Inserts a panel into the aggregation {@link #getPanels panels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPanel(
      /**
      * The panel to insert; if empty, nothing is inserted
      */
    oPanel: typings.openui5.sapMP13nPanelMod.default,
      /**
      * The `0`-based index the panel should be inserted at; for a negative value of `iIndex`, the panel is inserted
      * at position 0; for a value greater than the current size of the aggregation, the panel is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getPanels panels}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPanels(): js.Array[typings.openui5.sapMP13nPanelMod.default] = js.native
    
    def removePanel(/**
      * The panel to remove or its index or id
      */
    vPanel: String): typings.openui5.sapMP13nPanelMod.default | Null = js.native
    /**
      * Removes a panel from the aggregation {@link #getPanels panels}.
      *
      * @returns The removed panel or `null`
      */
    def removePanel(/**
      * The panel to remove or its index or id
      */
    vPanel: int): typings.openui5.sapMP13nPanelMod.default | Null = js.native
    def removePanel(
      /**
      * The panel to remove or its index or id
      */
    vPanel: typings.openui5.sapMP13nPanelMod.default
    ): typings.openui5.sapMP13nPanelMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getInitialVisiblePanelType initialVisiblePanelType}.
      *
      * This property determines which panel is initially shown when dialog is opened. If not defined then the
      * first visible panel of `panels` aggregation is taken. Setting value after the dialog is opened has no
      * effect anymore. Due to extensibility reason the type should be `string`. So it is feasible to add a custom
      * panel without expanding the type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialVisiblePanelType(): this.type = js.native
    def setInitialVisiblePanelType(/**
      * New value for property `initialVisiblePanelType`
      */
    sInitialVisiblePanelType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowReset showReset}.
      *
      * This property determines whether the 'Restore' button is shown inside the dialog. If this property is
      * set to true, clicking the 'Reset' button will trigger the `reset` event sending a notification that model
      * data must be reset.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowReset(): this.type = js.native
    def setShowReset(/**
      * New value for property `showReset`
      */
    bShowReset: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Sets a new value for property {@link #getShowResetEnabled showResetEnabled}.
      *
      * This property determines whether the 'Restore' button is enabled and is taken into account only if `showReset`
      * is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowResetEnabled(): this.type = js.native
    def setShowResetEnabled(/**
      * New value for property `showResetEnabled`
      */
    bShowResetEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidationExecutor validationExecutor}.
      *
      * Calls the validation listener once all panel-relevant validation checks have been done. This callback
      * function is called in order to perform cross-model validation checks.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidationExecutor(): this.type = js.native
    def setValidationExecutor(/**
      * New value for property `validationExecutor`
      */
    oValidationExecutor: js.Object): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getPanels panels} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindPanels(): this.type = js.native
  }
  
  trait P13nDialogSettings
    extends StObject
       with DialogSettings {
    
    /**
      * Event fired if the 'cancel' button in `P13nDialog` is clicked.
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property determines which panel is initially shown when dialog is opened. If not defined then the
      * first visible panel of `panels` aggregation is taken. Setting value after the dialog is opened has no
      * effect anymore. Due to extensibility reason the type should be `string`. So it is feasible to add a custom
      * panel without expanding the type.
      */
    var initialVisiblePanelType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event fired if the 'ok' button in `P13nDialog` is clicked.
      */
    var ok: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The dialog panels displayed in the dialog.
      */
    var panels: js.UndefOr[
        js.Array[typings.openui5.sapMP13nPanelMod.default] | typings.openui5.sapMP13nPanelMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event fired if the 'reset' button in `P13nDialog` is clicked.
      */
    var reset: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property determines whether the 'Restore' button is shown inside the dialog. If this property is
      * set to true, clicking the 'Reset' button will trigger the `reset` event sending a notification that model
      * data must be reset.
      */
    var showReset: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * This property determines whether the 'Restore' button is enabled and is taken into account only if `showReset`
      * is set to `true`.
      */
    var showResetEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Calls the validation listener once all panel-relevant validation checks have been done. This callback
      * function is called in order to perform cross-model validation checks.
      */
    var validationExecutor: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object P13nDialogSettings {
    
    inline def apply(): P13nDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nDialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nDialogSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setInitialVisiblePanelType(value: String | PropertyBindingInfo): Self = StObject.set(x, "initialVisiblePanelType", value.asInstanceOf[js.Any])
      
      inline def setInitialVisiblePanelTypeUndefined: Self = StObject.set(x, "initialVisiblePanelType", js.undefined)
      
      inline def setOk(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setPanels(
        value: js.Array[typings.openui5.sapMP13nPanelMod.default] | typings.openui5.sapMP13nPanelMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
      
      inline def setPanelsVarargs(value: typings.openui5.sapMP13nPanelMod.default*): Self = StObject.set(x, "panels", js.Array(value*))
      
      inline def setReset(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setShowReset(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showReset", value.asInstanceOf[js.Any])
      
      inline def setShowResetEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showResetEnabled", value.asInstanceOf[js.Any])
      
      inline def setShowResetEnabledUndefined: Self = StObject.set(x, "showResetEnabled", js.undefined)
      
      inline def setShowResetUndefined: Self = StObject.set(x, "showReset", js.undefined)
      
      inline def setValidationExecutor(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validationExecutor", value.asInstanceOf[js.Any])
      
      inline def setValidationExecutorUndefined: Self = StObject.set(x, "validationExecutor", js.undefined)
    }
  }
}
