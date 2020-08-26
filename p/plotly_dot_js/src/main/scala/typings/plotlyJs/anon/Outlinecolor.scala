package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outlinecolor extends js.Object {
  var outlinecolor: typings.plotlyJs.mod.Color = js.native
}

object Outlinecolor {
  @scala.inline
  def apply(outlinecolor: typings.plotlyJs.mod.Color): Outlinecolor = {
    val __obj = js.Dynamic.literal(outlinecolor = outlinecolor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outlinecolor]
  }
  @scala.inline
  implicit class OutlinecolorOps[Self <: Outlinecolor] (val x: Self) extends AnyVal {
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
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("outlinecolor", js.Array(value :_*))
    @scala.inline
    def setOutlinecolor(value: typings.plotlyJs.mod.Color): Self = this.set("outlinecolor", value.asInstanceOf[js.Any])
  }
  
}

