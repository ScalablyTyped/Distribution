package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
}

