package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IFilterItem
import typings.openui5.sapUiWebcFioriLibraryMod.IFilterItemOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriFilterItemMod {
  
  @JSImport("sap/ui/webc/fiori/FilterItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FilterItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FilterItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FilterItemSettings) = this()
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
    mSettings: FilterItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FilterItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IFilterItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/FilterItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.FilterItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FilterItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.FilterItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait FilterItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IFilterItem {
    
    /**
      * Adds some value to the aggregation {@link #getValues values}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addValue(/**
      * The value to add; if empty, nothing is inserted
      */
    oValue: IFilterItemOption): this.type = js.native
    
    /**
      * Destroys all the values in the aggregation {@link #getValues values}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyValues(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getValues values}.
      *
      * Defines the `values` list.
      */
    def getValues(): js.Array[IFilterItemOption] = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IFilterItemOption` in the aggregation {@link #getValues values}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfValue(/**
      * The value whose index is looked for
      */
    oValue: IFilterItemOption): int = js.native
    
    /**
      * Inserts a value into the aggregation {@link #getValues values}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertValue(
      /**
      * The value to insert; if empty, nothing is inserted
      */
    oValue: IFilterItemOption,
      /**
      * The `0`-based index the value should be inserted at; for a negative value of `iIndex`, the value is inserted
      * at position 0; for a value greater than the current size of the aggregation, the value is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getValues values}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllValues(): js.Array[IFilterItemOption] = js.native
    
    def removeValue(/**
      * The value to remove or its index or id
      */
    vValue: String): IFilterItemOption | Null = js.native
    /**
      * Removes a value from the aggregation {@link #getValues values}.
      *
      * @returns The removed value or `null`
      */
    def removeValue(/**
      * The value to remove or its index or id
      */
    vValue: int): IFilterItemOption | Null = js.native
    def removeValue(/**
      * The value to remove or its index or id
      */
    vValue: IFilterItemOption): IFilterItemOption | Null = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait FilterItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the text of the component.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the `values` list.
      */
    var values: js.UndefOr[
        js.Array[IFilterItemOption] | IFilterItemOption | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FilterItemSettings {
    
    inline def apply(): FilterItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterItemSettings] (val x: Self) extends AnyVal {
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValues(
        value: js.Array[IFilterItemOption] | IFilterItemOption | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: IFilterItemOption*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
