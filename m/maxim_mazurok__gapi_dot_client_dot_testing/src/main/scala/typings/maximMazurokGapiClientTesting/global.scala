package typings.maximMazurokGapiClientTesting

import typings.maximMazurokGapiClientTesting.gapi.client.testing.ApplicationDetailServiceResource
import typings.maximMazurokGapiClientTesting.gapi.client.testing.ProjectsResource
import typings.maximMazurokGapiClientTesting.gapi.client.testing.TestEnvironmentCatalogResource
import typings.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.testing
import typings.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Testing API v1 */
      @scala.inline
      def load(name: testing, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: testing, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object testing {
        
        @JSGlobal("gapi.client.testing.applicationDetailService")
        @js.native
        val applicationDetailService: ApplicationDetailServiceResource = js.native
        
        @JSGlobal("gapi.client.testing.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.testing.testEnvironmentCatalog")
        @js.native
        val testEnvironmentCatalog: TestEnvironmentCatalogResource = js.native
      }
    }
  }
}
