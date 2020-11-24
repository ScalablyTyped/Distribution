package typings.maximMazurokGapiClientTpu

import typings.maximMazurokGapiClientTpu.gapi.client.tpu.ProjectsResource
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.tpu
import typings.maximMazurokGapiClientTpu.maximMazurokGapiClientTpuStrings.v1
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
      
      /** Load Cloud TPU API v1 */
      def load(name: tpu, version: v1): js.Thenable[Unit] = js.native
      def load(name: tpu, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object tpu extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
