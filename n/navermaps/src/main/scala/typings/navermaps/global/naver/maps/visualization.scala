package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.visualization.DotMapOptions
import typings.navermaps.naver.maps.visualization.HeatMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Submodule - visualization
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-visualization.html
  */
object visualization {
  
  @JSGlobal("naver.maps.visualization.DotMap")
  @js.native
  open class DotMap ()
    extends StObject
       with typings.navermaps.naver.maps.visualization.DotMap {
    def this(dotMapOptions: DotMapOptions) = this()
  }
  
  @JSGlobal("naver.maps.visualization.HeatMap")
  @js.native
  open class HeatMap ()
    extends StObject
       with typings.navermaps.naver.maps.visualization.HeatMap {
    def this(heatMapOptions: HeatMapOptions) = this()
  }
  
  @JSGlobal("naver.maps.visualization.SpectrumStyle")
  @js.native
  object SpectrumStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.visualization.SpectrumStyle & String] = js.native
    
    /* "cool" */ val COOL: typings.navermaps.naver.maps.visualization.SpectrumStyle.COOL & String = js.native
    
    /* "greys" */ val GREYS: typings.navermaps.naver.maps.visualization.SpectrumStyle.GREYS & String = js.native
    
    /* "hot" */ val HOT: typings.navermaps.naver.maps.visualization.SpectrumStyle.HOT & String = js.native
    
    /* "hsv" */ val HSV: typings.navermaps.naver.maps.visualization.SpectrumStyle.HSV & String = js.native
    
    /* "jet" */ val JET: typings.navermaps.naver.maps.visualization.SpectrumStyle.JET & String = js.native
    
    /* "oxygen" */ val OXYGEN: typings.navermaps.naver.maps.visualization.SpectrumStyle.OXYGEN & String = js.native
    
    /* "portland" */ val PORTLAND: typings.navermaps.naver.maps.visualization.SpectrumStyle.PORTLAND & String = js.native
    
    /* "rainbow" */ val RAINBOW: typings.navermaps.naver.maps.visualization.SpectrumStyle.RAINBOW & String = js.native
    
    /* "RdBu" */ val RdBu: typings.navermaps.naver.maps.visualization.SpectrumStyle.RdBu & String = js.native
    
    /* "YIGnBu" */ val YIGnBu: typings.navermaps.naver.maps.visualization.SpectrumStyle.YIGnBu & String = js.native
    
    /* "YIOrRd" */ val YIOrRd: typings.navermaps.naver.maps.visualization.SpectrumStyle.YIOrRd & String = js.native
  }
  
  @JSGlobal("naver.maps.visualization.WeightedLocation")
  @js.native
  open class WeightedLocation protected ()
    extends StObject
       with typings.navermaps.naver.maps.visualization.WeightedLocation {
    def this(lat: Double, lng: Double) = this()
    def this(lat: Double, lng: Double, weight: Double) = this()
    
    /* CompleteClass */
    override def getLocation(): typings.navermaps.naver.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getWeight(): Double = js.native
    
    /* CompleteClass */
    override def lat(): Double = js.native
    
    /* CompleteClass */
    override def lng(): Double = js.native
  }
}
