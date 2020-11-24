package typings.pinterestSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpMethod extends js.Object
@JSImport("pinterest-sdk", "HttpMethod")
@js.native
object HttpMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpMethod with Double] = js.native
  
  @js.native
  sealed trait delete extends HttpMethod
  /* 3 */ @js.native
  object delete extends TopLevel[delete with Double]
  
  @js.native
  sealed trait get extends HttpMethod
  /* 0 */ @js.native
  object get extends TopLevel[get with Double]
  
  @js.native
  sealed trait post extends HttpMethod
  /* 2 */ @js.native
  object post extends TopLevel[post with Double]
  
  @js.native
  sealed trait put extends HttpMethod
  /* 1 */ @js.native
  object put extends TopLevel[put with Double]
}
