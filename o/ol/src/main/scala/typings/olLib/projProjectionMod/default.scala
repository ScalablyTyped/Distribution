package typings
package olLib.projProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/Projection", JSImport.Default)
@js.native
class default protected () extends Projection {
  def this(options: Options) = this()
  /* CompleteClass */
  override def canWrapX(): scala.Boolean = js.native
  /* CompleteClass */
  override def getAxisOrientation(): java.lang.String = js.native
  /* CompleteClass */
  override def getCode(): java.lang.String = js.native
  /* CompleteClass */
  override def getDefaultTileGrid(): olLib.tilegridTileGridMod.default = js.native
  /* CompleteClass */
  override def getExtent(): olLib.extentMod.Extent = js.native
  /* CompleteClass */
  override def getMetersPerUnit(): scala.Double = js.native
  /* CompleteClass */
  override def getPointResolutionFunc(): js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double] = js.native
  /* CompleteClass */
  override def getUnits(): olLib.projUnitsMod.Units = js.native
  /* CompleteClass */
  override def getWorldExtent(): olLib.extentMod.Extent = js.native
  /* CompleteClass */
  override def isGlobal(): scala.Boolean = js.native
  /* CompleteClass */
  override def setDefaultTileGrid(tileGrid: olLib.tilegridTileGridMod.default): scala.Unit = js.native
  /* CompleteClass */
  override def setExtent(extent: olLib.extentMod.Extent): scala.Unit = js.native
  /* CompleteClass */
  override def setGetPointResolution(func: js.Function2[/* p0 */ scala.Double, /* p1 */ olLib.coordinateMod.Coordinate, scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def setGlobal(global: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setWorldExtent(worldExtent: olLib.extentMod.Extent): scala.Unit = js.native
}

