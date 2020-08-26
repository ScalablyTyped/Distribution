package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderRaw extends js.Object {
  var render: `754` = js.native
  var renderRaw: `755` = js.native
}

object RenderRaw {
  @scala.inline
  def apply(render: `754`, renderRaw: `755`): RenderRaw = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderRaw]
  }
  @scala.inline
  implicit class RenderRawOps[Self <: RenderRaw] (val x: Self) extends AnyVal {
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
    def setRender(value: `754`): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderRaw(value: `755`): Self = this.set("renderRaw", value.asInstanceOf[js.Any])
  }
  
}

