package typings.maximMazurokGapiClientWorkflows.gapi.client.workflows

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWorkflows.anon.Accesstoken
import typings.maximMazurokGapiClientWorkflows.anon.Callback
import typings.maximMazurokGapiClientWorkflows.anon.Fields
import typings.maximMazurokGapiClientWorkflows.anon.Filter
import typings.maximMazurokGapiClientWorkflows.anon.Key
import typings.maximMazurokGapiClientWorkflows.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowsResource extends js.Object {
  
  /** Creates a new workflow. If a workflow with the specified name already exists in the specified project and location, the long running operation will return ALREADY_EXISTS error. */
  def create(request: Callback): Request[Operation] = js.native
  def create(request: Fields, body: Workflow): Request[Operation] = js.native
  
  /** Deletes a workflow with the specified name. This method also cancels and deletes all running executions of the workflow. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Gets details of a single Workflow. */
  def get(): Request[Workflow] = js.native
  def get(request: Accesstoken): Request[Workflow] = js.native
  
  /** Lists Workflows in a given project and location. The default order is not specified. */
  def list(): Request[ListWorkflowsResponse] = js.native
  def list(request: Filter): Request[ListWorkflowsResponse] = js.native
  
  /**
    * Updates an existing workflow. Running this method has no impact on already running executions of the workflow. A new revision of the workflow may be created as a result of a
    * successful update operation. In that case, such revision will be used in new workflow executions.
    */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Workflow): Request[Operation] = js.native
}
