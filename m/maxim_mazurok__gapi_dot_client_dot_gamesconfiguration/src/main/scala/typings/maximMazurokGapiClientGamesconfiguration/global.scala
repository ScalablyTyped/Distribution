package typings.maximMazurokGapiClientGamesconfiguration

import typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration.AchievementConfigurationsResource
import typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration.ImageConfigurationsResource
import typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration.LeaderboardConfigurationsResource
import typings.maximMazurokGapiClientGamesconfiguration.maximMazurokGapiClientGamesconfigurationStrings.gamesconfiguration
import typings.maximMazurokGapiClientGamesconfiguration.maximMazurokGapiClientGamesconfigurationStrings.v1configuration
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
      
      object gamesconfiguration {
        
        @JSGlobal("gapi.client.gamesconfiguration.achievementConfigurations")
        @js.native
        val achievementConfigurations: AchievementConfigurationsResource = js.native
        
        @JSGlobal("gapi.client.gamesconfiguration.imageConfigurations")
        @js.native
        val imageConfigurations: ImageConfigurationsResource = js.native
        
        @JSGlobal("gapi.client.gamesconfiguration.leaderboardConfigurations")
        @js.native
        val leaderboardConfigurations: LeaderboardConfigurationsResource = js.native
      }
      
      /** Load Google Play Game Services Publishing API v1configuration */
      inline def load(name: gamesconfiguration, version: v1configuration): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: gamesconfiguration, version: v1configuration, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
