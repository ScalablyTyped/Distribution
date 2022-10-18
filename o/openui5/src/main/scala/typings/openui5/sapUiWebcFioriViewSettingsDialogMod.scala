package typings.openui5

import typings.openui5.anon.FilterItems
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IFilterItem
import typings.openui5.sapUiWebcFioriLibraryMod.ISortItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriViewSettingsDialogMod {
  
  @JSImport("sap/ui/webc/fiori/ViewSettingsDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ViewSettingsDialog`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    
    @JSImport("sap/ui/webc/fiori/ViewSettingsDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.ViewSettingsDialog with name `sClassName` and enriches
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
      * Returns a metadata object for class sap.ui.webc.fiori.ViewSettingsDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ViewSettingsDialog
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some filterItem to the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilterItem(/**
      * The filterItem to add; if empty, nothing is inserted
      */
    oFilterItem: IFilterItem): this.type = js.native
    
    /**
      * Adds some sortItem to the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSortItem(/**
      * The sortItem to add; if empty, nothing is inserted
      */
    oSortItem: ISortItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired before the component is opened. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired before the component is opened. **This event does not bubble.**
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired when cancel button is activated.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired when cancel button is activated.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired when confirmation button is activated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ViewSettingsDialog` itself.
      *
      * Fired when confirmation button is activated.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ViewSettingsDialog`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the filterItems in the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterItems(): this.type = js.native
    
    /**
      * Destroys all the sortItems in the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySortItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
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
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.ui.webc.fiori.ViewSettingsDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachConfirm(
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
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: FilterItems): this.type = js.native
    
    /**
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: FilterItems): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getFilterItems filterItems}.
      */
    def getFilterItems(): js.Array[IFilterItem] = js.native
    
    /**
      * Gets current value of property {@link #getSortDescending sortDescending}.
      *
      * Defines the initial sort order.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sortDescending`
      */
    def getSortDescending(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSortItems sortItems}.
      */
    def getSortItems(): js.Array[ISortItem] = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IFilterItem` in the aggregation {@link #getFilterItems filterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilterItem(/**
      * The filterItem whose index is looked for
      */
    oFilterItem: IFilterItem): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.ISortItem` in the aggregation {@link #getSortItems sortItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSortItem(/**
      * The sortItem whose index is looked for
      */
    oSortItem: ISortItem): int = js.native
    
    /**
      * Inserts a filterItem into the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilterItem(
      /**
      * The filterItem to insert; if empty, nothing is inserted
      */
    oFilterItem: IFilterItem,
      /**
      * The `0`-based index the filterItem should be inserted at; for a negative value of `iIndex`, the filterItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the filterItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a sortItem into the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSortItem(
      /**
      * The sortItem to insert; if empty, nothing is inserted
      */
    oSortItem: ISortItem,
      /**
      * The `0`-based index the sortItem should be inserted at; for a negative value of `iIndex`, the sortItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the sortItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilterItems filterItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilterItems(): js.Array[IFilterItem] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSortItems sortItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSortItems(): js.Array[ISortItem] = js.native
    
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: String): IFilterItem | Null = js.native
    /**
      * Removes a filterItem from the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns The removed filterItem or `null`
      */
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: int): IFilterItem | Null = js.native
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: IFilterItem): IFilterItem | Null = js.native
    
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: String): ISortItem | Null = js.native
    /**
      * Removes a sortItem from the aggregation {@link #getSortItems sortItems}.
      *
      * @returns The removed sortItem or `null`
      */
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: int): ISortItem | Null = js.native
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: ISortItem): ISortItem | Null = js.native
    
    /**
      * Sets a JavaScript object, as settings to the `sap.ui.webc.fiori.ViewSettingsDialog`. This method can
      * be used after the dialog is initially open, as the dialog need to set its initial settings. The `sap.ui.webc.fiori.ViewSettingsDialog`
      * throws an event called "before-open", this can be used as trigger point. The object should have the following
      * format: `{ { "sortOrder" : "Ascending", "sortBy" : "Name", "filters" : [{"Filter 1": ["Some filter 1",
      * "Some filter 2"]}, {"Filter 2": ["Some filter 4"]}]} }`
      */
    def setConfirmedSettings(/**
      * A value to be set as predefined settings.
      */
    settings: String): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getSortDescending sortDescending}.
      *
      * Defines the initial sort order.
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
      * Shows the dialog.
      */
    def show(): Unit = js.native
  }
  
  trait ViewSettingsDialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired before the component is opened. **This event does not bubble.**
      */
    var beforeOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when cancel button is activated.
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when confirmation button is activated.
      */
    var confirm: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    var filterItems: js.UndefOr[
        js.Array[IFilterItem] | IFilterItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the initial sort order.
      */
    var sortDescending: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var sortItems: js.UndefOr[
        js.Array[ISortItem] | ISortItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ViewSettingsDialogSettings {
    
    inline def apply(): ViewSettingsDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsDialogSettings]
    }
    
    extension [Self <: ViewSettingsDialogSettings](x: Self) {
      
      inline def setBeforeOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setConfirm(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setFilterItems(
        value: js.Array[IFilterItem] | IFilterItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: IFilterItem*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setSortDescending(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortItems(
        value: js.Array[ISortItem] | ISortItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sortItems", value.asInstanceOf[js.Any])
      
      inline def setSortItemsUndefined: Self = StObject.set(x, "sortItems", js.undefined)
      
      inline def setSortItemsVarargs(value: ISortItem*): Self = StObject.set(x, "sortItems", js.Array(value*))
    }
  }
}
