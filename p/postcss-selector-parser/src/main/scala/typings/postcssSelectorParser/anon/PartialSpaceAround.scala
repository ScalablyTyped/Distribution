package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.SpaceAround> */
@js.native
trait PartialSpaceAround extends js.Object {
  var after: js.UndefOr[String] = js.native
  var before: js.UndefOr[String] = js.native
}

object PartialSpaceAround {
  @scala.inline
  def apply(): PartialSpaceAround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSpaceAround]
  }
  @scala.inline
  implicit class PartialSpaceAroundOps[Self <: PartialSpaceAround] (val x: Self) extends AnyVal {
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
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
  
}

