package typings.maximMazurokGapiClientJobs

import typings.maximMazurokGapiClientJobs.gapi.client.jobs.ProjectsResource
import typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.jobs
import typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object jobs {
        
        @JSGlobal("gapi.client.jobs.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Talent Solution API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: jobs, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: jobs, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
