package typings.maximMazurokGapiClientMemcache

import typings.maximMazurokGapiClientMemcache.gapi.client.memcache.ProjectsResource
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.memcache
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.v1beta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Memorystore for Memcached API v1beta2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: memcache, version: v1beta2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: memcache, version: v1beta2, callback: js.Function0[_]): Unit = js.native
      
      object memcache {
        
        @JSGlobal("gapi.client.memcache.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
