package typings.maximMazurokGapiClientPoly

import typings.maximMazurokGapiClientPoly.gapi.client.poly.AssetsResource
import typings.maximMazurokGapiClientPoly.gapi.client.poly.UsersResource
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.poly
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Poly API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: poly, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: poly, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object poly {
        
        @JSGlobal("gapi.client.poly.assets")
        @js.native
        val assets: AssetsResource = js.native
        
        @JSGlobal("gapi.client.poly.users")
        @js.native
        val users: UsersResource = js.native
      }
    }
  }
}
