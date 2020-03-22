package typings.officeUiFabricReact.spinButtonSpinButtonMod

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.positioningTypesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonProps, 'step' | 'min' | 'max' | 'disabled' | 'labelPosition' | 'label' | 'incrementButtonIcon' | 'decrementButtonIcon'>> */
trait DefaultProps extends js.Object {
  var decrementButtonIcon: IIconProps
  var disabled: Boolean
  var incrementButtonIcon: IIconProps
  var label: String
  var labelPosition: Position
  var max: Double
  var min: Double
  var step: Double
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
}

