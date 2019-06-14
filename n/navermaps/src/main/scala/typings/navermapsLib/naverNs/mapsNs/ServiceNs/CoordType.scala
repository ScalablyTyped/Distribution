package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoordType extends js.Object

@JSGlobal("naver.maps.Service.CoordType")
@js.native
object CoordType extends js.Object {
  @js.native
  sealed trait LATLNG
    extends navermapsLib.naverNs.mapsNs.ServiceNs.CoordType
  
  @js.native
  sealed trait TM128
    extends navermapsLib.naverNs.mapsNs.ServiceNs.CoordType
  
  /* 0 */ val LATLNG: LATLNG with scala.Double = js.native
  /* 1 */ val TM128: TM128 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.ServiceNs.CoordType with scala.Double] = js.native
}

