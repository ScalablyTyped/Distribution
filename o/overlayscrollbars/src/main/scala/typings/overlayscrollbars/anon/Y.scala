package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y extends js.Object {
  var x: js.UndefOr[ScrollBehavior] = js.native
  var y: js.UndefOr[ScrollBehavior] = js.native
}

object Y {
  @scala.inline
  def apply(): Y = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Y]
  }
  @scala.inline
  implicit class YOps[Self <: Y] (val x: Self) extends AnyVal {
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
    def setX(value: ScrollBehavior): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: ScrollBehavior): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

