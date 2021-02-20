package typings.maximMazurokGapiClientYoutubereporting

import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.JobsResource
import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.MediaResource
import typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.ReportTypesResource
import typings.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.v1
import typings.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.youtubereporting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load YouTube Reporting API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: youtubereporting, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: youtubereporting, version: v1, callback: js.Function0[_]): Unit = js.native
      
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
