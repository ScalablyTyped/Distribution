package typings.ol.projectionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def canWrapX(): Boolean
  def getAxisOrientation(): String
  def getCode(): String
  def getDefaultTileGrid(): typings.ol.tilegridTileGridMod.default
  def getExtent(): Extent
  def getMetersPerUnit(): Double
  def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]
  def getUnits(): Units
  def getWorldExtent(): Extent
  def isGlobal(): Boolean
  def setDefaultTileGrid(tileGrid: typings.ol.tilegridTileGridMod.default): Unit
  def setExtent(extent: Extent): Unit
  def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit
  def setGlobal(global: Boolean): Unit
  def setWorldExtent(worldExtent: Extent): Unit
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
}

