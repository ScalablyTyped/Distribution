package typings
package olLib.tileRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileRange extends js.Object {
  def contains(tileCoord: olLib.tilecoordMod.TileCoord): scala.Boolean
  def containsTileRange(tileRange: TileRange): scala.Boolean
  def containsXY(x: scala.Double, y: scala.Double): scala.Boolean
  def equals(tileRange: TileRange): scala.Boolean
  def extend(tileRange: TileRange): scala.Unit
  def getHeight(): scala.Double
  def getSize(): olLib.sizeMod.Size
  def getWidth(): scala.Double
  def intersects(tileRange: TileRange): scala.Boolean
}

object TileRange {
  @scala.inline
  def apply(
    contains: olLib.tilecoordMod.TileCoord => scala.Boolean,
    containsTileRange: TileRange => scala.Boolean,
    containsXY: (scala.Double, scala.Double) => scala.Boolean,
    equals: TileRange => scala.Boolean,
    extend: TileRange => scala.Unit,
    getHeight: () => scala.Double,
    getSize: () => olLib.sizeMod.Size,
    getWidth: () => scala.Double,
    intersects: TileRange => scala.Boolean
  ): TileRange = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getHeight = js.Any.fromFunction0(getHeight), getSize = js.Any.fromFunction0(getSize), getWidth = js.Any.fromFunction0(getWidth), intersects = js.Any.fromFunction1(intersects))
  
    __obj.asInstanceOf[TileRange]
  }
}

