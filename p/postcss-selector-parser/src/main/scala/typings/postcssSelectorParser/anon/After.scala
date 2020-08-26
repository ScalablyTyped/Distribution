package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  var after: js.UndefOr[String] = js.native
  var attribute: js.UndefOr[PartialSpaceAround] = js.native
  var before: js.UndefOr[String] = js.native
  var insensitive: js.UndefOr[PartialSpaceAround] = js.native
  var operator: js.UndefOr[PartialSpaceAround] = js.native
  var value: js.UndefOr[PartialSpaceAround] = js.native
}

object After {
  @scala.inline
  def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
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
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAttribute(value: PartialSpaceAround): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setInsensitive(value: PartialSpaceAround): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
    @scala.inline
    def setOperator(value: PartialSpaceAround): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setValue(value: PartialSpaceAround): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

