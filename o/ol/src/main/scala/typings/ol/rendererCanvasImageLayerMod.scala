package typings.ol

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasImageLayerMod {
  
  /**
    * @classdesc
    * Canvas renderer for image layers.
    * @api
    */
  @JSImport("ol/renderer/canvas/ImageLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasImageLayerRenderer {
    /**
      * @param {import("../../layer/Image.js").default} imageLayer Image layer.
      */
    def this(imageLayer: typings.ol.styleImageMod.default) = this()
  }
  
  /**
    * @classdesc
    * Canvas renderer for image layers.
    * @api
    */
  @js.native
  trait CanvasImageLayerRenderer
    extends typings.ol.rendererCanvasLayerMod.default[Any] {
    
    /**
      * @return {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} Image.
      */
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /**
      * @protected
      * @type {?import("../../ImageBase.js").default}
      */
    /* protected */ var image_ : typings.ol.imageBaseMod.default | Null = js.native
  }
}
