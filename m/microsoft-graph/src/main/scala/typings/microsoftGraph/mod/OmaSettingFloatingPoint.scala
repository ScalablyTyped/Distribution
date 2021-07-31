package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingFloatingPoint
  extends StObject
     with OmaSetting {
  
  // Value.
  var value: js.UndefOr[Double] = js.undefined
}
object OmaSettingFloatingPoint {
  
  @scala.inline
  def apply(): OmaSettingFloatingPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingFloatingPoint]
  }
  
  @scala.inline
  implicit class OmaSettingFloatingPointMutableBuilder[Self <: OmaSettingFloatingPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
