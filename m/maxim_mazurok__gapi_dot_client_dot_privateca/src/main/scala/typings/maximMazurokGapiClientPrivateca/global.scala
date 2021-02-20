package typings.maximMazurokGapiClientPrivateca

import typings.maximMazurokGapiClientPrivateca.gapi.client.privateca.ProjectsResource
import typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.privateca
import typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Certificate Authority API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: privateca, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: privateca, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      object privateca {
        
        @JSGlobal("gapi.client.privateca.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
