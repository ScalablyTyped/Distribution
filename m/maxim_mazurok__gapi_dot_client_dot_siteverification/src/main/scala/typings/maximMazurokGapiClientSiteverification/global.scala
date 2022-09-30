package typings.maximMazurokGapiClientSiteverification

import typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification.WebResourceResource
import typings.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.siteverification
import typings.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.v1
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
      
      /** Load Google Site Verification API v1 */
      inline def load(name: siteverification, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: siteverification, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object siteverification {
        
        @JSGlobal("gapi.client.siteverification.webResource")
        @js.native
        val webResource: WebResourceResource = js.native
      }
    }
  }
}
