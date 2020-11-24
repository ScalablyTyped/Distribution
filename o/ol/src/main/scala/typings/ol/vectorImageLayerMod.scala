package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/canvas/VectorImageLayer", JSImport.Namespace)
@js.native
object vectorImageLayerMod extends js.Object {
  
  @js.native
  trait CanvasVectorImageLayerRenderer
    extends typings.ol.imageLayerMod.default {
    
    def postRender(): Unit = js.native
    
    def preRender(): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorImageLayerRenderer {
    def this(layer: typings.ol.vectorImageMod.default) = this()
  }
}
