package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olImageCanvasMod {
  
  @JSImport("ol/ImageCanvas", JSImport.Default)
  @js.native
  open class default protected () extends ImageCanvas {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      canvas: HTMLCanvasElement,
      opt_loader: Loader
    ) = this()
  }
  
  @js.native
  trait ImageCanvas
    extends typings.ol.imageBaseMod.default {
    
    /**
      * Get any error associated with asynchronous rendering.
      */
    def getError(): js.Error = js.native
  }
  
  type Loader = js.Function1[/* p0 */ js.Function1[/* p0 */ js.UndefOr[js.Error], Unit], Unit]
}
