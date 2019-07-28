package typings.openlayers.openlayersMod.olxNs

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.projNs.Projection
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
    val __obj = js.Dynamic.literal(center = center, projection = projection, resolution = resolution, rotation = rotation)
  
    __obj.asInstanceOf[ViewState]
  }
}

