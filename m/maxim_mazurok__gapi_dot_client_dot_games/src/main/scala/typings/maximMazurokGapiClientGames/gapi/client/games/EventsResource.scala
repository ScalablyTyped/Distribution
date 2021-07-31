package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.Accesstoken
import typings.maximMazurokGapiClientGames.anon.Language
import typings.maximMazurokGapiClientGames.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends StObject {
  
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(): Request[PlayerEventListResponse] = js.native
  def listByPlayer(request: Accesstoken): Request[PlayerEventListResponse] = js.native
  
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(): Request[EventDefinitionListResponse] = js.native
  def listDefinitions(request: Accesstoken): Request[EventDefinitionListResponse] = js.native
  
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: Language): Request[EventUpdateResponse] = js.native
  def record(request: QuotaUser, body: EventRecordRequest): Request[EventUpdateResponse] = js.native
}
