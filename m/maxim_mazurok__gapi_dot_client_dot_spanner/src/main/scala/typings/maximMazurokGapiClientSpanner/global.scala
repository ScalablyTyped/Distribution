package typings.maximMazurokGapiClientSpanner

import typings.maximMazurokGapiClientSpanner.gapi.client.spanner.ProjectsResource
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.spanner
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Spanner API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: spanner, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: spanner, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object spanner {
        
        @JSGlobal("gapi.client.spanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
