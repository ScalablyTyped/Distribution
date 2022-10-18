package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersLabelForMod {
  
  @JSImport("sap/ui/test/matchers/LabelFor", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends LabelFor {
    def this(/**
      * optional map/JSON-object with initial settings for the new LabelFor
      */
    mSettings: LabelForSettings) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/matchers/LabelFor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.matchers.LabelFor with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, LabelFor]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LabelFor],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.matchers.LabelFor.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait LabelFor
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
      * Default value is `"text"`.
      *
      * @returns Value of property `propertyName`
      */
    def getPropertyName(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text of the {@link sap.m.Label} which have the labelFor property.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
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
      * Default value is `"text"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyName(): this.type = js.native
    def setPropertyName(/**
      * New value for property `propertyName`
      */
    sPropertyName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text of the {@link sap.m.Label} which have the labelFor property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait LabelForSettings
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
      * The text of the {@link sap.m.Label} which have the labelFor property.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object LabelForSettings {
    
    inline def apply(): LabelForSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelForSettings]
    }
    
    extension [Self <: LabelForSettings](x: Self) {
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      inline def setParameters(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPropertyName(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
