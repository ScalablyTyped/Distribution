package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapType extends js.Object {
  var maxZoom: scala.Double
  var minZoom: scala.Double
  var name: java.lang.String
  var projection: Projection
  var tileSize: Size
  def getTile(x: scala.Double, y: scala.Double, z: scala.Double): stdLib.HTMLElement | Tile
}

object MapType {
  @scala.inline
  def apply(
    getTile: (scala.Double, scala.Double, scala.Double) => stdLib.HTMLElement | Tile,
    maxZoom: scala.Double,
    minZoom: scala.Double,
    name: java.lang.String,
    projection: Projection,
    tileSize: Size
  ): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), maxZoom = maxZoom, minZoom = minZoom, name = name, projection = projection, tileSize = tileSize)
  
    __obj.asInstanceOf[MapType]
  }
}

