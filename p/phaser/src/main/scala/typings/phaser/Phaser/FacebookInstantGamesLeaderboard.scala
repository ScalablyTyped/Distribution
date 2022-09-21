package typings.phaser.Phaser

import typings.phaser.LeaderboardScore
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents one single Leaderboard that belongs to a Facebook Instant Game.
  * 
  * You do not need to instantiate this class directly, it will be created when you use the
  * `getLeaderboard()` method of the main plugin.
  */
@js.native
trait FacebookInstantGamesLeaderboard
  extends StObject
     with EventEmitter {
  
  /**
    * The ID of the context that the leaderboard is associated with, or null if the leaderboard is not tied to a particular context.
    */
  var contextID: String = js.native
  
  /**
    * The total number of player entries in the leaderboard.
    * This value defaults to zero. Populate it via the `getEntryCount()` method.
    */
  var entryCount: integer = js.native
  
  /**
    * Retrieves a set of leaderboard entries, based on the current player's connected players (including the current player), ordered by local rank within the set of connected players.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes this Leaderboard will emit the `getconnectedscores` event along with an array of LeaderboardScore entries and the name of the Leaderboard.
    */
  def getConnectedScores(): this.type = js.native
  
  /**
    * Fetches the total number of player entries in the leaderboard.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes this Leaderboard will emit the `getentrycount` event along with the count and name of the Leaderboard.
    */
  def getEntryCount(): this.type = js.native
  
  /**
    * Gets the players leaderboard entry and stores it in the `playerScore` property.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes this Leaderboard will emit the `getplayerscore` event along with the score and the name of the Leaderboard.
    * 
    * If the player has not yet saved a score, the event will send `null` as the score value, and `playerScore` will be set to `null` as well.
    */
  def getPlayerScore(): this.type = js.native
  
  /**
    * Retrieves a set of leaderboard entries, ordered by score ranking in the leaderboard.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes this Leaderboard will emit the `getscores` event along with an array of LeaderboardScore entries and the name of the Leaderboard.
    * @param count The number of entries to attempt to fetch from the leaderboard. Currently, up to a maximum of 100 entries may be fetched per query. Default 10.
    * @param offset The offset from the top of the leaderboard that entries will be fetched from. Default 0.
    */
  def getScores(): this.type = js.native
  def getScores(count: Unit, offset: integer): this.type = js.native
  def getScores(count: integer): this.type = js.native
  def getScores(count: integer, offset: integer): this.type = js.native
  
  /**
    * The name of the leaderboard.
    */
  var name: String = js.native
  
  /**
    * The players score object.
    * This value defaults to `null`. Populate it via the `getPlayerScore()` method.
    */
  var playerScore: LeaderboardScore = js.native
  
  /**
    * A reference to the Facebook Instant Games Plugin.
    */
  var plugin: FacebookInstantGamesPlugin = js.native
  
  /**
    * An Instant Game leaderboard instance.
    */
  var ref: Any = js.native
  
  /**
    * The scores in the Leaderboard from the currently requested range.
    * This value defaults to an empty array. Populate it via the `getScores()` method.
    * The contents of this array are reset each time `getScores()` is called.
    */
  var scores: js.Array[LeaderboardScore] = js.native
  
  /**
    * Updates the player's score. If the player has an existing score, the old score will only be replaced if the new score is better than it.
    * NOTE: If the leaderboard is associated with a specific context, the game must be in that context to set a score for the player.
    * 
    * The data is requested in an async call, so the result isn't available immediately.
    * 
    * When the call completes this Leaderboard will emit the `setscore` event along with the LeaderboardScore object and the name of the Leaderboard.
    * 
    * If the save fails the event will send `null` as the score value.
    * @param score The new score for the player. Must be a 64-bit integer number.
    * @param data Metadata to associate with the stored score. Must be less than 2KB in size. If an object is given it will be passed to `JSON.stringify`.
    */
  def setScore(score: integer): this.type = js.native
  def setScore(score: integer, data: String): this.type = js.native
  def setScore(score: integer, data: Any): this.type = js.native
}
