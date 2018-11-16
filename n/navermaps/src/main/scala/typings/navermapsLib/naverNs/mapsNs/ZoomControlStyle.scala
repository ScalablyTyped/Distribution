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
  
  val LARGE: LARGE with java.lang.String = js.native
  val SMALL: SMALL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[navermapsLib.naverNs.mapsNs.ZoomControlStyle with java.lang.String] = js.native
}

