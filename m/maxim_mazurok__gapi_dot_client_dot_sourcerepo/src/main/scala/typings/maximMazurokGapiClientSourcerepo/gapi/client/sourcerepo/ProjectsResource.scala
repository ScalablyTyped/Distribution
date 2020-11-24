package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSourcerepo.anon.Callback
import typings.maximMazurokGapiClientSourcerepo.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  /** Returns the Cloud Source Repositories configuration of the project. */
  def getConfig(): Request[ProjectConfig] = js.native
  def getConfig(request: Callback): Request[ProjectConfig] = js.native
  
  var repos: ReposResource = js.native
  
  def updateConfig(request: Callback, body: UpdateProjectConfigRequest): Request[ProjectConfig] = js.native
  /** Updates the Cloud Source Repositories configuration of the project. */
  def updateConfig(request: QuotaUser): Request[ProjectConfig] = js.native
}
