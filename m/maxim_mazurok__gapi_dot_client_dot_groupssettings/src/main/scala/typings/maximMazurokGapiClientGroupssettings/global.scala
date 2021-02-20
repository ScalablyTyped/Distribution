package typings.maximMazurokGapiClientGroupssettings

import typings.maximMazurokGapiClientGroupssettings.gapi.client.groupssettings.GroupsResource
import typings.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.groupssettings
import typings.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object groupssettings {
        
        @JSGlobal("gapi.client.groupssettings.groups")
        @js.native
        val groups: GroupsResource = js.native
      }
      
      /** Load Groups Settings API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: groupssettings, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: groupssettings, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
