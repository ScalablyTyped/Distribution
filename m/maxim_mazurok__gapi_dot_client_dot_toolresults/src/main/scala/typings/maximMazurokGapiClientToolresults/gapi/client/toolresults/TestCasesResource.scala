package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.PageToken
import typings.maximMazurokGapiClientToolresults.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCasesResource extends StObject {
  
  /**
    * Gets details of a Test Case for a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the
    * user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Test Case does not exist
    */
  def get(): Request[TestCase] = js.native
  def get(request: ProjectId): Request[TestCase] = js.native
  
  /**
    * Lists Test Cases attached to a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the
    * user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Step does not exist
    */
  def list(): Request[ListTestCasesResponse] = js.native
  def list(request: PageToken): Request[ListTestCasesResponse] = js.native
}
