package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.VectorArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
  */
@js.native
trait IPlaySoundEventData extends StObject {
  
  /**
    * The pitch of the sound effect. A value of 1.0 will play the sound effect with regular pitch
    * @default 1.0
    */
  var pitch: Double = js.native
  
  /**
    * The position in the world we want to play the sound at
    * @default [0, 0, 0]
    */
  var position: VectorArray = js.native
  
  /**
    * The identifier of the sound you want to play. Only sounds defined in the applied resource packs can be played
    */
  var sound: String = js.native
  
  /**
    * The volume of the sound effect. A value of 1.0 will play the sound effect at the volume it was recorded at
    * @default 1.0
    */
  var volume: Double = js.native
}
object IPlaySoundEventData {
  
  @scala.inline
  def apply(pitch: Double, position: VectorArray, sound: String, volume: Double): IPlaySoundEventData = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaySoundEventData]
  }
  
  @scala.inline
  implicit class IPlaySoundEventDataMutableBuilder[Self <: IPlaySoundEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: VectorArray): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
