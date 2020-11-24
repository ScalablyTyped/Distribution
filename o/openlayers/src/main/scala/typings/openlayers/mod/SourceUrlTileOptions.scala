package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceUrlTileOptions extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var opaque: js.UndefOr[Boolean] = js.native
  
  var projection: ProjectionLike = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  def tileLoadFunction(tile: Tile, url: String): Unit = js.native
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: TileLoadFunctionType = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
