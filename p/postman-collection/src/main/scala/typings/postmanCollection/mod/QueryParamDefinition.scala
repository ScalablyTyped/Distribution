package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParamDefinition extends PropertyDefinition {
  var key: String | Null = js.native
  var system: js.UndefOr[Boolean] = js.native
  var value: String | Null = js.native
}

object QueryParamDefinition {
  @scala.inline
  def apply(): QueryParamDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParamDefinition]
  }
  @scala.inline
  implicit class QueryParamDefinitionOps[Self <: QueryParamDefinition] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    @scala.inline
    def setSystem(value: Boolean): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

