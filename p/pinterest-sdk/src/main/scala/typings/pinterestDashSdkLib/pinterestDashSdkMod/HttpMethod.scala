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
  
  val delete: delete with java.lang.String = js.native
  val get: get with java.lang.String = js.native
  val post: post with java.lang.String = js.native
  val put: put with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pinterestDashSdkLib.pinterestDashSdkMod.HttpMethod with java.lang.String] = js.native
}

