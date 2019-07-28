package typings.mockjs.mockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockjsToJSONSchemaRs extends js.Object {
  var items: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.undefined
  var name: js.UndefOr[S] = js.undefined
  var path: js.Array[S]
  var properties: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.undefined
  var rule: js.Object
  var template: js.Any
  var `type`: S
}

object MockjsToJSONSchemaRs {
  @scala.inline
  def apply(
    path: js.Array[S],
    rule: js.Object,
    template: js.Any,
    `type`: S,
    items: js.Array[MockjsToJSONSchemaRs] = null,
    name: S = null,
    properties: js.Array[MockjsToJSONSchemaRs] = null
  ): MockjsToJSONSchemaRs = {
    val __obj = js.Dynamic.literal(path = path, rule = rule, template = template)
    __obj.updateDynamic("type")(`type`)
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[MockjsToJSONSchemaRs]
  }
}

