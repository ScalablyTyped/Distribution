package typings.maximMazurokGapiClientGmailpostmastertools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alt extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant. */
  @JSName("endDate.day")
  var endDateDotday: js.UndefOr[Double] = js.native
  
  /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
  @JSName("endDate.month")
  var endDateDotmonth: js.UndefOr[Double] = js.native
  
  /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
  @JSName("endDate.year")
  var endDateDotyear: js.UndefOr[Double] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Requested page size. Server may return fewer TrafficStats than requested. If unspecified, server will pick an appropriate default. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous List request, if any. This is the value of ListTrafficStatsResponse.next_page_token returned from the previous call to
    * `ListTrafficStats` method.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the domain whose traffic statistics we'd like to list. It should have the form `domains/{domain_name}`, where domain_name is the fully qualified domain
    * name.
    */
  var parent: String = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant. */
  @JSName("startDate.day")
  var startDateDotday: js.UndefOr[Double] = js.native
  
  /** Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day. */
  @JSName("startDate.month")
  var startDateDotmonth: js.UndefOr[Double] = js.native
  
  /** Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year. */
  @JSName("startDate.year")
  var startDateDotyear: js.UndefOr[Double] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Alt {
  
  @scala.inline
  def apply(parent: String): Alt = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  
  @scala.inline
  implicit class AltOps[Self <: Alt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setEndDateDotday(value: Double): Self = this.set("endDate.day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateDotday: Self = this.set("endDate.day", js.undefined)
    
    @scala.inline
    def setEndDateDotmonth(value: Double): Self = this.set("endDate.month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateDotmonth: Self = this.set("endDate.month", js.undefined)
    
    @scala.inline
    def setEndDateDotyear(value: Double): Self = this.set("endDate.year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateDotyear: Self = this.set("endDate.year", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setStartDateDotday(value: Double): Self = this.set("startDate.day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateDotday: Self = this.set("startDate.day", js.undefined)
    
    @scala.inline
    def setStartDateDotmonth(value: Double): Self = this.set("startDate.month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateDotmonth: Self = this.set("startDate.month", js.undefined)
    
    @scala.inline
    def setStartDateDotyear(value: Double): Self = this.set("startDate.year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateDotyear: Self = this.set("startDate.year", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
