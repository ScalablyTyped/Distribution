package typings.maximMazurokGapiClientSiteverification

import typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification.WebResourceResource
import typings.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.siteverification
import typings.maximMazurokGapiClientSiteverification.maximMazurokGapiClientSiteverificationStrings.v1
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
      
      /** Load Google Site Verification API v1 */
      def load(name: siteverification, version: v1): js.Thenable[Unit] = js.native
      def load(name: siteverification, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object siteverification extends js.Object {
        
        val webResource: WebResourceResource = js.native
      }
    }
  }
}
