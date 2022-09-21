package typings.phaser.global.Phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents one single Leaderboard that belongs to a Facebook Instant Game.
  * 
  * You do not need to instantiate this class directly, it will be created when you use the
  * `getLeaderboard()` method of the main plugin.
  */
@JSGlobal("Phaser.FacebookInstantGamesLeaderboard")
@js.native
open class FacebookInstantGamesLeaderboard protected ()
  extends StObject
     with typings.phaser.Phaser.FacebookInstantGamesLeaderboard {
  /**
    * 
    * @param plugin A reference to the Facebook Instant Games Plugin.
    * @param data An Instant Game leaderboard instance.
    */
  def this(plugin: typings.phaser.Phaser.FacebookInstantGamesPlugin, data: Any) = this()
}
