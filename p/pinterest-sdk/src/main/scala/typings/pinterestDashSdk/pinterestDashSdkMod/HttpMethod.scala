package typings.pinterestDashSdk.pinterestDashSdkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpMethod extends js.Object

@JSImport("pinterest-sdk", "HttpMethod")
@js.native
object HttpMethod extends js.Object {
  @js.native
  sealed trait delete extends HttpMethod
  
  @js.native
  sealed trait get extends HttpMethod
  
  @js.native
  sealed trait post extends HttpMethod
  
  @js.native
  sealed trait put extends HttpMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpMethod with Double] = js.native
  /* 3 */ @js.native
  object delete extends TopLevel[delete with Double]
  
  /* 0 */ @js.native
  object get extends TopLevel[get with Double]
  
  /* 2 */ @js.native
  object post extends TopLevel[post with Double]
  
  /* 1 */ @js.native
  object put extends TopLevel[put with Double]
  
}

