package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockjsToJSONSchemaRs extends js.Object {
  var items: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.native
  var name: js.UndefOr[S] = js.native
  var path: js.Array[S] = js.native
  var properties: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.native
  var rule: js.Object = js.native
  var template: js.Any = js.native
  var `type`: S = js.native
}

object MockjsToJSONSchemaRs {
  @scala.inline
  def apply(path: js.Array[S], rule: js.Object, template: js.Any, `type`: S): MockjsToJSONSchemaRs = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockjsToJSONSchemaRs]
  }
  @scala.inline
  implicit class MockjsToJSONSchemaRsOps[Self <: MockjsToJSONSchemaRs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathVarargs(value: S*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[S]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: js.Object): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: S): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: MockjsToJSONSchemaRs*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[MockjsToJSONSchemaRs]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setName(value: S): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: MockjsToJSONSchemaRs*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[MockjsToJSONSchemaRs]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

