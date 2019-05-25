package typings
package olLib.tilegridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createForExtent(extent: olLib.extentMod.Extent): olLib.tilegridTileGridMod.default = js.native
  def createForExtent(extent: olLib.extentMod.Extent, opt_maxZoom: scala.Double): olLib.tilegridTileGridMod.default = js.native
  def createForExtent(extent: olLib.extentMod.Extent, opt_maxZoom: scala.Double, opt_tileSize: olLib.sizeMod.Size): olLib.tilegridTileGridMod.default = js.native
  def createForExtent(
    extent: olLib.extentMod.Extent,
    opt_maxZoom: scala.Double,
    opt_tileSize: olLib.sizeMod.Size,
    opt_corner: olLib.extentCornerMod.Corner
  ): olLib.tilegridTileGridMod.default = js.native
  def createForExtent(extent: olLib.extentMod.Extent, opt_maxZoom: scala.Double, opt_tileSize: scala.Double): olLib.tilegridTileGridMod.default = js.native
  def createForExtent(
    extent: olLib.extentMod.Extent,
    opt_maxZoom: scala.Double,
    opt_tileSize: scala.Double,
    opt_corner: olLib.extentCornerMod.Corner
  ): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(projection: olLib.projMod.ProjectionLike): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(projection: olLib.projMod.ProjectionLike, opt_maxZoom: scala.Double): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(
    projection: olLib.projMod.ProjectionLike,
    opt_maxZoom: scala.Double,
    opt_tileSize: olLib.sizeMod.Size
  ): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(
    projection: olLib.projMod.ProjectionLike,
    opt_maxZoom: scala.Double,
    opt_tileSize: olLib.sizeMod.Size,
    opt_corner: olLib.extentCornerMod.Corner
  ): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(projection: olLib.projMod.ProjectionLike, opt_maxZoom: scala.Double, opt_tileSize: scala.Double): olLib.tilegridTileGridMod.default = js.native
  def createForProjection(
    projection: olLib.projMod.ProjectionLike,
    opt_maxZoom: scala.Double,
    opt_tileSize: scala.Double,
    opt_corner: olLib.extentCornerMod.Corner
  ): olLib.tilegridTileGridMod.default = js.native
  def createXYZ(): olLib.tilegridTileGridMod.default = js.native
  def createXYZ(opt_options: XYZOptions): olLib.tilegridTileGridMod.default = js.native
  def extentFromProjection(projection: olLib.projMod.ProjectionLike): olLib.extentMod.Extent = js.native
  def getForProjection(projection: olLib.projProjectionMod.default): olLib.tilegridTileGridMod.default = js.native
  def wrapX(
    tileGrid: olLib.tilegridTileGridMod.default,
    tileCoord: olLib.tilecoordMod.TileCoord,
    projection: olLib.projProjectionMod.default
  ): olLib.tilecoordMod.TileCoord = js.native
}

