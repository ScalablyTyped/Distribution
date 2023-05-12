package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorImageLayerMod {
  
  /**
    * @classdesc
    * Canvas renderer for image layers.
    * @api
    */
  @JSImport("ol/renderer/canvas/VectorImageLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorImageLayerRenderer {
    /**
      * @param {import("../../layer/VectorImage.js").default} layer Vector image layer.
      */
    def this(layer: typings.ol.layerVectorImageMod.default[Any]) = this()
  }
  
  /**
    * @classdesc
    * Canvas renderer for image layers.
    * @api
    */
  @js.native
  trait CanvasVectorImageLayerRenderer
    extends typings.ol.rendererCanvasImageLayerMod.default {
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var coordinateToVectorPixelTransform_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var layerImageRatio_ : Any = js.native
    
    /**
      */
    def postRender(): Unit = js.native
    
    /**
      */
    def preRender(): Unit = js.native
    
    /**
      */
    def renderDeclutter(): Unit = js.native
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var renderedPixelToCoordinateTransform_ : Any = js.native
    
    /**
      * @private
      * @type {import("./VectorLayer.js").default}
      */
    /* private */ var vectorRenderer_ : Any = js.native
  }
}
