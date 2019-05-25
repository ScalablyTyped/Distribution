package typings
package olLib.tileRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/TileRange", JSImport.Default)
@js.native
class default protected () extends TileRange {
  def this(minX: scala.Double, maxX: scala.Double, minY: scala.Double, maxY: scala.Double) = this()
  /* CompleteClass */
  override def contains(tileCoord: olLib.tilecoordMod.TileCoord): scala.Boolean = js.native
  /* CompleteClass */
  override def containsTileRange(tileRange: TileRange): scala.Boolean = js.native
  /* CompleteClass */
  override def containsXY(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def equals(tileRange: TileRange): scala.Boolean = js.native
  /* CompleteClass */
  override def extend(tileRange: TileRange): scala.Unit = js.native
  /* CompleteClass */
  override def getHeight(): scala.Double = js.native
  /* CompleteClass */
  override def getSize(): olLib.sizeMod.Size = js.native
  /* CompleteClass */
  override def getWidth(): scala.Double = js.native
  /* CompleteClass */
  override def intersects(tileRange: TileRange): scala.Boolean = js.native
}

