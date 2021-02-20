package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoothCycle extends StObject {
  
  var cycle: Boolean = js.native
  
  var moderator: String = js.native
}
object BoothCycle {
  
  @scala.inline
  def apply(cycle: Boolean, moderator: String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothCycle]
  }
  
  @scala.inline
  implicit class BoothCycleMutableBuilder[Self <: BoothCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
  }
}
