package typings.pinterestDashSdk.pinterestDashSdkMod

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
  
  /* 3 */ val delete: typings.pinterestDashSdk.pinterestDashSdkMod.HttpMethod.delete with Double = js.native
  /* 0 */ val get: typings.pinterestDashSdk.pinterestDashSdkMod.HttpMethod.get with Double = js.native
  /* 2 */ val post: typings.pinterestDashSdk.pinterestDashSdkMod.HttpMethod.post with Double = js.native
  /* 1 */ val put: typings.pinterestDashSdk.pinterestDashSdkMod.HttpMethod.put with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpMethod with Double] = js.native
}

