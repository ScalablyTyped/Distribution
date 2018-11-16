package typings
package overwatchDashApiLib.overwatchDashApiMod

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
    var conclusionStrategy: java.lang.String
    var conclusionValue: scala.Double
    var dateCreated: scala.Double
    var endDate: java.lang.String
    var endDateTS: scala.Double
    var flags: js.Array[_]
    var games: js.Array[MatchGameData]
    var handle: java.lang.String
    var id: scala.Double
    var losses: ScoreTuple
    var scores: js.Array[MatchScores]
    var showEndTime: scala.Boolean
    var showStartTime: scala.Boolean
    var startDate: java.lang.String
    var startDateTS: scala.Double
    var state: java.lang.String
    var status: java.lang.String
    var statusReason: java.lang.String
    var ties: ScoreTuple
    var tournament: MatchTournamentData
    var videos: js.Array[MatchVideoData]
    var winner: TeamData
    var wins: ScoreTuple
    var youtubeId: java.lang.String
  }
  
  
  trait MatchGameAttributeData extends js.Object {
    var instanceID: java.lang.String
    var map: java.lang.String
    var mapScore: MatchGameScore
  }
  
  
  trait MatchGameData extends js.Object {
    var attributes: MatchGameAttributeData
    var attributesVersion: java.lang.String
    var handle: java.lang.String
    var id: scala.Double
    var points: ScoreTuple
    var state: java.lang.String
    var stats: scala.Null
    var status: java.lang.String
    var statusReason: java.lang.String
  }
  
  
  trait MatchGameScore extends js.Object {
    var team1: scala.Double
    var team2: scala.Double
  }
  
  
  trait MatchScores extends js.Object {
    var value: scala.Double
  }
  
  
  trait MatchTournamentData extends js.Object {
    var id: scala.Double
    var location: java.lang.String
    var `type`: java.lang.String
  }
  
  
  trait MatchVideoData extends js.Object {
    var description: java.lang.String
    var name: scala.Double
    var thumbnailUrl: java.lang.String
    var vodLink: java.lang.String
    var youtubeId: java.lang.String
  }
  
  
  trait PreseasonStandingInfo extends StandingInfo {
    var comparisons: js.Array[StandingComparison]
  }
  
  
  trait ScheduleInfo extends js.Object {
    var endDate: java.lang.String
    var stages: js.Array[StageScheduleInfo]
    var startDate: java.lang.String
  }
  
  
  trait StageScheduleInfo extends js.Object {
    var enabled: scala.Boolean
    var id: scala.Double
    var matches: js.Array[MatchData]
    var name: java.lang.String
    var slug: java.lang.String
    var tournament: js.Array[TournamentData]
    var weeks: js.Array[WeekData]
  }
  
  
  trait StageStandingInfo extends PreseasonStandingInfo {
    var isPlayoffWinner: scala.Boolean
  }
  
  
  trait Stages extends js.Object {
    var stage1: StageStandingInfo
    var stage2: StageStandingInfo
    var stage3: StageStandingInfo
    var stage4: StageStandingInfo
  }
  
  
  trait StandingComparison extends js.Object {
    var key: java.lang.String
    var value: scala.Double
  }
  
  
  trait StandingInfo extends js.Object {
    var gameLoss: scala.Double
    var gamePointsAgainst: scala.Double
    var gamePointsFor: scala.Double
    var gameTie: scala.Double
    var gameWin: scala.Double
    var matchBye: scala.Double
    var matchDraw: scala.Double
    var matchLoss: scala.Double
    var matchWin: scala.Double
    var placement: scala.Double
  }
  
  
  trait TeamData extends js.Object {
    var abbreviatedName: java.lang.String
    var addressCountry: java.lang.String
    var availableLanguages: js.Array[java.lang.String]
    var game: java.lang.String
    var handle: java.lang.String
    var homeLocation: java.lang.String
    var icon: java.lang.String
    var id: scala.Double
    var logo: java.lang.String
    var name: java.lang.String
    var primaryColor: java.lang.String
    var secondaryColor: java.lang.String
    var secondaryPhoto: java.lang.String
    var `type`: java.lang.String
  }
  
  
  trait TeamStandingInfo extends js.Object {
    var abbreviatedName: java.lang.String
    var divisionId: scala.Double
    var id: scala.Double
    var league: StandingInfo
    var name: java.lang.String
    var preseason: PreseasonStandingInfo
    var stages: Stages
  }
  
  
  trait TournamentData extends js.Object {
    var id: scala.Double
    var `type`: java.lang.String
  }
  
  
  trait WeekData extends js.Object {
    var endDate: scala.Double
    var id: scala.Double
    var matches: js.Array[MatchData]
    var name: java.lang.String
    var startDate: scala.Double
  }
  
  def getLiveMatch(callback: overwatchDashApiLib.overwatchDashApiMod.callbackFunc[ApiResponse[LiveMatchData]]): scala.Unit = js.native
  def getSchedule(callback: overwatchDashApiLib.overwatchDashApiMod.callbackFunc[ApiResponse[ScheduleInfo]]): scala.Unit = js.native
  def getStandings(
    callback: overwatchDashApiLib.overwatchDashApiMod.callbackFunc[ApiResponse[js.Array[TeamStandingInfo]]]
  ): scala.Unit = js.native
  type ScoreTuple = js.Tuple2[scala.Double, scala.Double]
}

