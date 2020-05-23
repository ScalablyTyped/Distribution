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
  
}

