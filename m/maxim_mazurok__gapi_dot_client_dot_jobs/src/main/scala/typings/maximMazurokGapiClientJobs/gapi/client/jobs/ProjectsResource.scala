package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientJobs.anon.CompanyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var clientEvents: ClientEventsResource = js.native
  
  var companies: CompaniesResource = js.native
  
  /** Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box. */
  def complete(): Request[CompleteQueryResponse] = js.native
  def complete(request: CompanyName): Request[CompleteQueryResponse] = js.native
  
  var jobs: JobsResource = js.native
}
