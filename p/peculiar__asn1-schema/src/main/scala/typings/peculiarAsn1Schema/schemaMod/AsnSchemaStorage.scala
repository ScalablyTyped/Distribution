package typings.peculiarAsn1Schema.schemaMod

import typings.asn1js.mod.Choice
import typings.asn1js.mod.Sequence
import typings.asn1js.mod.Set
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/schema", "AsnSchemaStorage")
@js.native
class AsnSchemaStorage () extends js.Object {
  var items: WeakMap[js.Object, IAsnSchema] = js.native
  def cache(target: js.Object): Unit = js.native
  def create(target: js.Object, useNames: Boolean): Sequence | Set | Choice = js.native
  def createDefault(target: js.Object): IAsnSchema = js.native
  /* protected */ def findParentSchema(target: js.Object): IAsnSchema | Null = js.native
  def get(target: js.Object): IAsnSchema = js.native
  def has(target: js.Object): Boolean = js.native
  def set(target: js.Object, schema: IAsnSchema): this.type = js.native
}

