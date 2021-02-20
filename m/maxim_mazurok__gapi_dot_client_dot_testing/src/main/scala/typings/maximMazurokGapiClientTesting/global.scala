package typings.maximMazurokGapiClientTesting

import typings.maximMazurokGapiClientTesting.gapi.client.testing.ApplicationDetailServiceResource
import typings.maximMazurokGapiClientTesting.gapi.client.testing.ProjectsResource
import typings.maximMazurokGapiClientTesting.gapi.client.testing.TestEnvironmentCatalogResource
import typings.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.testing
import typings.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Testing API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: testing, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: testing, version: v1, callback: js.Function0[_]): Unit = js.native
      
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
