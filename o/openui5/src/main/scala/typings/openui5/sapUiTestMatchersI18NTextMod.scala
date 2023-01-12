package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersI18NTextMod {
  
  @JSImport("sap/ui/test/matchers/I18NText", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends I18NText {
    def this(/**
      * optional map/JSON-object with initial settings for the new I18NText
      */
    mSettings: I18NTextSettings) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/matchers/I18NText", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.matchers.I18NText with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.test.matchers.Matcher.extend}.
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
    oClassInfo: ClassInfo[T, I18NText]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, I18NText],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.matchers.I18NText.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait I18NText
    extends typings.openui5.sapUiTestMatchersMatcherMod.default {
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * The key of the I18N text in the containing {@link module:sap/base/i18n/ResourceBundle}.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getModelName modelName}.
      *
      * The name of the {@link sap.ui.model.resource.ResourceModel} assigned to the control.
      *
      * Default value is `"i18n"`.
      *
      * @returns Value of property `modelName`
      */
    def getModelName(): String = js.native
    
    /**
      * Gets current value of property {@link #getParameters parameters}.
      *
      * The parameters for replacing the placeholders of the I18N text. See {@link module:sap/base/i18n/ResourceBundle#getText}.
      *
      * @returns Value of property `parameters`
      */
    def getParameters(): Any = js.native
    
    /**
      * Gets current value of property {@link #getPropertyName propertyName}.
      *
      * The name of the control property to match the I18N text with.
      *
      * @returns Value of property `propertyName`
      */
    def getPropertyName(): String = js.native
    
    /**
      * Gets current value of property {@link #getUseLibraryBundle useLibraryBundle}.
      *
      * The boolean flag to indicate whether to utiliize the library bundle of the control
      *
      * @returns Value of property `useLibraryBundle`
      */
    def getUseLibraryBundle(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * The key of the I18N text in the containing {@link module:sap/base/i18n/ResourceBundle}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getModelName modelName}.
      *
      * The name of the {@link sap.ui.model.resource.ResourceModel} assigned to the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"i18n"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModelName(): this.type = js.native
    def setModelName(/**
      * New value for property `modelName`
      */
    sModelName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getParameters parameters}.
      *
      * The parameters for replacing the placeholders of the I18N text. See {@link module:sap/base/i18n/ResourceBundle#getText}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setParameters(/**
      * New value for property `parameters`
      */
    oParameters: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPropertyName propertyName}.
      *
      * The name of the control property to match the I18N text with.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyName(/**
      * New value for property `propertyName`
      */
    sPropertyName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseLibraryBundle useLibraryBundle}.
      *
      * The boolean flag to indicate whether to utiliize the library bundle of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseLibraryBundle(/**
      * New value for property `useLibraryBundle`
      */
    bUseLibraryBundle: Boolean): this.type = js.native
  }
  
  trait I18NTextSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The key of the I18N text in the containing {@link module:sap/base/i18n/ResourceBundle}.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The name of the {@link sap.ui.model.resource.ResourceModel} assigned to the control.
      */
    var modelName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The parameters for replacing the placeholders of the I18N text. See {@link module:sap/base/i18n/ResourceBundle#getText}.
      */
    var parameters: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The name of the control property to match the I18N text with.
      */
    var propertyName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The boolean flag to indicate whether to utiliize the library bundle of the control
      */
    var useLibraryBundle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object I18NTextSettings {
    
    inline def apply(): I18NTextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[I18NTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18NTextSettings] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      inline def setParameters(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPropertyName(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setUseLibraryBundle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useLibraryBundle", value.asInstanceOf[js.Any])
      
      inline def setUseLibraryBundleUndefined: Self = StObject.set(x, "useLibraryBundle", js.undefined)
    }
  }
}
