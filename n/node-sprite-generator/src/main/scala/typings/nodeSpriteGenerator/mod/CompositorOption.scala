package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositorOption extends js.Object {
  var compressionLevel: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[CompositorFilters] = js.native
}

object CompositorOption {
  @scala.inline
  def apply(): CompositorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositorOption]
  }
  @scala.inline
  implicit class CompositorOptionOps[Self <: CompositorOption] (val x: Self) extends AnyVal {
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
    def setCompressionLevel(value: Double): Self = this.set("compressionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionLevel: Self = this.set("compressionLevel", js.undefined)
    @scala.inline
    def setFilter(value: CompositorFilters): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

