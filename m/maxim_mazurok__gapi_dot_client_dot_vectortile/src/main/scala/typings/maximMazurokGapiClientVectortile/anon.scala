package typings.maximMazurokGapiClientVectortile

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
    
    /**
      * Flag indicating whether the returned tile will always contain 2.5D footprints for structures. If enabled_modeled_volumes is set, this will mean that structures will have both
      * their 3D models and 2.5D footprints returned.
      */
    var alwaysIncludeBuildingFootprints: js.UndefOr[Boolean] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** API client name and version. For example, the SDK calling the API. The exact format is up to the client. */
    @JSName("clientInfo.apiClient")
    var clientInfoDotapiClient: js.UndefOr[String] = js.undefined
    
    /** Application ID, such as the package name on Android and the bundle identifier on iOS platforms. */
    @JSName("clientInfo.applicationId")
    var clientInfoDotapplicationId: js.UndefOr[String] = js.undefined
    
    /** Application version number, such as "1.2.3". The exact format is application-dependent. */
    @JSName("clientInfo.applicationVersion")
    var clientInfoDotapplicationVersion: js.UndefOr[String] = js.undefined
    
    /** Device model as reported by the device. The exact format is platform-dependent. */
    @JSName("clientInfo.deviceModel")
    var clientInfoDotdeviceModel: js.UndefOr[String] = js.undefined
    
    /** Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent. */
    @JSName("clientInfo.operatingSystem")
    var clientInfoDotoperatingSystem: js.UndefOr[String] = js.undefined
    
    /** Platform where the application is running. */
    @JSName("clientInfo.platform")
    var clientInfoDotplatform: js.UndefOr[String] = js.undefined
    
    /**
      * Required. A client-generated user ID. The ID should be generated and persisted during the first user session or whenever a pre-existing ID is not found. The exact format is up
      * to the client. This must be non-empty in a GetFeatureTileRequest (whether via the header or GetFeatureTileRequest.client_info).
      */
    @JSName("clientInfo.userId")
    var clientInfoDotuserId: js.UndefOr[String] = js.undefined
    
    /**
      * Optional version id identifying the tile that is already in the client's cache. This field should be populated with the most recent version_id value returned by the API for the
      * requested tile. If the version id is empty the server always returns a newly rendered tile. If it is provided the server checks if the tile contents would be identical to one
      * that's already on the client, and if so, returns a stripped-down response tile with STATUS_OK_DATA_UNCHANGED instead.
      */
    var clientTileVersionId: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating whether detailed highway types should be returned. If this is set, the CONTROLLED_ACCESS_HIGHWAY type may be returned. If not, then these highways will have the
      * generic HIGHWAY type. This exists for backwards compatibility reasons.
      */
    var enableDetailedHighwayTypes: js.UndefOr[Boolean] = js.undefined
    
    /** Flag indicating whether human-readable names should be returned for features. If this is set, the display_name field on the feature will be filled out. */
    var enableFeatureNames: js.UndefOr[Boolean] = js.undefined
    
    /** Flag indicating whether 3D building models should be enabled. If this is set structures will be returned as 3D modeled volumes rather than 2.5D extruded areas where possible. */
    var enableModeledVolumes: js.UndefOr[Boolean] = js.undefined
    
    /** Flag indicating whether political features should be returned. */
    var enablePoliticalFeatures: js.UndefOr[Boolean] = js.undefined
    
    /** Flag indicating whether the returned tile will contain road features that are marked private. Private roads are indicated by the Feature.segment_info.road_info.is_private field. */
    var enablePrivateRoads: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag indicating whether unclipped buildings should be returned. If this is set, building render ops will extend beyond the tile boundary. Buildings will only be returned on the
      * tile that contains their centroid.
      */
    var enableUnclippedBuildings: js.UndefOr[Boolean] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Required. The BCP-47 language code corresponding to the language in which the name was requested, such as "en-US" or "sr-Latn". For more information, see
      * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
      */
    var languageCode: js.UndefOr[String] = js.undefined
    
    /**
      * Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `tiles/` followed by the resource ID, which encodes the tile's global x and y
      * coordinates and zoom level as `@,,z`. For example, `tiles/@1,2,3z`.
      */
    var name: String
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /**
      * Required. The Unicode country/region code (CLDR) of the location from which the request is coming from, such as "US" and "419". For more information, see
      * http://www.unicode.org/reports/tr35/#unicode_region_subtag.
      */
    var regionCode: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    inline def apply(name: String): Accesstoken = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
      
      inline def setAlwaysIncludeBuildingFootprints(value: Boolean): Self = StObject.set(x, "alwaysIncludeBuildingFootprints", value.asInstanceOf[js.Any])
      
      inline def setAlwaysIncludeBuildingFootprintsUndefined: Self = StObject.set(x, "alwaysIncludeBuildingFootprints", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClientInfoDotapiClient(value: String): Self = StObject.set(x, "clientInfo.apiClient", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapiClientUndefined: Self = StObject.set(x, "clientInfo.apiClient", js.undefined)
      
      inline def setClientInfoDotapplicationId(value: String): Self = StObject.set(x, "clientInfo.applicationId", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapplicationIdUndefined: Self = StObject.set(x, "clientInfo.applicationId", js.undefined)
      
      inline def setClientInfoDotapplicationVersion(value: String): Self = StObject.set(x, "clientInfo.applicationVersion", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapplicationVersionUndefined: Self = StObject.set(x, "clientInfo.applicationVersion", js.undefined)
      
      inline def setClientInfoDotdeviceModel(value: String): Self = StObject.set(x, "clientInfo.deviceModel", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotdeviceModelUndefined: Self = StObject.set(x, "clientInfo.deviceModel", js.undefined)
      
      inline def setClientInfoDotoperatingSystem(value: String): Self = StObject.set(x, "clientInfo.operatingSystem", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotoperatingSystemUndefined: Self = StObject.set(x, "clientInfo.operatingSystem", js.undefined)
      
      inline def setClientInfoDotplatform(value: String): Self = StObject.set(x, "clientInfo.platform", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotplatformUndefined: Self = StObject.set(x, "clientInfo.platform", js.undefined)
      
      inline def setClientInfoDotuserId(value: String): Self = StObject.set(x, "clientInfo.userId", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotuserIdUndefined: Self = StObject.set(x, "clientInfo.userId", js.undefined)
      
      inline def setClientTileVersionId(value: String): Self = StObject.set(x, "clientTileVersionId", value.asInstanceOf[js.Any])
      
      inline def setClientTileVersionIdUndefined: Self = StObject.set(x, "clientTileVersionId", js.undefined)
      
      inline def setEnableDetailedHighwayTypes(value: Boolean): Self = StObject.set(x, "enableDetailedHighwayTypes", value.asInstanceOf[js.Any])
      
      inline def setEnableDetailedHighwayTypesUndefined: Self = StObject.set(x, "enableDetailedHighwayTypes", js.undefined)
      
      inline def setEnableFeatureNames(value: Boolean): Self = StObject.set(x, "enableFeatureNames", value.asInstanceOf[js.Any])
      
      inline def setEnableFeatureNamesUndefined: Self = StObject.set(x, "enableFeatureNames", js.undefined)
      
      inline def setEnableModeledVolumes(value: Boolean): Self = StObject.set(x, "enableModeledVolumes", value.asInstanceOf[js.Any])
      
      inline def setEnableModeledVolumesUndefined: Self = StObject.set(x, "enableModeledVolumes", js.undefined)
      
      inline def setEnablePoliticalFeatures(value: Boolean): Self = StObject.set(x, "enablePoliticalFeatures", value.asInstanceOf[js.Any])
      
      inline def setEnablePoliticalFeaturesUndefined: Self = StObject.set(x, "enablePoliticalFeatures", js.undefined)
      
      inline def setEnablePrivateRoads(value: Boolean): Self = StObject.set(x, "enablePrivateRoads", value.asInstanceOf[js.Any])
      
      inline def setEnablePrivateRoadsUndefined: Self = StObject.set(x, "enablePrivateRoads", js.undefined)
      
      inline def setEnableUnclippedBuildings(value: Boolean): Self = StObject.set(x, "enableUnclippedBuildings", value.asInstanceOf[js.Any])
      
      inline def setEnableUnclippedBuildingsUndefined: Self = StObject.set(x, "enableUnclippedBuildings", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
      
      inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
      
      inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Alt extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** The precision of terrain altitudes in centimeters. Possible values: between 1 (cm level precision) and 1,000,000 (10-kilometer level precision). */
    var altitudePrecisionCentimeters: js.UndefOr[Double] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** API client name and version. For example, the SDK calling the API. The exact format is up to the client. */
    @JSName("clientInfo.apiClient")
    var clientInfoDotapiClient: js.UndefOr[String] = js.undefined
    
    /** Application ID, such as the package name on Android and the bundle identifier on iOS platforms. */
    @JSName("clientInfo.applicationId")
    var clientInfoDotapplicationId: js.UndefOr[String] = js.undefined
    
    /** Application version number, such as "1.2.3". The exact format is application-dependent. */
    @JSName("clientInfo.applicationVersion")
    var clientInfoDotapplicationVersion: js.UndefOr[String] = js.undefined
    
    /** Device model as reported by the device. The exact format is platform-dependent. */
    @JSName("clientInfo.deviceModel")
    var clientInfoDotdeviceModel: js.UndefOr[String] = js.undefined
    
    /** Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent. */
    @JSName("clientInfo.operatingSystem")
    var clientInfoDotoperatingSystem: js.UndefOr[String] = js.undefined
    
    /** Platform where the application is running. */
    @JSName("clientInfo.platform")
    var clientInfoDotplatform: js.UndefOr[String] = js.undefined
    
    /**
      * Required. A client-generated user ID. The ID should be generated and persisted during the first user session or whenever a pre-existing ID is not found. The exact format is up
      * to the client. This must be non-empty in a GetFeatureTileRequest (whether via the header or GetFeatureTileRequest.client_info).
      */
    @JSName("clientInfo.userId")
    var clientInfoDotuserId: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum allowed resolution for the returned elevation heightmap. Possible values: between 1 and 1024 (and not less than min_elevation_resolution_cells). Over-sized
      * heightmaps will be non-uniformly down-sampled such that each edge is no longer than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example:
      * Original resolution: 100px (width) * 30px (height) max_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
      */
    var maxElevationResolutionCells: js.UndefOr[Double] = js.undefined
    
    /**
      * api-linter: core::0131::request-unknown-fields=disabled aip.dev/not-precedent: Maintaining existing request parameter pattern. The minimum allowed resolution for the returned
      * elevation heightmap. Possible values: between 0 and 1024 (and not more than max_elevation_resolution_cells). Zero is supported for backward compatibility. Under-sized heightmaps
      * will be non-uniformly up-sampled such that each edge is no shorter than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example: Original
      * resolution: 30px (width) * 10px (height) min_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
      */
    var minElevationResolutionCells: js.UndefOr[Double] = js.undefined
    
    /**
      * Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `terraintiles/` followed by the resource ID, which encodes the tile's global x and y
      * coordinates and zoom level as `@,,z`. For example, `terraintiles/@1,2,3z`.
      */
    var name: String
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Terrain formats that the client understands. */
    var terrainFormats: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Alt {
    
    inline def apply(name: String): Alt = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAltitudePrecisionCentimeters(value: Double): Self = StObject.set(x, "altitudePrecisionCentimeters", value.asInstanceOf[js.Any])
      
      inline def setAltitudePrecisionCentimetersUndefined: Self = StObject.set(x, "altitudePrecisionCentimeters", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClientInfoDotapiClient(value: String): Self = StObject.set(x, "clientInfo.apiClient", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapiClientUndefined: Self = StObject.set(x, "clientInfo.apiClient", js.undefined)
      
      inline def setClientInfoDotapplicationId(value: String): Self = StObject.set(x, "clientInfo.applicationId", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapplicationIdUndefined: Self = StObject.set(x, "clientInfo.applicationId", js.undefined)
      
      inline def setClientInfoDotapplicationVersion(value: String): Self = StObject.set(x, "clientInfo.applicationVersion", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotapplicationVersionUndefined: Self = StObject.set(x, "clientInfo.applicationVersion", js.undefined)
      
      inline def setClientInfoDotdeviceModel(value: String): Self = StObject.set(x, "clientInfo.deviceModel", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotdeviceModelUndefined: Self = StObject.set(x, "clientInfo.deviceModel", js.undefined)
      
      inline def setClientInfoDotoperatingSystem(value: String): Self = StObject.set(x, "clientInfo.operatingSystem", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotoperatingSystemUndefined: Self = StObject.set(x, "clientInfo.operatingSystem", js.undefined)
      
      inline def setClientInfoDotplatform(value: String): Self = StObject.set(x, "clientInfo.platform", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotplatformUndefined: Self = StObject.set(x, "clientInfo.platform", js.undefined)
      
      inline def setClientInfoDotuserId(value: String): Self = StObject.set(x, "clientInfo.userId", value.asInstanceOf[js.Any])
      
      inline def setClientInfoDotuserIdUndefined: Self = StObject.set(x, "clientInfo.userId", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxElevationResolutionCells(value: Double): Self = StObject.set(x, "maxElevationResolutionCells", value.asInstanceOf[js.Any])
      
      inline def setMaxElevationResolutionCellsUndefined: Self = StObject.set(x, "maxElevationResolutionCells", js.undefined)
      
      inline def setMinElevationResolutionCells(value: Double): Self = StObject.set(x, "minElevationResolutionCells", value.asInstanceOf[js.Any])
      
      inline def setMinElevationResolutionCellsUndefined: Self = StObject.set(x, "minElevationResolutionCells", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      inline def setTerrainFormats(value: String | js.Array[String]): Self = StObject.set(x, "terrainFormats", value.asInstanceOf[js.Any])
      
      inline def setTerrainFormatsUndefined: Self = StObject.set(x, "terrainFormats", js.undefined)
      
      inline def setTerrainFormatsVarargs(value: String*): Self = StObject.set(x, "terrainFormats", js.Array(value*))
      
      inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
