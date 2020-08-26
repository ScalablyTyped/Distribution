package typings.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleObject extends js.Object {
  var bell: js.UndefOr[Boolean] = js.native
  var bg: js.UndefOr[String] = js.native
  var bold: js.UndefOr[Boolean] = js.native
  var fg: js.UndefOr[String] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  var underline: js.UndefOr[Boolean] = js.native
}

object StyleObject {
  @scala.inline
  def apply(): StyleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleObject]
  }
  @scala.inline
  implicit class StyleObjectOps[Self <: StyleObject] (val x: Self) extends AnyVal {
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
    def setBell(value: Boolean): Self = this.set("bell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBell: Self = this.set("bell", js.undefined)
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

