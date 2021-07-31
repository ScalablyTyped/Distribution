package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGameservices.anon.Callback
import typings.maximMazurokGapiClientGameservices.anon.DeploymentId
import typings.maximMazurokGapiClientGameservices.anon.Fields
import typings.maximMazurokGapiClientGameservices.anon.Key
import typings.maximMazurokGapiClientGameservices.anon.Name
import typings.maximMazurokGapiClientGameservices.anon.Oauthtoken
import typings.maximMazurokGapiClientGameservices.anon.PrettyPrint
import typings.maximMazurokGapiClientGameservices.anon.PreviewTime
import typings.maximMazurokGapiClientGameservices.anon.QuotaUser
import typings.maximMazurokGapiClientGameservices.anon.Resource
import typings.maximMazurokGapiClientGameservices.anon.UpdateMask
import typings.maximMazurokGapiClientGameservices.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerDeploymentsResource extends StObject {
  
  var configs: ConfigsResource = js.native
  
  /** Creates a new game server deployment in a given project and location. */
  def create(request: DeploymentId): Request[Operation] = js.native
  def create(request: Key, body: GameServerDeployment): Request[Operation] = js.native
  
  /** Deletes a single game server deployment. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def fetchDeploymentState(request: Callback, body: FetchDeploymentStateRequest): Request[FetchDeploymentStateResponse] = js.native
  /**
    * Retrieves information about the current state of the game server deployment. Gathers all the Agones fleets and Agones autoscalers, including fleets running an older version of the
    * game server deployment.
    */
  def fetchDeploymentState(request: Name): Request[FetchDeploymentStateResponse] = js.native
  
  /** Gets details of a single game server deployment. */
  def get(): Request[GameServerDeployment] = js.native
  def get(request: Callback): Request[GameServerDeployment] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Gets details a single game server deployment rollout. */
  def getRollout(): Request[GameServerDeploymentRollout] = js.native
  def getRollout(request: Callback): Request[GameServerDeploymentRollout] = js.native
  
  /** Lists game server deployments in a given project and location. */
  def list(): Request[ListGameServerDeploymentsResponse] = js.native
  def list(request: Fields): Request[ListGameServerDeploymentsResponse] = js.native
  
  /** Patches a game server deployment. */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: GameServerDeployment): Request[Operation] = js.native
  
  /** Previews the game server deployment rollout. This API does not mutate the rollout resource. */
  def previewRollout(request: PreviewTime): Request[PreviewGameServerDeploymentRolloutResponse] = js.native
  def previewRollout(request: UpdateMask, body: GameServerDeploymentRollout): Request[PreviewGameServerDeploymentRolloutResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def updateRollout(request: QuotaUser, body: GameServerDeploymentRollout): Request[Operation] = js.native
  /**
    * Patches a single game server deployment rollout. The method will not return an error if the update does not affect any existing realms. For example - if the
    * default_game_server_config is changed but all existing realms use the override, that is valid. Similarly, if a non existing realm is explicitly called out in
    * game_server_config_overrides field, that will also not result in an error.
    */
  def updateRollout(request: UploadType): Request[Operation] = js.native
}
