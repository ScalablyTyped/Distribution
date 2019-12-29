package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding with Double] = js.native
  /* 1 */ @js.native
  object EUC_KR extends TopLevel[EUC_KR with Double]
  
  /* 0 */ @js.native
  object UTF_8 extends TopLevel[UTF_8 with Double]
  
}

