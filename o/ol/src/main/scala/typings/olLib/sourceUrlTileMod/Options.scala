package typings
package olLib.sourceUrlTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.native
  var attributionsCollapsible: js.UndefOr[scala.Boolean] = js.native
  var cacheSize: js.UndefOr[scala.Double] = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var opaque: js.UndefOr[scala.Boolean] = js.native
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.native
  var state: js.UndefOr[olLib.sourceStateMod.State] = js.native
  var tileGrid: js.UndefOr[olLib.tilegridTileGridMod.default] = js.native
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: olLib.tileMod.LoadFunction = js.native
  var tilePixelRatio: js.UndefOr[scala.Double] = js.native
  var tileUrlFunction: js.UndefOr[olLib.tileMod.UrlFunction] = js.native
  var transition: js.UndefOr[scala.Double] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.native
  var wrapX: js.UndefOr[scala.Boolean] = js.native
  def tileLoadFunction(p0: olLib.tileMod.Tile, p1: java.lang.String): scala.Unit = js.native
}

