package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersAggregationContainsPropertyEqualMod {
  
  @JSImport("sap/ui/test/matchers/AggregationContainsPropertyEqual", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AggregationContainsPropertyEqual {
    def this(/**
      * optional map/JSON-object with initial settings for the new AggregationContainsPropertyEqualMatcher
      */
    mSettings: AggregationContainsPropertyEqualSettings) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/matchers/AggregationContainsPropertyEqual", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.matchers.AggregationContainsPropertyEqual with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, AggregationContainsPropertyEqual]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AggregationContainsPropertyEqual],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.matchers.AggregationContainsPropertyEqual.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait AggregationContainsPropertyEqual
    extends typings.openui5.sapUiTestMatchersMatcherMod.default {
    
    /**
      * Gets current value of property {@link #getAggregationName aggregationName}.
      *
      * The Name of the aggregation that is used for matching.
      *
      * @returns Value of property `aggregationName`
      */
    def getAggregationName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPropertyName propertyName}.
      *
      * The Name of the property that is used for matching.
      *
      * @returns Value of property `propertyName`
      */
    def getPropertyName(): String = js.native
    
    /**
      * Gets current value of property {@link #getPropertyValue propertyValue}.
      *
      * The value of the Property that is used for matching.
      *
      * @returns Value of property `propertyValue`
      */
    def getPropertyValue(): Any = js.native
    
    /**
      * Sets a new value for property {@link #getAggregationName aggregationName}.
      *
      * The Name of the aggregation that is used for matching.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAggregationName(/**
      * New value for property `aggregationName`
      */
    sAggregationName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPropertyName propertyName}.
      *
      * The Name of the property that is used for matching.
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
      * Sets a new value for property {@link #getPropertyValue propertyValue}.
      *
      * The value of the Property that is used for matching.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyValue(/**
      * New value for property `propertyValue`
      */
    oPropertyValue: Any): this.type = js.native
  }
  
  trait AggregationContainsPropertyEqualSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The Name of the aggregation that is used for matching.
      */
    var aggregationName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The Name of the property that is used for matching.
      */
    var propertyName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The value of the Property that is used for matching.
      */
    var propertyValue: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object AggregationContainsPropertyEqualSettings {
    
    inline def apply(): AggregationContainsPropertyEqualSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregationContainsPropertyEqualSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AggregationContainsPropertyEqualSettings] (val x: Self) extends AnyVal {
      
      inline def setAggregationName(value: String | PropertyBindingInfo): Self = StObject.set(x, "aggregationName", value.asInstanceOf[js.Any])
      
      inline def setAggregationNameUndefined: Self = StObject.set(x, "aggregationName", js.undefined)
      
      inline def setPropertyName(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setPropertyValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
      
      inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
    }
  }
}
