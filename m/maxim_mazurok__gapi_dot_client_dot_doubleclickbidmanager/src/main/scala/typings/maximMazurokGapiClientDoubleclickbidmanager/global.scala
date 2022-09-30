package typings.maximMazurokGapiClientDoubleclickbidmanager

import typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typings.maximMazurokGapiClientDoubleclickbidmanager.maximMazurokGapiClientDoubleclickbidmanagerStrings.v2
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
      
      object doubleclickbidmanager {
        
        @JSGlobal("gapi.client.doubleclickbidmanager.queries")
        @js.native
        val queries: QueriesResource = js.native
      }
      
      /** Load DoubleClick Bid Manager API v2 */
      inline def load(name: doubleclickbidmanager, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: doubleclickbidmanager, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
