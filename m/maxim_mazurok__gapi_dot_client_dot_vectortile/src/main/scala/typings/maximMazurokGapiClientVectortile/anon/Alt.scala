package typings.maximMazurokGapiClientVectortile.anon

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
  
  /** The precision of terrain altitudes in centimeters. Possible values: between 1 (cm level precision) and 1,000,000 (10-kilometer level precision). */
  var altitudePrecisionCentimeters: js.UndefOr[Double] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** API client name and version. For example, the SDK calling the API. The exact format is up to the client. */
  @JSName("clientInfo.apiClient")
  var clientInfoDotapiClient: js.UndefOr[String] = js.native
  
  /** Application ID, such as the package name on Android and the bundle identifier on iOS platforms. */
  @JSName("clientInfo.applicationId")
  var clientInfoDotapplicationId: js.UndefOr[String] = js.native
  
  /** Application version number, such as "1.2.3". The exact format is application-dependent. */
  @JSName("clientInfo.applicationVersion")
  var clientInfoDotapplicationVersion: js.UndefOr[String] = js.native
  
  /** Device model as reported by the device. The exact format is platform-dependent. */
  @JSName("clientInfo.deviceModel")
  var clientInfoDotdeviceModel: js.UndefOr[String] = js.native
  
  /** Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent. */
  @JSName("clientInfo.operatingSystem")
  var clientInfoDotoperatingSystem: js.UndefOr[String] = js.native
  
  /** Platform where the application is running. */
  @JSName("clientInfo.platform")
  var clientInfoDotplatform: js.UndefOr[String] = js.native
  
  /**
    * Required. A client-generated user ID. The ID should be generated and persisted during the first user session or whenever a pre-existing ID is not found. The exact format is up
    * to the client. This must be non-empty in a GetFeatureTileRequest (whether via the header or GetFeatureTileRequest.client_info).
    */
  @JSName("clientInfo.userId")
  var clientInfoDotuserId: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The maximum allowed resolution for the returned elevation heightmap. Possible values: between 1 and 1024 (and not less than min_elevation_resolution_cells). Over-sized
    * heightmaps will be non-uniformly down-sampled such that each edge is no longer than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example:
    * Original resolution: 100px (width) * 30px (height) max_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    */
  var maxElevationResolutionCells: js.UndefOr[Double] = js.native
  
  /**
    * The minimum allowed resolution for the returned elevation heightmap. Possible values: between 0 and 1024 (and not more than max_elevation_resolution_cells). Zero is supported
    * for backward compatibility. Under-sized heightmaps will be non-uniformly up-sampled such that each edge is no shorter than this value. Non-uniformity is chosen to maximise the
    * amount of preserved data. For example: Original resolution: 30px (width) * 10px (height) min_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    */
  var minElevationResolutionCells: js.UndefOr[Double] = js.native
  
  /**
    * Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `terraintiles/` followed by the resource ID, which encodes the tile's global x and y
    * coordinates and zoom level as `@,,z`. For example, `terraintiles/@1,2,3z`.
    */
  var name: String = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Terrain formats that the client understands. */
  var terrainFormats: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Alt {
  
  @scala.inline
  def apply(name: String): Alt = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
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
    def setAltitudePrecisionCentimeters(value: Double): Self = this.set("altitudePrecisionCentimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitudePrecisionCentimeters: Self = this.set("altitudePrecisionCentimeters", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setClientInfoDotapiClient(value: String): Self = this.set("clientInfo.apiClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotapiClient: Self = this.set("clientInfo.apiClient", js.undefined)
    
    @scala.inline
    def setClientInfoDotapplicationId(value: String): Self = this.set("clientInfo.applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotapplicationId: Self = this.set("clientInfo.applicationId", js.undefined)
    
    @scala.inline
    def setClientInfoDotapplicationVersion(value: String): Self = this.set("clientInfo.applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotapplicationVersion: Self = this.set("clientInfo.applicationVersion", js.undefined)
    
    @scala.inline
    def setClientInfoDotdeviceModel(value: String): Self = this.set("clientInfo.deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotdeviceModel: Self = this.set("clientInfo.deviceModel", js.undefined)
    
    @scala.inline
    def setClientInfoDotoperatingSystem(value: String): Self = this.set("clientInfo.operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotoperatingSystem: Self = this.set("clientInfo.operatingSystem", js.undefined)
    
    @scala.inline
    def setClientInfoDotplatform(value: String): Self = this.set("clientInfo.platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotplatform: Self = this.set("clientInfo.platform", js.undefined)
    
    @scala.inline
    def setClientInfoDotuserId(value: String): Self = this.set("clientInfo.userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDotuserId: Self = this.set("clientInfo.userId", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxElevationResolutionCells(value: Double): Self = this.set("maxElevationResolutionCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxElevationResolutionCells: Self = this.set("maxElevationResolutionCells", js.undefined)
    
    @scala.inline
    def setMinElevationResolutionCells(value: Double): Self = this.set("minElevationResolutionCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinElevationResolutionCells: Self = this.set("minElevationResolutionCells", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setTerrainFormatsVarargs(value: String*): Self = this.set("terrainFormats", js.Array(value :_*))
    
    @scala.inline
    def setTerrainFormats(value: String | js.Array[String]): Self = this.set("terrainFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainFormats: Self = this.set("terrainFormats", js.undefined)
    
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
