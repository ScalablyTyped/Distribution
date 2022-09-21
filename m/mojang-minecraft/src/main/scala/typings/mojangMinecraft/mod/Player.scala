package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Player")
@js.native
/* protected */ open class Player () extends Entity {
  
  /**
    * @remarks
    * Gets the current item cooldown time for a particular
    * cooldown category.
    * @param itemCategory
    * Specifies the cooldown category to retrieve the current
    * cooldown for.
    * @throws This function can throw errors.
    */
  def getItemCooldown(itemCategory: String): Double = js.native
  
  /**
    * Name of the player.
    * @throws This property can throw when used.
    */
  val name: String = js.native
  
  /**
    * Contains methods for manipulating the on-screen display of a
    * Player.
    */
  val onScreenDisplay: ScreenDisplay = js.native
  
  /**
    * @remarks
    * Plays a sound that only this particular player can hear.
    * @param soundID
    * Identifier of the sound to play.
    * @param soundOptions
    * Additional optional options for the sound.
    * @throws This function can throw errors.
    */
  def playSound(soundID: String): Unit = js.native
  def playSound(soundID: String, soundOptions: SoundOptions): Unit = js.native
  
  /**
    * Manages the selected slot in the player's hotbar.
    */
  var selectedSlot: Double = js.native
  
  /**
    * @remarks
    * Sets the item cooldown time for a particular cooldown
    * category.
    * @param itemCategory
    * Specifies the cooldown category to retrieve the current
    * cooldown for.
    * @param tickDuration
    * Duration in ticks of the item cooldown.
    * @throws This function can throw errors.
    */
  def startItemCooldown(itemCategory: String, tickDuration: Double): Unit = js.native
  
  def tell(message: String): Unit = js.native
  /**
    * @remarks
    * Sends a message that is displayed on the connected client
    * for this player.
    * @param message
    * @throws This function can throw errors.
    */
  def tell(message: RawMessage): Unit = js.native
}
