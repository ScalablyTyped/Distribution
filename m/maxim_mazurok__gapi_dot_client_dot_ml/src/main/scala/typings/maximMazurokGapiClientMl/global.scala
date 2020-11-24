package typings.maximMazurokGapiClientMl

import typings.maximMazurokGapiClientMl.gapi.client.ml.ProjectsResource
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.ml
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.v1
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
      
      /** Load AI Platform Training & Prediction API v1 */
      def load(name: ml, version: v1): js.Thenable[Unit] = js.native
      def load(name: ml, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object ml extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
