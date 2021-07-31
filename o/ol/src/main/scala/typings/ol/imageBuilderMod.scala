package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBuilderMod {
  
  @JSImport("ol/render/canvas/ImageBuilder", JSImport.Default)
  @js.native
  class default protected () extends CanvasImageBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasImageBuilder
    extends typings.ol.builderMod.default
}
