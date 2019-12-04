package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/CircleReplay", JSImport.Namespace)
@js.native
object renderWebglCircleReplayMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.renderWebglReplayMod.default {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
  type WebGLCircleReplay = typings.ol.renderWebglReplayMod.default
}

