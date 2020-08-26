package typings.ol.tileRangeMod

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileRange extends js.Object {
  def contains(tileCoord: TileCoord): Boolean = js.native
  def containsTileRange(tileRange: TileRange): Boolean = js.native
  def containsXY(x: Double, y: Double): Boolean = js.native
  def equals(tileRange: TileRange): Boolean = js.native
  def extend(tileRange: TileRange): Unit = js.native
  def getHeight(): Double = js.native
  def getSize(): Size = js.native
  def getWidth(): Double = js.native
  def intersects(tileRange: TileRange): Boolean = js.native
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
  @scala.inline
  implicit class TileRangeOps[Self <: TileRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContains(value: TileCoord => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsTileRange(value: TileRange => Boolean): Self = this.set("containsTileRange", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsXY(value: (Double, Double) => Boolean): Self = this.set("containsXY", js.Any.fromFunction2(value))
    @scala.inline
    def setEquals(value: TileRange => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: TileRange => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Size): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setIntersects(value: TileRange => Boolean): Self = this.set("intersects", js.Any.fromFunction1(value))
  }
  
}

