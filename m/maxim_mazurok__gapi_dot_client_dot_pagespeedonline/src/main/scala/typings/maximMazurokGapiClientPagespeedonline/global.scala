package typings.maximMazurokGapiClientPagespeedonline

import typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedapiResource
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.pagespeedonline
import typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.v5
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load PageSpeed Insights API v5 */
      inline def load(name: pagespeedonline, version: v5): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: pagespeedonline, version: v5, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object pagespeedonline {
        
        @JSGlobal("gapi.client.pagespeedonline.pagespeedapi")
        @js.native
        val pagespeedapi: PagespeedapiResource = js.native
      }
    }
  }
}
