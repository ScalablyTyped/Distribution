package typings.maximMazurokGapiClientVision

import typings.maximMazurokGapiClientVision.gapi.client.vision.FilesResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.ImagesResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.LocationsResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.OperationsResource
import typings.maximMazurokGapiClientVision.gapi.client.vision.ProjectsResource
import typings.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.v1
import typings.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.vision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Vision API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vision, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: vision, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object vision {
        
        @JSGlobal("gapi.client.vision.files")
        @js.native
        val files: FilesResource = js.native
        
        @JSGlobal("gapi.client.vision.images")
        @js.native
        val images: ImagesResource = js.native
        
        @JSGlobal("gapi.client.vision.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.vision.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.vision.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
