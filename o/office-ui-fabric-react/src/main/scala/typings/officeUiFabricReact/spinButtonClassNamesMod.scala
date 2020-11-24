package typings.officeUiFabricReact

import typings.officeUiFabricReact.positioningTypesMod.Position
import typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonClassNames
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.classNames", JSImport.Namespace)
@js.native
object spinButtonClassNamesMod extends js.Object {
  
  def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection
  ): ISpinButtonClassNames = js.native
  def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: js.UndefOr[scala.Nothing],
    className: String
  ): ISpinButtonClassNames = js.native
  def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position
  ): ISpinButtonClassNames = js.native
  def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position,
    className: String
  ): ISpinButtonClassNames = js.native
}
