package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiLayoutFormFormLayoutMod.FormLayoutSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormGridLayoutMod {
  
  @JSImport("sap/ui/layout/form/GridLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.GridLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridLayoutSettings) = this()
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
    mSettings: GridLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/GridLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.GridLayout with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.form.FormLayout.extend}.
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
    oClassInfo: ClassInfo[T, GridLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.GridLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridLayout
    extends typings.openui5.sapUiLayoutFormFormLayoutMod.default {
    
    /**
      * Gets current value of property {@link #getSingleColumn singleColumn}.
      *
      * If set, the grid renders only one `FormContainer` per column. That means one `FormContainer` is below
      * the other. The whole grid has 8 cells per row.
      *
      * If not set, `FormContainer` can use the full width of the grid or two `FormContainers` can be placed
      * beside each other. In this case the whole grid has 16 cells per row.
      *
      * Default value is `false`.
      *
      * @returns Value of property `singleColumn`
      */
    def getSingleColumn(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getSingleColumn singleColumn}.
      *
      * If set, the grid renders only one `FormContainer` per column. That means one `FormContainer` is below
      * the other. The whole grid has 8 cells per row.
      *
      * If not set, `FormContainer` can use the full width of the grid or two `FormContainers` can be placed
      * beside each other. In this case the whole grid has 16 cells per row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSingleColumn(): this.type = js.native
    def setSingleColumn(/**
      * New value for property `singleColumn`
      */
    bSingleColumn: Boolean): this.type = js.native
  }
  
  trait GridLayoutSettings
    extends StObject
       with FormLayoutSettings {
    
    /**
      * If set, the grid renders only one `FormContainer` per column. That means one `FormContainer` is below
      * the other. The whole grid has 8 cells per row.
      *
      * If not set, `FormContainer` can use the full width of the grid or two `FormContainers` can be placed
      * beside each other. In this case the whole grid has 16 cells per row.
      */
    var singleColumn: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridLayoutSettings {
    
    inline def apply(): GridLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setSingleColumn(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleColumn", value.asInstanceOf[js.Any])
      
      inline def setSingleColumnUndefined: Self = StObject.set(x, "singleColumn", js.undefined)
    }
  }
}
