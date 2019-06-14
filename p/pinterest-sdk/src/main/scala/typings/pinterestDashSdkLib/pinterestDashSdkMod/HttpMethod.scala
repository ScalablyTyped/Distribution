package typings
package pinterestDashSdkLib.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpMethod extends js.Object

@JSImport("pinterest-sdk", "HttpMethod")
@js.native
object HttpMethod extends js.Object {
  @js.native
  sealed trait delete
    extends pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod
  
  @js.native
  sealed trait get
    extends pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod
  
  @js.native
  sealed trait post
    extends pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod
  
  @js.native
  sealed trait put
    extends pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod
  
  /* 3 */ val delete: delete with scala.Double = js.native
  /* 0 */ val get: get with scala.Double = js.native
  /* 2 */ val post: post with scala.Double = js.native
  /* 1 */ val put: put with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod with scala.Double] = js.native
}

