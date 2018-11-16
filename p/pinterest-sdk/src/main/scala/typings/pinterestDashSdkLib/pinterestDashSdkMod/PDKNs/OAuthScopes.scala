package typings
package pinterestDashSdkLib.pinterestDashSdkMod.PDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthScopes extends js.Object

@JSImport("pinterest-sdk/PDK", "OAuthScopes")
@js.native
object OAuthScopes extends js.Object {
  @js.native
  sealed trait read_public
    extends pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OAuthScopes
  
  @js.native
  sealed trait read_relationships
    extends pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OAuthScopes
  
  @js.native
  sealed trait write_public
    extends pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OAuthScopes
  
  @js.native
  sealed trait write_relationships
    extends pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OAuthScopes
  
}

