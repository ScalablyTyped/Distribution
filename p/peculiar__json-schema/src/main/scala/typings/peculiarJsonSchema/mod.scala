package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.decoratorsMod.IJsonPropOptions
import typings.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typings.peculiarJsonSchema.parserMod.IJsonParserOptions
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.serializerMod.IJsonSerializerOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonError protected ()
    extends typings.peculiarJsonSchema.errorsMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
  }
  
  @js.native
  class JsonParser ()
    extends typings.peculiarJsonSchema.parserMod.JsonParser
  
  @js.native
  class JsonSerializer ()
    extends typings.peculiarJsonSchema.serializerMod.JsonSerializer
  
  @js.native
  class KeyError protected ()
    extends typings.peculiarJsonSchema.errorsMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @js.native
  class ParserError protected ()
    extends typings.peculiarJsonSchema.errorsMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
  }
  
  @js.native
  class SerializerError protected ()
    extends typings.peculiarJsonSchema.errorsMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: Error) = this()
  }
  
  @js.native
  class TransformError protected ()
    extends typings.peculiarJsonSchema.errorsMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
  }
  
  @js.native
  class ValidationError ()
    extends typings.peculiarJsonSchema.jsonErrorMod.JsonError
  
  def JsonProp(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def JsonProp(options: IJsonPropOptions): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  /* static members */
  @js.native
  object JsonParser extends js.Object {
    /**
      * Checks for odd properties in target object.
      * @param target Target object
      * @param namedSchema Named schema with a list of properties
      * @param schema
      * @throws Throws ParserError exception whenever target object has odd property
      */
    var checkStrictProperty: js.Any = js.native
    def fromJSON[T](target: js.Any, options: IJsonParserOptions[T]): T = js.native
    def parse[T](data: String, options: IJsonParserOptions[T]): T = js.native
  }
  
  @js.native
  object JsonPropTypes extends js.Object {
    /* 0 */ val Any: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Any with Double = js.native
    /* 1 */ val Boolean: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Boolean with Double = js.native
    /* 2 */ val Number: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.Number with Double = js.native
    /* 3 */ val String: typings.peculiarJsonSchema.propTypesMod.JsonPropTypes.String with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.peculiarJsonSchema.propTypesMod.JsonPropTypes with Double] = js.native
  }
  
  /* static members */
  @js.native
  object JsonSerializer extends js.Object {
    def serialize(obj: js.Any): String = js.native
    def serialize(obj: js.Any, options: IJsonSerializerOptions): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def toJSON(obj: js.Any): js.Any = js.native
    def toJSON(obj: js.Any, options: IJsonSerializerOptions): js.Any = js.native
  }
  
}

