package typings.maximMazurokGapiClientGroupsmigration

import typings.maximMazurokGapiClientGroupsmigration.gapi.client.groupsmigration.ArchiveResource
import typings.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.groupsmigration
import typings.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object groupsmigration {
        
        @JSGlobal("gapi.client.groupsmigration.archive")
        @js.native
        val archive: ArchiveResource = js.native
      }
      
      /** Load Groups Migration API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: groupsmigration, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: groupsmigration, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
