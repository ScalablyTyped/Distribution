package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.MaxResults
import typings.maximMazurokGapiClientGames.anon.PlayerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayersResource extends StObject {
  
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set `playerId` to `me`. */
  def get(): Request[Player] = js.native
  def get(request: PlayerId): Request[Player] = js.native
  
  /** Get the collection of players for the currently authenticated user. */
  def list(): Request[PlayerListResponse] = js.native
  def list(request: MaxResults): Request[PlayerListResponse] = js.native
}
