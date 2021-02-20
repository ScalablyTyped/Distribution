package typings.maximMazurokGapiClientMonitoring

import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ProjectsResource
import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ServicesResource
import typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring.UptimeCheckIpsResource
import typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.monitoring
import typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Monitoring API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: monitoring, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: monitoring, version: v3, callback: js.Function0[_]): Unit = js.native
      
      object monitoring {
        
        @JSGlobal("gapi.client.monitoring.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.monitoring.services")
        @js.native
        val services: ServicesResource = js.native
        
        @JSGlobal("gapi.client.monitoring.uptimeCheckIps")
        @js.native
        val uptimeCheckIps: UptimeCheckIpsResource = js.native
      }
    }
  }
}
