package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMP13nPanelMod.P13nPanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nSortPanelMod_ {
  
  @JSImport("sap/m/P13nSortPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nSortPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nSortPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nSortPanelSettings) = this()
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
    mSettings: P13nSortPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nSortPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nSortPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nSortPanel with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.P13nPanel.extend}.
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
    oClassInfo: ClassInfo[T, P13nSortPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nSortPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nSortPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nSortPanel
    extends typings.openui5.sapMP13nPanelMod.default {
    
    /**
      * Adds some sortItem to the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSortItem(
      /**
      * The sortItem to add; if empty, nothing is inserted
      */
    oSortItem: typings.openui5.sapMP13nSortItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addSortItem addSortItem} event of this `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was added
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAddSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addSortItem addSortItem} event of this `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was added
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddSortItem(
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
    def attachAddSortItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeSortItem removeSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was removed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRemoveSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeSortItem removeSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was removed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveSortItem(
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
    def attachRemoveSortItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateSortItem updateSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was updated
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateSortItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateSortItem updateSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nSortPanel` itself.
      *
      * event raised when a SortItem was updated
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateSortItem(
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
    def attachUpdateSortItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nSortPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
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
      * Destroys all the sortItems in the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySortItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:addSortItem addSortItem} event of this `sap.m.P13nSortPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAddSortItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAddSortItem(
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
      * Detaches event handler `fnFunction` from the {@link #event:removeSortItem removeSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRemoveSortItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRemoveSortItem(
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
      * Detaches event handler `fnFunction` from the {@link #event:updateSortItem updateSortItem} event of this
      * `sap.m.P13nSortPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateSortItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUpdateSortItem(
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
      * Fires event {@link #event:addSortItem addSortItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAddSortItem(): this.type = js.native
    def fireAddSortItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:removeSortItem removeSortItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRemoveSortItem(): this.type = js.native
    def fireRemoveSortItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:updateSortItem updateSortItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateSortItem(): this.type = js.native
    def fireUpdateSortItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * defines if the mediaQuery or a ContainerResize will be used for layout update. When the ConditionPanel
      * is used on a dialog the property should be set to true!
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLayoutMode layoutMode}.
      *
      * can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      *
      * @returns Value of property `layoutMode`
      */
    def getLayoutMode(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSortItems sortItems}.
      *
      * defined Sort Items
      */
    def getSortItems(): js.Array[typings.openui5.sapMP13nSortItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.P13nSortItem` in the aggregation {@link #getSortItems sortItems}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSortItem(
      /**
      * The sortItem whose index is looked for
      */
    oSortItem: typings.openui5.sapMP13nSortItemMod.default
    ): int = js.native
    
    /**
      * Inserts a sortItem into the aggregation {@link #getSortItems sortItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSortItem(
      /**
      * The sortItem to insert; if empty, nothing is inserted
      */
    oSortItem: typings.openui5.sapMP13nSortItemMod.default,
      /**
      * The `0`-based index the sortItem should be inserted at; for a negative value of `iIndex`, the sortItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the sortItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSortItems sortItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSortItems(): js.Array[typings.openui5.sapMP13nSortItemMod.default] = js.native
    
    /**
      * @SINCE 1.28
      *
      * removes all invalid sort conditions.
      */
    def removeInvalidConditions(): Unit = js.native
    
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: String): typings.openui5.sapMP13nSortItemMod.default | Null = js.native
    /**
      * Removes a sortItem from the aggregation {@link #getSortItems sortItems}.
      *
      * @returns The removed sortItem or `null`
      */
    def removeSortItem(/**
      * The sortItem to remove or its index or id
      */
    vSortItem: int): typings.openui5.sapMP13nSortItemMod.default | Null = js.native
    def removeSortItem(
      /**
      * The sortItem to remove or its index or id
      */
    vSortItem: typings.openui5.sapMP13nSortItemMod.default
    ): typings.openui5.sapMP13nSortItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.28
      *
      * removes all errors/warning states from of all sort conditions.
      */
    def removeValidationErrors(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * defines if the mediaQuery or a ContainerResize will be used for layout update. When the ConditionPanel
      * is used on a dialog the property should be set to true!
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContainerQuery(): this.type = js.native
    def setContainerQuery(/**
      * New value for property `containerQuery`
      */
    bContainerQuery: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayoutMode layoutMode}.
      *
      * can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutMode(): this.type = js.native
    def setLayoutMode(/**
      * New value for property `layoutMode`
      */
    sLayoutMode: String): this.type = js.native
    
    /**
      * setter for the supported operations array
      *
      * @returns this for chaining
      */
    def setOperations(
      /**
      * array of operations `[sap.m.P13nConditionOperation.BT, sap.m.P13nConditionOperation.EQ]`
      */
    aOperations: js.Array[Any]
    ): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getSortItems sortItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindSortItems(): this.type = js.native
    
    /**
      * check if the entered/modified conditions are correct, marks invalid fields yellow (Warning state) and
      * opens a popup message dialog to give the user the feedback that some values are wrong or missing.
      *
      * @returns `True` if all conditions are valid, `false` otherwise.
      */
    def validateConditions(): Boolean = js.native
  }
  
  trait P13nSortPanelSettings
    extends StObject
       with P13nPanelSettings {
    
    /**
      * event raised when a SortItem was added
      */
    var addSortItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * defines if the mediaQuery or a ContainerResize will be used for layout update. When the ConditionPanel
      * is used on a dialog the property should be set to true!
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      */
    var layoutMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * event raised when a SortItem was removed
      */
    var removeSortItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * defined Sort Items
      */
    var sortItems: js.UndefOr[
        js.Array[typings.openui5.sapMP13nSortItemMod.default] | typings.openui5.sapMP13nSortItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * event raised when a SortItem was updated
      */
    var updateSortItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object P13nSortPanelSettings {
    
    inline def apply(): P13nSortPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nSortPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nSortPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setAddSortItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "addSortItem", js.Any.fromFunction1(value))
      
      inline def setAddSortItemUndefined: Self = StObject.set(x, "addSortItem", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setLayoutMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      inline def setRemoveSortItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "removeSortItem", js.Any.fromFunction1(value))
      
      inline def setRemoveSortItemUndefined: Self = StObject.set(x, "removeSortItem", js.undefined)
      
      inline def setSortItems(
        value: js.Array[typings.openui5.sapMP13nSortItemMod.default] | typings.openui5.sapMP13nSortItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sortItems", value.asInstanceOf[js.Any])
      
      inline def setSortItemsUndefined: Self = StObject.set(x, "sortItems", js.undefined)
      
      inline def setSortItemsVarargs(value: typings.openui5.sapMP13nSortItemMod.default*): Self = StObject.set(x, "sortItems", js.Array(value*))
      
      inline def setUpdateSortItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateSortItem", js.Any.fromFunction1(value))
      
      inline def setUpdateSortItemUndefined: Self = StObject.set(x, "updateSortItem", js.undefined)
    }
  }
}
