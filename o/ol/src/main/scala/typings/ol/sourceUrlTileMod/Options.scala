package typings.ol.sourceUrlTileMod

import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceStateMod.State
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var attributionsCollapsible: js.UndefOr[Boolean] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var key: js.UndefOr[String] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var state: js.UndefOr[State] = js.native
  var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: LoadFunction = js.native
  var tilePixelRatio: js.UndefOr[Double] = js.native
  var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
  var transition: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
  def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
}

