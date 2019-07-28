package typings.navermaps.naverNs.mapsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapType extends js.Object {
  var maxZoom: Double
  var minZoom: Double
  var name: String
  var projection: Projection
  var tileSize: Size
  def getTile(x: Double, y: Double, z: Double): HTMLElement | Tile
}

object MapType {
  @scala.inline
  def apply(
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    tileSize: Size
  ): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), maxZoom = maxZoom, minZoom = minZoom, name = name, projection = projection, tileSize = tileSize)
  
    __obj.asInstanceOf[MapType]
  }
}

