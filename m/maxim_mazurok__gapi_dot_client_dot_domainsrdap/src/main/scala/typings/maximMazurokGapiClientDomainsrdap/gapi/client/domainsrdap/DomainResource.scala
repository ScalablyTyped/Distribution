package typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDomainsrdap.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainResource extends js.Object {
  
  /** Look up RDAP information for a domain by name. */
  def get(): Request[HttpBody] = js.native
  def get(request: Alt): Request[HttpBody] = js.native
}
