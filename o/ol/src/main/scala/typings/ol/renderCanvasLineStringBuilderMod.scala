package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasLineStringBuilderMod {
  
  @JSImport("ol/render/canvas/LineStringBuilder", JSImport.Default)
  @js.native
  open class default () extends CanvasLineStringBuilder
  
  @js.native
  trait CanvasLineStringBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {number} end End.
      * @param {number} stride Stride.
      * @private
      * @return {number} end.
      */
    /* private */ var drawFlatCoordinates_ : Any = js.native
  }
}
