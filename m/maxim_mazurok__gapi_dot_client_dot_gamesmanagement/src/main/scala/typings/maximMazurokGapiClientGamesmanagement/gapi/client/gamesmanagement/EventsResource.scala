package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesmanagement.anon.Alt
import typings.maximMazurokGapiClientGamesmanagement.anon.EventId
import typings.maximMazurokGapiClientGamesmanagement.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends StObject {
  
  /** Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application. */
  def reset(): Request[Unit] = js.native
  def reset(request: EventId): Request[Unit] = js.native
  
  /** Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application. */
  def resetAll(): Request[Unit] = js.native
  def resetAll(request: Alt): Request[Unit] = js.native
  
  /** Resets all draft events for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(): Request[Unit] = js.native
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  
  /** Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be reset. */
  def resetForAllPlayers(): Request[Unit] = js.native
  def resetForAllPlayers(request: EventId): Request[Unit] = js.native
  
  def resetMultipleForAllPlayers(request: Alt, body: EventsResetMultipleForAllRequest): Request[Unit] = js.native
  /** Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be reset. */
  def resetMultipleForAllPlayers(request: Fields): Request[Unit] = js.native
}
