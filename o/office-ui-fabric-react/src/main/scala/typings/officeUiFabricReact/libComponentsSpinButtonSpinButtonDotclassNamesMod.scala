package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsSpinButtonSpinButtonDottypesMod.ISpinButtonClassNames
import typings.officeUiFabricReact.libComponentsSpinButtonSpinButtonDottypesMod.ISpinButtonStyles
import typings.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection
import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinButtonSpinButtonDotclassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection
  ): ISpinButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], isFocused.asInstanceOf[js.Any], keyboardSpinDirection.asInstanceOf[js.Any])).asInstanceOf[ISpinButtonClassNames]
  inline def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Unit,
    className: String
  ): ISpinButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], isFocused.asInstanceOf[js.Any], keyboardSpinDirection.asInstanceOf[js.Any], labelPosition.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ISpinButtonClassNames]
  inline def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position
  ): ISpinButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], isFocused.asInstanceOf[js.Any], keyboardSpinDirection.asInstanceOf[js.Any], labelPosition.asInstanceOf[js.Any])).asInstanceOf[ISpinButtonClassNames]
  inline def getClassNames(
    styles: ISpinButtonStyles,
    disabled: Boolean,
    isFocused: Boolean,
    keyboardSpinDirection: KeyboardSpinDirection,
    labelPosition: Position,
    className: String
  ): ISpinButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], isFocused.asInstanceOf[js.Any], keyboardSpinDirection.asInstanceOf[js.Any], labelPosition.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ISpinButtonClassNames]
}
