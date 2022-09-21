package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPubsub.anon.Accesstoken
import typings.maximMazurokGapiClientPubsub.anon.Alt
import typings.maximMazurokGapiClientPubsub.anon.Callback
import typings.maximMazurokGapiClientPubsub.anon.Fields
import typings.maximMazurokGapiClientPubsub.anon.Key
import typings.maximMazurokGapiClientPubsub.anon.Oauthtoken
import typings.maximMazurokGapiClientPubsub.anon.Parent
import typings.maximMazurokGapiClientPubsub.anon.PrettyPrint
import typings.maximMazurokGapiClientPubsub.anon.QuotaUser
import typings.maximMazurokGapiClientPubsub.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemasResource extends StObject {
  
  /** Creates a schema. */
  def create(request: Accesstoken): Request[Schema] = js.native
  def create(request: Alt, body: Schema): Request[Schema] = js.native
  
  /** Deletes a schema. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a schema. */
  def get(): Request[Schema] = js.native
  def get(request: Fields): Request[Schema] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Lists schemas in a project. */
  def list(): Request[ListSchemasResponse] = js.native
  def list(request: Oauthtoken): Request[ListSchemasResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /** Validates a schema. */
  def validate(request: Parent): Request[js.Object] = js.native
  def validate(request: QuotaUser, body: ValidateSchemaRequest): Request[js.Object] = js.native
  
  def validateMessage(request: QuotaUser, body: ValidateMessageRequest): Request[js.Object] = js.native
  /** Validates a message against a schema. */
  def validateMessage(request: Resource): Request[js.Object] = js.native
}
