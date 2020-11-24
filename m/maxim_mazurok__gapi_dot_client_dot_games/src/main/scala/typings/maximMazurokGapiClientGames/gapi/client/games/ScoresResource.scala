package typings.maximMazurokGapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGames.anon.IncludeRankType
import typings.maximMazurokGapiClientGames.anon.PageToken
import typings.maximMazurokGapiClientGames.anon.QuotaUser
import typings.maximMazurokGapiClientGames.anon.Resource
import typings.maximMazurokGapiClientGames.anon.ResultsAbove
import typings.maximMazurokGapiClientGames.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoresResource extends js.Object {
  
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, `leaderboardId` can be set to `ALL` to retrieve data for all
    * leaderboards in a given time span. `NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(): Request[PlayerLeaderboardScoreListResponse] = js.native
  def get(request: IncludeRankType): Request[PlayerLeaderboardScoreListResponse] = js.native
  
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(): Request[LeaderboardScores] = js.native
  def list(request: PageToken): Request[LeaderboardScores] = js.native
  
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(): Request[LeaderboardScores] = js.native
  def listWindow(request: ResultsAbove): Request[LeaderboardScores] = js.native
  
  /** Submits a score to the specified leaderboard. */
  def submit(): Request[PlayerScoreResponse] = js.native
  def submit(request: Score): Request[PlayerScoreResponse] = js.native
  
  def submitMultiple(request: QuotaUser, body: PlayerScoreSubmissionList): Request[PlayerScoreListResponse] = js.native
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: Resource): Request[PlayerScoreListResponse] = js.native
}
