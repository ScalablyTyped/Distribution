package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "LeverActionEvent")
@js.native
/* protected */ open class LeverActionEvent () extends BlockEvent {
  
  /**
    * True if the lever is activated (that is, transmitting
    * power).
    */
  val isPowered: Boolean = js.native
  
  /**
    * Optional player that triggered the lever activation.
    */
  val player: Player = js.native
}
