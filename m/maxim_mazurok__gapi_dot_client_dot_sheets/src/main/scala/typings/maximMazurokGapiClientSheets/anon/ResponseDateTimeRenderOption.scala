package typings.maximMazurokGapiClientSheets.anon

import typings.maximMazurokGapiClientSheets.gapi.client.sheets.ValueRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDateTimeRenderOption extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. If the range to write was
    * larger than the range actually written, the response includes all values in the requested range (excluding trailing empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** The A1 notation of the values to update. */
  var range: String
  
  /** Request body */
  var resource: ValueRange
  
  /**
    * Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render
    * option is DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.undefined
  
  /** Determines how values in the response should be rendered. The default render option is ValueRenderOption.FORMATTED_VALUE. */
  var responseValueRenderOption: js.UndefOr[String] = js.undefined
  
  /** The ID of the spreadsheet to update. */
  var spreadsheetId: String
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.undefined
}
object ResponseDateTimeRenderOption {
  
  @scala.inline
  def apply(range: String, resource: ValueRange, spreadsheetId: String): ResponseDateTimeRenderOption = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], spreadsheetId = spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDateTimeRenderOption]
  }
  
  @scala.inline
  implicit class ResponseDateTimeRenderOptionMutableBuilder[Self <: ResponseDateTimeRenderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ValueRange): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    @scala.inline
    def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
  }
}
