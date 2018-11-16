package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvasOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.native
  @JSName("canvasFunction")
  var canvasFunction_Original: openlayersLib.openlayersMod.CanvasFunctionType = js.native
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.native
  var projection: openlayersLib.openlayersMod.ProjectionLike = js.native
  var ratio: js.UndefOr[scala.Double] = js.native
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.native
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.native
  def canvasFunction(
    extent: openlayersLib.openlayersMod.Extent,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    size: openlayersLib.openlayersMod.Size,
    proj: openlayersLib.openlayersMod.projNs.Projection
  ): stdLib.HTMLCanvasElement = js.native
}

