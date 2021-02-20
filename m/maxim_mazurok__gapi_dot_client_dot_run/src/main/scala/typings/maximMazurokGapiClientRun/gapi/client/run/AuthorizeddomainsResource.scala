package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeddomainsResource extends StObject {
  
  /** List authorized domains. */
  def list(): Request[ListAuthorizedDomainsResponse] = js.native
  def list(request: Accesstoken): Request[ListAuthorizedDomainsResponse] = js.native
}
