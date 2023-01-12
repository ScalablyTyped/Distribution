package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a number of samples attributed to a certain source position.
  */
trait PositionTickInfo extends StObject {
  
  /**
    * Source line number (1-based).
    */
  var line: Double
  
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: Double
}
object PositionTickInfo {
  
  inline def apply(line: Double, ticks: Double): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTickInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionTickInfo] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
