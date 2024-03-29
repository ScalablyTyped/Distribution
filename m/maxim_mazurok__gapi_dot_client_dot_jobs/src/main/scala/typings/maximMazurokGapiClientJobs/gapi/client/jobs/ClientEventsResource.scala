package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientJobs.anon.Alt
import typings.maximMazurokGapiClientJobs.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEventsResource extends StObject {
  
  /**
    * Report events issued when end user interacts with customer's application that uses Cloud Talent Solution. You may inspect the created events in [self service
    * tools](https://console.cloud.google.com/talent-solution/overview). [Learn more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.
    */
  def create(request: Alt): Request[ClientEvent] = js.native
  def create(request: Callback, body: ClientEvent): Request[ClientEvent] = js.native
}
