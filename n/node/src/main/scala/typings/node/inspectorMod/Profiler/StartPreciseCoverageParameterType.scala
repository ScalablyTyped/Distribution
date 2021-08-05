package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPreciseCoverageParameterType extends StObject {
  
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.undefined
}
object StartPreciseCoverageParameterType {
  
  inline def apply(): StartPreciseCoverageParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageParameterType]
  }
  
  extension [Self <: StartPreciseCoverageParameterType](x: Self) {
    
    inline def setCallCount(value: Boolean): Self = StObject.set(x, "callCount", value.asInstanceOf[js.Any])
    
    inline def setCallCountUndefined: Self = StObject.set(x, "callCount", js.undefined)
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
  }
}
