package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsStackStackDotTypesMod {
  import typings.atUifabricFoundation.libIComponentMod.IComponent
  import typings.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typings.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typings.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typings.atUifabricFoundation.libISlotsMod.ISlotProp
  import typings.std.Extract
  import typings.std.ReturnType

  type IStackComponent = IComponent[IStackProps, IStackTokens, IStackStyles, IStackProps, js.Object]
  type IStackSlot = ISlotProp[IStackProps, scala.Nothing]
  type IStackStyles = IComponentStyles[IStackSlots]
  type IStackStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles], js.Function]
  ]
  type IStackTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackProps, IStackTokens], js.Function]]
}
