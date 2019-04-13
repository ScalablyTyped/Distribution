package typings
package pinterestDashSdkLib.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthScopes extends js.Object

@JSImport("pinterest-sdk", "OAuthScopes")
@js.native
object OAuthScopes extends js.Object {
  @js.native
  sealed trait read_public
    extends pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes
  
  @js.native
  sealed trait read_relationships
    extends pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes
  
  @js.native
  sealed trait write_public
    extends pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes
  
  @js.native
  sealed trait write_relationships
    extends pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes
  
  val read_public: read_public with java.lang.String = js.native
  val read_relationships: read_relationships with java.lang.String = js.native
  val write_public: write_public with java.lang.String = js.native
  val write_relationships: write_relationships with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes with java.lang.String] = js.native
}

