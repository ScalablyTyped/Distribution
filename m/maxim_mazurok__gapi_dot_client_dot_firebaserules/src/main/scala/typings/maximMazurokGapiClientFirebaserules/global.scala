package typings.maximMazurokGapiClientFirebaserules

import typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules.ProjectsResource
import typings.maximMazurokGapiClientFirebaserules.maximMazurokGapiClientFirebaserulesStrings.firebaserules
import typings.maximMazurokGapiClientFirebaserules.maximMazurokGapiClientFirebaserulesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebaserules {
        
        @JSGlobal("gapi.client.firebaserules.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Rules API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebaserules, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebaserules, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
