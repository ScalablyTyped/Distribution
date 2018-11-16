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

