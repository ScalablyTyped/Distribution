package typings.maximMazurokGapiClientMonitoring

import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ProjectsResource
import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ServicesResource
import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.UptimeCheckIpsResource
import typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.monitoring
import typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.v3
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
      
      /** Load Cloud Monitoring API v3 */
      def load(name: monitoring, version: v3): js.Thenable[Unit] = js.native
      def load(name: monitoring, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object monitoring extends js.Object {
        
        val projects: ProjectsResource = js.native
        
        val services: ServicesResource = js.native
        
        val uptimeCheckIps: UptimeCheckIpsResource = js.native
      }
    }
  }
}
