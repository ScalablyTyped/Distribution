package typings.officeUiFabricReact.spinButtonSpinButtonMod

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.positioningTypesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonProps, 'step' | 'min' | 'max' | 'disabled' | 'labelPosition' | 'label' | 'incrementButtonIcon' | 'decrementButtonIcon'>> */
@js.native
trait DefaultProps extends js.Object {
  
  var decrementButtonIcon: IIconProps = js.native
  
  var disabled: Boolean = js.native
  
  var incrementButtonIcon: IIconProps = js.native
  
  var label: String = js.native
  
  var labelPosition: Position = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var step: Double = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply(
    decrementButtonIcon: IIconProps,
    disabled: Boolean,
    incrementButtonIcon: IIconProps,
    label: String,
    labelPosition: Position,
    max: Double,
    min: Double,
    step: Double
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(decrementButtonIcon = decrementButtonIcon.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], incrementButtonIcon = incrementButtonIcon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
    
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
    def setDecrementButtonIcon(value: IIconProps): Self = this.set("decrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementButtonIcon(value: IIconProps): Self = this.set("incrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: Position): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
