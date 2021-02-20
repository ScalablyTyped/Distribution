package typings.maximMazurokGapiClientScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstoken extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The maximum number of returned processes per page of results. Defaults to 50. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with a specific deployment ID. */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that completed on or before the given timestamp. */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from a script function with the given function name. */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with project names containing a specific string. */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those originating from projects with a specific script ID. */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those that were started on or after the given timestamp. */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process statuses. */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified process types. */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional field used to limit returned processes to those having one of the specified user access levels. */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[String | js.Array[String]] = js.native
}
object Accesstoken {
  
  @scala.inline
  def apply(): Accesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotdeploymentId(value: String): Self = StObject.set(x, "userProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotdeploymentIdUndefined: Self = StObject.set(x, "userProcessFilter.deploymentId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotendTime(value: String): Self = StObject.set(x, "userProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotendTimeUndefined: Self = StObject.set(x, "userProcessFilter.endTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotfunctionName(value: String): Self = StObject.set(x, "userProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotfunctionNameUndefined: Self = StObject.set(x, "userProcessFilter.functionName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotprojectName(value: String): Self = StObject.set(x, "userProcessFilter.projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotprojectNameUndefined: Self = StObject.set(x, "userProcessFilter.projectName", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotscriptId(value: String): Self = StObject.set(x, "userProcessFilter.scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotscriptIdUndefined: Self = StObject.set(x, "userProcessFilter.scriptId", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstartTime(value: String): Self = StObject.set(x, "userProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotstartTimeUndefined: Self = StObject.set(x, "userProcessFilter.startTime", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstatuses(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotstatusesUndefined: Self = StObject.set(x, "userProcessFilter.statuses", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotstatusesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.statuses", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDottypes(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDottypesUndefined: Self = StObject.set(x, "userProcessFilter.types", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDottypesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.types", js.Array(value :_*))
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevels(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevelsUndefined: Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.undefined)
    
    @scala.inline
    def setUserProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.Array(value :_*))
  }
}
