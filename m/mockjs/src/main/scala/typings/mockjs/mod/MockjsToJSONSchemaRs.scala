package typings.mockjs.mod

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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockjsToJSONSchemaRs]
  }
}

