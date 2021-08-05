package typings.maximMazurokGapiClientIap

import typings.maximMazurokGapiClientIap.gapi.client.iap.ProjectsResource
import typings.maximMazurokGapiClientIap.gapi.client.iap.V1Resource
import typings.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.iap
import typings.maximMazurokGapiClientIap.maximMazurokGapiClientIapStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object iap {
        
        @JSGlobal("gapi.client.iap.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.iap.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Cloud Identity-Aware Proxy API v1 */
      inline def load(name: iap, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: iap, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
