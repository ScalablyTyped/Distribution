package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayersResource extends js.Object {
  
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(): Request[Unit] = js.native
  def hide(request: Key): Request[Unit] = js.native
  
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(): Request[Unit] = js.native
  def unhide(request: Key): Request[Unit] = js.native
}
