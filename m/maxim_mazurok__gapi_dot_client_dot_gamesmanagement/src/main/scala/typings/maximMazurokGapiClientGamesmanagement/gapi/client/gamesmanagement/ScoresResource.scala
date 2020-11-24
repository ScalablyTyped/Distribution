package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesmanagement.anon.Alt
import typings.maximMazurokGapiClientGamesmanagement.anon.LeaderboardId
import typings.maximMazurokGapiClientGamesmanagement.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoresResource extends js.Object {
  
  /** Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your application. */
  def reset(): Request[PlayerScoreResetResponse] = js.native
  def reset(request: LeaderboardId): Request[PlayerScoreResetResponse] = js.native
  
  /** Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your application. */
  def resetAll(): Request[PlayerScoreResetAllResponse] = js.native
  def resetAll(request: Alt): Request[PlayerScoreResetAllResponse] = js.native
  
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(): Request[Unit] = js.native
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  
  /** Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only draft leaderboards can be reset. */
  def resetForAllPlayers(): Request[Unit] = js.native
  def resetForAllPlayers(request: LeaderboardId): Request[Unit] = js.native
  
  def resetMultipleForAllPlayers(request: Alt, body: ScoresResetMultipleForAllRequest): Request[Unit] = js.native
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft leaderboards may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: Oauthtoken): Request[Unit] = js.native
}
