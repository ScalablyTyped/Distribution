package typings.maximMazurokGapiClientPoly

import typings.maximMazurokGapiClientPoly.gapi.client.poly.AssetsResource
import typings.maximMazurokGapiClientPoly.gapi.client.poly.UsersResource
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.poly
import typings.maximMazurokGapiClientPoly.maximMazurokGapiClientPolyStrings.v1
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
      
      /** Load Poly API v1 */
      inline def load(name: poly, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: poly, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
