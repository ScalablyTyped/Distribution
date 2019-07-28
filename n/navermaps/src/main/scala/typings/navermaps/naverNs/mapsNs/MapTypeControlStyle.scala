package typings.navermaps.naverNs.mapsNs

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
  sealed trait BUTTON extends MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN extends MapTypeControlStyle
  
  /* 0 */ val BUTTON: typings.navermaps.naverNs.mapsNs.MapTypeControlStyle.BUTTON with Double = js.native
  /* 1 */ val DROPDOWN: typings.navermaps.naverNs.mapsNs.MapTypeControlStyle.DROPDOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
}

