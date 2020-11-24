package typings.maximMazurokGapiClientGames

import typings.maximMazurokGapiClientGames.gapi.client.games.AchievementDefinitionsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.AchievementsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.ApplicationsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.EventsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.LeaderboardsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.MetagameResource
import typings.maximMazurokGapiClientGames.gapi.client.games.PlayersResource
import typings.maximMazurokGapiClientGames.gapi.client.games.RevisionsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.ScoresResource
import typings.maximMazurokGapiClientGames.gapi.client.games.SnapshotsExtendedResource
import typings.maximMazurokGapiClientGames.gapi.client.games.SnapshotsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.StatsResource
import typings.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.games
import typings.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Google Play Game Services v1 */
      def load(name: games, version: v1): js.Thenable[Unit] = js.native
      def load(name: games, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object games extends js.Object {
        
        val achievementDefinitions: AchievementDefinitionsResource = js.native
        
        val achievements: AchievementsResource = js.native
        
        val applications: ApplicationsResource = js.native
        
        val events: EventsResource = js.native
        
        val leaderboards: LeaderboardsResource = js.native
        
        val metagame: MetagameResource = js.native
        
        val players: PlayersResource = js.native
        
        val revisions: RevisionsResource = js.native
        
        val scores: ScoresResource = js.native
        
        val snapshots: SnapshotsResource = js.native
        
        val snapshotsExtended: SnapshotsExtendedResource = js.native
        
        val stats: StatsResource = js.native
      }
    }
  }
}
