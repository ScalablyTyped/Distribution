package typings.maximMazurokGapiClientPagespeedonline

import typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedapiResource
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.pagespeedonline
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.v5
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
      
      /** Load PageSpeed Insights API v5 */
      def load(name: pagespeedonline, version: v5): js.Thenable[Unit] = js.native
      def load(name: pagespeedonline, version: v5, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object pagespeedonline extends js.Object {
        
        val pagespeedapi: PagespeedapiResource = js.native
      }
    }
  }
}
