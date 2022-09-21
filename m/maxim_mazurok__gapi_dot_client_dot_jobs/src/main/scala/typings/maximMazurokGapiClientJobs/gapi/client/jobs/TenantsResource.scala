package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientJobs.anon.Accesstoken
import typings.maximMazurokGapiClientJobs.anon.Callback
import typings.maximMazurokGapiClientJobs.anon.Oauthtoken
import typings.maximMazurokGapiClientJobs.anon.PageSize
import typings.maximMazurokGapiClientJobs.anon.Uploadprotocol
import typings.maximMazurokGapiClientJobs.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenantsResource extends StObject {
  
  var clientEvents: ClientEventsResource = js.native
  
  var companies: CompaniesResource = js.native
  
  /** Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box. */
  def completeQuery(): Request[CompleteQueryResponse] = js.native
  def completeQuery(request: typings.maximMazurokGapiClientJobs.anon.Company): Request[CompleteQueryResponse] = js.native
  
  def create(request: Callback, body: Tenant): Request[Tenant] = js.native
  /** Creates a new tenant entity. */
  def create(request: Uploadprotocol): Request[Tenant] = js.native
  
  /** Deletes specified tenant. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves specified tenant. */
  def get(): Request[Tenant] = js.native
  def get(request: Accesstoken): Request[Tenant] = js.native
  
  var jobs: JobsResource = js.native
  
  /** Lists all tenants associated with the project. */
  def list(): Request[ListTenantsResponse] = js.native
  def list(request: PageSize): Request[ListTenantsResponse] = js.native
  
  def patch(request: Oauthtoken, body: Tenant): Request[Tenant] = js.native
  /** Updates specified tenant. */
  def patch(request: Xgafv): Request[Tenant] = js.native
}
