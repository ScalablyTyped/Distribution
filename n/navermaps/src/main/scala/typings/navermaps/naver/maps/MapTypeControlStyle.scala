package typings.navermaps.naver.maps

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
  
  /* 0 */ val BUTTON: typings.navermaps.naver.maps.MapTypeControlStyle.BUTTON with Double = js.native
  /* 1 */ val DROPDOWN: typings.navermaps.naver.maps.MapTypeControlStyle.DROPDOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
}

