package typings.maximMazurokGapiClientRun

import typings.maximMazurokGapiClientRun.gapi.client.run.NamespacesResource
import typings.maximMazurokGapiClientRun.gapi.client.run.ProjectsResource
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.run
import typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Run Admin API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: run, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: run, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object run {
        
        @JSGlobal("gapi.client.run.namespaces")
        @js.native
        val namespaces: NamespacesResource = js.native
        
        @JSGlobal("gapi.client.run.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
