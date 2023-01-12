package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormGridContainerDataMod {
  
  @JSImport("sap/ui/layout/form/GridContainerData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.GridContainerData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridContainerData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridContainerDataSettings) = this()
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
    mSettings: GridContainerDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridContainerDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/GridContainerData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.GridContainerData with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, GridContainerData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridContainerData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.GridContainerData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridContainerData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getHalfGrid halfGrid}.
      *
      * If set, the container takes half the width of the `Form` (8 cells), if not it takes the full width (16
      * cells). If the `GridLayout` is set to `singleColumn`, the full width of the grid is only 8 cells. So
      * containers are rendered only once per row.
      *
      * Default value is `false`.
      *
      * @returns Value of property `halfGrid`
      */
    def getHalfGrid(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getHalfGrid halfGrid}.
      *
      * If set, the container takes half the width of the `Form` (8 cells), if not it takes the full width (16
      * cells). If the `GridLayout` is set to `singleColumn`, the full width of the grid is only 8 cells. So
      * containers are rendered only once per row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHalfGrid(): this.type = js.native
    def setHalfGrid(/**
      * New value for property `halfGrid`
      */
    bHalfGrid: Boolean): this.type = js.native
  }
  
  trait GridContainerDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * If set, the container takes half the width of the `Form` (8 cells), if not it takes the full width (16
      * cells). If the `GridLayout` is set to `singleColumn`, the full width of the grid is only 8 cells. So
      * containers are rendered only once per row.
      */
    var halfGrid: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridContainerDataSettings {
    
    inline def apply(): GridContainerDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridContainerDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridContainerDataSettings] (val x: Self) extends AnyVal {
      
      inline def setHalfGrid(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "halfGrid", value.asInstanceOf[js.Any])
      
      inline def setHalfGridUndefined: Self = StObject.set(x, "halfGrid", js.undefined)
    }
  }
}
