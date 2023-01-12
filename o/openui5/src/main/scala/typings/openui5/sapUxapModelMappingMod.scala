package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapModelMappingMod {
  
  @JSImport("sap/uxap/ModelMapping", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ModelMapping`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ModelMapping {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ModelMappingSettings) = this()
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
    mSettings: ModelMappingSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ModelMappingSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ModelMapping", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ModelMapping with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, ModelMapping]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ModelMapping],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ModelMapping.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ModelMapping
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getExternalModelName externalModelName}.
      *
      * Determines the external model name.
      *
      * @returns Value of property `externalModelName`
      */
    def getExternalModelName(): String = js.native
    
    /**
      * Gets current value of property {@link #getExternalPath externalPath}.
      *
      * Determines the external path.
      *
      * @returns Value of property `externalPath`
      */
    def getExternalPath(): String = js.native
    
    /**
      * Gets current value of property {@link #getInternalModelName internalModelName}.
      *
      * Determines the internal model name.
      *
      * Default value is `"Model"`.
      *
      * @returns Value of property `internalModelName`
      */
    def getInternalModelName(): String = js.native
    
    /**
      * Sets a new value for property {@link #getExternalModelName externalModelName}.
      *
      * Determines the external model name.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExternalModelName(): this.type = js.native
    def setExternalModelName(/**
      * New value for property `externalModelName`
      */
    sExternalModelName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExternalPath externalPath}.
      *
      * Determines the external path.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExternalPath(): this.type = js.native
    def setExternalPath(/**
      * New value for property `externalPath`
      */
    sExternalPath: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInternalModelName internalModelName}.
      *
      * Determines the internal model name.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Model"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInternalModelName(): this.type = js.native
    def setInternalModelName(/**
      * New value for property `internalModelName`
      */
    sInternalModelName: String): this.type = js.native
  }
  
  trait ModelMappingSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Determines the external model name.
      */
    var externalModelName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the external path.
      */
    var externalPath: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the internal model name.
      */
    var internalModelName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ModelMappingSettings {
    
    inline def apply(): ModelMappingSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelMappingSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelMappingSettings] (val x: Self) extends AnyVal {
      
      inline def setExternalModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "externalModelName", value.asInstanceOf[js.Any])
      
      inline def setExternalModelNameUndefined: Self = StObject.set(x, "externalModelName", js.undefined)
      
      inline def setExternalPath(value: String | PropertyBindingInfo): Self = StObject.set(x, "externalPath", value.asInstanceOf[js.Any])
      
      inline def setExternalPathUndefined: Self = StObject.set(x, "externalPath", js.undefined)
      
      inline def setInternalModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "internalModelName", value.asInstanceOf[js.Any])
      
      inline def setInternalModelNameUndefined: Self = StObject.set(x, "internalModelName", js.undefined)
    }
  }
}
