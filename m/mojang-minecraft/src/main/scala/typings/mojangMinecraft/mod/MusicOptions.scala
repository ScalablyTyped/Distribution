package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "MusicOptions")
@js.native
open class MusicOptions () extends StObject {
  
  /**
    * Specifies a fade overlap for music at the end of play.
    */
  var fade: Double = js.native
  
  /**
    * If set to true, this music track will play repeatedly.
    */
  var loop: Boolean = js.native
  
  /**
    * Relative volume level of the music.
    */
  var volume: Double = js.native
}
