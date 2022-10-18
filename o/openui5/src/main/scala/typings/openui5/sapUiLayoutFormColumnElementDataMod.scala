package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.form.ColumnCells
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormColumnElementDataMod {
  
  @JSImport("sap/ui/layout/form/ColumnElementData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.ColumnElementData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColumnElementData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColumnElementDataSettings) = this()
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
    mSettings: ColumnElementDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnElementDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/ColumnElementData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.ColumnElementData with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, ColumnElementData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColumnElementData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.ColumnElementData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColumnElementData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getCellsLarge cellsLarge}.
      *
      * Number of cells used by a field if the `FormElement` element is large. The label is then beside the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` element is used.
      *
      * Default value is `8`.
      *
      * @returns Value of property `cellsLarge`
      */
    def getCellsLarge(): ColumnCells = js.native
    
    /**
      * Gets current value of property {@link #getCellsSmall cellsSmall}.
      *
      * Number of cells used by a field if the `FormElement` element is small. The label is then above the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` is used.
      *
      * Default value is `12`.
      *
      * @returns Value of property `cellsSmall`
      */
    def getCellsSmall(): ColumnCells = js.native
    
    /**
      * Sets a new value for property {@link #getCellsLarge cellsLarge}.
      *
      * Number of cells used by a field if the `FormElement` element is large. The label is then beside the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` element is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `8`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCellsLarge(): this.type = js.native
    def setCellsLarge(/**
      * New value for property `cellsLarge`
      */
    sCellsLarge: ColumnCells): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCellsSmall cellsSmall}.
      *
      * Number of cells used by a field if the `FormElement` element is small. The label is then above the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCellsSmall(): this.type = js.native
    def setCellsSmall(/**
      * New value for property `cellsSmall`
      */
    sCellsSmall: ColumnCells): this.type = js.native
  }
  
  trait ColumnElementDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Number of cells used by a field if the `FormElement` element is large. The label is then beside the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` element is used.
      */
    var cellsLarge: js.UndefOr[
        ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of cells used by a field if the `FormElement` element is small. The label is then above the fields
      * per default.
      *
      * If set to `12`, the full size of the `FormElement` is used.
      */
    var cellsSmall: js.UndefOr[
        ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColumnElementDataSettings {
    
    inline def apply(): ColumnElementDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnElementDataSettings]
    }
    
    extension [Self <: ColumnElementDataSettings](x: Self) {
      
      inline def setCellsLarge(value: ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cellsLarge", value.asInstanceOf[js.Any])
      
      inline def setCellsLargeUndefined: Self = StObject.set(x, "cellsLarge", js.undefined)
      
      inline def setCellsSmall(value: ColumnCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cellsSmall", value.asInstanceOf[js.Any])
      
      inline def setCellsSmallUndefined: Self = StObject.set(x, "cellsSmall", js.undefined)
    }
  }
}
