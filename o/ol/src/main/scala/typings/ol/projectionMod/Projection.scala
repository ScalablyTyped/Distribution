package typings.ol.projectionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def canWrapX(): Boolean = js.native
  def getAxisOrientation(): String = js.native
  def getCode(): String = js.native
  def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default = js.native
  def getExtent(): Extent = js.native
  def getMetersPerUnit(): Double = js.native
  def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] = js.native
  def getUnits(): Units = js.native
  def getWorldExtent(): Extent = js.native
  def isGlobal(): Boolean = js.native
  def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
  def setExtent(extent: Extent): Unit = js.native
  def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
  def setGlobal(global: Boolean): Unit = js.native
  def setWorldExtent(worldExtent: Extent): Unit = js.native
}

object Projection {
  @scala.inline
  def apply(
    canWrapX: () => Boolean,
    getAxisOrientation: () => String,
    getCode: () => String,
    getDefaultTileGrid: () => typings.ol.tilegridTileGridMod.default,
    getExtent: () => Extent,
    getMetersPerUnit: () => Double,
    getPointResolutionFunc: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double],
    getUnits: () => Units,
    getWorldExtent: () => Extent,
    isGlobal: () => Boolean,
    setDefaultTileGrid: typings.ol.tilegridTileGridMod.default => Unit,
    setExtent: Extent => Unit,
    setGetPointResolution: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit,
    setGlobal: Boolean => Unit,
    setWorldExtent: Extent => Unit
  ): Projection = {
    val __obj = js.Dynamic.literal(canWrapX = js.Any.fromFunction0(canWrapX), getAxisOrientation = js.Any.fromFunction0(getAxisOrientation), getCode = js.Any.fromFunction0(getCode), getDefaultTileGrid = js.Any.fromFunction0(getDefaultTileGrid), getExtent = js.Any.fromFunction0(getExtent), getMetersPerUnit = js.Any.fromFunction0(getMetersPerUnit), getPointResolutionFunc = js.Any.fromFunction0(getPointResolutionFunc), getUnits = js.Any.fromFunction0(getUnits), getWorldExtent = js.Any.fromFunction0(getWorldExtent), isGlobal = js.Any.fromFunction0(isGlobal), setDefaultTileGrid = js.Any.fromFunction1(setDefaultTileGrid), setExtent = js.Any.fromFunction1(setExtent), setGetPointResolution = js.Any.fromFunction1(setGetPointResolution), setGlobal = js.Any.fromFunction1(setGlobal), setWorldExtent = js.Any.fromFunction1(setWorldExtent))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
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
    def setCanWrapX(value: () => Boolean): Self = this.set("canWrapX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAxisOrientation(value: () => String): Self = this.set("getAxisOrientation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCode(value: () => String): Self = this.set("getCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefaultTileGrid(value: () => typings.ol.tilegridTileGridMod.default): Self = this.set("getDefaultTileGrid", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExtent(value: () => Extent): Self = this.set("getExtent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMetersPerUnit(value: () => Double): Self = this.set("getMetersPerUnit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPointResolutionFunc(value: () => js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Self = this.set("getPointResolutionFunc", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUnits(value: () => Units): Self = this.set("getUnits", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorldExtent(value: () => Extent): Self = this.set("getWorldExtent", js.Any.fromFunction0(value))
    @scala.inline
    def setIsGlobal(value: () => Boolean): Self = this.set("isGlobal", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDefaultTileGrid(value: typings.ol.tilegridTileGridMod.default => Unit): Self = this.set("setDefaultTileGrid", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExtent(value: Extent => Unit): Self = this.set("setExtent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGetPointResolution(value: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Unit): Self = this.set("setGetPointResolution", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGlobal(value: Boolean => Unit): Self = this.set("setGlobal", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWorldExtent(value: Extent => Unit): Self = this.set("setWorldExtent", js.Any.fromFunction1(value))
  }
  
}

