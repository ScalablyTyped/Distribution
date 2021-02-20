package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.CallbackFields
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typings.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends StObject {
  
  var assets: AssetsResource = js.native
  
  /** Gets the settings for an organization. */
  def getOrganizationSettings(): Request[OrganizationSettings] = js.native
  def getOrganizationSettings(request: PrettyPrint): Request[OrganizationSettings] = js.native
  
  var notificationConfigs: NotificationConfigsResource = js.native
  
  var operations: OperationsResource = js.native
  
  var sources: SourcesResource = js.native
  
  /** Updates an organization's settings. */
  def updateOrganizationSettings(request: CallbackFields): Request[OrganizationSettings] = js.native
  def updateOrganizationSettings(request: UpdateMask, body: OrganizationSettings): Request[OrganizationSettings] = js.native
}
