package typings.pixiGraphics

import typings.pixiGraphics.libStylesFillStyleMod.FillStyle
import typings.pixiGraphics.libStylesLineStyleMod.LineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsBatchPartMod {
  
  @JSImport("@pixi/graphics/lib/utils/BatchPart", "BatchPart")
  @js.native
  open class BatchPart () extends StObject {
    
    var attribSize: Double = js.native
    
    var attribStart: Double = js.native
    
    def begin(style: FillStyle, startIndex: Double, attribStart: Double): Unit = js.native
    /**
      * Begin batch part.
      * @param style
      * @param startIndex
      * @param attribStart
      */
    def begin(style: LineStyle, startIndex: Double, attribStart: Double): Unit = js.native
    
    /**
      * End batch part.
      * @param endIndex
      * @param endAttrib
      */
    def end(endIndex: Double, endAttrib: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    var size: Double = js.native
    
    var start: Double = js.native
    
    var style: LineStyle | FillStyle = js.native
  }
}
