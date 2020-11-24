package typings.maximMazurokGapiClientGamesmanagement

import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.AchievementsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ApplicationsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.EventsResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.PlayersResource
import typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ScoresResource
import typings.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.gamesmanagement
import typings.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.v1management
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
      
      /** Load Google Play Game Management v1management */
      def load(name: gamesmanagement, version: v1management): js.Thenable[Unit] = js.native
      def load(name: gamesmanagement, version: v1management, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object gamesmanagement extends js.Object {
        
        val achievements: AchievementsResource = js.native
        
        val applications: ApplicationsResource = js.native
        
        val events: EventsResource = js.native
        
        val players: PlayersResource = js.native
        
        val scores: ScoresResource = js.native
      }
    }
  }
}
