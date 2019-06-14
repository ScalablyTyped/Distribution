package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSGlobal("naver.maps.Service.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ERROR
    extends navermapsLib.naverNs.mapsNs.ServiceNs.Status
  
  @js.native
  sealed trait OK
    extends navermapsLib.naverNs.mapsNs.ServiceNs.Status
  
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.ServiceNs.Status with scala.Double] = js.native
}

