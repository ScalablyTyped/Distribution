package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.ClientOperationId
import typings.maximMazurokGapiClientDns.anon.DigestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKeysResource extends StObject {
  
  /** Fetch the representation of an existing DnsKey. */
  def get(): Request[DnsKey] = js.native
  def get(request: ClientOperationId): Request[DnsKey] = js.native
  
  /** Enumerate DnsKeys to a ResourceRecordSet collection. */
  def list(): Request[DnsKeysListResponse] = js.native
  def list(request: DigestType): Request[DnsKeysListResponse] = js.native
}
