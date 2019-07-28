package typings.navermaps.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSGlobal("naver.maps.Service.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ERROR extends Status
  
  @js.native
  sealed trait OK extends Status
  
  /* 1 */ val ERROR: typings.navermaps.naverNs.mapsNs.ServiceNs.Status.ERROR with Double = js.native
  /* 0 */ val OK: typings.navermaps.naverNs.mapsNs.ServiceNs.Status.OK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

