package typings.maximMazurokGapiClientFactchecktools

import typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.ClaimsResource
import typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.PagesResource
import typings.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.factchecktools
import typings.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.v1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object factchecktools {
        
        @JSGlobal("gapi.client.factchecktools.claims")
        @js.native
        val claims: ClaimsResource = js.native
        
        @JSGlobal("gapi.client.factchecktools.pages")
        @js.native
        val pages: PagesResource = js.native
      }
      
      /** Load Fact Check Tools API v1alpha1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: factchecktools, version: v1alpha1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: factchecktools, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
