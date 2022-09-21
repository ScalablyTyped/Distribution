package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFirstAndThirdPartyAudienceId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsFirstAndThirdPartyAudienceId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsFirstAndThirdPartyAudienceIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.FirstAndThirdPartyAudienceId
import typings.maximMazurokGapiClientDisplayvideo.anon.FirstAndThirdPartyAudienceIdKey
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserUploadTypeUploadprotocol
import typings.maximMazurokGapiClientDisplayvideo.anon.UploadTypeUploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudiencesResource extends StObject {
  
  def create(request: QuotaUserUploadTypeUploadprotocol, body: FirstAndThirdPartyAudience): Request[FirstAndThirdPartyAudience] = js.native
  /** Creates a FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID` */
  def create(request: UploadTypeUploadprotocolXgafv): Request[FirstAndThirdPartyAudience] = js.native
  
  def editCustomerMatchMembers(request: FieldsFirstAndThirdPartyAudienceId, body: EditCustomerMatchMembersRequest): Request[EditCustomerMatchMembersResponse] = js.native
  /** Updates the member list of a Customer Match audience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID` */
  def editCustomerMatchMembers(request: FirstAndThirdPartyAudienceId): Request[EditCustomerMatchMembersResponse] = js.native
  
  /** Gets a first and third party audience. */
  def get(): Request[FirstAndThirdPartyAudience] = js.native
  def get(request: FirstAndThirdPartyAudienceIdKey): Request[FirstAndThirdPartyAudience] = js.native
  
  /** Lists first and third party audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListFirstAndThirdPartyAudiencesResponse] = js.native
  
  /** Updates an existing FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID` */
  def patch(request: CallbackFieldsFirstAndThirdPartyAudienceId): Request[FirstAndThirdPartyAudience] = js.native
  def patch(request: FieldsFirstAndThirdPartyAudienceIdKey, body: FirstAndThirdPartyAudience): Request[FirstAndThirdPartyAudience] = js.native
}
