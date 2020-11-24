package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base.IColorSliderState> */
@js.native
trait ReadonlyIColorSliderState extends js.Object {
  
  val currentValue: Double = js.native
}
object ReadonlyIColorSliderState {
  
  @scala.inline
  def apply(currentValue: Double): ReadonlyIColorSliderState = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorSliderState]
  }
  
  @scala.inline
  implicit class ReadonlyIColorSliderStateOps[Self <: ReadonlyIColorSliderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentValue(value: Double): Self = this.set("currentValue", value.asInstanceOf[js.Any])
  }
}
