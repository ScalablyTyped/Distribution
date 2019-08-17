package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTextTextDotTypesMod {
  import typings.atUifabricFoundation.libIComponentMod.IComponent
  import typings.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typings.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typings.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typings.atUifabricFoundation.libISlotsMod.ISlotProp
  import typings.std.Extract
  import typings.std.ReturnType

  type ITextComponent = IComponent[ITextProps, ITextTokens, ITextStyles, ITextProps, js.Object]
  type ITextSlot = ISlotProp[ITextProps, String]
  type ITextStyles = IComponentStyles[ITextSlots]
  type ITextStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles], js.Function]
  ]
  type ITextTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[ITextProps, ITextTokens], js.Function]]
}
