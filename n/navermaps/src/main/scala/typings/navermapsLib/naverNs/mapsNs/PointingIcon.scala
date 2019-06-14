package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointingIcon extends js.Object

@JSGlobal("naver.maps.PointingIcon")
@js.native
object PointingIcon extends js.Object {
  @js.native
  sealed trait BLOCK_ARROW
    extends navermapsLib.naverNs.mapsNs.PointingIcon
  
  @js.native
  sealed trait CIRCLE
    extends navermapsLib.naverNs.mapsNs.PointingIcon
  
  @js.native
  sealed trait DIAMOND
    extends navermapsLib.naverNs.mapsNs.PointingIcon
  
  @js.native
  sealed trait OPEN_ARROW
    extends navermapsLib.naverNs.mapsNs.PointingIcon
  
  /* 0 */ val BLOCK_ARROW: BLOCK_ARROW with scala.Double = js.native
  /* 1 */ val CIRCLE: CIRCLE with scala.Double = js.native
  /* 2 */ val DIAMOND: DIAMOND with scala.Double = js.native
  /* 1 */ val OPEN_ARROW: OPEN_ARROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.PointingIcon with scala.Double] = js.native
}

