package typings.maximMazurokGapiClientMemcache

import typings.maximMazurokGapiClientMemcache.gapi.client.memcache.ProjectsResource
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.memcache
import typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.v1beta2
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
      
      /** Load Cloud Memorystore for Memcached API v1beta2 */
      def load(name: memcache, version: v1beta2): js.Thenable[Unit] = js.native
      def load(name: memcache, version: v1beta2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object memcache extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
