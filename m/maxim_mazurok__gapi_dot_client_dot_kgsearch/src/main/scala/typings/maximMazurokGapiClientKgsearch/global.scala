package typings.maximMazurokGapiClientKgsearch

import typings.maximMazurokGapiClientKgsearch.gapi.client.kgsearch.EntitiesResource
import typings.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.kgsearch
import typings.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object kgsearch {
        
        @JSGlobal("gapi.client.kgsearch.entities")
        @js.native
        val entities: EntitiesResource = js.native
      }
      
      /** Load Knowledge Graph Search API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: kgsearch, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: kgsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
