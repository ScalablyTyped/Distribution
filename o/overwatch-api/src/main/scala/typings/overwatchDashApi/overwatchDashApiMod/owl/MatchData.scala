package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchData extends js.Object {
  var clientHints: js.Array[_]
  var competitors: js.Array[TeamData]
  var conclusionStrategy: String
  var conclusionValue: Double
  var dateCreated: Double
  var endDate: String
  var endDateTS: Double
  var flags: js.Array[_]
  var games: js.Array[MatchGameData]
  var handle: String
  var id: Double
  var losses: ScoreTuple
  var scores: js.Array[MatchScores]
  var showEndTime: Boolean
  var showStartTime: Boolean
  var startDate: String
  var startDateTS: Double
  var state: String
  var status: String
  var statusReason: String
  var ties: ScoreTuple
  var tournament: MatchTournamentData
  var videos: js.Array[MatchVideoData]
  var winner: TeamData
  var wins: ScoreTuple
  var youtubeId: String
}

object MatchData {
  @scala.inline
  def apply(
    clientHints: js.Array[_],
    competitors: js.Array[TeamData],
    conclusionStrategy: String,
    conclusionValue: Double,
    dateCreated: Double,
    endDate: String,
    endDateTS: Double,
    flags: js.Array[_],
    games: js.Array[MatchGameData],
    handle: String,
    id: Double,
    losses: ScoreTuple,
    scores: js.Array[MatchScores],
    showEndTime: Boolean,
    showStartTime: Boolean,
    startDate: String,
    startDateTS: Double,
    state: String,
    status: String,
    statusReason: String,
    ties: ScoreTuple,
    tournament: MatchTournamentData,
    videos: js.Array[MatchVideoData],
    winner: TeamData,
    wins: ScoreTuple,
    youtubeId: String
  ): MatchData = {
    val __obj = js.Dynamic.literal(clientHints = clientHints, competitors = competitors, conclusionStrategy = conclusionStrategy, conclusionValue = conclusionValue, dateCreated = dateCreated, endDate = endDate, endDateTS = endDateTS, flags = flags, games = games, handle = handle, id = id, losses = losses, scores = scores, showEndTime = showEndTime, showStartTime = showStartTime, startDate = startDate, startDateTS = startDateTS, state = state, status = status, statusReason = statusReason, ties = ties, tournament = tournament, videos = videos, winner = winner, wins = wins, youtubeId = youtubeId)
  
    __obj.asInstanceOf[MatchData]
  }
}

