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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load YouTube Data API v3 v3 */
      @scala.inline
      def load(name: youtube, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: youtube, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object youtube {
        
        @JSGlobal("gapi.client.youtube.abuseReports")
        @js.native
        val abuseReports: AbuseReportsResource = js.native
        
        @JSGlobal("gapi.client.youtube.activities")
        @js.native
        val activities: ActivitiesResource = js.native
        
        @JSGlobal("gapi.client.youtube.captions")
        @js.native
        val captions: CaptionsResource = js.native
        
        @JSGlobal("gapi.client.youtube.channelBanners")
        @js.native
        val channelBanners: ChannelBannersResource = js.native
        
        @JSGlobal("gapi.client.youtube.channelSections")
        @js.native
        val channelSections: ChannelSectionsResource = js.native
        
        @JSGlobal("gapi.client.youtube.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.youtube.commentThreads")
        @js.native
        val commentThreads: CommentThreadsResource = js.native
        
        @JSGlobal("gapi.client.youtube.comments")
        @js.native
        val comments: CommentsResource = js.native
        
        @JSGlobal("gapi.client.youtube.i18nLanguages")
        @js.native
        val i18nLanguages: I18nLanguagesResource = js.native
        
        @JSGlobal("gapi.client.youtube.i18nRegions")
        @js.native
        val i18nRegions: I18nRegionsResource = js.native
        
        @JSGlobal("gapi.client.youtube.liveBroadcasts")
        @js.native
        val liveBroadcasts: LiveBroadcastsResource = js.native
        
        @JSGlobal("gapi.client.youtube.liveChatBans")
        @js.native
        val liveChatBans: LiveChatBansResource = js.native
        
        @JSGlobal("gapi.client.youtube.liveChatMessages")
        @js.native
        val liveChatMessages: LiveChatMessagesResource = js.native
        
        @JSGlobal("gapi.client.youtube.liveChatModerators")
        @js.native
        val liveChatModerators: LiveChatModeratorsResource = js.native
        
        @JSGlobal("gapi.client.youtube.liveStreams")
        @js.native
        val liveStreams: LiveStreamsResource = js.native
        
        @JSGlobal("gapi.client.youtube.members")
        @js.native
        val members: MembersResource = js.native
        
        @JSGlobal("gapi.client.youtube.membershipsLevels")
        @js.native
        val membershipsLevels: MembershipsLevelsResource = js.native
        
        @JSGlobal("gapi.client.youtube.playlistItems")
        @js.native
        val playlistItems: PlaylistItemsResource = js.native
        
        @JSGlobal("gapi.client.youtube.playlists")
        @js.native
        val playlists: PlaylistsResource = js.native
        
        @JSGlobal("gapi.client.youtube.search")
        @js.native
        val search: SearchResource = js.native
        
        @JSGlobal("gapi.client.youtube.sponsors")
        @js.native
        val sponsors: SponsorsResource = js.native
        
        @JSGlobal("gapi.client.youtube.subscriptions")
        @js.native
        val subscriptions: SubscriptionsResource = js.native
        
        @JSGlobal("gapi.client.youtube.superChatEvents")
        @js.native
        val superChatEvents: SuperChatEventsResource = js.native
        
        @JSGlobal("gapi.client.youtube.tests")
        @js.native
        val tests: TestsResource = js.native
        
        @JSGlobal("gapi.client.youtube.thirdPartyLinks")
        @js.native
        val thirdPartyLinks: ThirdPartyLinksResource = js.native
        
        @JSGlobal("gapi.client.youtube.thumbnails")
        @js.native
        val thumbnails: ThumbnailsResource = js.native
        
        @JSGlobal("gapi.client.youtube.videoAbuseReportReasons")
        @js.native
        val videoAbuseReportReasons: VideoAbuseReportReasonsResource = js.native
        
        @JSGlobal("gapi.client.youtube.videoCategories")
        @js.native
        val videoCategories: VideoCategoriesResource = js.native
        
        @JSGlobal("gapi.client.youtube.videos")
        @js.native
        val videos: VideosResource = js.native
        
        @JSGlobal("gapi.client.youtube.watermarks")
        @js.native
        val watermarks: WatermarksResource = js.native
      }
    }
  }
}
