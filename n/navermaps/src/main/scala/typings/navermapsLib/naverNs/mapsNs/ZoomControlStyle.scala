package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("naver.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait LARGE
    extends navermapsLib.naverNs.mapsNs.ZoomControlStyle
  
  @js.native
  sealed trait SMALL
    extends navermapsLib.naverNs.mapsNs.ZoomControlStyle
  
  /* 0 */ val LARGE: LARGE with scala.Double = js.native
  /* 1 */ val SMALL: SMALL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.ZoomControlStyle with scala.Double] = js.native
}

