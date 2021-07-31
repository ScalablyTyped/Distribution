package typings.maximMazurokGapiClientYoutubereporting

import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.JobsResource
import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.MediaResource
import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.ReportTypesResource
import typings.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.v1
import typings.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.youtubereporting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load YouTube Reporting API v1 */
      @scala.inline
      def load(name: youtubereporting, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: youtubereporting, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object youtubereporting {
        
        @JSGlobal("gapi.client.youtubereporting.jobs")
        @js.native
        val jobs: JobsResource = js.native
        
        @JSGlobal("gapi.client.youtubereporting.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.youtubereporting.reportTypes")
        @js.native
        val reportTypes: ReportTypesResource = js.native
      }
    }
  }
}
