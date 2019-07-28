package typings.navermaps.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Encoding extends js.Object

@JSGlobal("naver.maps.Service.Encoding")
@js.native
object Encoding extends js.Object {
  @js.native
  sealed trait EUC_KR extends Encoding
  
  @js.native
  sealed trait UTF_8 extends Encoding
  
  /* 1 */ val EUC_KR: typings.navermaps.naverNs.mapsNs.ServiceNs.Encoding.EUC_KR with Double = js.native
  /* 0 */ val UTF_8: typings.navermaps.naverNs.mapsNs.ServiceNs.Encoding.UTF_8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
}

