package typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDomainsrdap.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends js.Object {
  
  /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
  def getDomains(): Request[RdapResponse] = js.native
  def getDomains(request: Oauthtoken): Request[RdapResponse] = js.native
  
  /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
  def getEntities(): Request[RdapResponse] = js.native
  def getEntities(request: Oauthtoken): Request[RdapResponse] = js.native
  
  /** Get help information for the RDAP API, including links to documentation. */
  def getHelp(): Request[HttpBody] = js.native
  def getHelp(request: Oauthtoken): Request[HttpBody] = js.native
  
  /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
  def getIp(): Request[HttpBody] = js.native
  def getIp(request: Oauthtoken): Request[HttpBody] = js.native
  
  /** The RDAP API recognizes this command from the RDAP specification but does not support it. The response is a formatted 501 error. */
  def getNameservers(): Request[RdapResponse] = js.native
  def getNameservers(request: Oauthtoken): Request[RdapResponse] = js.native
}
