package typings.maximMazurokGapiClientMemcache

import typings.maximMazurokGapiClientMemcache.gapi.client.memcache.ProjectsResource
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.memcache
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Memorystore for Memcached API v1 */
      inline def load(name: memcache, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: memcache, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object memcache {
        
        @JSGlobal("gapi.client.memcache.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
