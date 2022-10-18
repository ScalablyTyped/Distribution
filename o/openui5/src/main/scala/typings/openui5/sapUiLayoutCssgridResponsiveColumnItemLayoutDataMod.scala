package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.IGridItemLayoutData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridResponsiveColumnItemLayoutDataMod {
  
  @JSImport("sap/ui/layout/cssgrid/ResponsiveColumnItemLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.ui.layout.cssgrid.ResponsiveColumnItemLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveColumnItemLayoutData {
    def this(/**
      * Initial settings for the new element.
      */
    mSettings: ResponsiveColumnItemLayoutDataSettings) = this()
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
      * Initial settings for the new element.
      */
    mSettings: ResponsiveColumnItemLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element.
      */
    mSettings: ResponsiveColumnItemLayoutDataSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_layout_cssgrid_IGridItemLayoutData: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/ResponsiveColumnItemLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.ResponsiveColumnItemLayoutData with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, ResponsiveColumnItemLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveColumnItemLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.ResponsiveColumnItemLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveColumnItemLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default
       with IGridItemLayoutData {
    
    /**
      * Gets current value of property {@link #getColumns columns}.
      *
      * Specifies the number of columns, which the item should take.
      *
      * Default value is `1`.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * Gets current value of property {@link #getRows rows}.
      *
      * Specifies the number of rows, which the item should take.
      *
      * Default value is `1`.
      *
      * @returns Value of property `rows`
      */
    def getRows(): int = js.native
    
    /**
      * Sets a new value for property {@link #getColumns columns}.
      *
      * Specifies the number of columns, which the item should take.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(): this.type = js.native
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRows rows}.
      *
      * Specifies the number of rows, which the item should take.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRows(): this.type = js.native
    def setRows(/**
      * New value for property `rows`
      */
    iRows: int): this.type = js.native
  }
  
  trait ResponsiveColumnItemLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Specifies the number of columns, which the item should take.
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the number of rows, which the item should take.
      */
    var rows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ResponsiveColumnItemLayoutDataSettings {
    
    inline def apply(): ResponsiveColumnItemLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveColumnItemLayoutDataSettings]
    }
    
    extension [Self <: ResponsiveColumnItemLayoutDataSettings](x: Self) {
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
}
