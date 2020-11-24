package typings.maximMazurokGapiClientVision

import typings.maximMazurokGapiClientVision.gapi.client.vision.FilesResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.ImagesResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.LocationsResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.OperationsResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.ProjectsResource
import typings.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.v1
import typings.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.vision
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
      
      /** Load Cloud Vision API v1 */
      def load(name: vision, version: v1): js.Thenable[Unit] = js.native
      def load(name: vision, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object vision extends js.Object {
        
        val files: FilesResource = js.native
        
        val images: ImagesResource = js.native
        
        val locations: LocationsResource = js.native
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
