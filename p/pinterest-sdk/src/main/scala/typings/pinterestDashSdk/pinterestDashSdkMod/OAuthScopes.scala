package typings.pinterestDashSdk.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthScopes extends js.Object

@JSImport("pinterest-sdk", "OAuthScopes")
@js.native
object OAuthScopes extends js.Object {
  @js.native
  sealed trait read_public extends OAuthScopes
  
  @js.native
  sealed trait read_relationships extends OAuthScopes
  
  @js.native
  sealed trait write_public extends OAuthScopes
  
  @js.native
  sealed trait write_relationships extends OAuthScopes
  
  /* 0 */ val read_public: typings.pinterestDashSdk.pinterestDashSdkMod.OAuthScopes.read_public with Double = js.native
  /* 2 */ val read_relationships: typings.pinterestDashSdk.pinterestDashSdkMod.OAuthScopes.read_relationships with Double = js.native
  /* 1 */ val write_public: typings.pinterestDashSdk.pinterestDashSdkMod.OAuthScopes.write_public with Double = js.native
  /* 3 */ val write_relationships: typings.pinterestDashSdk.pinterestDashSdkMod.OAuthScopes.write_relationships with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OAuthScopes with Double] = js.native
}

