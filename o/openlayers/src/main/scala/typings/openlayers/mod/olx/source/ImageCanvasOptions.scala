package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.CanvasFunctionType
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.source.State
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
  def canvasFunction(extent: Extent_, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement = js.native
}

