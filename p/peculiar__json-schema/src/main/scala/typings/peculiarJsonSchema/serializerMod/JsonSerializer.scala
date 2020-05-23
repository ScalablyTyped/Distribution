package typings.peculiarJsonSchema.serializerMod

import typings.peculiarJsonSchema.transformMod.JsonTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/serializer", "JsonSerializer")
@js.native
class JsonSerializer () extends JsonTransform

/* static members */
@JSImport("@peculiar/json-schema/build/types/serializer", "JsonSerializer")
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

