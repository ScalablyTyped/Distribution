package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.AccesstokenAlt
import typings.maximMazurokGapiClientSecuritycenter.anon.Alt
import typings.maximMazurokGapiClientSecuritycenter.anon.Callback
import typings.maximMazurokGapiClientSecuritycenter.anon.Fields
import typings.maximMazurokGapiClientSecuritycenter.anon.FindingId
import typings.maximMazurokGapiClientSecuritycenter.anon.Key
import typings.maximMazurokGapiClientSecuritycenter.anon.Name
import typings.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import typings.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import typings.maximMazurokGapiClientSecuritycenter.anon.UploadType
import typings.maximMazurokGapiClientSecuritycenter.anon.Uploadprotocol
import typings.maximMazurokGapiClientSecuritycenter.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingsResource extends StObject {
  
  def bulkMute(request: Alt, body: BulkMuteFindingsRequest): Request[Operation] = js.native
  /**
    * Kicks off an LRO to bulk mute findings for a parent based on a filter. The parent can be either an organization, folder or project. The findings matched by the filter will be muted
    * after the LRO is done.
    */
  def bulkMute(request: typings.maximMazurokGapiClientSecuritycenter.anon.Resource): Request[Operation] = js.native
  
  def create(request: AccesstokenAlt, body: Finding): Request[Finding] = js.native
  /** Creates a finding. The corresponding source must exist for finding creation to succeed. */
  def create(request: FindingId): Request[Finding] = js.native
  
  var externalSystems: ExternalSystemsResource = js.native
  
  def group(request: Alt, body: GroupFindingsRequest): Request[GroupFindingsResponse] = js.native
  /**
    * Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example:
    * /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings
    */
  def group(request: UploadType): Request[GroupFindingsResponse] = js.native
  
  /** Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings */
  def list(): Request[ListFindingsResponse] = js.native
  def list(request: Callback): Request[ListFindingsResponse] = js.native
  
  def patch(request: QuotaUser, body: Finding): Request[Finding] = js.native
  /** Creates or updates a finding. The corresponding source must exist for a finding creation to succeed. */
  def patch(request: UpdateMask): Request[Finding] = js.native
  
  def setMute(request: Name, body: SetMuteRequest): Request[Finding] = js.native
  /** Updates the mute state of a finding. */
  def setMute(request: Uploadprotocol): Request[Finding] = js.native
  
  def setState(request: Name, body: SetFindingStateRequest): Request[Finding] = js.native
  /** Updates the state of a finding. */
  def setState(request: Xgafv): Request[Finding] = js.native
  
  /** Updates security marks. */
  def updateSecurityMarks(request: Fields): Request[SecurityMarks] = js.native
  def updateSecurityMarks(request: Key, body: SecurityMarks): Request[SecurityMarks] = js.native
}
