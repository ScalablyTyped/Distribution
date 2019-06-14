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
  
  /* 0 */ val read_public: read_public with scala.Double = js.native
  /* 2 */ val read_relationships: read_relationships with scala.Double = js.native
  /* 1 */ val write_public: write_public with scala.Double = js.native
  /* 3 */ val write_relationships: write_relationships with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pinterestDashSdkLib.pinterestDashSdkMod.OAuthScopes with scala.Double] = js.native
}

