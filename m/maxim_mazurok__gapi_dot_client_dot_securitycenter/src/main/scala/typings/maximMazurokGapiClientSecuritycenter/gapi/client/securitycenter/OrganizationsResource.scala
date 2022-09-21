package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.Name
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends StObject {
  
  var assets: AssetsResource = js.native
  
  var bigQueryExports: BigQueryExportsResource = js.native
  
  var findings: FindingsResource = js.native
  
  /** Gets the settings for an organization. */
  def getOrganizationSettings(): Request[OrganizationSettings] = js.native
  def getOrganizationSettings(request: Name): Request[OrganizationSettings] = js.native
  
  var muteConfigs: MuteConfigsResource = js.native
  
  var notificationConfigs: NotificationConfigsResource = js.native
  
  var operations: OperationsResource = js.native
  
  var sources: SourcesResource = js.native
  
  /** Updates an organization's settings. */
  def updateOrganizationSettings(request: PrettyPrintQuotaUser): Request[OrganizationSettings] = js.native
  def updateOrganizationSettings(request: QuotaUser, body: OrganizationSettings): Request[OrganizationSettings] = js.native
}
