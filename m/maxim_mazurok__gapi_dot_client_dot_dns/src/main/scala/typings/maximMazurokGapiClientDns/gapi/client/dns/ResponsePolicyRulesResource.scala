package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.AltCallback
import typings.maximMazurokGapiClientDns.anon.CallbackClientOperationId
import typings.maximMazurokGapiClientDns.anon.CallbackFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsePolicyRulesResource extends StObject {
  
  /** Creates a new Response Policy Rule. */
  def create(request: AltCallback): Request[ResponsePolicyRule] = js.native
  def create(request: typings.maximMazurokGapiClientDns.anon.ResponsePolicy, body: ResponsePolicyRule): Request[ResponsePolicyRule] = js.native
  
  /** Deletes a previously created Response Policy Rule. */
  def delete(): Request[Unit] = js.native
  def delete(request: typings.maximMazurokGapiClientDns.anon.ResponsePolicyRule): Request[Unit] = js.native
  
  /** Fetches the representation of an existing Response Policy Rule. */
  def get(): Request[ResponsePolicyRule] = js.native
  def get(request: typings.maximMazurokGapiClientDns.anon.ResponsePolicyRule): Request[ResponsePolicyRule] = js.native
  
  /** Enumerates all Response Policy Rules associated with a project. */
  def list(): Request[ResponsePolicyRulesListResponse] = js.native
  def list(request: CallbackFields): Request[ResponsePolicyRulesListResponse] = js.native
  
  /** Applies a partial update to an existing Response Policy Rule. */
  def patch(request: CallbackClientOperationId): Request[ResponsePolicyRulesPatchResponse] = js.native
  def patch(request: typings.maximMazurokGapiClientDns.anon.ResponsePolicyRule, body: ResponsePolicyRule): Request[ResponsePolicyRulesPatchResponse] = js.native
  
  /** Updates an existing Response Policy Rule. */
  def update(request: CallbackClientOperationId): Request[ResponsePolicyRulesUpdateResponse] = js.native
  def update(request: typings.maximMazurokGapiClientDns.anon.ResponsePolicyRule, body: ResponsePolicyRule): Request[ResponsePolicyRulesUpdateResponse] = js.native
}
