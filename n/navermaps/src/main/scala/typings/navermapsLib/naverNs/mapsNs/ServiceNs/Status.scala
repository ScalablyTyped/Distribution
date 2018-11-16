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
  
  val ERROR: ERROR with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[navermapsLib.naverNs.mapsNs.ServiceNs.Status with java.lang.String] = js.native
}

