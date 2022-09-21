package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "World")
@js.native
/* protected */ open class World_ () extends StObject {
  
  def broadcastClientMessage(id: String, value: String): Unit = js.native
  
  /**
    * Contains a set of events that are applicable to the entirety
    * of the world.
    */
  val events: Events = js.native
  
  /**
    * @param dimensionId
    * @returns
    * The requested dimension
    * @throws
    * Throws if the given dimension name is invalid
    */
  def getDimension(dimensionId: String): Dimension = js.native
  
  /**
    * @remarks
    * Returns a property value.
    * @param identifier
    * @returns
    * Returns the value for the property, or undefined if the
    * property has not been set.
    * @throws This function can throw errors.
    */
  def getDynamicProperty(identifier: String): Boolean | Double | String = js.native
  
  /**
    * @remarks
    * Returns all players currently in the world.
    * @param options
    * @returns
    * All players currently in the world.
    * @throws This function can throw errors.
    */
  def getPlayers(): PlayerIterator = js.native
  def getPlayers(options: EntityQueryOptions): PlayerIterator = js.native
  
  /**
    * @remarks
    * Plays a particular music track for all players.
    * @param trackID
    * @param musicOptions
    */
  def playMusic(trackID: String): Unit = js.native
  def playMusic(trackID: String, musicOptions: MusicOptions): Unit = js.native
  
  /**
    * @remarks
    * Plays a sound for all players.
    * @param soundID
    * @param soundOptions
    */
  def playSound(soundID: String): Unit = js.native
  def playSound(soundID: String, soundOptions: SoundOptions): Unit = js.native
  
  /**
    * @remarks
    * Queues an additional music track for players. If a track is
    * not playing, a music track will play.
    * @param trackID
    * @param musicOptions
    */
  def queueMusic(trackID: String): Unit = js.native
  def queueMusic(trackID: String, musicOptions: MusicOptions): Unit = js.native
  
  /**
    * @remarks
    * Removes a specified property.
    * @param identifier
    * @throws This function can throw errors.
    */
  def removeDynamicProperty(identifier: String): Boolean = js.native
  
  def say(message: String): Unit = js.native
  /**
    * @remarks
    * Broadcasts a message that is displayed on all connected
    * clients.
    * @param message
    * @throws This function can throw errors.
    */
  def say(message: RawMessage): Unit = js.native
  
  /**
    * Returns the general global scoreboard that applies to the
    * world.
    */
  val scoreboard: Scoreboard = js.native
  
  def setDynamicProperty(identifier: String, value: String): Unit = js.native
  /**
    * @remarks
    * Sets a specified property to a value.
    * @param identifier
    * @param value
    * Data value of the property to set.
    * @throws This function can throw errors.
    */
  def setDynamicProperty(identifier: String, value: Boolean): Unit = js.native
  def setDynamicProperty(identifier: String, value: Double): Unit = js.native
  
  /**
    * @remarks
    * Stops any music tracks from playing.
    */
  def stopMusic(): Unit = js.native
}
