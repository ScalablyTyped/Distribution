package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersBindingPathMod {
  
  @JSImport("sap/ui/test/matchers/BindingPath", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BindingPath {
    def this(/**
      * Map/JSON-object with initial settings for the new BindingPath.
      */
    mSettings: BindingPathSettings) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/matchers/BindingPath", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.matchers.BindingPath with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, BindingPath]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BindingPath],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.matchers.BindingPath.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait BindingPath
    extends typings.openui5.sapUiTestMatchersMatcherMod.default {
    
    /**
      * Gets current value of property {@link #getModelName modelName}.
      *
      * The name of the binding model that is used for matching.
      *
      * @returns Value of property `modelName`
      */
    def getModelName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPath path}.
      *
      * The value of the binding context path that is used for matching. As of version 1.81, it can also be a
      * regular expression.
      *
      * @returns Value of property `path`
      */
    def getPath(): Any = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getPropertyPath propertyPath}.
      *
      * The value of the binding property path that is used for matching. If (context) path is also set, propertyPath
      * will be assumed to be relative to the binding context path As of version 1.81, it can also be a regular
      * expression.
      *
      * @returns Value of property `propertyPath`
      */
    def getPropertyPath(): Any = js.native
    
    /**
      * @SINCE 1.86
      *
      * Gets current value of property {@link #getValue value}.
      *
      * value of a static binding property. Use this only for {@link sap.ui.model.StaticBinding}
      *
      * @returns Value of property `value`
      */
    def getValue(): Any = js.native
    
    /**
      * Sets a new value for property {@link #getModelName modelName}.
      *
      * The name of the binding model that is used for matching.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModelName(/**
      * New value for property `modelName`
      */
    sModelName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPath path}.
      *
      * The value of the binding context path that is used for matching. As of version 1.81, it can also be a
      * regular expression.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPath(/**
      * New value for property `path`
      */
    oPath: Any): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getPropertyPath propertyPath}.
      *
      * The value of the binding property path that is used for matching. If (context) path is also set, propertyPath
      * will be assumed to be relative to the binding context path As of version 1.81, it can also be a regular
      * expression.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyPath(/**
      * New value for property `propertyPath`
      */
    oPropertyPath: Any): this.type = js.native
    
    /**
      * @SINCE 1.86
      *
      * Sets a new value for property {@link #getValue value}.
      *
      * value of a static binding property. Use this only for {@link sap.ui.model.StaticBinding}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(/**
      * New value for property `value`
      */
    oValue: Any): this.type = js.native
  }
  
  trait BindingPathSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The name of the binding model that is used for matching.
      */
    var modelName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The value of the binding context path that is used for matching. As of version 1.81, it can also be a
      * regular expression.
      */
    var path: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * The value of the binding property path that is used for matching. If (context) path is also set, propertyPath
      * will be assumed to be relative to the binding context path As of version 1.81, it can also be a regular
      * expression.
      */
    var propertyPath: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.86
      *
      * value of a static binding property. Use this only for {@link sap.ui.model.StaticBinding}
      */
    var value: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object BindingPathSettings {
    
    inline def apply(): BindingPathSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindingPathSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindingPathSettings] (val x: Self) extends AnyVal {
      
      inline def setModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      inline def setPath(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPropertyPath(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      inline def setPropertyPathUndefined: Self = StObject.set(x, "propertyPath", js.undefined)
      
      inline def setValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
