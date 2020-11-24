package typings.maximMazurokGapiClientVideointelligence

import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.OperationsResource
import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.ProjectsResource
import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.VideosResource
import typings.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.v1
import typings.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.videointelligence
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
      
      /** Load Cloud Video Intelligence API v1 */
      def load(name: videointelligence, version: v1): js.Thenable[Unit] = js.native
      def load(name: videointelligence, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object videointelligence extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val videos: VideosResource = js.native
      }
    }
  }
}
