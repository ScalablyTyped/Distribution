package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsL
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsM
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnsXL
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormColumnContainerDataMod {
  
  @JSImport("sap/ui/layout/form/ColumnContainerData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.ColumnContainerData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColumnContainerData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColumnContainerDataSettings) = this()
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
    mSettings: ColumnContainerDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnContainerDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/ColumnContainerData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.ColumnContainerData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ColumnContainerData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColumnContainerData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.ColumnContainerData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColumnContainerData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getColumnsL columnsL}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * Default value is `2`.
      *
      * @returns Value of property `columnsL`
      */
    def getColumnsL(): ColumnsL = js.native
    
    /**
      * Gets current value of property {@link #getColumnsM columnsM}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has medium size.
      *
      * Default value is `1`.
      *
      * @returns Value of property `columnsM`
      */
    def getColumnsM(): ColumnsM = js.native
    
    /**
      * Gets current value of property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      *
      * Default value is `2`.
      *
      * @returns Value of property `columnsXL`
      */
    def getColumnsXL(): ColumnsXL = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsL columnsL}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsL(): this.type = js.native
    def setColumnsL(/**
      * New value for property `columnsL`
      */
    sColumnsL: ColumnsL): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsM columnsM}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsM(): this.type = js.native
    def setColumnsM(/**
      * New value for property `columnsM`
      */
    sColumnsM: ColumnsM): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns the `FormContainer` element uses if the `Form` control has extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsXL(): this.type = js.native
    def setColumnsXL(/**
      * New value for property `columnsXL`
      */
    sColumnsXL: ColumnsXL): this.type = js.native
  }
  
  trait ColumnContainerDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Number of columns the `FormContainer` element uses if the `Form` control has large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      */
    var columnsL: js.UndefOr[
        ColumnsL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of columns the `FormContainer` element uses if the `Form` control has medium size.
      */
    var columnsM: js.UndefOr[
        ColumnsM | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of columns the `FormContainer` element uses if the `Form` control has extra-large size.
      *
      * The number of columns for extra-large size must not be smaller than the number of columns for large size.
      */
    var columnsXL: js.UndefOr[
        ColumnsXL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColumnContainerDataSettings {
    
    inline def apply(): ColumnContainerDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnContainerDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnContainerDataSettings] (val x: Self) extends AnyVal {
      
      inline def setColumnsL(value: ColumnsL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsL", value.asInstanceOf[js.Any])
      
      inline def setColumnsLUndefined: Self = StObject.set(x, "columnsL", js.undefined)
      
      inline def setColumnsM(value: ColumnsM | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsM", value.asInstanceOf[js.Any])
      
      inline def setColumnsMUndefined: Self = StObject.set(x, "columnsM", js.undefined)
      
      inline def setColumnsXL(value: ColumnsXL | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsXL", value.asInstanceOf[js.Any])
      
      inline def setColumnsXLUndefined: Self = StObject.set(x, "columnsXL", js.undefined)
    }
  }
}
