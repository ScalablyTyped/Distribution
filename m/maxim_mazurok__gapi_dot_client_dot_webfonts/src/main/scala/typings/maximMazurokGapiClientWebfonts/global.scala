package typings.maximMazurokGapiClientWebfonts

import typings.maximMazurokGapiClientWebfonts.gapi.client.webfonts.WebfontsResource
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.v1
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.webfonts
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
      
      /** Load Web Fonts Developer API v1 */
      def load(name: webfonts, version: v1): js.Thenable[Unit] = js.native
      def load(name: webfonts, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object webfonts extends js.Object {
        
        val webfonts: WebfontsResource = js.native
      }
    }
  }
}
