package typings.maximMazurokGapiClientLifesciences

import typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences.ProjectsResource
import typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.lifesciences
import typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.v2beta
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
      
      /** Load Cloud Life Sciences API v2beta */
      def load(name: lifesciences, version: v2beta): js.Thenable[Unit] = js.native
      def load(name: lifesciences, version: v2beta, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object lifesciences extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
