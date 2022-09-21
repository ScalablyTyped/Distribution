package typings.nivoLegends

import typings.nivoLegends.anon.Color
import typings.nivoLegends.anon.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/legends/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQuantizeColorScaleLegendData(hasScaleOverriddenDomainReverseValueFormatSeparator: Domain): js.Array[Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuantizeColorScaleLegendData")(hasScaleOverriddenDomainReverseValueFormatSeparator.asInstanceOf[js.Any]).asInstanceOf[js.Array[Color]]
  
  @js.native
  trait Scale extends StObject {
    
    def apply(value: Double): Double = js.native
    
    def invertExtent(value: Double): js.Tuple2[Double, Double] = js.native
    
    def range(): js.Array[Double] = js.native
  }
}
