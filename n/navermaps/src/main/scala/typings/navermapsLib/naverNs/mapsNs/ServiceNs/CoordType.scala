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
  
  val LATLNG: LATLNG with java.lang.String = js.native
  val TM128: TM128 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[navermapsLib.naverNs.mapsNs.ServiceNs.CoordType with java.lang.String] = js.native
}

