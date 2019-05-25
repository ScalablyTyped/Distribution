package typings
package olLib.tilecoordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilecoord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createOrUpdate(z: scala.Double, x: scala.Double, y: scala.Double): TileCoord = js.native
  def createOrUpdate(z: scala.Double, x: scala.Double, y: scala.Double, opt_tileCoord: TileCoord): TileCoord = js.native
  def fromKey(key: java.lang.String): TileCoord = js.native
  def getKey(tileCoord: TileCoord): java.lang.String = js.native
  def getKeyZXY(z: scala.Double, x: scala.Double, y: scala.Double): java.lang.String = js.native
  def hash(tileCoord: TileCoord): scala.Double = js.native
  def quadKey(tileCoord: TileCoord): java.lang.String = js.native
  def withinExtentAndZ(tileCoord: TileCoord, tileGrid: olLib.tilegridTileGridMod.default): scala.Boolean = js.native
}

