package typings.maximMazurokGapiClientSpanner

import typings.maximMazurokGapiClientSpanner.gapi.client.spanner.ProjectsResource
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.spanner
import typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Cloud Spanner API v1 */
      def load(name: spanner, version: v1): js.Thenable[Unit] = js.native
      def load(name: spanner, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object spanner extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
