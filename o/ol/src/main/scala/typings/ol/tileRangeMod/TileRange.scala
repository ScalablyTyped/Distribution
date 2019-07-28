package typings.ol.tileRangeMod

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileRange extends js.Object {
  def contains(tileCoord: TileCoord): Boolean
  def containsTileRange(tileRange: TileRange): Boolean
  def containsXY(x: Double, y: Double): Boolean
  def equals(tileRange: TileRange): Boolean
  def extend(tileRange: TileRange): Unit
  def getHeight(): Double
  def getSize(): Size
  def getWidth(): Double
  def intersects(tileRange: TileRange): Boolean
}

object TileRange {
  @scala.inline
  def apply(
    contains: TileCoord => Boolean,
    containsTileRange: TileRange => Boolean,
    containsXY: (Double, Double) => Boolean,
    equals: TileRange => Boolean,
    extend: TileRange => Unit,
    getHeight: () => Double,
    getSize: () => Size,
    getWidth: () => Double,
    intersects: TileRange => Boolean
  ): TileRange = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getHeight = js.Any.fromFunction0(getHeight), getSize = js.Any.fromFunction0(getSize), getWidth = js.Any.fromFunction0(getWidth), intersects = js.Any.fromFunction1(intersects))
  
    __obj.asInstanceOf[TileRange]
  }
}

