package typings.maximMazurokGapiClientYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForChannelId extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Return the subscriptions of the given channel owner. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Return the subscriptions to the subset of these channels that the authenticated user is subscribed to. */
  var forChannelId: js.UndefOr[String] = js.undefined
  
  /** Return the subscriptions with the given IDs for Stubby or Apiary. */
  var id: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** Flag for returning the subscriptions of the authenticated user. */
  var mine: js.UndefOr[Boolean] = js.undefined
  
  var myRecentSubscribers: js.UndefOr[Boolean] = js.undefined
  
  /** Return the subscribers of the given channel owner. */
  var mySubscribers: js.UndefOr[Boolean] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials
    * identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide
    * authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The
    * *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a
    * value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that
    * is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be
    * linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different
    * YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide
    * authentication credentials for each separate channel.
    */
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.undefined
  
  /** The order of the returned subscriptions */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other
    * pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include. If the parameter identifies a property
    * that contains child properties, the child properties will be included in the response. For example, in a subscription resource, the snippet property contains other properties,
    * such as a display title for the subscription. If you set *part=snippet*, the API response will also contain all of those nested properties.
    */
  var part: String | js.Array[String]
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object ForChannelId {
  
  @scala.inline
  def apply(part: String | js.Array[String]): ForChannelId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForChannelId]
  }
  
  @scala.inline
  implicit class ForChannelIdMutableBuilder[Self <: ForChannelId] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setForChannelId(value: String): Self = StObject.set(x, "forChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForChannelIdUndefined: Self = StObject.set(x, "forChannelId", js.undefined)
    
    @scala.inline
    def setId(value: String | js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMine(value: Boolean): Self = StObject.set(x, "mine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineUndefined: Self = StObject.set(x, "mine", js.undefined)
    
    @scala.inline
    def setMyRecentSubscribers(value: Boolean): Self = StObject.set(x, "myRecentSubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyRecentSubscribersUndefined: Self = StObject.set(x, "myRecentSubscribers", js.undefined)
    
    @scala.inline
    def setMySubscribers(value: Boolean): Self = StObject.set(x, "mySubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySubscribersUndefined: Self = StObject.set(x, "mySubscribers", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerChannel(value: String): Self = StObject.set(x, "onBehalfOfContentOwnerChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerChannelUndefined: Self = StObject.set(x, "onBehalfOfContentOwnerChannel", js.undefined)
    
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
  }
}
