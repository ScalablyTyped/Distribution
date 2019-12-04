package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.rendererCanvasMapMod.CanvasMapRenderer
import typings.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/Map", JSImport.Namespace)
@js.native
object rendererCanvasMapMod extends js.Object {
  @js.native
  trait CanvasMapRenderer
    extends typings.ol.rendererMapMod.default {
    /* protected */ def getTransform(frameState: FrameState): Transform = js.native
  }
  
  @js.native
  class default protected () extends CanvasMapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
}

