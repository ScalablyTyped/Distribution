package typings.maximMazurokGapiClientWebfonts

import typings.maximMazurokGapiClientWebfonts.gapi.client.webfonts.WebfontsResource
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.v1
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.webfonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Web Fonts Developer API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: webfonts, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: webfonts, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object webfonts {
        
        @JSGlobal("gapi.client.webfonts.webfonts")
        @js.native
        val webfonts: WebfontsResource = js.native
      }
    }
  }
}
