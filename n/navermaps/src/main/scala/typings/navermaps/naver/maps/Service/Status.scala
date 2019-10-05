package typings.navermaps.naver.maps.Service

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
  
  /* 1 */ val ERROR: typings.navermaps.naver.maps.Service.Status.ERROR with Double = js.native
  /* 0 */ val OK: typings.navermaps.naver.maps.Service.Status.OK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

