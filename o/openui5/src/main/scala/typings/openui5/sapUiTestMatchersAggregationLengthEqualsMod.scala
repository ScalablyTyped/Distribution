package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersAggregationLengthEqualsMod {
  
  @JSImport("sap/ui/test/matchers/AggregationLengthEquals", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AggregationLengthEquals {
    def this(/**
      * optional map/JSON-object with initial settings for the new AggregationLengthEqualsMatcher
      */
    mSettings: AggregationLengthEqualsSettings) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/matchers/AggregationLengthEquals", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.matchers.AggregationLengthEquals with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, AggregationLengthEquals]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AggregationLengthEquals],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.matchers.AggregationLengthEquals.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait AggregationLengthEquals
    extends typings.openui5.sapUiTestMatchersMatcherMod.default {
    
    /**
      * Gets current value of property {@link #getLength length}.
      *
      * The length that aggregation `name` should have.
      *
      * @returns Value of property `length`
      */
    def getLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The name of the aggregation that is used for matching.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Sets a new value for property {@link #getLength length}.
      *
      * The length that aggregation `name` should have.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLength(/**
      * New value for property `length`
      */
    iLength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * The name of the aggregation that is used for matching.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
  }
  
  trait AggregationLengthEqualsSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The length that aggregation `name` should have.
      */
    var length: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The name of the aggregation that is used for matching.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object AggregationLengthEqualsSettings {
    
    inline def apply(): AggregationLengthEqualsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregationLengthEqualsSettings]
    }
    
    extension [Self <: AggregationLengthEqualsSettings](x: Self) {
      
      inline def setLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
