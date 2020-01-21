package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helperMod {
  type UniformLiteralValue = scala.Double | js.Array[scala.Double] | typings.std.HTMLCanvasElement | typings.std.HTMLImageElement | typings.std.ImageData | typings.ol.olMod.Transform
  type UniformValue = typings.ol.helperMod.UniformLiteralValue | (js.Function1[
    /* p0 */ typings.ol.pluggableMapMod.FrameState, 
    typings.ol.helperMod.UniformLiteralValue
  ])
}
