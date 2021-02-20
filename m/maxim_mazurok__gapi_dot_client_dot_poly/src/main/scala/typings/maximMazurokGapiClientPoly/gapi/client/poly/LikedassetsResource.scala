package typings.maximMazurokGapiClientPoly.gapi.client.poly

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPoly.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LikedassetsResource extends StObject {
  
  /** Lists assets that the user has liked. Only the value 'me', representing the currently-authenticated user, is supported. May include assets with an access level of UNLISTED. */
  def list(): Request[ListLikedAssetsResponse] = js.native
  def list(request: Fields): Request[ListLikedAssetsResponse] = js.native
}
