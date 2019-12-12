package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.TopLevel
import typings.navermaps.naver.maps.Service.CoordType.LATLNG
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoordType with Double] = js.native
  /* 0 */ @js.native
  object LATLNG extends TopLevel[LATLNG with Double]
  
  /* 1 */ @js.native
  object TM128
    extends TopLevel[typings.navermaps.naver.maps.Service.CoordType.TM128 with Double]
  
}

