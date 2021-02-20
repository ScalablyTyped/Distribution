package typings.maximMazurokGapiClientIap

import typings.maximMazurokGapiClientIap.gapi.client.iap.ProjectsResource
import typings.maximMazurokGapiClientIap.gapi.client.iap.V1Resource
import typings.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.iap
import typings.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object iap {
        
        @JSGlobal("gapi.client.iap.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.iap.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Cloud Identity-Aware Proxy API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iap, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iap, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
