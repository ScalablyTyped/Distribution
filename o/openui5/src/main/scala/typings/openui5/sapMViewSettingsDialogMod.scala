package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.StringFilterOperator
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMViewSettingsDialogMod {
  
  @JSImport("sap/m/ViewSettingsDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ViewSettingsDialog`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/view-settings-dialog/ View Settings Dialog}
    */
  open class default () extends ViewSettingsDialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsDialogSettings) = this()
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
    mSettings: ViewSettingsDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ViewSettingsDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ViewSettingsDialog with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ViewSettingsDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ViewSettingsDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ViewSettingsDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  type SelectedFilterKeys = Record[String, Boolean]
  
  @js.native
  trait ViewSettingsDialog
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Overwrites the aggregation setter in order to have ID validation logic as some strings are reserved for
      * the predefined tabs.
      *
      * @returns Reference to `this` for method chaining
      */
    def addCustomTab(
      /**
      * The custom tab to be added
      */
    oCustomTab: typings.openui5.sapMViewSettingsCustomTabMod.default
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Adds some filterItem to the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilterItem(
      /**
      * The filterItem to add; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Adds a group item and sets the association to reflect the selected state.
      *
      * @returns Reference to `this` for method chaining
      */
    def addGroupItem(
      /**
      * The item to be added to the group items
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Adds a preset filter item and sets the association to reflect the selected state.
      *
      * @returns Reference to `this` for method chaining
      */
    def addPresetFilterItem(
      /**
      * The selected item or a string with the key
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Adds a sort item and sets the association to reflect the selected state.
      *
      * @returns Reference to `this` for method chaining
      */
    def addSortItem(
      /**
      * The item to be added to the aggregation
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the Cancel button is pressed. It can be used to set the state of custom filter controls.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the Cancel button is pressed. It can be used to set the state of custom filter controls.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Indicates that the user has pressed the OK button and the selected sort, group, and filter settings should
      * be applied to the data on this page.
      *
      * **Note:** Custom tabs are not converted to event parameters automatically. For custom tabs, you have
      * to read the state of your controls inside the callback of this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Indicates that the user has pressed the OK button and the selected sort, group, and filter settings should
      * be applied to the data on this page.
      *
      * **Note:** Custom tabs are not converted to event parameters automatically. For custom tabs, you have
      * to read the state of your controls inside the callback of this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterDetailPageOpened filterDetailPageOpened }
      * event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Fired when the filter detail page is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterDetailPageOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit]
    ): this.type = js.native
    def attachFilterDetailPageOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterDetailPageOpened filterDetailPageOpened }
      * event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Fired when the filter detail page is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterDetailPageOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit]
    ): this.type = js.native
    def attachFilterDetailPageOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the Reset button is pressed. It can be used to set the state of custom tabs.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the Reset button is pressed. It can be used to set the state of custom tabs.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resetFilters resetFilters} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the filters are being reset.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResetFilters(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachResetFilters(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resetFilters resetFilters} event of this `sap.m.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsDialog` itself.
      *
      * Called when the filters are being reset.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResetFilters(
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
    def attachResetFilters(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Binds aggregation {@link #getCustomTabs customTabs} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindCustomTabs(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Binds aggregation {@link #getFilterItems filterItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindFilterItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Binds aggregation {@link #getGroupItems groupItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindGroupItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Binds aggregation {@link #getPresetFilterItems presetFilterItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindPresetFilterItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Binds aggregation {@link #getSortItems sortItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindSortItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Clears the selected filters and navigates to the filter overview page
      *
      * @returns Reference to `this` for method chaining
      */
    def clearFilters(): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Destroys all the customTabs in the aggregation {@link #getCustomTabs customTabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomTabs(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Destroys all the filterItems in the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Destroys all the groupItems in the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyGroupItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Destroys all the presetFilterItems in the aggregation {@link #getPresetFilterItems presetFilterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPresetFilterItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Destroys all the sortItems in the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySortItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit]
    ): this.type = js.native
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogConfirmEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:filterDetailPageOpened filterDetailPageOpened }
      * event of this `sap.m.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilterDetailPageOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit]
    ): this.type = js.native
    def detachFilterDetailPageOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsDialogFilterDetailPageOpenedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:reset reset} event of this `sap.m.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachReset(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachReset(
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
      * Detaches event handler `fnFunction` from the {@link #event:resetFilters resetFilters} event of this `sap.m.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachResetFilters(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachResetFilters(
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ViewSettingsDialog$ConfirmEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:filterDetailPageOpened filterDetailPageOpened} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilterDetailPageOpened(): this.type = js.native
    def fireFilterDetailPageOpened(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ViewSettingsDialog$FilterDetailPageOpenedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:resetFilters resetFilters} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireResetFilters(): this.type = js.native
    def fireResetFilters(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Gets content of aggregation {@link #getCustomTabs customTabs}.
      *
      * The list of all the custom tabs.
      */
    def getCustomTabs(): js.Array[typings.openui5.sapMViewSettingsCustomTabMod.default] = js.native
    
    /**
      * @since 1.16
      *
      * Gets content of aggregation {@link #getFilterItems filterItems}.
      *
      * The list of items with key and value that can be filtered on (for example, a list of columns for a table).
      * A filterItem is associated with one or more detail filters.
      *
      * **Note:** It is recommended to use the `sap.m.ViewSettingsFilterItem` as it fits best at the filter page.
      */
    def getFilterItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @since 1.42
      *
      * Gets current value of property {@link #getFilterSearchOperator filterSearchOperator}.
      *
      * Provides a string filter operator which is used when the user searches items in filter details page.
      * Possible operators are: `AnyWordStartsWith`, `Contains`, `StartsWith`, `Equals`. This property will be
      * ignored if a custom callback is provided through `setFilterSearchCallback` method.
      *
      * Default value is `StartsWith`.
      *
      * @returns Value of property `filterSearchOperator`
      */
    def getFilterSearchOperator(): StringFilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StringFilterOperator * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getGroupDescending groupDescending}.
      *
      * Determines whether the group order is descending or ascending (default).
      *
      * Default value is `false`.
      *
      * @returns Value of property `groupDescending`
      */
    def getGroupDescending(): Boolean = js.native
    
    /**
      * @since 1.16
      *
      * Gets content of aggregation {@link #getGroupItems groupItems}.
      *
      * The list of items with key and value that can be grouped on (for example, a list of columns for a table).
      */
    def getGroupItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @since 1.16
      *
      * Gets content of aggregation {@link #getPresetFilterItems presetFilterItems}.
      *
      * The list of preset filter items with key and value that allows the selection of more complex or custom
      * filters. These entries are displayed at the top of the filter tab.
      */
    def getPresetFilterItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @since 1.42
      *
      * Gets the selected filter object in format { parent_key: { key: boolean, key2: boolean, ...}, ... }.
      *
      * @returns An object with item and sub-item keys
      */
    def getSelectedFilterCompoundKeys(): Record[String, SelectedFilterKeys] = js.native
    
    /**
      * Returns the selected filters as an array of ViewSettingsItems.
      *
      * It can be used to create matching sorters and filters to apply the selected settings to the data.
      *
      * @returns An array of selected filter items
      */
    def getSelectedFilterItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @deprecated (since 1.42) - replaced by `getSelectedFilterCompoundKeys` method
      *
      * Gets the selected filter object in format {key: boolean}.
      *
      * It can be used to create matching sorters and filters to apply the selected settings to the data.
      *
      * @returns An object with item and sub-item keys
      */
    def getSelectedFilterKeys(): SelectedFilterKeys = js.native
    
    /**
      * Gets the filter string in format: "filter name (subfilter1 name, subfilter2 name, ...), ...". For custom
      * and preset filters it will only add the filter name to the resulting string.
      *
      * @returns The selected filter string
      */
    def getSelectedFilterString(): String = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedGroupItem selectedGroupItem},
      * or `null`.
      */
    def getSelectedGroupItem(): ID = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedPresetFilterItem selectedPresetFilterItem},
      * or `null`.
      */
    def getSelectedPresetFilterItem(): ID = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedSortItem selectedSortItem},
      * or `null`.
      */
    def getSelectedSortItem(): ID = js.native
    
    /**
      * Gets current value of property {@link #getSortDescending sortDescending}.
      *
      * Determines whether the sort order is descending or ascending (default).
      *
      * Default value is `false`.
      *
      * @returns Value of property `sortDescending`
      */
    def getSortDescending(): Boolean = js.native
    
    /**
      * @since 1.16
      *
      * Gets content of aggregation {@link #getSortItems sortItems}.
      *
      * The list of items with key and value that can be sorted over (for example, a list of columns for a table).
      */
    def getSortItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the dialog. If not set and there is only one active tab, the dialog uses the default
      * "View" or "Sort", "Group", "Filter" respectively.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.72
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * Forward method to the inner dialog method: hasStyleClass.
      *
      * @returns true if the class is set, false otherwise
      */
    def hasStyleClass(): Boolean = js.native
    
    /**
      * @since 1.30
      *
      * Checks for the provided `sap.m.ViewSettingsCustomTab` in the aggregation {@link #getCustomTabs customTabs}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomTab(
      /**
      * The customTab whose index is looked for
      */
    oCustomTab: typings.openui5.sapMViewSettingsCustomTabMod.default
    ): int = js.native
    
    /**
      * @since 1.16
      *
      * Checks for the provided `sap.m.ViewSettingsItem` in the aggregation {@link #getFilterItems filterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilterItem(
      /**
      * The filterItem whose index is looked for
      */
    oFilterItem: typings.openui5.sapMViewSettingsItemMod.default
    ): int = js.native
    
    /**
      * @since 1.16
      *
      * Checks for the provided `sap.m.ViewSettingsItem` in the aggregation {@link #getGroupItems groupItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfGroupItem(
      /**
      * The groupItem whose index is looked for
      */
    oGroupItem: typings.openui5.sapMViewSettingsItemMod.default
    ): int = js.native
    
    /**
      * @since 1.16
      *
      * Checks for the provided `sap.m.ViewSettingsItem` in the aggregation {@link #getPresetFilterItems presetFilterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPresetFilterItem(
      /**
      * The presetFilterItem whose index is looked for
      */
    oPresetFilterItem: typings.openui5.sapMViewSettingsItemMod.default
    ): int = js.native
    
    /**
      * @since 1.16
      *
      * Checks for the provided `sap.m.ViewSettingsItem` in the aggregation {@link #getSortItems sortItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSortItem(
      /**
      * The sortItem whose index is looked for
      */
    oSortItem: typings.openui5.sapMViewSettingsItemMod.default
    ): int = js.native
    
    /**
      * @since 1.30
      *
      * Inserts a customTab into the aggregation {@link #getCustomTabs customTabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomTab(
      /**
      * The customTab to insert; if empty, nothing is inserted
      */
    oCustomTab: typings.openui5.sapMViewSettingsCustomTabMod.default,
      /**
      * The `0`-based index the customTab should be inserted at; for a negative value of `iIndex`, the customTab
      * is inserted at position 0; for a value greater than the current size of the aggregation, the customTab
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Inserts a filterItem into the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilterItem(
      /**
      * The filterItem to insert; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapMViewSettingsItemMod.default,
      /**
      * The `0`-based index the filterItem should be inserted at; for a negative value of `iIndex`, the filterItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the filterItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Inserts a groupItem into the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertGroupItem(
      /**
      * The groupItem to insert; if empty, nothing is inserted
      */
    oGroupItem: typings.openui5.sapMViewSettingsItemMod.default,
      /**
      * The `0`-based index the groupItem should be inserted at; for a negative value of `iIndex`, the groupItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the groupItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Inserts a presetFilterItem into the aggregation {@link #getPresetFilterItems presetFilterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPresetFilterItem(
      /**
      * The presetFilterItem to insert; if empty, nothing is inserted
      */
    oPresetFilterItem: typings.openui5.sapMViewSettingsItemMod.default,
      /**
      * The `0`-based index the presetFilterItem should be inserted at; for a negative value of `iIndex`, the
      * presetFilterItem is inserted at position 0; for a value greater than the current size of the aggregation,
      * the presetFilterItem is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Inserts a sortItem into the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSortItem(
      /**
      * The sortItem to insert; if empty, nothing is inserted
      */
    oSortItem: typings.openui5.sapMViewSettingsItemMod.default,
      /**
      * The `0`-based index the sortItem should be inserted at; for a negative value of `iIndex`, the sortItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the sortItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the ViewSettingsDialog relative to the parent control.
      *
      * @returns Reference to `this` for method chaining
      */
    def open(): this.type = js.native
    def open(
      /**
      * The ID of the initial page to be opened in the dialog. The available values are "sort", "group", "filter"
      * or IDs of custom tabs.
      */
    sPageId: String
    ): this.type = js.native
    
    /**
      * @since 1.30
      *
      * Removes all the controls from the aggregation {@link #getCustomTabs customTabs}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomTabs(): js.Array[typings.openui5.sapMViewSettingsCustomTabMod.default] = js.native
    
    /**
      * Removes all filter Items and resets the remembered page if it was a filter detail page and all of its
      * filter items are being removed.
      *
      * @returns the removed items
      */
    def removeAllFilterItems(): js.Array[typings.openui5.sapMViewSettingsFilterItemMod.default] = js.native
    
    /**
      * @since 1.16
      *
      * Removes all the controls from the aggregation {@link #getGroupItems groupItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllGroupItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @since 1.16
      *
      * Removes all the controls from the aggregation {@link #getPresetFilterItems presetFilterItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPresetFilterItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * @since 1.16
      *
      * Removes all the controls from the aggregation {@link #getSortItems sortItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSortItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    def removeCustomTab(/**
      * The customTab to remove or its index or id
      */
    vCustomTab: String): typings.openui5.sapMViewSettingsCustomTabMod.default | Null = js.native
    /**
      * @since 1.30
      *
      * Removes a customTab from the aggregation {@link #getCustomTabs customTabs}.
      *
      * @returns The removed customTab or `null`
      */
    def removeCustomTab(/**
      * The customTab to remove or its index or id
      */
    vCustomTab: int): typings.openui5.sapMViewSettingsCustomTabMod.default | Null = js.native
    def removeCustomTab(
      /**
      * The customTab to remove or its index or id
      */
    vCustomTab: typings.openui5.sapMViewSettingsCustomTabMod.default
    ): typings.openui5.sapMViewSettingsCustomTabMod.default | Null = js.native
    
    def removeFilterItem(/**
      * The filter item's index, or the item itself, or its id
      */
    vFilterItem: String): typings.openui5.sapMViewSettingsFilterItemMod.default | Null = js.native
    /**
      * Removes a filter Item and resets the remembered page if it was the filter detail page of the removed
      * filter.
      *
      * @returns The removed item or `null`
      */
    def removeFilterItem(/**
      * The filter item's index, or the item itself, or its id
      */
    vFilterItem: int): typings.openui5.sapMViewSettingsFilterItemMod.default | Null = js.native
    def removeFilterItem(
      /**
      * The filter item's index, or the item itself, or its id
      */
    vFilterItem: typings.openui5.sapMViewSettingsFilterItemMod.default
    ): typings.openui5.sapMViewSettingsFilterItemMod.default | Null = js.native
    
    def removeGroupItem(/**
      * The groupItem to remove or its index or id
      */
    vGroupItem: String): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    /**
      * @since 1.16
      *
      * Removes a groupItem from the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns The removed groupItem or `null`
      */
    def removeGroupItem(/**
      * The groupItem to remove or its index or id
      */
    vGroupItem: int): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    def removeGroupItem(
      /**
      * The groupItem to remove or its index or id
      */
    vGroupItem: typings.openui5.sapMViewSettingsItemMod.default
    ): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    
    def removePresetFilterItem(/**
      * The presetFilterItem to remove or its index or id
      */
    vPresetFilterItem: String): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    /**
      * @since 1.16
      *
      * Removes a presetFilterItem from the aggregation {@link #getPresetFilterItems presetFilterItems}.
      *
      * @returns The removed presetFilterItem or `null`
      */
    def removePresetFilterItem(/**
      * The presetFilterItem to remove or its index or id
      */
    vPresetFilterItem: int): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    def removePresetFilterItem(
      /**
      * The presetFilterItem to remove or its index or id
      */
    vPresetFilterItem: typings.openui5.sapMViewSettingsItemMod.default
    ): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: String): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    /**
      * @since 1.16
      *
      * Removes a sortItem from the aggregation {@link #getSortItems sortItems}.
      *
      * @returns The removed sortItem or `null`
      */
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: int): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    def removeSortItem(
      /**
      * The sortItem to remove or its index or id
      */
    vSortItem: typings.openui5.sapMViewSettingsItemMod.default
    ): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    
    /**
      * @since 1.42
      *
      * Sets a callback that will check the ViewSettingsItem's text against the search query. If a callback is
      * set, `filterSearchOperator` property will be ignored, as it serves the same purpose.
      *
      * @returns Reference to `this` for method chaining
      */
    def setFilterSearchCallback(
      /**
      * A function that accepts two parameters fnTest({string} query, {string} value) and returns boolean if
      * the value satisfies the query.
      */
    fnTest: js.Function2[/* p1 */ String, /* p2 */ String, Boolean]
    ): this.type = js.native
    
    /**
      * @since 1.42
      *
      * Sets a new value for property {@link #getFilterSearchOperator filterSearchOperator}.
      *
      * Provides a string filter operator which is used when the user searches items in filter details page.
      * Possible operators are: `AnyWordStartsWith`, `Contains`, `StartsWith`, `Equals`. This property will be
      * ignored if a custom callback is provided through `setFilterSearchCallback` method.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `StartsWith`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterSearchOperator(): this.type = js.native
    def setFilterSearchOperator(
      /**
      * New value for property `filterSearchOperator`
      */
    sFilterSearchOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StringFilterOperator * / any */ String
    ): this.type = js.native
    def setFilterSearchOperator(
      /**
      * New value for property `filterSearchOperator`
      */
    sFilterSearchOperator: StringFilterOperator
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupDescending groupDescending}.
      *
      * Determines whether the group order is descending or ascending (default).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupDescending(): this.type = js.native
    def setGroupDescending(/**
      * New value for property `groupDescending`
      */
    bGroupDescending: Boolean): this.type = js.native
    
    /**
      * @since 1.42
      *
      * Sets the selected filter object in format { parent_key: { key: boolean, key2: boolean, ...}, ... }.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSelectedFilterCompoundKeys(
      /**
      * A configuration object with filter item and sub item keys in the format: { parent_key: { key: boolean,
      * key2: boolean, ...}, ... }. Setting boolean to true will set the filter to true, false or omitting an
      * entry will set the filter to false. It can be used to set the dialog state based on presets.
      */
    oSelectedFilterKeys: Record[String, SelectedFilterKeys]
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.42) - replaced by `setSelectedFilterCompoundKeys` method
      *
      * Sets the selected filter object in format {key: boolean}. **Note:** Do not use duplicated item keys with
      * this method.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSelectedFilterKeys(
      /**
      * A configuration object with filter item and sub item keys in the format: { key: boolean }. Setting boolean
      * to true will set the filter to true, false or omitting an entry will set the filter to false. It can
      * be used to set the dialog state based on presets.
      */
    oSelectedFilterKeys: SelectedFilterKeys
    ): this.type = js.native
    
    def setSelectedGroupItem(/**
      * The selected item, the item's string key or the item id
      */
    vItemOrKey: String): this.type = js.native
    /**
      * Sets the selected group item (either by key, item id or item instance).
      *
      * @returns Reference to `this` for method chaining
      */
    def setSelectedGroupItem(
      /**
      * The selected item, the item's string key or the item id
      */
    vItemOrKey: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Sets the selected preset filter item.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSelectedPresetFilterItem(): this.type = js.native
    def setSelectedPresetFilterItem(/**
      * The selected item or the item's key string
      */
    vItemOrKey: String): this.type = js.native
    def setSelectedPresetFilterItem(
      /**
      * The selected item or the item's key string
      */
    vItemOrKey: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    def setSelectedSortItem(/**
      * The selected item, the item's string key or the item id
      */
    vItemOrKey: String): this.type = js.native
    /**
      * Sets the selected sort item (either by key, item id or item instance).
      *
      * @returns Reference to `this` for method chaining
      */
    def setSelectedSortItem(
      /**
      * The selected item, the item's string key or the item id
      */
    vItemOrKey: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSortDescending sortDescending}.
      *
      * Determines whether the sort order is descending or ascending (default).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortDescending(): this.type = js.native
    def setSortDescending(/**
      * New value for property `sortDescending`
      */
    bSortDescending: Boolean): this.type = js.native
    
    /**
      * Sets the title of the internal dialog.
      *
      * @returns Reference to `this` for method chaining
      */
    def setTitle(/**
      * The title text for the dialog
      */
    sTitle: String): this.type = js.native
    
    /**
      * @since 1.72
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
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
      * @since 1.30
      *
      * Unbinds aggregation {@link #getCustomTabs customTabs} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindCustomTabs(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Unbinds aggregation {@link #getFilterItems filterItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindFilterItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Unbinds aggregation {@link #getGroupItems groupItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindGroupItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Unbinds aggregation {@link #getPresetFilterItems presetFilterItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindPresetFilterItems(): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Unbinds aggregation {@link #getSortItems sortItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindSortItems(): this.type = js.native
  }
  
  trait ViewSettingsDialog$CancelEventParameters extends StObject
  
  trait ViewSettingsDialog$ConfirmEventParameters extends StObject {
    
    /**
      * The selected filter items in an object notation format: { parentKey: { key: boolean, key2: boolean, ...
      * }, ...}. If a custom control filter was displayed (for example, the user clicked on the filter item),
      * the value for its key is set to true to indicate that there has been an interaction with the control.
      */
    var filterCompoundKeys: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The selected filters in an array of ViewSettingsItem.
      */
    var filterItems: js.UndefOr[js.Array[typings.openui5.sapMViewSettingsItemMod.default]] = js.undefined
    
    /**
      * The selected filter items in an object notation format: { key: boolean }. If a custom control filter
      * was displayed (for example, the user clicked on the filter item), the value for its key is set to true
      * to indicate that there has been an interaction with the control.
      */
    var filterKeys: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The selected filter items in a string format to display in the control's header bar in format "Filtered
      * by: key (subkey1, subkey2, subkey3)".
      */
    var filterString: js.UndefOr[String] = js.undefined
    
    /**
      * The selected group order (true = descending, false = ascending).
      */
    var groupDescending: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The selected group item.
      */
    var groupItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default] = js.undefined
    
    /**
      * The selected preset filter item.
      */
    var presetFilterItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default] = js.undefined
    
    /**
      * The selected sort order (true = descending, false = ascending).
      */
    var sortDescending: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The selected sort item.
      */
    var sortItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default] = js.undefined
  }
  object ViewSettingsDialog$ConfirmEventParameters {
    
    inline def apply(): ViewSettingsDialog$ConfirmEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsDialog$ConfirmEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsDialog$ConfirmEventParameters] (val x: Self) extends AnyVal {
      
      inline def setFilterCompoundKeys(value: js.Object): Self = StObject.set(x, "filterCompoundKeys", value.asInstanceOf[js.Any])
      
      inline def setFilterCompoundKeysUndefined: Self = StObject.set(x, "filterCompoundKeys", js.undefined)
      
      inline def setFilterItems(value: js.Array[typings.openui5.sapMViewSettingsItemMod.default]): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setFilterKeys(value: js.Object): Self = StObject.set(x, "filterKeys", value.asInstanceOf[js.Any])
      
      inline def setFilterKeysUndefined: Self = StObject.set(x, "filterKeys", js.undefined)
      
      inline def setFilterString(value: String): Self = StObject.set(x, "filterString", value.asInstanceOf[js.Any])
      
      inline def setFilterStringUndefined: Self = StObject.set(x, "filterString", js.undefined)
      
      inline def setGroupDescending(value: Boolean): Self = StObject.set(x, "groupDescending", value.asInstanceOf[js.Any])
      
      inline def setGroupDescendingUndefined: Self = StObject.set(x, "groupDescending", js.undefined)
      
      inline def setGroupItem(value: typings.openui5.sapMViewSettingsItemMod.default): Self = StObject.set(x, "groupItem", value.asInstanceOf[js.Any])
      
      inline def setGroupItemUndefined: Self = StObject.set(x, "groupItem", js.undefined)
      
      inline def setPresetFilterItem(value: typings.openui5.sapMViewSettingsItemMod.default): Self = StObject.set(x, "presetFilterItem", value.asInstanceOf[js.Any])
      
      inline def setPresetFilterItemUndefined: Self = StObject.set(x, "presetFilterItem", js.undefined)
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortItem(value: typings.openui5.sapMViewSettingsItemMod.default): Self = StObject.set(x, "sortItem", value.asInstanceOf[js.Any])
      
      inline def setSortItemUndefined: Self = StObject.set(x, "sortItem", js.undefined)
    }
  }
  
  trait ViewSettingsDialog$FilterDetailPageOpenedEventParameters extends StObject {
    
    /**
      * The filter item for which the details are opened.
      */
    var parentFilterItem: js.UndefOr[typings.openui5.sapMViewSettingsFilterItemMod.default] = js.undefined
  }
  object ViewSettingsDialog$FilterDetailPageOpenedEventParameters {
    
    inline def apply(): ViewSettingsDialog$FilterDetailPageOpenedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsDialog$FilterDetailPageOpenedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsDialog$FilterDetailPageOpenedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setParentFilterItem(value: typings.openui5.sapMViewSettingsFilterItemMod.default): Self = StObject.set(x, "parentFilterItem", value.asInstanceOf[js.Any])
      
      inline def setParentFilterItemUndefined: Self = StObject.set(x, "parentFilterItem", js.undefined)
    }
  }
  
  trait ViewSettingsDialog$ResetEventParameters extends StObject
  
  trait ViewSettingsDialog$ResetFiltersEventParameters extends StObject
  
  type ViewSettingsDialogCancelEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$CancelEventParameters]
  
  type ViewSettingsDialogCancelEventParameters = ViewSettingsDialog$CancelEventParameters
  
  type ViewSettingsDialogConfirmEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$ConfirmEventParameters]
  
  type ViewSettingsDialogConfirmEventParameters = ViewSettingsDialog$ConfirmEventParameters
  
  type ViewSettingsDialogFilterDetailPageOpenedEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$FilterDetailPageOpenedEventParameters]
  
  type ViewSettingsDialogFilterDetailPageOpenedEventParameters = ViewSettingsDialog$FilterDetailPageOpenedEventParameters
  
  type ViewSettingsDialogResetEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$ResetEventParameters]
  
  type ViewSettingsDialogResetEventParameters = ViewSettingsDialog$ResetEventParameters
  
  type ViewSettingsDialogResetFiltersEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$ResetFiltersEventParameters]
  
  type ViewSettingsDialogResetFiltersEventParameters = ViewSettingsDialog$ResetFiltersEventParameters
  
  trait ViewSettingsDialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Called when the Cancel button is pressed. It can be used to set the state of custom filter controls.
      */
    var cancel: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Indicates that the user has pressed the OK button and the selected sort, group, and filter settings should
      * be applied to the data on this page.
      *
      * **Note:** Custom tabs are not converted to event parameters automatically. For custom tabs, you have
      * to read the state of your controls inside the callback of this event.
      */
    var confirm: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$ConfirmEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.30
      *
      * The list of all the custom tabs.
      */
    var customTabs: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsCustomTabMod.default] | typings.openui5.sapMViewSettingsCustomTabMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the filter detail page is opened.
      */
    var filterDetailPageOpened: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$FilterDetailPageOpenedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * The list of items with key and value that can be filtered on (for example, a list of columns for a table).
      * A filterItem is associated with one or more detail filters.
      *
      * **Note:** It is recommended to use the `sap.m.ViewSettingsFilterItem` as it fits best at the filter page.
      */
    var filterItems: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.42
      *
      * Provides a string filter operator which is used when the user searches items in filter details page.
      * Possible operators are: `AnyWordStartsWith`, `Contains`, `StartsWith`, `Equals`. This property will be
      * ignored if a custom callback is provided through `setFilterSearchCallback` method.
      */
    var filterSearchOperator: js.UndefOr[
        StringFilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StringFilterOperator * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the group order is descending or ascending (default).
      */
    var groupDescending: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * The list of items with key and value that can be grouped on (for example, a list of columns for a table).
      */
    var groupItems: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * The list of preset filter items with key and value that allows the selection of more complex or custom
      * filters. These entries are displayed at the top of the filter tab.
      */
    var presetFilterItems: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Called when the Reset button is pressed. It can be used to set the state of custom tabs.
      */
    var reset: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Called when the filters are being reset.
      */
    var resetFilters: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The group item that is selected. It can be set by either passing a key or the item itself to the function
      * setSelectedGroupItem. By default 'None' is selected. You can restore back to 'None' by setting this association
      * to empty value.
      */
    var selectedGroupItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default | String] = js.undefined
    
    /**
      * The preset filter item that is selected. It can be set by either passing a key or the item itself to
      * the function setSelectedPresetFilterItem. Note that either a preset filter OR multiple detail filters
      * can be active at the same time.
      */
    var selectedPresetFilterItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default | String] = js.undefined
    
    /**
      * The sort item that is selected. It can be set by either passing a key or the item itself to the function
      * setSelectedSortItem.
      */
    var selectedSortItem: js.UndefOr[typings.openui5.sapMViewSettingsItemMod.default | String] = js.undefined
    
    /**
      * Determines whether the sort order is descending or ascending (default).
      */
    var sortDescending: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * The list of items with key and value that can be sorted over (for example, a list of columns for a table).
      */
    var sortItems: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the title of the dialog. If not set and there is only one active tab, the dialog uses the default
      * "View" or "Sort", "Group", "Filter" respectively.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ViewSettingsDialogSettings {
    
    inline def apply(): ViewSettingsDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsDialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsDialogSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setConfirm(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$ConfirmEventParameters] => Unit
      ): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setCustomTabs(
        value: js.Array[typings.openui5.sapMViewSettingsCustomTabMod.default] | typings.openui5.sapMViewSettingsCustomTabMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customTabs", value.asInstanceOf[js.Any])
      
      inline def setCustomTabsUndefined: Self = StObject.set(x, "customTabs", js.undefined)
      
      inline def setCustomTabsVarargs(value: typings.openui5.sapMViewSettingsCustomTabMod.default*): Self = StObject.set(x, "customTabs", js.Array(value*))
      
      inline def setFilterDetailPageOpened(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsDialog$FilterDetailPageOpenedEventParameters] => Unit
      ): Self = StObject.set(x, "filterDetailPageOpened", js.Any.fromFunction1(value))
      
      inline def setFilterDetailPageOpenedUndefined: Self = StObject.set(x, "filterDetailPageOpened", js.undefined)
      
      inline def setFilterItems(
        value: js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setFilterSearchOperator(
        value: StringFilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StringFilterOperator * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "filterSearchOperator", value.asInstanceOf[js.Any])
      
      inline def setFilterSearchOperatorUndefined: Self = StObject.set(x, "filterSearchOperator", js.undefined)
      
      inline def setGroupDescending(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupDescending", value.asInstanceOf[js.Any])
      
      inline def setGroupDescendingUndefined: Self = StObject.set(x, "groupDescending", js.undefined)
      
      inline def setGroupItems(
        value: js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "groupItems", value.asInstanceOf[js.Any])
      
      inline def setGroupItemsUndefined: Self = StObject.set(x, "groupItems", js.undefined)
      
      inline def setGroupItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "groupItems", js.Array(value*))
      
      inline def setPresetFilterItems(
        value: js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "presetFilterItems", value.asInstanceOf[js.Any])
      
      inline def setPresetFilterItemsUndefined: Self = StObject.set(x, "presetFilterItems", js.undefined)
      
      inline def setPresetFilterItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "presetFilterItems", js.Array(value*))
      
      inline def setReset(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetFilters(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "resetFilters", js.Any.fromFunction1(value))
      
      inline def setResetFiltersUndefined: Self = StObject.set(x, "resetFilters", js.undefined)
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setSelectedGroupItem(value: typings.openui5.sapMViewSettingsItemMod.default | String): Self = StObject.set(x, "selectedGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedGroupItemUndefined: Self = StObject.set(x, "selectedGroupItem", js.undefined)
      
      inline def setSelectedPresetFilterItem(value: typings.openui5.sapMViewSettingsItemMod.default | String): Self = StObject.set(x, "selectedPresetFilterItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedPresetFilterItemUndefined: Self = StObject.set(x, "selectedPresetFilterItem", js.undefined)
      
      inline def setSelectedSortItem(value: typings.openui5.sapMViewSettingsItemMod.default | String): Self = StObject.set(x, "selectedSortItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedSortItemUndefined: Self = StObject.set(x, "selectedSortItem", js.undefined)
      
      inline def setSortDescending(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortItems(
        value: js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sortItems", value.asInstanceOf[js.Any])
      
      inline def setSortItemsUndefined: Self = StObject.set(x, "sortItems", js.undefined)
      
      inline def setSortItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "sortItems", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
