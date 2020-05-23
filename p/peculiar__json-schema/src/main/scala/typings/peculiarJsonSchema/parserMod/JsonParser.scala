package typings.peculiarJsonSchema.parserMod

import typings.peculiarJsonSchema.transformMod.JsonTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/parser", "JsonParser")
@js.native
class JsonParser () extends JsonTransform

/* static members */
@JSImport("@peculiar/json-schema/build/types/parser", "JsonParser")
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

