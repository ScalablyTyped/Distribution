package typings.openfin.shapesLayoutMod

import typings.openfin.anon.ConstrainDragToContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var content: LayoutContent = js.native
  var settings: ConstrainDragToContainer = js.native
}

object Layout {
  @scala.inline
  def apply(content: LayoutContent, settings: ConstrainDragToContainer): Layout = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: LayoutContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: ConstrainDragToContainer): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

