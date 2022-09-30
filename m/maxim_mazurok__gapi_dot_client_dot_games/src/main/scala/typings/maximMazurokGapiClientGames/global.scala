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
import typings.maximMazurokGapiClientGames.gapi.client.games.SnapshotsResource
import typings.maximMazurokGapiClientGames.gapi.client.games.StatsResource
import typings.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.games
import typings.maximMazurokGapiClientGames.maximMazurokGapiClientGamesStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object games {
        
        @JSGlobal("gapi.client.games.achievementDefinitions")
        @js.native
        val achievementDefinitions: AchievementDefinitionsResource = js.native
        
        @JSGlobal("gapi.client.games.achievements")
        @js.native
        val achievements: AchievementsResource = js.native
        
        @JSGlobal("gapi.client.games.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.games.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.games.leaderboards")
        @js.native
        val leaderboards: LeaderboardsResource = js.native
        
        @JSGlobal("gapi.client.games.metagame")
        @js.native
        val metagame: MetagameResource = js.native
        
        @JSGlobal("gapi.client.games.players")
        @js.native
        val players: PlayersResource = js.native
        
        @JSGlobal("gapi.client.games.revisions")
        @js.native
        val revisions: RevisionsResource = js.native
        
        @JSGlobal("gapi.client.games.scores")
        @js.native
        val scores: ScoresResource = js.native
        
        @JSGlobal("gapi.client.games.snapshots")
        @js.native
        val snapshots: SnapshotsResource = js.native
        
        @JSGlobal("gapi.client.games.stats")
        @js.native
        val stats: StatsResource = js.native
      }
      
      /** Load Google Play Game Services v1 */
      inline def load(name: games, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: games, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
