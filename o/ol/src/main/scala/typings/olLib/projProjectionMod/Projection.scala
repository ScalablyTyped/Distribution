package typings
package olLib.projProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def canWrapX(): scala.Boolean
  def getAxisOrientation(): java.lang.String
  def getCode(): java.lang.String
  def getDefaultTileGrid(): olLib.tilegridTileGridMod.default
  def getExtent(): olLib.extentMod.Extent
  def getMetersPerUnit(): scala.Double
  def getPointResolutionFunc(): js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double]
  def getUnits(): olLib.projUnitsMod.Units
  def getWorldExtent(): olLib.extentMod.Extent
  def isGlobal(): scala.Boolean
  def setDefaultTileGrid(tileGrid: olLib.tilegridTileGridMod.default): scala.Unit
  def setExtent(extent: olLib.extentMod.Extent): scala.Unit
  def setGetPointResolution(func: js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double]): scala.Unit
  def setGlobal(global: scala.Boolean): scala.Unit
  def setWorldExtent(worldExtent: olLib.extentMod.Extent): scala.Unit
}

object Projection {
  @scala.inline
  def apply(
    canWrapX: () => scala.Boolean,
    getAxisOrientation: () => java.lang.String,
    getCode: () => java.lang.String,
    getDefaultTileGrid: () => olLib.tilegridTileGridMod.default,
    getExtent: () => olLib.extentMod.Extent,
    getMetersPerUnit: () => scala.Double,
    getPointResolutionFunc: () => js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double],
    getUnits: () => olLib.projUnitsMod.Units,
    getWorldExtent: () => olLib.extentMod.Extent,
    isGlobal: () => scala.Boolean,
    setDefaultTileGrid: olLib.tilegridTileGridMod.default => scala.Unit,
    setExtent: olLib.extentMod.Extent => scala.Unit,
    setGetPointResolution: js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double] => scala.Unit,
    setGlobal: scala.Boolean => scala.Unit,
    setWorldExtent: olLib.extentMod.Extent => scala.Unit
  ): Projection = {
    val __obj = js.Dynamic.literal(canWrapX = js.Any.fromFunction0(canWrapX), getAxisOrientation = js.Any.fromFunction0(getAxisOrientation), getCode = js.Any.fromFunction0(getCode), getDefaultTileGrid = js.Any.fromFunction0(getDefaultTileGrid), getExtent = js.Any.fromFunction0(getExtent), getMetersPerUnit = js.Any.fromFunction0(getMetersPerUnit), getPointResolutionFunc = js.Any.fromFunction0(getPointResolutionFunc), getUnits = js.Any.fromFunction0(getUnits), getWorldExtent = js.Any.fromFunction0(getWorldExtent), isGlobal = js.Any.fromFunction0(isGlobal), setDefaultTileGrid = js.Any.fromFunction1(setDefaultTileGrid), setExtent = js.Any.fromFunction1(setExtent), setGetPointResolution = js.Any.fromFunction1(setGetPointResolution), setGlobal = js.Any.fromFunction1(setGlobal), setWorldExtent = js.Any.fromFunction1(setWorldExtent))
  
    __obj.asInstanceOf[Projection]
  }
}

