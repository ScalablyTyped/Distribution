package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nColumnsItemMod {
  
  @JSImport("sap/m/P13nColumnsItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nColumnsItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nColumnsItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nColumnsItemSettings) = this()
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
    mSettings: P13nColumnsItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nColumnsItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nColumnsItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nColumnsItem with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, P13nColumnsItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nColumnsItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nColumnsItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nColumnsItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getColumnKey columnKey}.
      *
      * This property contains the unique table column key
      *
      * @returns Value of property `columnKey`
      */
    def getColumnKey(): String = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getIndex index}.
      *
      * This property contains the index of a table column
      *
      * @returns Value of property `index`
      */
    def getIndex(): int = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getTotal total}.
      *
      * This property contains the total flag of a table column.
      *
      * @returns Value of property `total`
      */
    def getTotal(): Boolean = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getVisible visible}.
      *
      * This property decides whether a `P13nColumnsItem` is visible
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * This property contains the with of a table column.
      *
      * @returns Value of property `width`
      */
    def getWidth(): String = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getColumnKey columnKey}.
      *
      * This property contains the unique table column key
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
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getIndex index}.
      *
      * This property contains the index of a table column
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndex(/**
      * New value for property `index`
      */
    iIndex: int): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getTotal total}.
      *
      * This property contains the total flag of a table column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTotal(/**
      * New value for property `total`
      */
    bTotal: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getVisible visible}.
      *
      * This property decides whether a `P13nColumnsItem` is visible
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * This property contains the with of a table column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: String): this.type = js.native
  }
  
  trait P13nColumnsItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * @SINCE 1.26.0
      *
      * This property contains the unique table column key
      */
    var columnKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * This property contains the index of a table column
      */
    var index: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * This property contains the total flag of a table column.
      */
    var total: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * This property decides whether a `P13nColumnsItem` is visible
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * This property contains the with of a table column.
      */
    var width: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object P13nColumnsItemSettings {
    
    inline def apply(): P13nColumnsItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nColumnsItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nColumnsItemSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setIndex(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setTotal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | PropertyBindingInfo): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
