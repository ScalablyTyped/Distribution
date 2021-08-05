package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoothCycle extends StObject {
  
  var cycle: Boolean
  
  var moderator: String
}
object BoothCycle {
  
  inline def apply(cycle: Boolean, moderator: String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothCycle]
  }
  
  extension [Self <: BoothCycle](x: Self) {
    
    inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
  }
}
