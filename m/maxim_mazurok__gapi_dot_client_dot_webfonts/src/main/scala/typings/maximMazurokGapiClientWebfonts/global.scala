package typings.maximMazurokGapiClientWebfonts

import typings.maximMazurokGapiClientWebfonts.gapi.client.webfonts.WebfontsResource
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.v1
import typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.webfonts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Web Fonts Developer API v1 */
      @scala.inline
      def load(name: webfonts, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: webfonts, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object webfonts {
        
        @JSGlobal("gapi.client.webfonts.webfonts")
        @js.native
        val webfonts: WebfontsResource = js.native
      }
    }
  }
}
