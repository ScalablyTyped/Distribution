package typings.maximMazurokGapiClientKgsearch

import typings.maximMazurokGapiClientKgsearch.gapi.client.kgsearch.EntitiesResource
import typings.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.kgsearch
import typings.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.v1
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
      
      /** Load Knowledge Graph Search API v1 */
      def load(name: kgsearch, version: v1): js.Thenable[Unit] = js.native
      def load(name: kgsearch, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object kgsearch extends js.Object {
        
        val entities: EntitiesResource = js.native
      }
    }
  }
}
