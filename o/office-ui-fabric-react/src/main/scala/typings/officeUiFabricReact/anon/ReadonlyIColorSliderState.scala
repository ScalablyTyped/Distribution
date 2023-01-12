package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base.IColorSliderState> */
trait ReadonlyIColorSliderState extends StObject {
  
  val currentValue: Double
}
object ReadonlyIColorSliderState {
  
  inline def apply(currentValue: Double): ReadonlyIColorSliderState = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorSliderState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyIColorSliderState] (val x: Self) extends AnyVal {
    
    inline def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
  }
}
