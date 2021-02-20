package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonBuilderMod {
  
  @JSImport("ol/render/canvas/PolygonBuilder", JSImport.Default)
  @js.native
  class default protected () extends CanvasPolygonBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasPolygonBuilder
    extends typings.ol.builderMod.default
}
