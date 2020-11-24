package typings.maximMazurokGapiClientVectortile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstoken extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
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
  
  /**
    * Optional version id identifying the tile that is already in the client's cache. This field should be populated with the most recent version_id value returned by the API for the
    * requested tile. If the version id is empty the server always returns a newly rendered tile. If it is provided the server checks if the tile contents would be identical to one
    * that's already on the client, and if so, returns a stripped-down response tile with STATUS_OK_DATA_UNCHANGED instead.
    */
  var clientTileVersionId: js.UndefOr[String] = js.native
  
  /**
    * Flag indicating whether detailed highway types should be returned. If this is set, the CONTROLLED_ACCESS_HIGHWAY type may be returned. If not, then these highways will have the
    * generic HIGHWAY type. This exists for backwards compatibility reasons.
    */
  var enableDetailedHighwayTypes: js.UndefOr[Boolean] = js.native
  
  /** Flag indicating whether human-readable names should be returned for features. If this is set, the display_name field on the feature will be filled out. */
  var enableFeatureNames: js.UndefOr[Boolean] = js.native
  
  /** Flag indicating whether 3D building models should be enabled. If this is set structures will be returned as 3D modeled volumes rather than 2.5D extruded areas where possible. */
  var enableModeledVolumes: js.UndefOr[Boolean] = js.native
  
  /** Flag indicating whether political features should be returned. */
  var enablePoliticalFeatures: js.UndefOr[Boolean] = js.native
  
  /** Flag indicating whether the returned tile will contain road features that are marked private. Private roads are indicated by the Feature.segment_info.road_info.is_private field. */
  var enablePrivateRoads: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag indicating whether unclipped buildings should be returned. If this is set, building render ops will extend beyond the tile boundary. Buildings will only be returned on the
    * tile that contains their centroid.
    */
  var enableUnclippedBuildings: js.UndefOr[Boolean] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Required. The BCP-47 language code corresponding to the language in which the name was requested, such as "en-US" or "sr-Latn". For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `tiles/` followed by the resource ID, which encodes the tile's global x and y
    * coordinates and zoom level as `@,,z`. For example, `tiles/@1,2,3z`.
    */
  var name: String = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Required. The Unicode country/region code (CLDR) of the location from which the request is coming from, such as "US" and "419". For more information, see
    * http://www.unicode.org/reports/tr35/#unicode_region_subtag.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Accesstoken {
  
  @scala.inline
  def apply(name: String): Accesstoken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
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
    def setClientTileVersionId(value: String): Self = this.set("clientTileVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientTileVersionId: Self = this.set("clientTileVersionId", js.undefined)
    
    @scala.inline
    def setEnableDetailedHighwayTypes(value: Boolean): Self = this.set("enableDetailedHighwayTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDetailedHighwayTypes: Self = this.set("enableDetailedHighwayTypes", js.undefined)
    
    @scala.inline
    def setEnableFeatureNames(value: Boolean): Self = this.set("enableFeatureNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFeatureNames: Self = this.set("enableFeatureNames", js.undefined)
    
    @scala.inline
    def setEnableModeledVolumes(value: Boolean): Self = this.set("enableModeledVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableModeledVolumes: Self = this.set("enableModeledVolumes", js.undefined)
    
    @scala.inline
    def setEnablePoliticalFeatures(value: Boolean): Self = this.set("enablePoliticalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePoliticalFeatures: Self = this.set("enablePoliticalFeatures", js.undefined)
    
    @scala.inline
    def setEnablePrivateRoads(value: Boolean): Self = this.set("enablePrivateRoads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePrivateRoads: Self = this.set("enablePrivateRoads", js.undefined)
    
    @scala.inline
    def setEnableUnclippedBuildings(value: Boolean): Self = this.set("enableUnclippedBuildings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableUnclippedBuildings: Self = this.set("enableUnclippedBuildings", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
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
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
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
