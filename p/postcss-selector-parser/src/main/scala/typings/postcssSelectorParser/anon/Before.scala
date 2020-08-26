package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Before extends js.Object {
  var after: String = js.native
  var attribute: js.UndefOr[PartialSpaces] = js.native
  var before: String = js.native
  var insensitive: js.UndefOr[PartialSpaces] = js.native
  var operator: js.UndefOr[PartialSpaces] = js.native
  var value: js.UndefOr[PartialSpaces] = js.native
}

object Before {
  @scala.inline
  def apply(after: String, before: String): Before = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  @scala.inline
  implicit class BeforeOps[Self <: Before] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribute(value: PartialSpaces): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setInsensitive(value: PartialSpaces): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
    @scala.inline
    def setOperator(value: PartialSpaces): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setValue(value: PartialSpaces): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

