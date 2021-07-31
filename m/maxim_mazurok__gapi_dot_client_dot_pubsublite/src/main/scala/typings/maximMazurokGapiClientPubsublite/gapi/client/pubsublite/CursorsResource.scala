package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPubsublite.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorsResource extends StObject {
  
  /** Returns all committed cursor information for a subscription. */
  def list(): Request[ListPartitionCursorsResponse] = js.native
  def list(request: Fields): Request[ListPartitionCursorsResponse] = js.native
}
