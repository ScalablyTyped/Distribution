package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerHint extends StObject {
  
  var profilerHint: Double
}
object ProfilerHint {
  
  inline def apply(profilerHint: Double): ProfilerHint = {
    val __obj = js.Dynamic.literal(profilerHint = profilerHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilerHint] (val x: Self) extends AnyVal {
    
    inline def setProfilerHint(value: Double): Self = StObject.set(x, "profilerHint", value.asInstanceOf[js.Any])
  }
}
