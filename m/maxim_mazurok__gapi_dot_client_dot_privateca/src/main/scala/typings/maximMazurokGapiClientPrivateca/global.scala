package typings.maximMazurokGapiClientPrivateca

import typings.maximMazurokGapiClientPrivateca.gapi.client.privateca.ProjectsResource
import typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.privateca
import typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.v1beta1
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
      
      /** Load Certificate Authority API v1beta1 */
      def load(name: privateca, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: privateca, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object privateca extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
