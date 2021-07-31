package typings.maximMazurokGapiClientPlayablelocations

import typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations.V3Resource
import typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.playablelocations
import typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Playable Locations API v3 */
      @scala.inline
      def load(name: playablelocations, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: playablelocations, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object playablelocations {
        
        @JSGlobal("gapi.client.playablelocations.v3")
        @js.native
        val v3: V3Resource = js.native
      }
    }
  }
}
