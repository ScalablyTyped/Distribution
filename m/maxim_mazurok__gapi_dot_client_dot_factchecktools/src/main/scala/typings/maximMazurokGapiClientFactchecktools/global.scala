package typings.maximMazurokGapiClientFactchecktools

import typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.ClaimsResource
import typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.PagesResource
import typings.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.factchecktools
import typings.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.v1alpha1
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
      
      /** Load Fact Check Tools API v1alpha1 */
      def load(name: factchecktools, version: v1alpha1): js.Thenable[Unit] = js.native
      def load(name: factchecktools, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object factchecktools extends js.Object {
        
        val claims: ClaimsResource = js.native
        
        val pages: PagesResource = js.native
      }
    }
  }
}
