package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientRule extends StObject {
  
  /** The final interpolation point. */
  var maxpoint: js.UndefOr[InterpolationPoint] = js.native
  
  /** An optional midway interpolation point. */
  var midpoint: js.UndefOr[InterpolationPoint] = js.native
  
  /** The starting interpolation point. */
  var minpoint: js.UndefOr[InterpolationPoint] = js.native
}
object GradientRule {
  
  @scala.inline
  def apply(): GradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientRule]
  }
  
  @scala.inline
  implicit class GradientRuleMutableBuilder[Self <: GradientRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxpoint(value: InterpolationPoint): Self = StObject.set(x, "maxpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxpointUndefined: Self = StObject.set(x, "maxpoint", js.undefined)
    
    @scala.inline
    def setMidpoint(value: InterpolationPoint): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    @scala.inline
    def setMinpoint(value: InterpolationPoint): Self = StObject.set(x, "minpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinpointUndefined: Self = StObject.set(x, "minpoint", js.undefined)
  }
}
