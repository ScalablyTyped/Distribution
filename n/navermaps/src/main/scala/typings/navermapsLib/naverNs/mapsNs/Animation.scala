package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

/**
   * Members
   */
@JSGlobal("naver.maps.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait BOUNCE
    extends navermapsLib.naverNs.mapsNs.Animation
  
  @js.native
  sealed trait DROP
    extends navermapsLib.naverNs.mapsNs.Animation
  
  /* 1 */ val BOUNCE: BOUNCE with scala.Double = js.native
  val DROP: DROP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.Animation with scala.Double] = js.native
}

