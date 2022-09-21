package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.decoratorsMod.IJsonPropOptions
import typings.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typings.peculiarJsonSchema.parserMod.IJsonParserOptions
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.serializerMod.IJsonSerializerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@peculiar/json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@peculiar/json-schema", "JsonError")
  @js.native
  open class JsonError protected ()
    extends typings.peculiarJsonSchema.errorsMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema", "JsonParser")
  @js.native
  open class JsonParser ()
    extends typings.peculiarJsonSchema.parserMod.JsonParser
  /* static members */
  object JsonParser {
    
    @JSImport("@peculiar/json-schema", "JsonParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks for odd properties in target object.
      * @param target Target object
      * @param namedSchema Named schema with a list of properties
      * @param schema
      * @throws Throws ParserError exception whenever target object has odd property
      */
    @JSImport("@peculiar/json-schema", "JsonParser.checkStrictProperty")
    @js.native
    def checkStrictProperty: Any = js.native
    inline def checkStrictProperty_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictProperty")(x.asInstanceOf[js.Any])
    
    inline def fromJSON[T](target: Any, options: IJsonParserOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def parse[T](data: String, options: IJsonParserOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  inline def JsonProp(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProp")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def JsonProp(options: IJsonPropOptions): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @JSImport("@peculiar/json-schema", "JsonPropTypes")
  @js.native
  object JsonPropTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarJsonSchema.propTypesMod.JsonPropTypes & Double] = js.native
    
    /* 0 */ val Any: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Any & Double = js.native
    
    /* 1 */ val Boolean: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Boolean & Double = js.native
    
    /* 2 */ val Number: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Number & Double = js.native
    
    /* 3 */ val String: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.String & Double = js.native
  }
  
  @JSImport("@peculiar/json-schema", "JsonSerializer")
  @js.native
  open class JsonSerializer ()
    extends typings.peculiarJsonSchema.serializerMod.JsonSerializer
  /* static members */
  object JsonSerializer {
    
    @JSImport("@peculiar/json-schema", "JsonSerializer")
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
  
  @JSImport("@peculiar/json-schema", "KeyError")
  @js.native
  open class KeyError protected ()
    extends typings.peculiarJsonSchema.errorsMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @JSImport("@peculiar/json-schema", "ParserError")
  @js.native
  open class ParserError protected ()
    extends typings.peculiarJsonSchema.errorsMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema", "SerializerError")
  @js.native
  open class SerializerError protected ()
    extends typings.peculiarJsonSchema.errorsMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema", "TransformError")
  @js.native
  open class TransformError protected ()
    extends typings.peculiarJsonSchema.errorsMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends typings.peculiarJsonSchema.errorsMod.ValidationError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
}
