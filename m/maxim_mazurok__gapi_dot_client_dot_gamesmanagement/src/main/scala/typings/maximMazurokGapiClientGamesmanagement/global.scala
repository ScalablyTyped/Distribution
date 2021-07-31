package typings.maximMazurokGapiClientGamesmanagement

import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.AchievementsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ApplicationsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.EventsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.PlayersResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ScoresResource
import typings.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.gamesmanagement
import typings.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.v1management
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object gamesmanagement {
        
        @JSGlobal("gapi.client.gamesmanagement.achievements")
        @js.native
        val achievements: AchievementsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.players")
        @js.native
        val players: PlayersResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.scores")
        @js.native
        val scores: ScoresResource = js.native
      }
      
      /** Load Google Play Game Management v1management */
      @scala.inline
      def load(name: gamesmanagement, version: v1management): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: gamesmanagement, version: v1management, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
