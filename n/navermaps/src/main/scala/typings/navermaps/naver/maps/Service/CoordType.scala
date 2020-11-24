package typings.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoordType extends js.Object
@JSGlobal("naver.maps.Service.CoordType")
@js.native
object CoordType extends js.Object {
  
  @js.native
  sealed trait LATLNG extends CoordType
  
  @js.native
  sealed trait TM128 extends CoordType
}
