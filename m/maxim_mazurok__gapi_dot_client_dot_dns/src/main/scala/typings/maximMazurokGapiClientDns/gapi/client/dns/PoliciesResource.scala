package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.MaxResults
import typings.maximMazurokGapiClientDns.anon.PrettyPrint
import typings.maximMazurokGapiClientDns.anon.QuotaUser
import typings.maximMazurokGapiClientDns.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends StObject {
  
  def create(request: PrettyPrint, body: Policy): Request[Policy] = js.native
  /** Create a new Policy */
  def create(request: QuotaUser): Request[Policy] = js.native
  
  /** Delete a previously created Policy. Will fail if the policy is still being referenced by a network. */
  def delete(): Request[Unit] = js.native
  def delete(request: typings.maximMazurokGapiClientDns.anon.Policy): Request[Unit] = js.native
  
  /** Fetch the representation of an existing Policy. */
  def get(): Request[Policy] = js.native
  def get(request: typings.maximMazurokGapiClientDns.anon.Policy): Request[Policy] = js.native
  
  /** Enumerate all Policies associated with a project. */
  def list(): Request[PoliciesListResponse] = js.native
  def list(request: MaxResults): Request[PoliciesListResponse] = js.native
  
  def patch(request: typings.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesPatchResponse] = js.native
  /** Apply a partial update to an existing Policy. */
  def patch(request: Resource): Request[PoliciesPatchResponse] = js.native
  
  def update(request: typings.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesUpdateResponse] = js.native
  /** Update an existing Policy. */
  def update(request: Resource): Request[PoliciesUpdateResponse] = js.native
}
