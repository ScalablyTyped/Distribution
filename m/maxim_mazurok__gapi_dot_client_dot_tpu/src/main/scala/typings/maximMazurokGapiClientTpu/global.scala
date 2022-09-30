package typings.maximMazurokGapiClientTpu

import typings.maximMazurokGapiClientTpu.gapi.client.tpu.ProjectsResource
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.tpu
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.v1
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
      
      /** Load Cloud TPU API v1 */
      inline def load(name: tpu, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: tpu, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object tpu {
        
        @JSGlobal("gapi.client.tpu.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
