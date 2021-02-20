package typings.maximMazurokGapiClientIndexing

import typings.maximMazurokGapiClientIndexing.gapi.client.indexing.UrlNotificationsResource
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.indexing
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object indexing {
        
        @JSGlobal("gapi.client.indexing.urlNotifications")
        @js.native
        val urlNotifications: UrlNotificationsResource = js.native
      }
      
      /** Load Indexing API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: indexing, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: indexing, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
