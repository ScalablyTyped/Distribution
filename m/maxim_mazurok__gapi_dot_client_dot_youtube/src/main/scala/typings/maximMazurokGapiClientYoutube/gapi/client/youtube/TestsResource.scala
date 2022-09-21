package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.CallbackExternalChannelId
import typings.maximMazurokGapiClientYoutube.anon.ExternalChannelId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestsResource extends StObject {
  
  def insert(request: CallbackExternalChannelId, body: TestItem): Request[TestItem] = js.native
  /** POST method. */
  def insert(request: ExternalChannelId): Request[TestItem] = js.native
}
