package typings.maximMazurokGapiClientIndexing

import typings.maximMazurokGapiClientIndexing.gapi.client.indexing.UrlNotificationsResource
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.indexing
import typings.maximMazurokGapiClientIndexing.maximMazurokGapiClientIndexingStrings.v3
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
      
      /** Load Indexing API v3 */
      def load(name: indexing, version: v3): js.Thenable[Unit] = js.native
      def load(name: indexing, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object indexing extends js.Object {
        
        val urlNotifications: UrlNotificationsResource = js.native
      }
    }
  }
}
