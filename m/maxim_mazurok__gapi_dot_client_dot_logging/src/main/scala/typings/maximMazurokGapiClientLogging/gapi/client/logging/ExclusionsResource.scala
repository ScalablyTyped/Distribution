package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Accesstoken
import typings.maximMazurokGapiClientLogging.anon.Fields
import typings.maximMazurokGapiClientLogging.anon.Name
import typings.maximMazurokGapiClientLogging.anon.Parent
import typings.maximMazurokGapiClientLogging.anon.Resource
import typings.maximMazurokGapiClientLogging.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusionsResource extends js.Object {
  
  /** Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions in a resource. */
  def create(request: Parent): Request[LogExclusion] = js.native
  def create(request: UploadType, body: LogExclusion): Request[LogExclusion] = js.native
  
  /** Deletes an exclusion. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets the description of an exclusion. */
  def get(): Request[LogExclusion] = js.native
  def get(request: Accesstoken): Request[LogExclusion] = js.native
  
  /** Lists all the exclusions in a parent resource. */
  def list(): Request[ListExclusionsResponse] = js.native
  def list(request: Fields): Request[ListExclusionsResponse] = js.native
  
  def patch(request: Name, body: LogExclusion): Request[LogExclusion] = js.native
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: Resource): Request[LogExclusion] = js.native
}
