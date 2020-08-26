package typings.playcanvas.anon

import typings.playcanvas.pc.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HalfExtents extends js.Object {
  var halfExtents: js.UndefOr[Vec2] = js.native
  var lengthSegments: js.UndefOr[Double] = js.native
  var widthSegments: js.UndefOr[Double] = js.native
}

object HalfExtents {
  @scala.inline
  def apply(): HalfExtents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HalfExtents]
  }
  @scala.inline
  implicit class HalfExtentsOps[Self <: HalfExtents] (val x: Self) extends AnyVal {
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
    def setHalfExtents(value: Vec2): Self = this.set("halfExtents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfExtents: Self = this.set("halfExtents", js.undefined)
    @scala.inline
    def setLengthSegments(value: Double): Self = this.set("lengthSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthSegments: Self = this.set("lengthSegments", js.undefined)
    @scala.inline
    def setWidthSegments(value: Double): Self = this.set("widthSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthSegments: Self = this.set("widthSegments", js.undefined)
  }
  
}

