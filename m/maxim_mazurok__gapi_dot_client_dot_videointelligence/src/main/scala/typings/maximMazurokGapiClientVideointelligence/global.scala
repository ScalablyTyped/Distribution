package typings.maximMazurokGapiClientVideointelligence

import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.OperationsResource
import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.ProjectsResource
import typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.VideosResource
import typings.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.v1
import typings.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.videointelligence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Video Intelligence API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: videointelligence, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: videointelligence, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object videointelligence {
        
        @JSGlobal("gapi.client.videointelligence.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.videointelligence.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.videointelligence.videos")
        @js.native
        val videos: VideosResource = js.native
      }
    }
  }
}
