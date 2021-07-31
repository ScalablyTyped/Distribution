package typings.maximMazurokGapiClientJobs

import typings.maximMazurokGapiClientJobs.gapi.client.jobs.ProjectsResource
import typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.jobs
import typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object jobs {
        
        @JSGlobal("gapi.client.jobs.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Talent Solution API v3 */
      @scala.inline
      def load(name: jobs, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: jobs, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
