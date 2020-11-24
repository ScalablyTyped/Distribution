package typings.maximMazurokGapiClientPoly

import typings.maximMazurokGapiClientPoly.gapi.client.poly.AssetsResource
import typings.maximMazurokGapiClientPoly.gapi.client.poly.UsersResource
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.poly
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.v1
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
      
      /** Load Poly API v1 */
      def load(name: poly, version: v1): js.Thenable[Unit] = js.native
      def load(name: poly, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object poly extends js.Object {
        
        val assets: AssetsResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
