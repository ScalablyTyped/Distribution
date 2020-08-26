package typings.ol.tileDebugMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var projection: js.UndefOr[ProjectionLike] = js.native
  var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
  var zDirection: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
    @scala.inline
    def setZDirection(value: Double): Self = this.set("zDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZDirection: Self = this.set("zDirection", js.undefined)
  }
  
}

