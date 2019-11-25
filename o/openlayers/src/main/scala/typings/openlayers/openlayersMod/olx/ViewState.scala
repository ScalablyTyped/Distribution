package typings.openlayers.openlayersMod.olx

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  var center: Coordinate
  var projection: Projection
  var resolution: Double
  var rotation: Double
}

object ViewState {
  @scala.inline
  def apply(center: Coordinate, projection: Projection, resolution: Double, rotation: Double): ViewState = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewState]
  }
}

