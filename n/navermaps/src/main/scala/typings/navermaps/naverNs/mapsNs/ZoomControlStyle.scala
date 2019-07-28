package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("naver.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait LARGE extends ZoomControlStyle
  
  @js.native
  sealed trait SMALL extends ZoomControlStyle
  
  /* 0 */ val LARGE: typings.navermaps.naverNs.mapsNs.ZoomControlStyle.LARGE with Double = js.native
  /* 1 */ val SMALL: typings.navermaps.naverNs.mapsNs.ZoomControlStyle.SMALL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomControlStyle with Double] = js.native
}

