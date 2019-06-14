package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Encoding extends js.Object

@JSGlobal("naver.maps.Service.Encoding")
@js.native
object Encoding extends js.Object {
  @js.native
  sealed trait EUC_KR
    extends navermapsLib.naverNs.mapsNs.ServiceNs.Encoding
  
  @js.native
  sealed trait UTF_8
    extends navermapsLib.naverNs.mapsNs.ServiceNs.Encoding
  
  /* 1 */ val EUC_KR: EUC_KR with scala.Double = js.native
  /* 0 */ val UTF_8: UTF_8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.ServiceNs.Encoding with scala.Double] = js.native
}

