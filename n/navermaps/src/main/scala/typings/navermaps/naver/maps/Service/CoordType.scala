package typings.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoordType extends js.Object

@JSGlobal("naver.maps.Service.CoordType")
@js.native
object CoordType extends js.Object {
  @js.native
  sealed trait LATLNG extends CoordType
  
  @js.native
  sealed trait TM128 extends CoordType
  
  /* 0 */ val LATLNG: typings.navermaps.naver.maps.Service.CoordType.LATLNG with Double = js.native
  /* 1 */ val TM128: typings.navermaps.naver.maps.Service.CoordType.TM128 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoordType with Double] = js.native
}

