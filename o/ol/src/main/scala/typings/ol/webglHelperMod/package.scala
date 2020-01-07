package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webglHelperMod {
  import typings.ol.pluggableMapMod.FrameState
  import typings.ol.transformMod.Transform
  import typings.std.HTMLCanvasElement
  import typings.std.HTMLImageElement
  import typings.std.ImageData

  type UniformLiteralValue = Double | js.Array[Double] | HTMLCanvasElement | HTMLImageElement | ImageData | Transform
  type UniformValue = UniformLiteralValue | (js.Function1[/* p0 */ FrameState, UniformLiteralValue])
}
