package typings.ol.tilegridMod

import typings.ol.cornerMod.Corner
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/tilegrid", "createForProjection")
@js.native
object createForProjection extends js.Object {
  
  def apply(projection: ProjectionLike): default = js.native
  def apply(
    projection: ProjectionLike,
    opt_maxZoom: js.UndefOr[scala.Nothing],
    opt_tileSize: js.UndefOr[scala.Nothing],
    opt_corner: Corner
  ): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Double): default = js.native
  def apply(
    projection: ProjectionLike,
    opt_maxZoom: js.UndefOr[scala.Nothing],
    opt_tileSize: Double,
    opt_corner: Corner
  ): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Size): default = js.native
  def apply(
    projection: ProjectionLike,
    opt_maxZoom: js.UndefOr[scala.Nothing],
    opt_tileSize: Size,
    opt_corner: Corner
  ): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double): default = js.native
  def apply(
    projection: ProjectionLike,
    opt_maxZoom: Double,
    opt_tileSize: js.UndefOr[scala.Nothing],
    opt_corner: Corner
  ): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
}
