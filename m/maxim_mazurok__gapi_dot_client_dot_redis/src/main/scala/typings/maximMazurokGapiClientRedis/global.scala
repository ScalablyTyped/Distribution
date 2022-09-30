package typings.maximMazurokGapiClientRedis

import typings.maximMazurokGapiClientRedis.gapi.client.redis.ProjectsResource
import typings.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.redis
import typings.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.v1
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
      
      /** Load Google Cloud Memorystore for Redis API v1 */
      inline def load(name: redis, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: redis, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object redis {
        
        @JSGlobal("gapi.client.redis.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
