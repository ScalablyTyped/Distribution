package typings.maximMazurokGapiClientLibraryagent

import typings.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent.ShelvesResource
import typings.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.libraryagent
import typings.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object libraryagent {
        
        @JSGlobal("gapi.client.libraryagent.shelves")
        @js.native
        val shelves: ShelvesResource = js.native
      }
      
      /** Load Library Agent API v1 */
      inline def load(name: libraryagent, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: libraryagent, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
