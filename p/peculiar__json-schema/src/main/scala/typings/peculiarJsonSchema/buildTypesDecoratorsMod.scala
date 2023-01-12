package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes
import typings.peculiarJsonSchema.buildTypesTypesMod.IEmptyConstructor
import typings.peculiarJsonSchema.buildTypesTypesMod.IJsonConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDecoratorsMod {
  
  @JSImport("@peculiar/json-schema/build/types/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JsonProp(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProp")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def JsonProp(options: IJsonPropOptions): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  trait IJsonPropOptions extends StObject {
    
    var converter: js.UndefOr[IJsonConverter[Any, Any]] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    /**
      * Defines a list of acceptable values
      */
    var enumeration: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specifies the exact number of characters or list items allowed. Must be equal to or greater than zero
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the upper bounds for numeric values (the value must be less than this value)
      */
    var maxExclusive: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the upper bounds for numeric values (the value must be less than or equal to this value)
      */
    var maxInclusive: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the maximum number of characters or list items allowed. Must be equal to or greater than zero
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the lower bounds for numeric values (the value must be greater than this value)
      */
    var minExclusive: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the lower bounds for numeric values (the value must be greater than or equal to this value)
      */
    var minInclusive: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the minimum number of characters or list items allowed. Must be equal to or greater than zero
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines regular expression for text
      */
    var pattern: js.UndefOr[String | js.RegExp] = js.undefined
    
    var repeated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines name of schema
      */
    var schema: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[JsonPropTypes | IEmptyConstructor[Any]] = js.undefined
  }
  object IJsonPropOptions {
    
    inline def apply(): IJsonPropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonPropOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonPropOptions] (val x: Self) extends AnyVal {
      
      inline def setConverter(value: IJsonConverter[Any, Any]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setEnumeration(value: js.Array[String]): Self = StObject.set(x, "enumeration", value.asInstanceOf[js.Any])
      
      inline def setEnumerationUndefined: Self = StObject.set(x, "enumeration", js.undefined)
      
      inline def setEnumerationVarargs(value: String*): Self = StObject.set(x, "enumeration", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxExclusive(value: Double): Self = StObject.set(x, "maxExclusive", value.asInstanceOf[js.Any])
      
      inline def setMaxExclusiveUndefined: Self = StObject.set(x, "maxExclusive", js.undefined)
      
      inline def setMaxInclusive(value: Double): Self = StObject.set(x, "maxInclusive", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveUndefined: Self = StObject.set(x, "maxInclusive", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinExclusive(value: Double): Self = StObject.set(x, "minExclusive", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveUndefined: Self = StObject.set(x, "minExclusive", js.undefined)
      
      inline def setMinInclusive(value: Double): Self = StObject.set(x, "minInclusive", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveUndefined: Self = StObject.set(x, "minInclusive", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      inline def setSchema(value: String | js.Array[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value*))
      
      inline def setType(value: JsonPropTypes | IEmptyConstructor[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
