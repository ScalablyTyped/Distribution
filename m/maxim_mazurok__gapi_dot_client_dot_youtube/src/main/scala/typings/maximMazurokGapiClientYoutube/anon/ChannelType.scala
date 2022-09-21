package typings.maximMazurokGapiClientYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelType extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Filter on resources belonging to this channelId. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Add a filter on the channel search. */
  var channelType: js.UndefOr[String] = js.undefined
  
  /** Filter on the livestream status of the videos. */
  var eventType: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Search owned by a content owner. */
  var forContentOwner: js.UndefOr[Boolean] = js.undefined
  
  /** Restrict the search to only retrieve videos uploaded using the project id of the authenticated user. */
  var forDeveloper: js.UndefOr[Boolean] = js.undefined
  
  /** Search for the private videos of the authenticated user. */
  var forMine: js.UndefOr[Boolean] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Filter on location of the video */
  var location: js.UndefOr[String] = js.undefined
  
  /** Filter on distance from the location (specified above). */
  var locationRadius: js.UndefOr[String] = js.undefined
  
  /** The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials
    * identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide
    * authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /** Sort order of the results. */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other
    * pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** The *part* parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet. */
  var part: String | js.Array[String]
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Filter on resources published after this date. */
  var publishedAfter: js.UndefOr[String] = js.undefined
  
  /** Filter on resources published before this date. */
  var publishedBefore: js.UndefOr[String] = js.undefined
  
  /** Textual search terms to match. */
  var q: js.UndefOr[String] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Display the content as seen by viewers in this country. */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /** Search related to a resource. */
  var relatedToVideoId: js.UndefOr[String] = js.undefined
  
  /** Return results relevant to this language. */
  var relevanceLanguage: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the search results should include restricted content as well as standard content. */
  var safeSearch: js.UndefOr[String] = js.undefined
  
  /** Restrict results to a particular topic. */
  var topicId: js.UndefOr[String] = js.undefined
  
  /** Restrict results to a particular set of resource types from One Platform. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  
  /** Filter on the presence of captions on the videos. */
  var videoCaption: js.UndefOr[String] = js.undefined
  
  /** Filter on videos in a specific category. */
  var videoCategoryId: js.UndefOr[String] = js.undefined
  
  /** Filter on the definition of the videos. */
  var videoDefinition: js.UndefOr[String] = js.undefined
  
  /** Filter on 3d videos. */
  var videoDimension: js.UndefOr[String] = js.undefined
  
  /** Filter on the duration of the videos. */
  var videoDuration: js.UndefOr[String] = js.undefined
  
  /** Filter on embeddable videos. */
  var videoEmbeddable: js.UndefOr[String] = js.undefined
  
  /** Filter on the license of the videos. */
  var videoLicense: js.UndefOr[String] = js.undefined
  
  /** Filter on syndicated videos. */
  var videoSyndicated: js.UndefOr[String] = js.undefined
  
  /** Filter on videos of a specific type. */
  var videoType: js.UndefOr[String] = js.undefined
}
object ChannelType {
  
  inline def apply(part: String | js.Array[String]): ChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelType]
  }
  
  extension [Self <: ChannelType](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setForContentOwner(value: Boolean): Self = StObject.set(x, "forContentOwner", value.asInstanceOf[js.Any])
    
    inline def setForContentOwnerUndefined: Self = StObject.set(x, "forContentOwner", js.undefined)
    
    inline def setForDeveloper(value: Boolean): Self = StObject.set(x, "forDeveloper", value.asInstanceOf[js.Any])
    
    inline def setForDeveloperUndefined: Self = StObject.set(x, "forDeveloper", js.undefined)
    
    inline def setForMine(value: Boolean): Self = StObject.set(x, "forMine", value.asInstanceOf[js.Any])
    
    inline def setForMineUndefined: Self = StObject.set(x, "forMine", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationRadius(value: String): Self = StObject.set(x, "locationRadius", value.asInstanceOf[js.Any])
    
    inline def setLocationRadiusUndefined: Self = StObject.set(x, "locationRadius", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: String | js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setPublishedAfter(value: String): Self = StObject.set(x, "publishedAfter", value.asInstanceOf[js.Any])
    
    inline def setPublishedAfterUndefined: Self = StObject.set(x, "publishedAfter", js.undefined)
    
    inline def setPublishedBefore(value: String): Self = StObject.set(x, "publishedBefore", value.asInstanceOf[js.Any])
    
    inline def setPublishedBeforeUndefined: Self = StObject.set(x, "publishedBefore", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setRelatedToVideoId(value: String): Self = StObject.set(x, "relatedToVideoId", value.asInstanceOf[js.Any])
    
    inline def setRelatedToVideoIdUndefined: Self = StObject.set(x, "relatedToVideoId", js.undefined)
    
    inline def setRelevanceLanguage(value: String): Self = StObject.set(x, "relevanceLanguage", value.asInstanceOf[js.Any])
    
    inline def setRelevanceLanguageUndefined: Self = StObject.set(x, "relevanceLanguage", js.undefined)
    
    inline def setSafeSearch(value: String): Self = StObject.set(x, "safeSearch", value.asInstanceOf[js.Any])
    
    inline def setSafeSearchUndefined: Self = StObject.set(x, "safeSearch", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    inline def setVideoCaption(value: String): Self = StObject.set(x, "videoCaption", value.asInstanceOf[js.Any])
    
    inline def setVideoCaptionUndefined: Self = StObject.set(x, "videoCaption", js.undefined)
    
    inline def setVideoCategoryId(value: String): Self = StObject.set(x, "videoCategoryId", value.asInstanceOf[js.Any])
    
    inline def setVideoCategoryIdUndefined: Self = StObject.set(x, "videoCategoryId", js.undefined)
    
    inline def setVideoDefinition(value: String): Self = StObject.set(x, "videoDefinition", value.asInstanceOf[js.Any])
    
    inline def setVideoDefinitionUndefined: Self = StObject.set(x, "videoDefinition", js.undefined)
    
    inline def setVideoDimension(value: String): Self = StObject.set(x, "videoDimension", value.asInstanceOf[js.Any])
    
    inline def setVideoDimensionUndefined: Self = StObject.set(x, "videoDimension", js.undefined)
    
    inline def setVideoDuration(value: String): Self = StObject.set(x, "videoDuration", value.asInstanceOf[js.Any])
    
    inline def setVideoDurationUndefined: Self = StObject.set(x, "videoDuration", js.undefined)
    
    inline def setVideoEmbeddable(value: String): Self = StObject.set(x, "videoEmbeddable", value.asInstanceOf[js.Any])
    
    inline def setVideoEmbeddableUndefined: Self = StObject.set(x, "videoEmbeddable", js.undefined)
    
    inline def setVideoLicense(value: String): Self = StObject.set(x, "videoLicense", value.asInstanceOf[js.Any])
    
    inline def setVideoLicenseUndefined: Self = StObject.set(x, "videoLicense", js.undefined)
    
    inline def setVideoSyndicated(value: String): Self = StObject.set(x, "videoSyndicated", value.asInstanceOf[js.Any])
    
    inline def setVideoSyndicatedUndefined: Self = StObject.set(x, "videoSyndicated", js.undefined)
    
    inline def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
    
    inline def setVideoTypeUndefined: Self = StObject.set(x, "videoType", js.undefined)
  }
}
