package typings.ol.tilegridMod

import typings.ol.extentCornerMod.Corner
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import typings.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid", "createForExtent")
@js.native
object createForExtent extends js.Object {
  def apply(extent: Extent): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
}

