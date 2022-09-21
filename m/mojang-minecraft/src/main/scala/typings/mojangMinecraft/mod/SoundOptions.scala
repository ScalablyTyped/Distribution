package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "SoundOptions")
@js.native
open class SoundOptions () extends StObject {
  
  /**
    * Specifies a location of where to play a particular sound.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * Pitch adjustment level for the sound.
    */
  var pitch: Double = js.native
  
  /**
    * Relative volume level of the sound.
    */
  var volume: Double = js.native
}
