package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMSelectMod.SelectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapHierarchicalSelectMod {
  
  @JSImport("sap/uxap/HierarchicalSelect", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `HierarchicalSelect`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends HierarchicalSelect {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: HierarchicalSelectSettings) = this()
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
    mSettings: HierarchicalSelectSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: HierarchicalSelectSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/HierarchicalSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.HierarchicalSelect with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Select.extend}.
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
    oClassInfo: ClassInfo[T, HierarchicalSelect]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HierarchicalSelect],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.HierarchicalSelect.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait HierarchicalSelect
    extends typings.openui5.sapMSelectMod.default {
    
    /**
      * Gets current value of property {@link #getUpperCase upperCase}.
      *
      * Determines whether the HierarchicalSelect items are displayed in upper case.
      *
      * Default value is `false`.
      *
      * @returns Value of property `upperCase`
      */
    def getUpperCase(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getUpperCase upperCase}.
      *
      * Determines whether the HierarchicalSelect items are displayed in upper case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpperCase(): this.type = js.native
    def setUpperCase(/**
      * New value for property `upperCase`
      */
    bUpperCase: Boolean): this.type = js.native
  }
  
  trait HierarchicalSelectSettings
    extends StObject
       with SelectSettings {
    
    /**
      * Determines whether the HierarchicalSelect items are displayed in upper case.
      */
    var upperCase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HierarchicalSelectSettings {
    
    inline def apply(): HierarchicalSelectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HierarchicalSelectSettings]
    }
    
    extension [Self <: HierarchicalSelectSettings](x: Self) {
      
      inline def setUpperCase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    }
  }
}
