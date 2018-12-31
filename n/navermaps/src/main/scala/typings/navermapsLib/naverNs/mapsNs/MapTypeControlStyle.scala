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
  
  val BUTTON: BUTTON with java.lang.String = js.native
  val DROPDOWN: DROPDOWN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[navermapsLib.naverNs.mapsNs.MapTypeControlStyle with java.lang.String] = js.native
}

