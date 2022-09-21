package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Seat")
@js.native
/* protected */ open class Seat () extends StObject {
  
  /**
    * If specified, contains a forced rotation that the riders in
    * this seat are facing.
    */
  val lockRiderRotation: Double = js.native
  
  /**
    * A maximum number of riders that this seat can support.
    */
  val maxRiderCount: Double = js.native
  
  /**
    * A minimum number of riders that can be placed in this seat
    * position, if this seat is to be filled.
    */
  val minRiderCount: Double = js.native
  
  /**
    * Physical location of this seat, relative to the entity's
    * location.
    */
  val position: Location = js.native
}
