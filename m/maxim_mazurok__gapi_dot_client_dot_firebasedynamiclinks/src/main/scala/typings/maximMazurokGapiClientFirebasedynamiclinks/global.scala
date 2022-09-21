package typings.maximMazurokGapiClientFirebasedynamiclinks

import typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ManagedShortLinksResource
import typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ShortLinksResource
import typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.V1Resource
import typings.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.firebasedynamiclinks
import typings.maximMazurokGapiClientFirebasedynamiclinks.maximMazurokGapiClientFirebasedynamiclinksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object firebasedynamiclinks {
        
        @JSGlobal("gapi.client.firebasedynamiclinks.managedShortLinks")
        @js.native
        val managedShortLinks: ManagedShortLinksResource = js.native
        
        @JSGlobal("gapi.client.firebasedynamiclinks.shortLinks")
        @js.native
        val shortLinks: ShortLinksResource = js.native
        
        @JSGlobal("gapi.client.firebasedynamiclinks.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Firebase Dynamic Links API v1 */
      inline def load(name: firebasedynamiclinks, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: firebasedynamiclinks, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
