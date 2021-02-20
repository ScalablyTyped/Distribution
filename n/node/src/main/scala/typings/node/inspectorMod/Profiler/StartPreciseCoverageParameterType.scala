package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPreciseCoverageParameterType extends StObject {
  
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.native
}
object StartPreciseCoverageParameterType {
  
  @scala.inline
  def apply(): StartPreciseCoverageParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageParameterType]
  }
  
  @scala.inline
  implicit class StartPreciseCoverageParameterTypeMutableBuilder[Self <: StartPreciseCoverageParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallCount(value: Boolean): Self = StObject.set(x, "callCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallCountUndefined: Self = StObject.set(x, "callCount", js.undefined)
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
  }
}
