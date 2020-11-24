package typings.maximMazurokGapiClientSts

import typings.maximMazurokGapiClientSts.gapi.client.sts.V1Resource
import typings.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.sts
import typings.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.v1
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
      
      /** Load Security Token Service API v1 */
      def load(name: sts, version: v1): js.Thenable[Unit] = js.native
      def load(name: sts, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object sts extends js.Object {
        
        val v1: V1Resource = js.native
      }
    }
  }
}
