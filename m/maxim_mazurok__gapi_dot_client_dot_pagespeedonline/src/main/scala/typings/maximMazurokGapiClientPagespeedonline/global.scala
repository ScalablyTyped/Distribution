package typings.maximMazurokGapiClientPagespeedonline

import typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedapiResource
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.pagespeedonline
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.v5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load PageSpeed Insights API v5 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pagespeedonline, version: v5): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: pagespeedonline, version: v5, callback: js.Function0[_]): Unit = js.native
      
      object pagespeedonline {
        
        @JSGlobal("gapi.client.pagespeedonline.pagespeedapi")
        @js.native
        val pagespeedapi: PagespeedapiResource = js.native
      }
    }
  }
}
