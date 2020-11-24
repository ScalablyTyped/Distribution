package typings.maximMazurokGapiClientRecommendationengine

import typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine.ProjectsResource
import typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.recommendationengine
import typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.v1beta1
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
      
      /** Load Recommendations AI v1beta1 */
      def load(name: recommendationengine, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: recommendationengine, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object recommendationengine extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
