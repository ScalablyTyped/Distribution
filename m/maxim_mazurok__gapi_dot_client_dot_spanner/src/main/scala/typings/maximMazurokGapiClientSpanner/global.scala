package typings.maximMazurokGapiClientSpanner

import typings.maximMazurokGapiClientSpanner.gapi.client.spanner.ProjectsResource
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.spanner
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Spanner API v1 */
      @scala.inline
      def load(name: spanner, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: spanner, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object spanner {
        
        @JSGlobal("gapi.client.spanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
