package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasImageBuilderMod {
  
  @JSImport("ol/render/canvas/ImageBuilder", JSImport.Default)
  @js.native
  open class default () extends CanvasImageBuilder
  
  @js.native
  trait CanvasImageBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var anchorX_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var anchorY_ : Any = js.native
    
    /**
      * Data shared with a text builder for combined decluttering.
      * @private
      * @type {import("../canvas.js").DeclutterImageWithText}
      */
    /* private */ var declutterImageWithText_ : Any = js.native
    
    /**
      * @private
      * @type {"declutter"|"obstacle"|"none"|undefined}
      */
    /* private */ var declutterMode_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var height_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement|HTMLVideoElement|HTMLImageElement}
      */
    /* private */ var hitDetectionImage_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var imagePixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement|HTMLVideoElement|HTMLImageElement}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var opacity_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var originX_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var originY_ : Any = js.native
    
    /**
      * @private
      * @type {boolean|undefined}
      */
    /* private */ var rotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var rotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../size.js").Size|undefined}
      */
    /* private */ var scale_ : Any = js.native
    
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default, sharedData: Any): Unit = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var width_ : Any = js.native
  }
}
