package typings.ol.tileRangeMod

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/TileRange", JSImport.Default)
@js.native
class default protected () extends TileRange {
  def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  /* CompleteClass */
  override def contains(tileCoord: TileCoord): Boolean = js.native
  /* CompleteClass */
  override def containsTileRange(tileRange: TileRange): Boolean = js.native
  /* CompleteClass */
  override def containsXY(x: Double, y: Double): Boolean = js.native
  /* CompleteClass */
  override def equals(tileRange: TileRange): Boolean = js.native
  /* CompleteClass */
  override def extend(tileRange: TileRange): Unit = js.native
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /* CompleteClass */
  override def getSize(): Size = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def intersects(tileRange: TileRange): Boolean = js.native
}

