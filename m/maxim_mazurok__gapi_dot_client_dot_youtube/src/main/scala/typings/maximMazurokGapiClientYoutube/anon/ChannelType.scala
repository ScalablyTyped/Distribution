package typings.maximMazurokGapiClientYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelType extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Filter on resources belonging to this channelId. */
  var channelId: js.UndefOr[String] = js.native
  
  /** Add a filter on the channel search. */
  var channelType: js.UndefOr[String] = js.native
  
  /** Filter on the livestream status of the videos. */
  var eventType: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Search owned by a content owner. */
  var forContentOwner: js.UndefOr[Boolean] = js.native
  
  /** Restrict the search to only retrieve videos uploaded using the project id of the authenticated user. */
  var forDeveloper: js.UndefOr[Boolean] = js.native
  
  /** Search for the private videos of the authenticated user. */
  var forMine: js.UndefOr[Boolean] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Filter on location of the video */
  var location: js.UndefOr[String] = js.native
  
  /** Filter on distance from the location (specified above). */
  var locationRadius: js.UndefOr[String] = js.native
  
  /** The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials
    * identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide
    * authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /** Sort order of the results. */
  var order: js.UndefOr[String] = js.native
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other
    * pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** The *part* parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet. */
  var part: String | js.Array[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Filter on resources published after this date. */
  var publishedAfter: js.UndefOr[String] = js.native
  
  /** Filter on resources published before this date. */
  var publishedBefore: js.UndefOr[String] = js.native
  
  /** Textual search terms to match. */
  var q: js.UndefOr[String] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Display the content as seen by viewers in this country. */
  var regionCode: js.UndefOr[String] = js.native
  
  /** Search related to a resource. */
  var relatedToVideoId: js.UndefOr[String] = js.native
  
  /** Return results relevant to this language. */
  var relevanceLanguage: js.UndefOr[String] = js.native
  
  /** Indicates whether the search results should include restricted content as well as standard content. */
  var safeSearch: js.UndefOr[String] = js.native
  
  /** Restrict results to a particular topic. */
  var topicId: js.UndefOr[String] = js.native
  
  /** Restrict results to a particular set of resource types from One Platform. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /** Filter on the presence of captions on the videos. */
  var videoCaption: js.UndefOr[String] = js.native
  
  /** Filter on videos in a specific category. */
  var videoCategoryId: js.UndefOr[String] = js.native
  
  /** Filter on the definition of the videos. */
  var videoDefinition: js.UndefOr[String] = js.native
  
  /** Filter on 3d videos. */
  var videoDimension: js.UndefOr[String] = js.native
  
  /** Filter on the duration of the videos. */
  var videoDuration: js.UndefOr[String] = js.native
  
  /** Filter on embeddable videos. */
  var videoEmbeddable: js.UndefOr[String] = js.native
  
  /** Filter on the license of the videos. */
  var videoLicense: js.UndefOr[String] = js.native
  
  /** Filter on syndicated videos. */
  var videoSyndicated: js.UndefOr[String] = js.native
  
  /** Filter on videos of a specific type. */
  var videoType: js.UndefOr[String] = js.native
}
object ChannelType {
  
  @scala.inline
  def apply(part: String | js.Array[String]): ChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelType]
  }
  
  @scala.inline
  implicit class ChannelTypeMutableBuilder[Self <: ChannelType] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setForContentOwner(value: Boolean): Self = StObject.set(x, "forContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForContentOwnerUndefined: Self = StObject.set(x, "forContentOwner", js.undefined)
    
    @scala.inline
    def setForDeveloper(value: Boolean): Self = StObject.set(x, "forDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForDeveloperUndefined: Self = StObject.set(x, "forDeveloper", js.undefined)
    
    @scala.inline
    def setForMine(value: Boolean): Self = StObject.set(x, "forMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForMineUndefined: Self = StObject.set(x, "forMine", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationRadius(value: String): Self = StObject.set(x, "locationRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationRadiusUndefined: Self = StObject.set(x, "locationRadius", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String | js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value :_*))
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setPublishedAfter(value: String): Self = StObject.set(x, "publishedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAfterUndefined: Self = StObject.set(x, "publishedAfter", js.undefined)
    
    @scala.inline
    def setPublishedBefore(value: String): Self = StObject.set(x, "publishedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedBeforeUndefined: Self = StObject.set(x, "publishedBefore", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setRelatedToVideoId(value: String): Self = StObject.set(x, "relatedToVideoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedToVideoIdUndefined: Self = StObject.set(x, "relatedToVideoId", js.undefined)
    
    @scala.inline
    def setRelevanceLanguage(value: String): Self = StObject.set(x, "relevanceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceLanguageUndefined: Self = StObject.set(x, "relevanceLanguage", js.undefined)
    
    @scala.inline
    def setSafeSearch(value: String): Self = StObject.set(x, "safeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeSearchUndefined: Self = StObject.set(x, "safeSearch", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    @scala.inline
    def setVideoCaption(value: String): Self = StObject.set(x, "videoCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCaptionUndefined: Self = StObject.set(x, "videoCaption", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = StObject.set(x, "videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCategoryIdUndefined: Self = StObject.set(x, "videoCategoryId", js.undefined)
    
    @scala.inline
    def setVideoDefinition(value: String): Self = StObject.set(x, "videoDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDefinitionUndefined: Self = StObject.set(x, "videoDefinition", js.undefined)
    
    @scala.inline
    def setVideoDimension(value: String): Self = StObject.set(x, "videoDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDimensionUndefined: Self = StObject.set(x, "videoDimension", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: String): Self = StObject.set(x, "videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDurationUndefined: Self = StObject.set(x, "videoDuration", js.undefined)
    
    @scala.inline
    def setVideoEmbeddable(value: String): Self = StObject.set(x, "videoEmbeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEmbeddableUndefined: Self = StObject.set(x, "videoEmbeddable", js.undefined)
    
    @scala.inline
    def setVideoLicense(value: String): Self = StObject.set(x, "videoLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoLicenseUndefined: Self = StObject.set(x, "videoLicense", js.undefined)
    
    @scala.inline
    def setVideoSyndicated(value: String): Self = StObject.set(x, "videoSyndicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSyndicatedUndefined: Self = StObject.set(x, "videoSyndicated", js.undefined)
    
    @scala.inline
    def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTypeUndefined: Self = StObject.set(x, "videoType", js.undefined)
  }
}
