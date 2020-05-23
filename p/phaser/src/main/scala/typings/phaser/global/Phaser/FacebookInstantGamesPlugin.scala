package typings.phaser.global.Phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Facebook Instant Games Plugin for Phaser 3 provides a seamless bridge between Phaser
  * and the Facebook Instant Games API version 6.2.
  * 
  * You can access this plugin via the `facebook` property in a Scene, i.e:
  * 
  * ```javascript
  * this.facebook.getPlatform();
  * ```
  * 
  * If this is unavailable please check to make sure you're using a build of Phaser that has
  * this plugin within it. You can quickly check this by looking at the dev tools console
  * header - the Phaser version number will have `-FB` after it if this plugin is loaded.
  * 
  * If you are building your own version of Phaser then use this Webpack DefinePlugin flag:
  * 
  * `"typeof PLUGIN_FBINSTANT": JSON.stringify(true)`
  * 
  * You will find that every Instant Games API method has a mapping in this plugin.
  * For a full list please consult either the plugin documentation, or the 6.2 SDK documentation
  * at https://developers.facebook.com/docs/games/instant-games/sdk/fbinstant6.2
  * 
  * Internally this plugin uses its own Data Manager to handle seamless user data updates and provides
  * handy functions for advertisement displaying, opening share dialogs, logging, leaderboards, purchase API requests,
  * loader integration and more.
  * 
  * To get started with Facebook Instant Games you will need to register on Facebook and create a new Instant
  * Game app that has its own unique app ID. Facebook have also provided a dashboard interface for setting up
  * various features for your game, including leaderboards, ad requests and the payments API. There are lots
  * of guides on the Facebook Developers portal to assist with setting these
  * various systems up: https://developers.facebook.com/docs/games/instant-games/guides
  * 
  * For more details follow the Quick Start guide here: https://developers.facebook.com/docs/games/instant-games
  */
@JSGlobal("Phaser.FacebookInstantGamesPlugin")
@js.native
class FacebookInstantGamesPlugin protected ()
  extends typings.phaser.Phaser.FacebookInstantGamesPlugin {
  /**
    * 
    * @param game A reference to the Phaser.Game instance.
    */
  def this(game: typings.phaser.Phaser.Game) = this()
}

