package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.CanvasFunctionType
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.Size
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.openlayers.openlayersMod.source.State
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvasOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var ratio: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var state: js.UndefOr[State] = js.native
  def canvasFunction(extent: Extent, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement = js.native
}

