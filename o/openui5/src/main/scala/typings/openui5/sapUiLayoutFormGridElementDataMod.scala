package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.form.GridElementCells
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormGridElementDataMod {
  
  @JSImport("sap/ui/layout/form/GridElementData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.GridElementData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridElementData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridElementDataSettings) = this()
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
    mSettings: GridElementDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridElementDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/GridElementData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.GridElementData with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, GridElementData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridElementData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.GridElementData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridElementData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getHCells hCells}.
      *
      * Number of cells in horizontal direction.
      *
      * If set to `auto`, the size is determined by the number of fields and the available cells. For labels
      * the auto size is 3 cells.
      *
      * If set to `full`, only one field is allowed within the `FormElement`. It gets the full width of the row
      * and the label is displayed above.
      *
      * **Note:** For labels, the full size setting has no effect.
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `hCells`
      */
    def getHCells(): GridElementCells = js.native
    
    /**
      * Gets current value of property {@link #getVCells vCells}.
      *
      * Number of cells in vertical direction.
      *
      * **Note:** This property has no effect on labels.
      *
      * Default value is `1`.
      *
      * @returns Value of property `vCells`
      */
    def getVCells(): int = js.native
    
    /**
      * Sets a new value for property {@link #getHCells hCells}.
      *
      * Number of cells in horizontal direction.
      *
      * If set to `auto`, the size is determined by the number of fields and the available cells. For labels
      * the auto size is 3 cells.
      *
      * If set to `full`, only one field is allowed within the `FormElement`. It gets the full width of the row
      * and the label is displayed above.
      *
      * **Note:** For labels, the full size setting has no effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHCells(): this.type = js.native
    def setHCells(/**
      * New value for property `hCells`
      */
    sHCells: GridElementCells): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVCells vCells}.
      *
      * Number of cells in vertical direction.
      *
      * **Note:** This property has no effect on labels.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVCells(): this.type = js.native
    def setVCells(/**
      * New value for property `vCells`
      */
    iVCells: int): this.type = js.native
  }
  
  trait GridElementDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Number of cells in horizontal direction.
      *
      * If set to `auto`, the size is determined by the number of fields and the available cells. For labels
      * the auto size is 3 cells.
      *
      * If set to `full`, only one field is allowed within the `FormElement`. It gets the full width of the row
      * and the label is displayed above.
      *
      * **Note:** For labels, the full size setting has no effect.
      */
    var hCells: js.UndefOr[
        GridElementCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of cells in vertical direction.
      *
      * **Note:** This property has no effect on labels.
      */
    var vCells: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object GridElementDataSettings {
    
    inline def apply(): GridElementDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridElementDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridElementDataSettings] (val x: Self) extends AnyVal {
      
      inline def setHCells(
        value: GridElementCells | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "hCells", value.asInstanceOf[js.Any])
      
      inline def setHCellsUndefined: Self = StObject.set(x, "hCells", js.undefined)
      
      inline def setVCells(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vCells", value.asInstanceOf[js.Any])
      
      inline def setVCellsUndefined: Self = StObject.set(x, "vCells", js.undefined)
    }
  }
}
