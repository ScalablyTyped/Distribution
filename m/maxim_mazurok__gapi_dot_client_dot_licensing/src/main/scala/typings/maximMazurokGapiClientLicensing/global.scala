package typings.maximMazurokGapiClientLicensing

import typings.maximMazurokGapiClientLicensing.gapi.client.licensing.LicenseAssignmentsResource
import typings.maximMazurokGapiClientLicensing.maximMazurokGapiClientLicensingStrings.licensing
import typings.maximMazurokGapiClientLicensing.maximMazurokGapiClientLicensingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object licensing {
        
        @JSGlobal("gapi.client.licensing.licenseAssignments")
        @js.native
        val licenseAssignments: LicenseAssignmentsResource = js.native
      }
      
      /** Load Enterprise License Manager API v1 */
      @scala.inline
      def load(name: licensing, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: licensing, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
