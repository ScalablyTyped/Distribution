package typings.maximMazurokGapiClientTpu

import typings.maximMazurokGapiClientTpu.gapi.client.tpu.ProjectsResource
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.tpu
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud TPU API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: tpu, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: tpu, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object tpu {
        
        @JSGlobal("gapi.client.tpu.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
