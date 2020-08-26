package typings.openfin.shapesPlatformMod

import typings.openfin.shapesLayoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceLayoutOpts extends js.Object {
  var layout: Layout = js.native
}

object ReplaceLayoutOpts {
  @scala.inline
  def apply(layout: Layout): ReplaceLayoutOpts = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutOpts]
  }
  @scala.inline
  implicit class ReplaceLayoutOptsOps[Self <: ReplaceLayoutOpts] (val x: Self) extends AnyVal {
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
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
  }
  
}

