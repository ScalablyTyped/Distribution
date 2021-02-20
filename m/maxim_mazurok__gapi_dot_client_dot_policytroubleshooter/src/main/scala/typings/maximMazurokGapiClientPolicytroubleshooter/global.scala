package typings.maximMazurokGapiClientPolicytroubleshooter

import typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter.IamResource
import typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.policytroubleshooter
import typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Policy Troubleshooter API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: policytroubleshooter, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: policytroubleshooter, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object policytroubleshooter {
        
        @JSGlobal("gapi.client.policytroubleshooter.iam")
        @js.native
        val iam: IamResource = js.native
      }
    }
  }
}
