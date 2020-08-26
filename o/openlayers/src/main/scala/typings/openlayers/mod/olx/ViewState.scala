package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewState extends js.Object {
  var center: Coordinate_ = js.native
  var projection: Projection = js.native
  var resolution: Double = js.native
  var rotation: Double = js.native
}

object ViewState {
  @scala.inline
  def apply(center: Coordinate_, projection: Projection, resolution: Double, rotation: Double): ViewState = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
  @scala.inline
  implicit class ViewStateOps[Self <: ViewState] (val x: Self) extends AnyVal {
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
    def setCenter(value: Coordinate_): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
  }
  
}

