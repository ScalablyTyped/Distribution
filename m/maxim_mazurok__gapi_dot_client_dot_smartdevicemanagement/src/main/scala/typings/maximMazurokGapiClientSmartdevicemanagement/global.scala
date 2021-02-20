package typings.maximMazurokGapiClientSmartdevicemanagement

import typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement.EnterprisesResource
import typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.smartdevicemanagement
import typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Smart Device Management API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: smartdevicemanagement, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: smartdevicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object smartdevicemanagement {
        
        @JSGlobal("gapi.client.smartdevicemanagement.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
      }
    }
  }
}
