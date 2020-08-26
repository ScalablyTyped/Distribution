package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynHeight extends js.Object {
  var dynHeight: js.UndefOr[Boolean] = js.native
  var dynWidth: js.UndefOr[Boolean] = js.native
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.native
}

object DynHeight {
  @scala.inline
  def apply(): DynHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynHeight]
  }
  @scala.inline
  implicit class DynHeightOps[Self <: DynHeight] (val x: Self) extends AnyVal {
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
    def setDynHeight(value: Boolean): Self = this.set("dynHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynHeight: Self = this.set("dynHeight", js.undefined)
    @scala.inline
    def setDynWidth(value: Boolean): Self = this.set("dynWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynWidth: Self = this.set("dynWidth", js.undefined)
    @scala.inline
    def setInheritedAttrsVarargs(value: String*): Self = this.set("inheritedAttrs", js.Array(value :_*))
    @scala.inline
    def setInheritedAttrs(value: String | js.Array[String]): Self = this.set("inheritedAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritedAttrs: Self = this.set("inheritedAttrs", js.undefined)
    @scala.inline
    def setInheritedAttrsNull: Self = this.set("inheritedAttrs", null)
  }
  
}

