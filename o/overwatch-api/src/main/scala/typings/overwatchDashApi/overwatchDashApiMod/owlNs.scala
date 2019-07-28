package typings.overwatchDashApi.overwatchDashApiMod

import typings.overwatchDashApi.overwatchDashApiMod.owlNs.ApiResponse
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.LiveMatchData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchGameAttributeData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchGameData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchGameScore
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchScores
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchTournamentData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.MatchVideoData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.PreseasonStandingInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.ScheduleInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.ScoreTuple
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.StageScheduleInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.StageStandingInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.Stages
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.StandingComparison
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.StandingInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.TeamData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.TeamStandingInfo
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.TournamentData
import typings.overwatchDashApi.overwatchDashApiMod.owlNs.WeekData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", "owl")
@js.native
object owlNs extends js.Object {
  trait ApiResponse[T] extends js.Object {
    var data: T
  }
  
  trait LiveMatchData extends js.Object
  
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
  
  trait MatchGameAttributeData extends js.Object {
    var instanceID: String
    var map: String
    var mapScore: MatchGameScore
  }
  
  trait MatchGameData extends js.Object {
    var attributes: MatchGameAttributeData
    var attributesVersion: String
    var handle: String
    var id: Double
    var points: ScoreTuple
    var state: String
    var stats: Null
    var status: String
    var statusReason: String
  }
  
  trait MatchGameScore extends js.Object {
    var team1: Double
    var team2: Double
  }
  
  trait MatchScores extends js.Object {
    var value: Double
  }
  
  trait MatchTournamentData extends js.Object {
    var id: Double
    var location: String
    var `type`: String
  }
  
  trait MatchVideoData extends js.Object {
    var description: String
    var name: Double
    var thumbnailUrl: String
    var vodLink: String
    var youtubeId: String
  }
  
  trait PreseasonStandingInfo extends StandingInfo {
    var comparisons: js.Array[StandingComparison]
  }
  
  trait ScheduleInfo extends js.Object {
    var endDate: String
    var stages: js.Array[StageScheduleInfo]
    var startDate: String
  }
  
  trait StageScheduleInfo extends js.Object {
    var enabled: Boolean
    var id: Double
    var matches: js.Array[MatchData]
    var name: String
    var slug: String
    var tournament: js.Array[TournamentData]
    var weeks: js.Array[WeekData]
  }
  
  trait StageStandingInfo extends PreseasonStandingInfo {
    var isPlayoffWinner: Boolean
  }
  
  trait Stages extends js.Object {
    var stage1: StageStandingInfo
    var stage2: StageStandingInfo
    var stage3: StageStandingInfo
    var stage4: StageStandingInfo
  }
  
  trait StandingComparison extends js.Object {
    var key: String
    var value: Double
  }
  
  trait StandingInfo extends js.Object {
    var gameLoss: Double
    var gamePointsAgainst: Double
    var gamePointsFor: Double
    var gameTie: Double
    var gameWin: Double
    var matchBye: Double
    var matchDraw: Double
    var matchLoss: Double
    var matchWin: Double
    var placement: Double
  }
  
  trait TeamData extends js.Object {
    var abbreviatedName: String
    var addressCountry: String
    var availableLanguages: js.Array[String]
    var game: String
    var handle: String
    var homeLocation: String
    var icon: String
    var id: Double
    var logo: String
    var name: String
    var primaryColor: String
    var secondaryColor: String
    var secondaryPhoto: String
    var `type`: String
  }
  
  trait TeamStandingInfo extends js.Object {
    var abbreviatedName: String
    var divisionId: Double
    var id: Double
    var league: StandingInfo
    var name: String
    var preseason: PreseasonStandingInfo
    var stages: Stages
  }
  
  trait TournamentData extends js.Object {
    var id: Double
    var `type`: String
  }
  
  trait WeekData extends js.Object {
    var endDate: Double
    var id: Double
    var matches: js.Array[MatchData]
    var name: String
    var startDate: Double
  }
  
  def getLiveMatch(callback: callbackFunc[ApiResponse[LiveMatchData]]): Unit = js.native
  def getSchedule(callback: callbackFunc[ApiResponse[ScheduleInfo]]): Unit = js.native
  def getStandings(callback: callbackFunc[ApiResponse[js.Array[TeamStandingInfo]]]): Unit = js.native
  type ScoreTuple = js.Tuple2[Double, Double]
}

