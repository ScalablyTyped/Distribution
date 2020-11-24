package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.visualization.DotMapOptions
import typings.navermaps.naver.maps.visualization.HeatMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.visualization")
@js.native
object visualization extends js.Object {
  
  // Sub module: visualization
  def apply(): Unit = js.native
  
  @js.native
  class DotMap ()
    extends typings.navermaps.naver.maps.visualization.DotMap {
    def this(dotMapOptions: DotMapOptions) = this()
  }
  
  @js.native
  class HeatMap ()
    extends typings.navermaps.naver.maps.visualization.HeatMap {
    def this(heatMapOptions: HeatMapOptions) = this()
  }
  
  @js.native
  object SpectrumStyle extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.visualization.SpectrumStyle with Double] = js.native
    
    /* 3 */ val COOL: typings.navermaps.naver.maps.visualization.SpectrumStyle.COOL with Double = js.native
    
    /* 4 */ val GREYS: typings.navermaps.naver.maps.visualization.SpectrumStyle.GREYS with Double = js.native
    
    /* 2 */ val HOT: typings.navermaps.naver.maps.visualization.SpectrumStyle.HOT with Double = js.native
    
    /* 1 */ val HSV: typings.navermaps.naver.maps.visualization.SpectrumStyle.HSV with Double = js.native
    
    /* 0 */ val JET: typings.navermaps.naver.maps.visualization.SpectrumStyle.JET with Double = js.native
    
    /* 10 */ val OXYGEN: typings.navermaps.naver.maps.visualization.SpectrumStyle.OXYGEN with Double = js.native
    
    /* 9 */ val PORTLAND: typings.navermaps.naver.maps.visualization.SpectrumStyle.PORTLAND with Double = js.native
    
    /* 8 */ val RAINBOW: typings.navermaps.naver.maps.visualization.SpectrumStyle.RAINBOW with Double = js.native
    
    /* 7 */ val RdBu: typings.navermaps.naver.maps.visualization.SpectrumStyle.RdBu with Double = js.native
    
    /* 5 */ val YIGnBu: typings.navermaps.naver.maps.visualization.SpectrumStyle.YIGnBu with Double = js.native
    
    /* 6 */ val YIOrRd: typings.navermaps.naver.maps.visualization.SpectrumStyle.YIOrRd with Double = js.native
  }
  
  @js.native
  class WeightedLocation protected ()
    extends typings.navermaps.naver.maps.visualization.WeightedLocation {
    def this(lat: Double, lng: Double) = this()
    def this(lat: Double, lng: Double, weight: Double) = this()
  }
}
