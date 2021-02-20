package typings.maximMazurokGapiClientLicensing

import typings.maximMazurokGapiClientLicensing.gapi.client.licensing.LicenseAssignmentsResource
import typings.maximMazurokGapiClientLicensing.maximMazurokGapiClientLicensingStrings.licensing
import typings.maximMazurokGapiClientLicensing.maximMazurokGapiClientLicensingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object licensing {
        
        @JSGlobal("gapi.client.licensing.licenseAssignments")
        @js.native
        val licenseAssignments: LicenseAssignmentsResource = js.native
      }
      
      /** Load Enterprise License Manager API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: licensing, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: licensing, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
