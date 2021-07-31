package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.Callback
import typings.maximMazurokGapiClientToolresults.anon.ExecutionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /**
    * Gets an Environment. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request
    * is malformed - NOT_FOUND - if the Environment does not exist
    */
  def get(): Request[Environment] = js.native
  def get(request: Callback): Request[Environment] = js.native
  
  /**
    * Lists Environments for a given Execution. The Environments are sorted by display name. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is
    * not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Execution does not exist
    */
  def list(): Request[ListEnvironmentsResponse] = js.native
  def list(request: ExecutionId): Request[ListEnvironmentsResponse] = js.native
}
