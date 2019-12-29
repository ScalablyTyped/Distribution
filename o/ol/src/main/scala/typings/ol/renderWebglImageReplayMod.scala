package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/ImageReplay", JSImport.Namespace)
@js.native
object renderWebglImageReplayMod extends js.Object {
  @js.native
  trait WebGLImageReplay
    extends typings.ol.renderWebglTextureReplayMod.default {
    var hitDetectionImages_ : js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement] = js.native
    var images_ : js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement] = js.native
  }
  
  @js.native
  class default protected () extends WebGLImageReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

