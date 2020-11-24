package typings.maximMazurokGapiClientPolicytroubleshooter

import typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter.IamResource
import typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.policytroubleshooter
import typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.v1
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
      
      /** Load Policy Troubleshooter API v1 */
      def load(name: policytroubleshooter, version: v1): js.Thenable[Unit] = js.native
      def load(name: policytroubleshooter, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object policytroubleshooter extends js.Object {
        
        val iam: IamResource = js.native
      }
    }
  }
}
