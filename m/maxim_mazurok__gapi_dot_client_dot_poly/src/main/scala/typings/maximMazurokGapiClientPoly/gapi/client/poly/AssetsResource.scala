package typings.maximMazurokGapiClientPoly.gapi.client.poly

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPoly.anon.Accesstoken
import typings.maximMazurokGapiClientPoly.anon.Alt
import typings.maximMazurokGapiClientPoly.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetsResource extends StObject {
  
  /** Returns detailed information about an asset given its name. PRIVATE assets are returned only if the currently authenticated user (via OAuth token) is the author of the asset. */
  def get(): Request[Asset] = js.native
  def get(request: Accesstoken): Request[Asset] = js.native
  
  /** Lists all public, remixable assets. These are assets with an access level of PUBLIC and published under the CC-By license. */
  /**
    * Lists assets authored by the given user. Only the value 'me', representing the currently-authenticated user, is supported. May include assets with an access level of PRIVATE or
    * UNLISTED and assets which are All Rights Reserved for the currently-authenticated user.
    */
  def list(): Request[ListAssetsResponse] = js.native
  def list(request: Alt): Request[ListAssetsResponse] = js.native
  def list(request: Callback): Request[ListUserAssetsResponse] = js.native
}
