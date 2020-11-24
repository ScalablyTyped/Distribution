package typings.maximMazurokGapiClientYoutube

import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.AbuseReportsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ActivitiesResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.CaptionsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelBannersResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelSectionsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.CommentThreadsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.CommentsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.I18nLanguagesResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.I18nRegionsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveBroadcastsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatBansResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatMessagesResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatModeratorsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveStreamsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.MembersResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.MembershipsLevelsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.PlaylistItemsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.PlaylistsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.SearchResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.SponsorsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.SubscriptionsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.SuperChatEventsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.TestsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ThirdPartyLinksResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.ThumbnailsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.VideoAbuseReportReasonsResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.VideoCategoriesResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.VideosResource
import typings.maximMazurokGapiClientYoutube.gapi.client.youtube.WatermarksResource
import typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.v3
import typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load YouTube Data API v3 v3 */
      def load(name: youtube, version: v3): js.Thenable[Unit] = js.native
      def load(name: youtube, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object youtube extends js.Object {
        
        val abuseReports: AbuseReportsResource = js.native
        
        val activities: ActivitiesResource = js.native
        
        val captions: CaptionsResource = js.native
        
        val channelBanners: ChannelBannersResource = js.native
        
        val channelSections: ChannelSectionsResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val commentThreads: CommentThreadsResource = js.native
        
        val comments: CommentsResource = js.native
        
        val i18nLanguages: I18nLanguagesResource = js.native
        
        val i18nRegions: I18nRegionsResource = js.native
        
        val liveBroadcasts: LiveBroadcastsResource = js.native
        
        val liveChatBans: LiveChatBansResource = js.native
        
        val liveChatMessages: LiveChatMessagesResource = js.native
        
        val liveChatModerators: LiveChatModeratorsResource = js.native
        
        val liveStreams: LiveStreamsResource = js.native
        
        val members: MembersResource = js.native
        
        val membershipsLevels: MembershipsLevelsResource = js.native
        
        val playlistItems: PlaylistItemsResource = js.native
        
        val playlists: PlaylistsResource = js.native
        
        val search: SearchResource = js.native
        
        val sponsors: SponsorsResource = js.native
        
        val subscriptions: SubscriptionsResource = js.native
        
        val superChatEvents: SuperChatEventsResource = js.native
        
        val tests: TestsResource = js.native
        
        val thirdPartyLinks: ThirdPartyLinksResource = js.native
        
        val thumbnails: ThumbnailsResource = js.native
        
        val videoAbuseReportReasons: VideoAbuseReportReasonsResource = js.native
        
        val videoCategories: VideoCategoriesResource = js.native
        
        val videos: VideosResource = js.native
        
        val watermarks: WatermarksResource = js.native
      }
    }
  }
}
