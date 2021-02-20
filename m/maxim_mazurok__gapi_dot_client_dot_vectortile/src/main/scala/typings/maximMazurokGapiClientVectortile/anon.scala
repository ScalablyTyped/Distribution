package typings.maximMazurokGapiClientVectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
      def setClientInfoDotapiClient(value: String): Self = StObject.set(x, "clientInfo.apiClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapiClientUndefined: Self = StObject.set(x, "clientInfo.apiClient", js.undefined)
      
      @scala.inline
      def setClientInfoDotapplicationId(value: String): Self = StObject.set(x, "clientInfo.applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapplicationIdUndefined: Self = StObject.set(x, "clientInfo.applicationId", js.undefined)
      
      @scala.inline
      def setClientInfoDotapplicationVersion(value: String): Self = StObject.set(x, "clientInfo.applicationVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapplicationVersionUndefined: Self = StObject.set(x, "clientInfo.applicationVersion", js.undefined)
      
      @scala.inline
      def setClientInfoDotdeviceModel(value: String): Self = StObject.set(x, "clientInfo.deviceModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotdeviceModelUndefined: Self = StObject.set(x, "clientInfo.deviceModel", js.undefined)
      
      @scala.inline
      def setClientInfoDotoperatingSystem(value: String): Self = StObject.set(x, "clientInfo.operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotoperatingSystemUndefined: Self = StObject.set(x, "clientInfo.operatingSystem", js.undefined)
      
      @scala.inline
      def setClientInfoDotplatform(value: String): Self = StObject.set(x, "clientInfo.platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotplatformUndefined: Self = StObject.set(x, "clientInfo.platform", js.undefined)
      
      @scala.inline
      def setClientInfoDotuserId(value: String): Self = StObject.set(x, "clientInfo.userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotuserIdUndefined: Self = StObject.set(x, "clientInfo.userId", js.undefined)
      
      @scala.inline
      def setClientTileVersionId(value: String): Self = StObject.set(x, "clientTileVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTileVersionIdUndefined: Self = StObject.set(x, "clientTileVersionId", js.undefined)
      
      @scala.inline
      def setEnableDetailedHighwayTypes(value: Boolean): Self = StObject.set(x, "enableDetailedHighwayTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDetailedHighwayTypesUndefined: Self = StObject.set(x, "enableDetailedHighwayTypes", js.undefined)
      
      @scala.inline
      def setEnableFeatureNames(value: Boolean): Self = StObject.set(x, "enableFeatureNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFeatureNamesUndefined: Self = StObject.set(x, "enableFeatureNames", js.undefined)
      
      @scala.inline
      def setEnableModeledVolumes(value: Boolean): Self = StObject.set(x, "enableModeledVolumes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableModeledVolumesUndefined: Self = StObject.set(x, "enableModeledVolumes", js.undefined)
      
      @scala.inline
      def setEnablePoliticalFeatures(value: Boolean): Self = StObject.set(x, "enablePoliticalFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePoliticalFeaturesUndefined: Self = StObject.set(x, "enablePoliticalFeatures", js.undefined)
      
      @scala.inline
      def setEnablePrivateRoads(value: Boolean): Self = StObject.set(x, "enablePrivateRoads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePrivateRoadsUndefined: Self = StObject.set(x, "enablePrivateRoads", js.undefined)
      
      @scala.inline
      def setEnableUnclippedBuildings(value: Boolean): Self = StObject.set(x, "enableUnclippedBuildings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUnclippedBuildingsUndefined: Self = StObject.set(x, "enableUnclippedBuildings", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
      def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Alt extends StObject {
    
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
    implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
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
      def setAltitudePrecisionCentimeters(value: Double): Self = StObject.set(x, "altitudePrecisionCentimeters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudePrecisionCentimetersUndefined: Self = StObject.set(x, "altitudePrecisionCentimeters", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClientInfoDotapiClient(value: String): Self = StObject.set(x, "clientInfo.apiClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapiClientUndefined: Self = StObject.set(x, "clientInfo.apiClient", js.undefined)
      
      @scala.inline
      def setClientInfoDotapplicationId(value: String): Self = StObject.set(x, "clientInfo.applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapplicationIdUndefined: Self = StObject.set(x, "clientInfo.applicationId", js.undefined)
      
      @scala.inline
      def setClientInfoDotapplicationVersion(value: String): Self = StObject.set(x, "clientInfo.applicationVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotapplicationVersionUndefined: Self = StObject.set(x, "clientInfo.applicationVersion", js.undefined)
      
      @scala.inline
      def setClientInfoDotdeviceModel(value: String): Self = StObject.set(x, "clientInfo.deviceModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotdeviceModelUndefined: Self = StObject.set(x, "clientInfo.deviceModel", js.undefined)
      
      @scala.inline
      def setClientInfoDotoperatingSystem(value: String): Self = StObject.set(x, "clientInfo.operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotoperatingSystemUndefined: Self = StObject.set(x, "clientInfo.operatingSystem", js.undefined)
      
      @scala.inline
      def setClientInfoDotplatform(value: String): Self = StObject.set(x, "clientInfo.platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotplatformUndefined: Self = StObject.set(x, "clientInfo.platform", js.undefined)
      
      @scala.inline
      def setClientInfoDotuserId(value: String): Self = StObject.set(x, "clientInfo.userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInfoDotuserIdUndefined: Self = StObject.set(x, "clientInfo.userId", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMaxElevationResolutionCells(value: Double): Self = StObject.set(x, "maxElevationResolutionCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxElevationResolutionCellsUndefined: Self = StObject.set(x, "maxElevationResolutionCells", js.undefined)
      
      @scala.inline
      def setMinElevationResolutionCells(value: Double): Self = StObject.set(x, "minElevationResolutionCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinElevationResolutionCellsUndefined: Self = StObject.set(x, "minElevationResolutionCells", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
      def setTerrainFormats(value: String | js.Array[String]): Self = StObject.set(x, "terrainFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerrainFormatsUndefined: Self = StObject.set(x, "terrainFormats", js.undefined)
      
      @scala.inline
      def setTerrainFormatsVarargs(value: String*): Self = StObject.set(x, "terrainFormats", js.Array(value :_*))
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
