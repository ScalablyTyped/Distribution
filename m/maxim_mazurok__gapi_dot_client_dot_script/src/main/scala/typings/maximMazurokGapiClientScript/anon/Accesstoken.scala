package typings.maximMazurokGapiClientScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** The maximum number of returned processes per page of results. Defaults to 50. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those originating from projects with a specific deployment ID. */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those that completed on or before the given timestamp. */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those originating from a script function with the given function name. */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those originating from projects with project names containing a specific string. */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those originating from projects with a specific script ID. */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those that were started on or after the given timestamp. */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.undefined
  
  /** Optional field used to limit returned processes to those having one of the specified process statuses. */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Optional field used to limit returned processes to those having one of the specified process types. */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Optional field used to limit returned processes to those having one of the specified user access levels. */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Accesstoken {
  
  inline def apply(): Accesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
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
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    inline def setUserProcessFilterDotdeploymentId(value: String): Self = StObject.set(x, "userProcessFilter.deploymentId", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotdeploymentIdUndefined: Self = StObject.set(x, "userProcessFilter.deploymentId", js.undefined)
    
    inline def setUserProcessFilterDotendTime(value: String): Self = StObject.set(x, "userProcessFilter.endTime", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotendTimeUndefined: Self = StObject.set(x, "userProcessFilter.endTime", js.undefined)
    
    inline def setUserProcessFilterDotfunctionName(value: String): Self = StObject.set(x, "userProcessFilter.functionName", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotfunctionNameUndefined: Self = StObject.set(x, "userProcessFilter.functionName", js.undefined)
    
    inline def setUserProcessFilterDotprojectName(value: String): Self = StObject.set(x, "userProcessFilter.projectName", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotprojectNameUndefined: Self = StObject.set(x, "userProcessFilter.projectName", js.undefined)
    
    inline def setUserProcessFilterDotscriptId(value: String): Self = StObject.set(x, "userProcessFilter.scriptId", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotscriptIdUndefined: Self = StObject.set(x, "userProcessFilter.scriptId", js.undefined)
    
    inline def setUserProcessFilterDotstartTime(value: String): Self = StObject.set(x, "userProcessFilter.startTime", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotstartTimeUndefined: Self = StObject.set(x, "userProcessFilter.startTime", js.undefined)
    
    inline def setUserProcessFilterDotstatuses(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.statuses", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotstatusesUndefined: Self = StObject.set(x, "userProcessFilter.statuses", js.undefined)
    
    inline def setUserProcessFilterDotstatusesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.statuses", js.Array(value*))
    
    inline def setUserProcessFilterDottypes(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.types", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDottypesUndefined: Self = StObject.set(x, "userProcessFilter.types", js.undefined)
    
    inline def setUserProcessFilterDottypesVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.types", js.Array(value*))
    
    inline def setUserProcessFilterDotuserAccessLevels(value: String | js.Array[String]): Self = StObject.set(x, "userProcessFilter.userAccessLevels", value.asInstanceOf[js.Any])
    
    inline def setUserProcessFilterDotuserAccessLevelsUndefined: Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.undefined)
    
    inline def setUserProcessFilterDotuserAccessLevelsVarargs(value: String*): Self = StObject.set(x, "userProcessFilter.userAccessLevels", js.Array(value*))
  }
}
