package typings.maximMazurokGapiClientRecommendationengine

import typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine.ProjectsResource
import typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.recommendationengine
import typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Recommendations AI v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: recommendationengine, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: recommendationengine, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      object recommendationengine {
        
        @JSGlobal("gapi.client.recommendationengine.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
