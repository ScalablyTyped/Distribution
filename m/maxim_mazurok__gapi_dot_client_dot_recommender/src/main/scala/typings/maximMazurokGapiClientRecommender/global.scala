package typings.maximMazurokGapiClientRecommender

import typings.maximMazurokGapiClientRecommender.gapi.client.recommender.ProjectsResource
import typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.recommender
import typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Recommender API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: recommender, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: recommender, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object recommender {
        
        @JSGlobal("gapi.client.recommender.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
