package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasPolygonBuilderMod {
  
  @JSImport("ol/render/canvas/PolygonBuilder", JSImport.Default)
  @js.native
  open class default () extends CanvasPolygonBuilder
  
  @js.native
  trait CanvasPolygonBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {Array<number>} ends Ends.
      * @param {number} stride Stride.
      * @private
      * @return {number} End.
      */
    /* private */ var drawFlatCoordinatess_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var setFillStrokeStyles_ : Any = js.native
  }
}
