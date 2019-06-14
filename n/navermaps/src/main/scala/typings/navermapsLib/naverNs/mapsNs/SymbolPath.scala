package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolPath extends js.Object

@JSGlobal("naver.maps.SymbolPath")
@js.native
object SymbolPath extends js.Object {
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW
    extends navermapsLib.naverNs.mapsNs.SymbolPath
  
  @js.native
  sealed trait BACKWARD_OPEN_ARROW
    extends navermapsLib.naverNs.mapsNs.SymbolPath
  
  @js.native
  sealed trait CIRCLE
    extends navermapsLib.naverNs.mapsNs.SymbolPath
  
  @js.native
  sealed trait FORWARD_CLOSED_ARROW
    extends navermapsLib.naverNs.mapsNs.SymbolPath
  
  @js.native
  sealed trait FORWARD_OPEN_ARROW
    extends navermapsLib.naverNs.mapsNs.SymbolPath
  
  /* 1 */ val BACKWARD_CLOSED_ARROW: BACKWARD_CLOSED_ARROW with scala.Double = js.native
  /* 0 */ val BACKWARD_OPEN_ARROW: BACKWARD_OPEN_ARROW with scala.Double = js.native
  /* 1 */ val CIRCLE: CIRCLE with scala.Double = js.native
  /* 2 */ val FORWARD_CLOSED_ARROW: FORWARD_CLOSED_ARROW with scala.Double = js.native
  /* 3 */ val FORWARD_OPEN_ARROW: FORWARD_OPEN_ARROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.SymbolPath with scala.Double] = js.native
}

