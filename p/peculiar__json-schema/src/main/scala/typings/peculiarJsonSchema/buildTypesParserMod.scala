package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesTransformMod.JsonTransform
import typings.peculiarJsonSchema.buildTypesTypesMod.IEmptyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesParserMod {
  
  @JSImport("@peculiar/json-schema/build/types/parser", "JsonParser")
  @js.native
  open class JsonParser () extends JsonTransform
  /* static members */
  object JsonParser {
    
    @JSImport("@peculiar/json-schema/build/types/parser", "JsonParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks for odd properties in target object.
      * @param target Target object
      * @param namedSchema Named schema with a list of properties
      * @param schema
      * @throws Throws ParserError exception whenever target object has odd property
      */
    @JSImport("@peculiar/json-schema/build/types/parser", "JsonParser.checkStrictProperty")
    @js.native
    def checkStrictProperty: Any = js.native
    inline def checkStrictProperty_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictProperty")(x.asInstanceOf[js.Any])
    
    inline def fromJSON[T](target: Any, options: IJsonParserOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def parse[T](data: String, options: IJsonParserOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  trait IJsonParserOptions[T] extends StObject {
    
    var schemaName: js.UndefOr[String] = js.undefined
    
    /**
      * Checks all properties for object and throws KeyError with list of wrong keys
      */
    var strictAllKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable strict checking of properties. Throw exception if incoming JSON has odd fields
      */
    var strictProperty: js.UndefOr[Boolean] = js.undefined
    
    var targetSchema: IEmptyConstructor[T]
  }
  object IJsonParserOptions {
    
    inline def apply[T](targetSchema: IEmptyConstructor[T]): IJsonParserOptions[T] = {
      val __obj = js.Dynamic.literal(targetSchema = targetSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonParserOptions[T]]
    }
    
    extension [Self <: IJsonParserOptions[?], T](x: Self & IJsonParserOptions[T]) {
      
      inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
      
      inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
      
      inline def setStrictAllKeys(value: Boolean): Self = StObject.set(x, "strictAllKeys", value.asInstanceOf[js.Any])
      
      inline def setStrictAllKeysUndefined: Self = StObject.set(x, "strictAllKeys", js.undefined)
      
      inline def setStrictProperty(value: Boolean): Self = StObject.set(x, "strictProperty", value.asInstanceOf[js.Any])
      
      inline def setStrictPropertyUndefined: Self = StObject.set(x, "strictProperty", js.undefined)
      
      inline def setTargetSchema(value: IEmptyConstructor[T]): Self = StObject.set(x, "targetSchema", value.asInstanceOf[js.Any])
    }
  }
}
