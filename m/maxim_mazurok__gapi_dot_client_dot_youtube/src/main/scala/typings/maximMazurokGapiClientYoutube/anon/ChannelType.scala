package typings.maximMazurokGapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelType extends js.Object {
  
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
  implicit class ChannelTypeOps[Self <: ChannelType] (val x: Self) extends AnyVal {
    
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
    def setPartVarargs(value: String*): Self = this.set("part", js.Array(value :_*))
    
    @scala.inline
    def setPart(value: String | js.Array[String]): Self = this.set("part", value.asInstanceOf[js.Any])
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setForContentOwner(value: Boolean): Self = this.set("forContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForContentOwner: Self = this.set("forContentOwner", js.undefined)
    
    @scala.inline
    def setForDeveloper(value: Boolean): Self = this.set("forDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForDeveloper: Self = this.set("forDeveloper", js.undefined)
    
    @scala.inline
    def setForMine(value: Boolean): Self = this.set("forMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForMine: Self = this.set("forMine", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationRadius(value: String): Self = this.set("locationRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationRadius: Self = this.set("locationRadius", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setPublishedAfter(value: String): Self = this.set("publishedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAfter: Self = this.set("publishedAfter", js.undefined)
    
    @scala.inline
    def setPublishedBefore(value: String): Self = this.set("publishedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedBefore: Self = this.set("publishedBefore", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setRelatedToVideoId(value: String): Self = this.set("relatedToVideoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedToVideoId: Self = this.set("relatedToVideoId", js.undefined)
    
    @scala.inline
    def setRelevanceLanguage(value: String): Self = this.set("relevanceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevanceLanguage: Self = this.set("relevanceLanguage", js.undefined)
    
    @scala.inline
    def setSafeSearch(value: String): Self = this.set("safeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeSearch: Self = this.set("safeSearch", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = this.set("topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicId: Self = this.set("topicId", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    
    @scala.inline
    def setVideoCaption(value: String): Self = this.set("videoCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCaption: Self = this.set("videoCaption", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = this.set("videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCategoryId: Self = this.set("videoCategoryId", js.undefined)
    
    @scala.inline
    def setVideoDefinition(value: String): Self = this.set("videoDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDefinition: Self = this.set("videoDefinition", js.undefined)
    
    @scala.inline
    def setVideoDimension(value: String): Self = this.set("videoDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDimension: Self = this.set("videoDimension", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: String): Self = this.set("videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDuration: Self = this.set("videoDuration", js.undefined)
    
    @scala.inline
    def setVideoEmbeddable(value: String): Self = this.set("videoEmbeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoEmbeddable: Self = this.set("videoEmbeddable", js.undefined)
    
    @scala.inline
    def setVideoLicense(value: String): Self = this.set("videoLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoLicense: Self = this.set("videoLicense", js.undefined)
    
    @scala.inline
    def setVideoSyndicated(value: String): Self = this.set("videoSyndicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSyndicated: Self = this.set("videoSyndicated", js.undefined)
    
    @scala.inline
    def setVideoType(value: String): Self = this.set("videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoType: Self = this.set("videoType", js.undefined)
  }
}
