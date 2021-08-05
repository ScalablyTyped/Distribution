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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Vision API v1 */
      inline def load(name: vision, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: vision, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
