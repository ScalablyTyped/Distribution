package typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDomainsrdap.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutnumResource extends js.Object {
  
  /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
  def get(): Request[RdapResponse] = js.native
  def get(request: Accesstoken): Request[RdapResponse] = js.native
}
