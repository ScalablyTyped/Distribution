package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.Alt
import typings.maximMazurokGapiClientSecuritycenter.anon.Callback
import typings.maximMazurokGapiClientSecuritycenter.anon.FindingId
import typings.maximMazurokGapiClientSecuritycenter.anon.Key
import typings.maximMazurokGapiClientSecuritycenter.anon.Name
import typings.maximMazurokGapiClientSecuritycenter.anon.Parent
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typings.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import typings.maximMazurokGapiClientSecuritycenter.anon.UploadType
import typings.maximMazurokGapiClientSecuritycenter.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingsResource extends js.Object {
  
  /** Creates a finding. The corresponding source must exist for finding creation to succeed. */
  def create(request: FindingId): Request[Finding] = js.native
  def create(request: Parent, body: Finding): Request[Finding] = js.native
  
  def group(request: Alt, body: GroupFindingsRequest): Request[GroupFindingsResponse] = js.native
  /**
    * Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example:
    * /v1/organizations/{organization_id}/sources/-/findings
    */
  def group(request: typings.maximMazurokGapiClientSecuritycenter.anon.Resource): Request[GroupFindingsResponse] = js.native
  
  /** Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings */
  def list(): Request[ListFindingsResponse] = js.native
  def list(request: Callback): Request[ListFindingsResponse] = js.native
  
  def patch(request: UpdateMask, body: Finding): Request[Finding] = js.native
  /** Creates or updates a finding. The corresponding source must exist for a finding creation to succeed. */
  def patch(request: UploadType): Request[Finding] = js.native
  
  def setState(request: PrettyPrint, body: SetFindingStateRequest): Request[Finding] = js.native
  /** Updates the state of a finding. */
  def setState(request: Uploadprotocol): Request[Finding] = js.native
  
  /** Updates security marks. */
  def updateSecurityMarks(request: Key): Request[SecurityMarks] = js.native
  def updateSecurityMarks(request: Name, body: SecurityMarks): Request[SecurityMarks] = js.native
}
