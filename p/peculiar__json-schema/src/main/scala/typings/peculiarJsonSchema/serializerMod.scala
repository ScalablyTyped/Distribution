package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.transformMod.JsonTransform
import typings.peculiarJsonSchema.typesMod.IEmptyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("@peculiar/json-schema/build/types/serializer", "JsonSerializer")
  @js.native
  open class JsonSerializer () extends JsonTransform
  /* static members */
  object JsonSerializer {
    
    @JSImport("@peculiar/json-schema/build/types/serializer", "JsonSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def serialize(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def serialize(obj: Any, options: Unit, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(
      obj: Any,
      options: Unit,
      replacer: js.Function2[/* key */ String, /* value */ Any, Any],
      space: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(
      obj: Any,
      options: Unit,
      replacer: js.Function2[/* key */ String, /* value */ Any, Any],
      space: Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(obj: Any, options: Unit, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(obj: Any, options: Unit, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(obj: Any, options: IJsonSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(
      obj: Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ Any, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(
      obj: Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ Any, Any],
      space: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(
      obj: Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ Any, Any],
      space: Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(obj: Any, options: IJsonSerializerOptions, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def serialize(obj: Any, options: IJsonSerializerOptions, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSON(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toJSON(obj: Any, options: IJsonSerializerOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  trait IJsonSerializerOptions extends StObject {
    
    var schemaName: js.UndefOr[String] = js.undefined
    
    var targetSchema: js.UndefOr[IEmptyConstructor[Any]] = js.undefined
  }
  object IJsonSerializerOptions {
    
    inline def apply(): IJsonSerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonSerializerOptions]
    }
    
    extension [Self <: IJsonSerializerOptions](x: Self) {
      
      inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
      
      inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
      
      inline def setTargetSchema(value: IEmptyConstructor[Any]): Self = StObject.set(x, "targetSchema", value.asInstanceOf[js.Any])
      
      inline def setTargetSchemaUndefined: Self = StObject.set(x, "targetSchema", js.undefined)
    }
  }
}
