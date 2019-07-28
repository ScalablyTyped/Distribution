package typings.ol.tilegridMod

import typings.ol.extentCornerMod.Corner
import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import typings.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createForExtent(extent: Extent): default = js.native
  def createForExtent(extent: Extent, opt_maxZoom: Double): default = js.native
  def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
  def createForProjection(projection: ProjectionLike): default = js.native
  def createForProjection(projection: ProjectionLike, opt_maxZoom: Double): default = js.native
  def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
  def createXYZ(): default = js.native
  def createXYZ(opt_options: XYZOptions): default = js.native
  def extentFromProjection(projection: ProjectionLike): Extent = js.native
  def getForProjection(projection: typings.ol.projProjectionMod.default): default = js.native
  def wrapX(tileGrid: default, tileCoord: TileCoord, projection: typings.ol.projProjectionMod.default): TileCoord = js.native
}

