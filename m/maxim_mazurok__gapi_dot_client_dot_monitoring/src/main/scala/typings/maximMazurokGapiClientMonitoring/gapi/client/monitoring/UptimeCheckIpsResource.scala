package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.OauthtokenPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UptimeCheckIpsResource extends js.Object {
  
  /** Returns the list of IP addresses that checkers run from */
  def list(): Request[ListUptimeCheckIpsResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListUptimeCheckIpsResponse] = js.native
}
