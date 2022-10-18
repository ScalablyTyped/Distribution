package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasLineStringBuilderMod {
  
  @JSImport("ol/render/canvas/LineStringBuilder", JSImport.Default)
  @js.native
  open class default protected () extends CanvasLineStringBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasLineStringBuilder
    extends typings.ol.renderCanvasBuilderMod.default
}
