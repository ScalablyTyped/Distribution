package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorImageLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorImageLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasVectorImageLayerRenderer {
    def this(layer: typings.ol.vectorImageMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorImageLayerRenderer
    extends typings.ol.imageLayerMod.default {
    
    def postRender(): Unit = js.native
    
    def preRender(): Unit = js.native
  }
}
