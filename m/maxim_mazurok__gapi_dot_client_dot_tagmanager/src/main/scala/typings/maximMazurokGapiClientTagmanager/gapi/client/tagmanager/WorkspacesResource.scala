package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.OauthtokenParent
import typings.maximMazurokGapiClientTagmanager.anon.PathPrettyPrint
import typings.maximMazurokGapiClientTagmanager.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientTagmanager.anon.QuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesResource extends StObject {
  
  var built_in_variables: BuiltInVariablesResource = js.native
  
  def create(request: Alt, body: Workspace): Request[Workspace] = js.native
  /** Creates a Workspace. */
  def create(request: OauthtokenParent): Request[Workspace] = js.native
  
  def create_version(request: Callback, body: CreateContainerVersionRequestVersionOptions): Request[CreateContainerVersionResponse] = js.native
  /** Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version. */
  def create_version(request: PathPrettyPrint): Request[CreateContainerVersionResponse] = js.native
  
  /** Deletes a Workspace. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  var folders: FoldersResource = js.native
  
  /** Gets a Workspace. */
  def get(): Request[Workspace] = js.native
  def get(request: Callback): Request[Workspace] = js.native
  
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(): Request[GetWorkspaceStatusResponse] = js.native
  def getStatus(request: Callback): Request[GetWorkspaceStatusResponse] = js.native
  
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(): Request[ListWorkspacesResponse] = js.native
  def list(request: Fields): Request[ListWorkspacesResponse] = js.native
  
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(): Request[QuickPreviewResponse] = js.native
  def quick_preview(request: Callback): Request[QuickPreviewResponse] = js.native
  
  def resolve_conflict(request: Oauthtoken, body: Entity): Request[Unit] = js.native
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: PrettyPrintQuotaUser): Request[Unit] = js.native
  
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(): Request[SyncWorkspaceResponse] = js.native
  def sync(request: Callback): Request[SyncWorkspaceResponse] = js.native
  
  var tags: TagsResource = js.native
  
  var templates: TemplatesResource = js.native
  
  var triggers: TriggersResource = js.native
  
  def update(request: Oauthtoken, body: Workspace): Request[Workspace] = js.native
  /** Updates a Workspace. */
  def update(request: QuotaUserResource): Request[Workspace] = js.native
  
  var variables: VariablesResource = js.native
  
  var zones: ZonesResource = js.native
}
