package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

/**
  * Enums
  */
@JSGlobal("naver.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait BUTTON
    extends navermapsLib.naverNs.mapsNs.MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN
    extends navermapsLib.naverNs.mapsNs.MapTypeControlStyle
  
  /* 0 */ val BUTTON: BUTTON with scala.Double = js.native
  /* 1 */ val DROPDOWN: DROPDOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.MapTypeControlStyle with scala.Double] = js.native
}

