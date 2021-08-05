package typings.maximMazurokGapiClientIndexing

import typings.maximMazurokGapiClientIndexing.gapi.client.indexing.UrlNotificationsResource
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.indexing
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object indexing {
        
        @JSGlobal("gapi.client.indexing.urlNotifications")
        @js.native
        val urlNotifications: UrlNotificationsResource = js.native
      }
      
      /** Load Indexing API v3 */
      inline def load(name: indexing, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: indexing, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
