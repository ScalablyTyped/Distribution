package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  var center: openlayersLib.openlayersMod.Coordinate
  var projection: openlayersLib.openlayersMod.projNs.Projection
  var resolution: scala.Double
  var rotation: scala.Double
}

object ViewState {
  @scala.inline
  def apply(
    center: openlayersLib.openlayersMod.Coordinate,
    projection: openlayersLib.openlayersMod.projNs.Projection,
    resolution: scala.Double,
    rotation: scala.Double
  ): ViewState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("projection")(projection)
    __obj.updateDynamic("resolution")(resolution)
    __obj.updateDynamic("rotation")(rotation)
    __obj.asInstanceOf[ViewState]
  }
}

