package typings.officeUiFabricReact.spinButtonClassNamesMod

import typings.officeUiFabricReact.positioningTypesMod.Position
import typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.classNames", "getClassNames")
@js.native
object getClassNames extends js.Object {
  def apply(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection
  ): ISpinButtonClassNames = js.native
  def apply(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position
  ): ISpinButtonClassNames = js.native
  def apply(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position,
    className: String
  ): ISpinButtonClassNames = js.native
}

