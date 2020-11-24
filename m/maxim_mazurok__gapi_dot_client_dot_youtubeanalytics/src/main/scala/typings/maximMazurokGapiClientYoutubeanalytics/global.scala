package typings.maximMazurokGapiClientYoutubeanalytics

import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupItemsResource
import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupsResource
import typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.ReportsResource
import typings.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.v2
import typings.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.youtubeanalytics
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
      
      /** Load YouTube Analytics API v2 */
      def load(name: youtubeanalytics, version: v2): js.Thenable[Unit] = js.native
      def load(name: youtubeanalytics, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object youtubeanalytics extends js.Object {
        
        val groupItems: GroupItemsResource = js.native
        
        val groups: GroupsResource = js.native
        
        val reports: ReportsResource = js.native
      }
    }
  }
}
