package typings.ol

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageLayerMod {
  
  @JSImport("ol/renderer/canvas/ImageLayer", JSImport.Default)
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typings.ol.imageMod.default) = this()
  }
  
  @js.native
  trait CanvasImageLayerRenderer
    extends typings.ol.canvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /* protected */ var image_ : typings.ol.imageBaseMod.default = js.native
  }
}
