package typings.phaser.Phaser

import typings.phaser.AdInstance
import typings.phaser.ChooseContextConfig
import typings.phaser.Phaser.Data.DataManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Product
import typings.phaser.Purchase
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait FacebookInstantGamesPlugin extends EventEmitter {
  
  /**
    * Contains AdInstance objects, as created by the `preloadAds()` method.
    */
  var ads: js.Array[AdInstance] = js.native
  
  /**
    * Checks if the current player can subscribe to the game bot.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they can subscribe, the `playerCanSubscribeBot` property is set to `true`
    * and this plugin will emit the `cansubscribebot` event.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `cansubscribebotfail` event instead.
    */
  def canSubscribeBot(): this.type = js.native
  
  /**
    * The set of products that are registered to the game.
    */
  var catalog: js.Array[Product] = js.native
  
  /**
    * Checks to see if a given Facebook Instant Games API is available or not.
    * @param api The API to check for, i.e. `player.getID`.
    */
  def checkAPI(api: String): Boolean = js.native
  
  /**
    * Opens a context selection dialog for the player. If the player selects an available context,
    * the client will attempt to switch into that context, and emit the `choose` event if successful.
    * Otherwise, if the player exits the menu or the client fails to switch into the new context, the `choosefail` event will be emitted.
    * @param options An object specifying conditions on the contexts that should be offered.
    */
  def chooseContext(): this.type = js.native
  def chooseContext(options: ChooseContextConfig): this.type = js.native
  
  /**
    * Consumes a specific purchase belonging to the current player. Before provisioning a product's effects to the player,
    * the game should request the consumption of the purchased product. Once the purchase is successfully consumed,
    * the game should immediately provide the player with the effects of their purchase.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `consumepurchase` event along
    * with the purchase data.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `consumepurchasefail` event instead.
    * @param purchaseToken The purchase token of the purchase that should be consumed.
    */
  def consumePurchase(purchaseToken: String): this.type = js.native
  
  /**
    * A unique identifier for the current game context. This represents a specific context
    * that the game is being played in (for example, a particular messenger conversation or facebook post).
    * The identifier will be null if game is being played in a solo context.
    * This value is populated automatically during boot.
    */
  var contextID: String = js.native
  
  /**
    * The current context in which your game is running. This can be either `null` or
    * one of:
    * 
    * `POST` - The game is running inside of a Facebook post.
    * `THREAD` - The game is running inside a Facebook Messenger thread.
    * `GROUP` - The game is running inside a Facebook Group.
    * `SOLO` - This is the default context, the player is the only participant.
    * 
    * This value is populated automatically during boot.
    */
  var contextType: String = js.native
  
  /**
    * Attempts to create or switch into a context between a specified player and the current player.
    * This plugin will emit the `create` event once the context switch is completed.
    * If the API call fails, such as if the player listed is not a Connected Player of the current player or if the
    * player does not provide permission to enter the new context, then the plugin will emit a 'createfail' event.
    * @param playerID ID of the player.
    */
  def createContext(playerID: String): this.type = js.native
  
  /**
    * Prompts the user to create a shortcut to the game if they are eligible to.
    * Can only be called once per session.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If the user choose to create a shortcut this plugin will emit the `shortcutcreated` event.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `shortcutcreatedfail` event instead.
    */
  def createShortcut(): this.type = js.native
  
  /**
    * A Data Manager instance.
    * It allows you to store, query and retrieve any key/value data you may need to store.
    * It's also used internally by the plugin to store FBIG API data.
    */
  var data: DataManager = js.native
  
  /**
    * Is the Data Manager currently locked?
    */
  var dataLocked: Boolean = js.native
  
  /**
    * Holds the entry point that the game was launched from.
    * This value is populated automatically during boot.
    */
  var entryPoint: String = js.native
  
  /**
    * An object that contains any data associated with the entry point that the game was launched from.
    * The contents of the object are developer-defined, and can occur from entry points on different platforms.
    * This will return null for older mobile clients, as well as when there is no data associated with the particular entry point.
    * This value is populated automatically during boot.
    */
  var entryPointData: js.Any = js.native
  
  /**
    * Immediately flushes any changes to the player data to the designated cloud storage.
    * This function is expensive, and should primarily be used for critical changes where persistence needs to be immediate
    * and known by the game. Non-critical changes should rely on the platform to persist them in the background.
    * NOTE: Calls to player.setDataAsync will be rejected while this function's result is pending.
    * 
    * Data managed via this plugins Data Manager instance is automatically synced with Facebook. However, you can call this
    * method directly if you need to flush the data directly.
    * 
    * When the APIs `flushDataAsync` call resolves it will emit the `flushdata` event from this plugin. If the call fails for some
    * reason it will emit `flushdatafail` instead.
    */
  def flushData(): this.type = js.native
  
  /**
    * A reference to the Phaser.Game instance.
    */
  val game: Game = js.native
  
  /**
    * This method is called automatically when the game has finished loading,
    * if you used the `showLoadProgress` method. If your game doesn't need to
    * load any assets, or you're managing the load yourself, then call this
    * method directly to start the API running.
    * 
    * When the API has finished starting this plugin will emit a `startgame` event
    * which you should listen for.
    */
  def gameStarted(): Unit = js.native
  
  /**
    * Fetches the game's product catalog.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `getcatalog` event along
    * with the catalog data.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `getcatalogfail` event instead.
    */
  def getCatalog(): this.type = js.native
  
  /**
    * Gets the associated data from the player based on the given key, or array of keys.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes the data is set into this plugins Data Manager and the
    * `getdata` event will be emitted.
    * @param keys The key/s of the data to retrieve.
    */
  def getData(keys: String): this.type = js.native
  def getData(keys: js.Array[String]): this.type = js.native
  
  /**
    * Returns the unique identifier for the current game context. This represents a specific context
    * that the game is being played in (for example, a particular messenger conversation or facebook post).
    * The identifier will be null if game is being played in a solo context.
    * 
    * It is only populated if `contextGetID` is in the list of supported APIs.
    */
  def getID(): String = js.native
  
  /**
    * Fetch a specific leaderboard belonging to this Instant Game.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes the `getleaderboard` event will be emitted along with a Leaderboard object instance.
    * @param name The name of the leaderboard. Each leaderboard for an Instant Game must have its own distinct name.
    */
  def getLeaderboard(name: String): this.type = js.native
  
  /**
    * Returns the current locale.
    * See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    * Use this to determine what languages the current game should be localized with.
    * It is only populated if `getLocale` is in the list of supported APIs.
    */
  def getLocale(): String = js.native
  
  /**
    * Returns the platform on which the game is currently running, i.e. `IOS`.
    * It is only populated if `getPlatform` is in the list of supported APIs.
    */
  def getPlatform(): String = js.native
  
  /**
    * Returns the id of the player. This is a string based ID, the same as `FBInstant.player.getID()`.
    * It is only populated if `playerGetID` is in the list of supported APIs.
    */
  def getPlayerID(): String = js.native
  
  /**
    * Returns the player's localized display name.
    * It is only populated if `playerGetName` is in the list of supported APIs.
    */
  def getPlayerName(): String = js.native
  
  /**
    * Returns the url to the player's public profile photo. The photo will always be a square, and with dimensions
    * of at least 200x200. When rendering it in the game, the exact dimensions should never be assumed to be constant.
    * It's recommended to always scale the image to a desired size before rendering.
    * It is only populated if `playerGetPhoto` is in the list of supported APIs.
    */
  def getPlayerPhotoURL(): String = js.native
  
  /**
    * Fetches an array of ConnectedPlayer objects containing information about active players
    * (people who played the game in the last 90 days) that are connected to the current player.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `players` event along
    * with the player data.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `playersfail` event instead.
    */
  def getPlayers(): this.type = js.native
  
  /**
    * Fetches a single Product from the game's product catalog.
    * 
    * The product catalog must have been populated using `getCatalog` prior to calling this method.
    * 
    * Use this to look-up product details based on a purchase list.
    * @param productID The Product ID of the item to get from the catalog.
    */
  def getProduct(productID: String): Product = js.native
  
  /**
    * Fetches all of the player's unconsumed purchases. The game must fetch the current player's purchases
    * as soon as the client indicates that it is ready to perform payments-related operations,
    * i.e. at game start. The game can then process and consume any purchases that are waiting to be consumed.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `getpurchases` event along
    * with the purchase data.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `getpurchasesfail` event instead.
    */
  def getPurchases(): this.type = js.native
  
  /**
    * Returns the string representation of the Facebook Instant Games SDK version being used.
    * It is only populated if `getSDKVersion` is in the list of supported APIs.
    */
  def getSDKVersion(): String = js.native
  
  /**
    * Retrieve stats from the designated cloud storage of the current player.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes the `getstats` event will be emitted along with the data object returned.
    * 
    * If the call fails, i.e. it's not in the list of supported APIs, or the request was rejected,
    * it will emit a `getstatsfail` event instead.
    * @param keys An optional array of unique keys to retrieve stats for. If the function is called without it, it will fetch all stats.
    */
  def getStats(): this.type = js.native
  def getStats(keys: js.Array[String]): this.type = js.native
  
  /**
    * Returns the current context in which your game is running. This can be either `null` or one of:
    * 
    * `POST` - The game is running inside of a Facebook post.
    * `THREAD` - The game is running inside a Facebook Messenger thread.
    * `GROUP` - The game is running inside a Facebook Group.
    * `SOLO` - This is the default context, the player is the only participant.
    * 
    * It is only populated if `contextGetType` is in the list of supported APIs.
    */
  def getType(): String = js.native
  
  /**
    * Has the Facebook Instant Games API loaded yet?
    * This is set automatically during the boot process.
    */
  var hasLoaded: Boolean = js.native
  
  /**
    * Increment the stats of the current player and save them to the designated cloud storage.
    * 
    * Stats in the Facebook Instant Games API are purely numerical values paired with a string-based key. Only numbers can be saved as stats,
    * all other data types will be ignored.
    * 
    * The data object provided for this call should contain offsets for how much to modify the stats by:
    * 
    * ```javascript
    * this.facebook.incStats({
    *     level: 1,
    *     zombiesSlain: 17,
    *     rank: -1
    * });
    * ```
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes the `incstats` event will be emitted along with the data object returned.
    * 
    * If the call fails, i.e. it's not in the list of supported APIs, or the request was rejected,
    * it will emit a `incstatsfail` event instead.
    * @param data An object containing a set of key-value pairs indicating how much to increment each stat in cloud storage. Note that only numerical values are processed.
    */
  def incStats(data: js.Object): this.type = js.native
  
  /**
    * This function determines whether the number of participants in the current game context is between a given minimum and maximum, inclusive.
    * If one of the bounds is null only the other bound will be checked against.
    * It will always return the original result for the first call made in a context in a given game play session.
    * Subsequent calls, regardless of arguments, will return the answer to the original query until a context change occurs and the query result is reset.
    * @param min The minimum bound of the context size query.
    * @param max The maximum bound of the context size query.
    */
  def isSizeBetween(): js.Object = js.native
  def isSizeBetween(min: js.UndefOr[scala.Nothing], max: integer): js.Object = js.native
  def isSizeBetween(min: integer): js.Object = js.native
  def isSizeBetween(min: integer, max: integer): js.Object = js.native
  
  /**
    * Contains all of the leaderboard data, as populated by the `getLeaderboard()` method.
    */
  var leaderboards: js.Array[FacebookInstantGamesLeaderboard] = js.native
  
  /**
    * Load the player's photo and store it in the Texture Manager, ready for use in-game.
    * 
    * This method works by using a Scene Loader instance and then asking the Loader to
    * retrieve the image.
    * 
    * When complete the plugin will emit a `photocomplete` event, along with the key of the photo.
    * 
    * ```javascript
    * this.facebook.loadPlayerPhoto(this, 'player').once('photocomplete', function (key) {
    *   this.add.image(x, y, 'player');
    * }, this);
    * ```
    * @param scene The Scene that will be responsible for loading this photo.
    * @param key The key to use when storing the photo in the Texture Manager.
    */
  def loadPlayerPhoto(scene: Scene, key: String): this.type = js.native
  
  /**
    * The current locale.
    * See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    * Use this to determine what languages the current game should be localized with.
    * This value is populated automatically during boot.
    */
  var locale: String = js.native
  
  /**
    * Log an app event with FB Analytics.
    * 
    * See https://developers.facebook.com/docs/javascript/reference/v2.8#app_events for more details about FB Analytics.
    * @param name Name of the event. Must be 2 to 40 characters, and can only contain '_', '-', ' ', and alphanumeric characters.
    * @param value An optional numeric value that FB Analytics can calculate a sum with.
    * @param params An optional object that can contain up to 25 key-value pairs to be logged with the event. Keys must be 2 to 40 characters, and can only contain '_', '-', ' ', and alphanumeric characters. Values must be less than 100 characters in length.
    */
  def log(name: String): this.type = js.native
  def log(name: String, value: js.UndefOr[scala.Nothing], params: js.Object): this.type = js.native
  def log(name: String, value: Double): this.type = js.native
  def log(name: String, value: Double, params: js.Object): this.type = js.native
  
  /**
    * Attempts to match the current player with other users looking for people to play with.
    * If successful, a new Messenger group thread will be created containing the matched players and the player will
    * be context switched to that thread. This plugin will also dispatch the `matchplayer` event, containing the new context ID and Type.
    * 
    * The default minimum and maximum number of players in one matched thread are 2 and 20 respectively,
    * depending on how many players are trying to get matched around the same time.
    * 
    * The values can be changed in `fbapp-config.json`. See the Bundle Config documentation for documentation about `fbapp-config.json`.
    * @param matchTag Optional extra information about the player used to group them with similar players. Players will only be grouped with other players with exactly the same tag. The tag must only include letters, numbers, and underscores and be 100 characters or less in length.
    * @param switchImmediately Optional extra parameter that specifies whether the player should be immediately switched to the new context when a match is found. By default this will be false which will mean the player needs explicitly press play after being matched to switch to the new context. Default false.
    */
  def matchPlayer(): this.type = js.native
  def matchPlayer(matchTag: js.UndefOr[scala.Nothing], switchImmediately: Boolean): this.type = js.native
  def matchPlayer(matchTag: String): this.type = js.native
  def matchPlayer(matchTag: String, switchImmediately: Boolean): this.type = js.native
  
  /**
    * This invokes a dialog to let the user share specified content, either as a message in Messenger or as a post on the user's timeline.
    * 
    * A blob of data can be attached to the share which every game session launched from the share will be able to access via the `this.entryPointData` property.
    * 
    * This data must be less than or equal to 1000 characters when stringified.
    * 
    * When this method is called you should consider your game paused. Listen out for the `resume` event from this plugin to know when the dialog has been closed.
    * 
    * The user may choose to cancel the share action and close the dialog. The resulting `resume` event will be dispatched regardless if the user actually shared the content or not.
    * @param text A text message to be shared.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param sessionData A blob of data to attach to the share.
    */
  def openChallenge(text: String, key: String): this.type = js.native
  def openChallenge(text: String, key: String, frame: js.UndefOr[scala.Nothing], sessionData: js.Object): this.type = js.native
  def openChallenge(text: String, key: String, frame: String): this.type = js.native
  def openChallenge(text: String, key: String, frame: String, sessionData: js.Object): this.type = js.native
  
  /**
    * This invokes a dialog to let the user invite a friend to play this game, either as a message in Messenger or as a post on the user's timeline.
    * 
    * A blob of data can be attached to the share which every game session launched from the share will be able to access via the `this.entryPointData` property.
    * 
    * This data must be less than or equal to 1000 characters when stringified.
    * 
    * When this method is called you should consider your game paused. Listen out for the `resume` event from this plugin to know when the dialog has been closed.
    * 
    * The user may choose to cancel the share action and close the dialog. The resulting `resume` event will be dispatched regardless if the user actually shared the content or not.
    * @param text A text message to be shared.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param sessionData A blob of data to attach to the share.
    */
  def openInvite(text: String, key: String): this.type = js.native
  def openInvite(text: String, key: String, frame: js.UndefOr[scala.Nothing], sessionData: js.Object): this.type = js.native
  def openInvite(text: String, key: String, frame: String): this.type = js.native
  def openInvite(text: String, key: String, frame: String, sessionData: js.Object): this.type = js.native
  
  /**
    * This invokes a dialog to let the user share specified content, either as a message in Messenger or as a post on the user's timeline.
    * 
    * A blob of data can be attached to the share which every game session launched from the share will be able to access via the `this.entryPointData` property.
    * 
    * This data must be less than or equal to 1000 characters when stringified.
    * 
    * When this method is called you should consider your game paused. Listen out for the `resume` event from this plugin to know when the dialog has been closed.
    * 
    * The user may choose to cancel the share action and close the dialog. The resulting `resume` event will be dispatched regardless if the user actually shared the content or not.
    * @param text A text message to be shared.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param sessionData A blob of data to attach to the share.
    */
  def openRequest(text: String, key: String): this.type = js.native
  def openRequest(text: String, key: String, frame: js.UndefOr[scala.Nothing], sessionData: js.Object): this.type = js.native
  def openRequest(text: String, key: String, frame: String): this.type = js.native
  def openRequest(text: String, key: String, frame: String, sessionData: js.Object): this.type = js.native
  
  /**
    * This invokes a dialog to let the user share specified content, either as a message in Messenger or as a post on the user's timeline.
    * 
    * A blob of data can be attached to the share which every game session launched from the share will be able to access via the `this.entryPointData` property.
    * 
    * This data must be less than or equal to 1000 characters when stringified.
    * 
    * When this method is called you should consider your game paused. Listen out for the `resume` event from this plugin to know when the dialog has been closed.
    * 
    * The user may choose to cancel the share action and close the dialog. The resulting `resume` event will be dispatched regardless if the user actually shared the content or not.
    * @param text A text message to be shared.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param sessionData A blob of data to attach to the share.
    */
  def openShare(text: String, key: String): this.type = js.native
  def openShare(text: String, key: String, frame: js.UndefOr[scala.Nothing], sessionData: js.Object): this.type = js.native
  def openShare(text: String, key: String, frame: String): this.type = js.native
  def openShare(text: String, key: String, frame: String, sessionData: js.Object): this.type = js.native
  
  /**
    * Does the current platform and context allow for use of the payments API?
    * Currently this is only available on Facebook.com and Android 6+.
    */
  var paymentsReady: Boolean = js.native
  
  /**
    * The platform on which the game is currently running, i.e. `IOS`.
    * This value is populated automatically during boot.
    */
  var platform: String = js.native
  
  /**
    * Whether a player can subscribe to the game bot or not.
    */
  var playerCanSubscribeBot: Boolean = js.native
  
  /**
    * Holds the id of the player. This is a string based ID, the same as `FBInstant.player.getID()`.
    * This value is populated automatically during boot if the API is supported.
    */
  var playerID: String = js.native
  
  /**
    * The player's localized display name.
    * This value is populated automatically during boot if the API is supported.
    */
  var playerName: String = js.native
  
  /**
    * A url to the player's public profile photo. The photo will always be a square, and with dimensions
    * of at least 200x200. When rendering it in the game, the exact dimensions should never be assumed to be constant.
    * It's recommended to always scale the image to a desired size before rendering.
    * This value is populated automatically during boot if the API is supported.
    */
  var playerPhotoURL: String = js.native
  
  /**
    * Attempt to create an instance of an interstitial ad.
    * 
    * If the instance is created successfully then the ad is preloaded ready for display in-game via the method `showAd()`.
    * 
    * If the ad loads it will emit the `adloaded` event, passing the AdInstance as the only parameter.
    * 
    * If the ad cannot be displayed because there was no inventory to fill it, it will emit the `adsnofill` event.
    * @param placementID The ad placement ID, or an array of IDs, as created in your Audience Network settings within Facebook.
    */
  def preloadAds(placementID: String): this.type = js.native
  def preloadAds(placementID: js.Array[String]): this.type = js.native
  
  /**
    * Attempt to create an instance of an rewarded video ad.
    * 
    * If the instance is created successfully then the ad is preloaded ready for display in-game via the method `showVideo()`.
    * 
    * If the ad loads it will emit the `adloaded` event, passing the AdInstance as the only parameter.
    * 
    * If the ad cannot be displayed because there was no inventory to fill it, it will emit the `adsnofill` event.
    * @param placementID The ad placement ID, or an array of IDs, as created in your Audience Network settings within Facebook.
    */
  def preloadVideoAds(placementID: String): this.type = js.native
  def preloadVideoAds(placementID: js.Array[String]): this.type = js.native
  
  /**
    * Begins the purchase flow for a specific product.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `purchase` event along
    * with the purchase data.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `purchasefail` event instead.
    * @param productID The identifier of the product to purchase.
    * @param developerPayload An optional developer-specified payload, to be included in the returned purchase's signed request.
    */
  def purchase(productID: String): this.type = js.native
  def purchase(productID: String, developerPayload: String): this.type = js.native
  
  /**
    * Contains all of the player's unconsumed purchases.
    * The game must fetch the current player's purchases as soon as the client indicates that it is ready to perform payments-related operations,
    * i.e. at game start. The game can then process and consume any purchases that are waiting to be consumed.
    */
  var purchases: js.Array[Purchase] = js.native
  
  /**
    * Quits the game.
    */
  def quit(): Unit = js.native
  
  /**
    * Set data to be saved to the designated cloud storage of the current player. The game can store up to 1MB of data for each unique player.
    * 
    * The data save is requested in an async call, so the result isn't available immediately.
    * 
    * Data managed via this plugins Data Manager instance is automatically synced with Facebook. However, you can call this
    * method directly if you need to replace the data object directly.
    * 
    * When the APIs `setDataAsync` call resolves it will emit the `savedata` event from this plugin. If the call fails for some
    * reason it will emit `savedatafail` instead.
    * 
    * The call resolving does not necessarily mean that the input has already been persisted. Rather, it means that the data was valid and
    * has been scheduled to be saved. It also guarantees that all values that were set are now available in `getData`.
    * @param data An object containing a set of key-value pairs that should be persisted to cloud storage.
    * The object must contain only serializable values - any non-serializable values will cause the entire modification to be rejected.
    */
  def saveData(data: js.Object): this.type = js.native
  
  /**
    * Sets the data associated with the individual gameplay session for the current context.
    * 
    * This function should be called whenever the game would like to update the current session data.
    * 
    * This session data may be used to populate a variety of payloads, such as game play webhooks.
    * @param data An arbitrary data object, which must be less than or equal to 1000 characters when stringified.
    */
  def saveSession(data: js.Object): this.type = js.native
  
  /**
    * Save the stats of the current player to the designated cloud storage.
    * 
    * Stats in the Facebook Instant Games API are purely numerical values paired with a string-based key. Only numbers can be saved as stats,
    * all other data types will be ignored.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes the `savestats` event will be emitted along with the data object returned.
    * 
    * If the call fails, i.e. it's not in the list of supported APIs, or the request was rejected,
    * it will emit a `savestatsfail` event instead.
    * @param data An object containing a set of key-value pairs that should be persisted to cloud storage as stats. Note that only numerical values are stored.
    */
  def saveStats(data: js.Object): this.type = js.native
  
  /**
    * Displays a previously loaded interstitial ad.
    * 
    * If the ad is successfully displayed this plugin will emit the `adfinished` event, with the AdInstance object as its parameter.
    * 
    * If the ad cannot be displayed, it will emit the `adsnotloaded` event.
    * @param placementID The ad placement ID to display.
    */
  def showAd(placementID: String): this.type = js.native
  
  /**
    * Call this method from your `Scene.preload` in order to sync the load progress
    * of the Phaser Loader with the Facebook Instant Games loader display, i.e.:
    * 
    * ```javascript
    * this.facebook.showLoadProgress(this);
    * this.facebook.once('startgame', this.startGame, this);
    * ```
    * @param scene The Scene for which you want to show loader progress for.
    */
  def showLoadProgress(scene: Scene): this.type = js.native
  
  /**
    * Displays a previously loaded interstitial video ad.
    * 
    * If the ad is successfully displayed this plugin will emit the `adfinished` event, with the AdInstance object as its parameter.
    * 
    * If the ad cannot be displayed, it will emit the `adsnotloaded` event.
    * @param placementID The ad placement ID to display.
    */
  def showVideo(placementID: String): this.type = js.native
  
  /**
    * Subscribes the current player to the game bot.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If they are successfully subscribed this plugin will emit the `subscribebot` event.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `subscribebotfail` event instead.
    */
  def subscribeBot(): this.type = js.native
  
  /**
    * A list of the Facebook Instant Games APIs that are available,
    * based on the given platform, context and user privacy settings.
    * This value is populated automatically during boot.
    */
  var supportedAPIs: js.Array[String] = js.native
  
  /**
    * Request a switch into a specific context. If the player does not have permission to enter that context,
    * or if the player does not provide permission for the game to enter that context, this will emit a `switchfail` event.
    * 
    * Otherwise, the plugin will emit the `switch` event when the game has switched into the specified context.
    * @param contextID The ID of the desired context.
    */
  def switchContext(contextID: String): this.type = js.native
  
  /**
    * Request that the client switch to a different Instant Game.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * If the game switches successfully this plugin will emit the `switchgame` event and the client will load the new game.
    * 
    * If they cannot, i.e. it's not in the list of supported APIs, or the request
    * was rejected, it will emit a `switchgamefail` event instead.
    * @param appID The Application ID of the Instant Game to switch to. The application must be an Instant Game, and must belong to the same business as the current game.
    * @param data An optional data payload. This will be set as the entrypoint data for the game being switched to. Must be less than or equal to 1000 characters when stringified.
    */
  def switchGame(appID: String): this.type = js.native
  def switchGame(appID: String, data: js.Object): this.type = js.native
  
  /**
    * Informs Facebook of a custom update that occurred in the game.
    * This will temporarily yield control to Facebook and Facebook will decide what to do based on what the update is.
    * Once Facebook returns control to the game the plugin will emit an `update` or `updatefail` event.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * The `text` parameter is an update payload with the following structure:
    * 
    * ```
    * text: {
    *     default: 'X just invaded Y\'s village!',
    *     localizations: {
    *         ar_AR: 'X \\u0641\\u0642\\u0637 \\u063A\\u0632\\u062A ' +
    *         '\\u0642\\u0631\\u064A\\u0629 Y!',
    *         en_US: 'X just invaded Y\'s village!',
    *         es_LA: '\\u00A1X acaba de invadir el pueblo de Y!',
    *     }
    * }
    * ```
    * @param cta The call to action text.
    * @param text The text object.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param template The update template key.
    * @param updateData The update data object payload.
    */
  def update(cta: String, text: js.Object, key: String, frame: String, template: String, updateData: js.Object): this.type = js.native
  def update(cta: String, text: js.Object, key: String, frame: integer, template: String, updateData: js.Object): this.type = js.native
  
  /**
    * Informs Facebook of a leaderboard update that occurred in the game.
    * This will temporarily yield control to Facebook and Facebook will decide what to do based on what the update is.
    * Once Facebook returns control to the game the plugin will emit an `update` or `updatefail` event.
    * 
    * It makes an async call to the API, so the result isn't available immediately.
    * 
    * The `text` parameter is an update payload with the following structure:
    * 
    * ```
    * text: {
    *     default: 'X just invaded Y\'s village!',
    *     localizations: {
    *         ar_AR: 'X \\u0641\\u0642\\u0637 \\u063A\\u0632\\u062A ' +
    *         '\\u0642\\u0631\\u064A\\u0629 Y!',
    *         en_US: 'X just invaded Y\'s village!',
    *         es_LA: '\\u00A1X acaba de invadir el pueblo de Y!',
    *     }
    * }
    * ```
    * @param cta The call to action text.
    * @param text The text object.
    * @param key The key of the texture to use as the share image.
    * @param frame The frame of the texture to use as the share image. Set to `null` if you don't require a frame, but do need to set session data.
    * @param template The update template key.
    * @param updateData The update data object payload.
    */
  def updateLeaderboard(cta: String, text: js.Object, key: String, frame: String, template: String, updateData: js.Object): this.type = js.native
  def updateLeaderboard(cta: String, text: js.Object, key: String, frame: integer, template: String, updateData: js.Object): this.type = js.native
  
  /**
    * The string representation of the Facebook Instant Games SDK version being used.
    * This value is populated automatically during boot.
    */
  var version: String = js.native
}
