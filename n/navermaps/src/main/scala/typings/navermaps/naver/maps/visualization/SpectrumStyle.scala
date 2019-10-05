package typings.navermaps.naver.maps.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpectrumStyle extends js.Object

@JSGlobal("naver.maps.visualization.SpectrumStyle")
@js.native
object SpectrumStyle extends js.Object {
  @js.native
  sealed trait COOL extends SpectrumStyle
  
  @js.native
  sealed trait GREYS extends SpectrumStyle
  
  @js.native
  sealed trait HOT extends SpectrumStyle
  
  @js.native
  sealed trait HSV extends SpectrumStyle
  
  @js.native
  sealed trait JET extends SpectrumStyle
  
  @js.native
  sealed trait OXYGEN extends SpectrumStyle
  
  @js.native
  sealed trait PORTLAND extends SpectrumStyle
  
  @js.native
  sealed trait RAINBOW extends SpectrumStyle
  
  @js.native
  sealed trait RdBu extends SpectrumStyle
  
  @js.native
  sealed trait YIGnBu extends SpectrumStyle
  
  @js.native
  sealed trait YIOrRd extends SpectrumStyle
  
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
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpectrumStyle with Double] = js.native
}

