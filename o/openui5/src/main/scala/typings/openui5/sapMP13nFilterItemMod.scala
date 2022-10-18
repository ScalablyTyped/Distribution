package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nFilterItemMod {
  
  @JSImport("sap/m/P13nFilterItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nFilterItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nFilterItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nFilterItemSettings) = this()
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
    mSettings: P13nFilterItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nFilterItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nFilterItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nFilterItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, P13nFilterItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nFilterItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nFilterItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nFilterItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Gets current value of property {@link #getColumnKey columnKey}.
      *
      * key of the column
      *
      * @returns Value of property `columnKey`
      */
    def getColumnKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getExclude exclude}.
      *
      * defines if the filter is an include or exclude filter item
      *
      * Default value is `false`.
      *
      * @returns Value of property `exclude`
      */
    def getExclude(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOperation operation}.
      *
      * sap.m.P13nConditionOperation
      *
      * @returns Value of property `operation`
      */
    def getOperation(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue1 value1}.
      *
      * value of the filter
      *
      * @returns Value of property `value1`
      */
    def getValue1(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue2 value2}.
      *
      * to value of the between filter
      *
      * @returns Value of property `value2`
      */
    def getValue2(): String = js.native
    
    /**
      * Sets a new value for property {@link #getColumnKey columnKey}.
      *
      * key of the column
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnKey(): this.type = js.native
    def setColumnKey(/**
      * New value for property `columnKey`
      */
    sColumnKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExclude exclude}.
      *
      * defines if the filter is an include or exclude filter item
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExclude(): this.type = js.native
    def setExclude(/**
      * New value for property `exclude`
      */
    bExclude: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOperation operation}.
      *
      * sap.m.P13nConditionOperation
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOperation(): this.type = js.native
    def setOperation(/**
      * New value for property `operation`
      */
    sOperation: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue1 value1}.
      *
      * value of the filter
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue1(): this.type = js.native
    def setValue1(/**
      * New value for property `value1`
      */
    sValue1: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue2 value2}.
      *
      * to value of the between filter
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue2(): this.type = js.native
    def setValue2(/**
      * New value for property `value2`
      */
    sValue2: String): this.type = js.native
  }
  
  trait P13nFilterItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * key of the column
      */
    var columnKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * defines if the filter is an include or exclude filter item
      */
    var exclude: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * sap.m.P13nConditionOperation
      */
    var operation: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * value of the filter
      */
    var value1: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * to value of the between filter
      */
    var value2: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object P13nFilterItemSettings {
    
    inline def apply(): P13nFilterItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nFilterItemSettings]
    }
    
    extension [Self <: P13nFilterItemSettings](x: Self) {
      
      inline def setColumnKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setExclude(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setOperation(value: String | PropertyBindingInfo): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setValue1(value: String | PropertyBindingInfo): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
      
      inline def setValue1Undefined: Self = StObject.set(x, "value1", js.undefined)
      
      inline def setValue2(value: String | PropertyBindingInfo): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
      
      inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
    }
  }
}
