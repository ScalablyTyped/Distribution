package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcValuehelpBaseListContentMod.ListContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpContentFixedListMod {
  
  @JSImport("sap/ui/mdc/valuehelp/content/FixedList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FixedList` content.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FixedList {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: FixedListSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: FixedListSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: FixedListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/content/FixedList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.content.FixedList with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.ListContent.extend}.
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
    oClassInfo: ClassInfo[T, FixedList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FixedList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.content.FixedList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FixedList
    extends typings.openui5.sapUiMdcValuehelpBaseListContentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getFilterList filterList}.
      *
      * If set, the items of the list are filtered based on `filterValue`.
      *
      * If a type-ahead behavior for the connected field is wanted, this property must be set to `true`. For
      * small lists all values are meant to be shown, independent of the typing in the connected field. In this
      * case this property must be set to `false`.
      *
      * If not set, the list opens if the user clicks into the connected field.
      *
      * Default value is `true`.
      *
      * @returns Value of property `filterList`
      */
    def getFilterList(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGroupable groupable}.
      *
      * If set, the items of the list can be grouped
      *
      * Default value is `false`.
      *
      * @returns Value of property `groupable`
      */
    def getGroupable(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items of the field help.
      *
      * The `key` of the items is not shown in the list, but is used as a value of the connected field.
      *
      * If the `additionalText` for all the items is not used, the column will not be displayed.
      *
      * **Note:** At the moment, icons are not supported.
      */
    def getItems(): js.Array[typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.valuehelp.content.FixedListItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default
    ): typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFilterList filterList}.
      *
      * If set, the items of the list are filtered based on `filterValue`.
      *
      * If a type-ahead behavior for the connected field is wanted, this property must be set to `true`. For
      * small lists all values are meant to be shown, independent of the typing in the connected field. In this
      * case this property must be set to `false`.
      *
      * If not set, the list opens if the user clicks into the connected field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterList(): this.type = js.native
    def setFilterList(/**
      * New value for property `filterList`
      */
    bFilterList: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupable groupable}.
      *
      * If set, the items of the list can be grouped
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupable(): this.type = js.native
    def setGroupable(/**
      * New value for property `groupable`
      */
    bGroupable: Boolean): this.type = js.native
  }
  
  trait FixedListSettings
    extends StObject
       with ListContentSettings {
    
    /**
      * If set, the items of the list are filtered based on `filterValue`.
      *
      * If a type-ahead behavior for the connected field is wanted, this property must be set to `true`. For
      * small lists all values are meant to be shown, independent of the typing in the connected field. In this
      * case this property must be set to `false`.
      *
      * If not set, the list opens if the user clicks into the connected field.
      */
    var filterList: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, the items of the list can be grouped
      */
    var groupable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Items of the field help.
      *
      * The `key` of the items is not shown in the list, but is used as a value of the connected field.
      *
      * If the `additionalText` for all the items is not used, the column will not be displayed.
      *
      * **Note:** At the moment, icons are not supported.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default] | typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FixedListSettings {
    
    inline def apply(): FixedListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedListSettings] (val x: Self) extends AnyVal {
      
      inline def setFilterList(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
      
      inline def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
      
      inline def setGroupable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      inline def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default] | typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiMdcValuehelpContentFixedListItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
