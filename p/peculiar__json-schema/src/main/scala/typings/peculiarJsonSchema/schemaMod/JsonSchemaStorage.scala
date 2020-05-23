package typings.peculiarJsonSchema.schemaMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/schema", "JsonSchemaStorage")
@js.native
class JsonSchemaStorage () extends js.Object {
  var items: Map[js.Object, IJsonSchema] = js.native
  /**
    * Creates new schema
    * @param target Target object
    */
  def create(target: js.Object): IJsonSchema = js.native
  /* protected */ def findParentSchema(target: js.Object): IJsonSchema | Null = js.native
  def get(target: js.Object): IJsonSchema = js.native
  def has(target: js.Object): Boolean = js.native
  def set(target: js.Object, schema: IJsonSchema): this.type = js.native
}

