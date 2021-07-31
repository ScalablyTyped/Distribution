package typings.maximMazurokGapiClientYoutubeanalytics

import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupItemsResource
import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupsResource
import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.ReportsResource
import typings.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.v2
import typings.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.youtubeanalytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load YouTube Analytics API v2 */
      @scala.inline
      def load(name: youtubeanalytics, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: youtubeanalytics, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object youtubeanalytics {
        
        @JSGlobal("gapi.client.youtubeanalytics.groupItems")
        @js.native
        val groupItems: GroupItemsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.groups")
        @js.native
        val groups: GroupsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.reports")
        @js.native
        val reports: ReportsResource = js.native
      }
    }
  }
}
