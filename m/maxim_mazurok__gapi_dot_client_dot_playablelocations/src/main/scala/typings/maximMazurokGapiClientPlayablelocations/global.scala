package typings.maximMazurokGapiClientPlayablelocations

import typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations.V3Resource
import typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.playablelocations
import typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Playable Locations API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: playablelocations, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: playablelocations, version: v3, callback: js.Function0[_]): Unit = js.native
      
      object playablelocations {
        
        @JSGlobal("gapi.client.playablelocations.v3")
        @js.native
        val v3: V3Resource = js.native
      }
    }
  }
}
