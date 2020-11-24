package typings.maximMazurokGapiClientGroupssettings

import typings.maximMazurokGapiClientGroupssettings.gapi.client.groupssettings.GroupsResource
import typings.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.groupssettings
import typings.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.v1
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
      
      /** Load Groups Settings API v1 */
      def load(name: groupssettings, version: v1): js.Thenable[Unit] = js.native
      def load(name: groupssettings, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object groupssettings extends js.Object {
        
        val groups: GroupsResource = js.native
      }
    }
  }
}
