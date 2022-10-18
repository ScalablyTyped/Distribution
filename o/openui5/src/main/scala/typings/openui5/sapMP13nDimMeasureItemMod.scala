package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nDimMeasureItemMod {
  
  @JSImport("sap/m/P13nDimMeasureItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nDimMeasureItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nDimMeasureItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nDimMeasureItemSettings) = this()
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
    mSettings: P13nDimMeasureItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nDimMeasureItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nDimMeasureItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nDimMeasureItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, P13nDimMeasureItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nDimMeasureItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nDimMeasureItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nDimMeasureItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Gets current value of property {@link #getColumnKey columnKey}.
      *
      * Specifies the unique chart column key. In this context a column refers to dimensions or measures of a
      * chart.
      *
      * @returns Value of property `columnKey`
      */
    def getColumnKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getIndex index}.
      *
      * Specifies the order of visible dimensions or measures of a chart.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `index`
      */
    def getIndex(): int = js.native
    
    /**
      * Gets current value of property {@link #getRole role}.
      *
      * Specifies the role of dimensions or measures. The role determines how dimensions and measures influence
      * the chart.
      *
      * @returns Value of property `role`
      */
    def getRole(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Specifies the visibility of dimensions or measures.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getColumnKey columnKey}.
      *
      * Specifies the unique chart column key. In this context a column refers to dimensions or measures of a
      * chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnKey(/**
      * New value for property `columnKey`
      */
    sColumnKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndex index}.
      *
      * Specifies the order of visible dimensions or measures of a chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndex(): this.type = js.native
    def setIndex(/**
      * New value for property `index`
      */
    iIndex: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRole role}.
      *
      * Specifies the role of dimensions or measures. The role determines how dimensions and measures influence
      * the chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRole(/**
      * New value for property `role`
      */
    sRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Specifies the visibility of dimensions or measures.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait P13nDimMeasureItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * Specifies the unique chart column key. In this context a column refers to dimensions or measures of a
      * chart.
      */
    var columnKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the order of visible dimensions or measures of a chart.
      */
    var index: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the role of dimensions or measures. The role determines how dimensions and measures influence
      * the chart.
      */
    var role: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the visibility of dimensions or measures.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object P13nDimMeasureItemSettings {
    
    inline def apply(): P13nDimMeasureItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nDimMeasureItemSettings]
    }
    
    extension [Self <: P13nDimMeasureItemSettings](x: Self) {
      
      inline def setColumnKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setIndex(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
