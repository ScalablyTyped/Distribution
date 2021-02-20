package typings.maximMazurokGapiClientTagmanager

import typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager.AccountsResource
import typings.maximMazurokGapiClientTagmanager.maximMazurokGapiClientTagmanagerStrings.tagmanager
import typings.maximMazurokGapiClientTagmanager.maximMazurokGapiClientTagmanagerStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Tag Manager API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: tagmanager, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: tagmanager, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object tagmanager {
        
        @JSGlobal("gapi.client.tagmanager.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}
