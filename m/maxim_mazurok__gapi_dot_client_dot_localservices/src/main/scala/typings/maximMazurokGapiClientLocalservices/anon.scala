package typings.maximMazurokGapiClientLocalservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant. */
    @JSName("endDate.day")
    var endDateDotday: js.UndefOr[Double] = js.undefined
    
    /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
    @JSName("endDate.month")
    var endDateDotmonth: js.UndefOr[Double] = js.undefined
    
    /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
    @JSName("endDate.year")
    var endDateDotyear: js.UndefOr[Double] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** The maximum number of accounts to return. If the page size is unset, page size will default to 1000. Maximum page_size is 10000. Optional. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** The `next_page_token` value returned from a previous request to SearchDetailedLeadReports that indicates where listing should continue. Optional. */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A query string for searching for account reports. Caller must provide a customer id of their MCC account with an associated Gaia Mint that allows read permission on their linked
      * accounts. Search expressions are case insensitive. Example query: | Query | Description | |-------------------------|-----------------------------------------------| |
      * manager_customer_id:123 | Get Detailed Lead Report for Manager with id | | | 123. | Required.
      */
    var query: js.UndefOr[String] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant. */
    @JSName("startDate.day")
    var startDateDotday: js.UndefOr[Double] = js.undefined
    
    /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
    @JSName("startDate.month")
    var startDateDotmonth: js.UndefOr[Double] = js.undefined
    
    /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
    @JSName("startDate.year")
    var startDateDotyear: js.UndefOr[Double] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    inline def apply(): Accesstoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setEndDateDotday(value: Double): Self = StObject.set(x, "endDate.day", value.asInstanceOf[js.Any])
      
      inline def setEndDateDotdayUndefined: Self = StObject.set(x, "endDate.day", js.undefined)
      
      inline def setEndDateDotmonth(value: Double): Self = StObject.set(x, "endDate.month", value.asInstanceOf[js.Any])
      
      inline def setEndDateDotmonthUndefined: Self = StObject.set(x, "endDate.month", js.undefined)
      
      inline def setEndDateDotyear(value: Double): Self = StObject.set(x, "endDate.year", value.asInstanceOf[js.Any])
      
      inline def setEndDateDotyearUndefined: Self = StObject.set(x, "endDate.year", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setStartDateDotday(value: Double): Self = StObject.set(x, "startDate.day", value.asInstanceOf[js.Any])
      
      inline def setStartDateDotdayUndefined: Self = StObject.set(x, "startDate.day", js.undefined)
      
      inline def setStartDateDotmonth(value: Double): Self = StObject.set(x, "startDate.month", value.asInstanceOf[js.Any])
      
      inline def setStartDateDotmonthUndefined: Self = StObject.set(x, "startDate.month", js.undefined)
      
      inline def setStartDateDotyear(value: Double): Self = StObject.set(x, "startDate.year", value.asInstanceOf[js.Any])
      
      inline def setStartDateDotyearUndefined: Self = StObject.set(x, "startDate.year", js.undefined)
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
