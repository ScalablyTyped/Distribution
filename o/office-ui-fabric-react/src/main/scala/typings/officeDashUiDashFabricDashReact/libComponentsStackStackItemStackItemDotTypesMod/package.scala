package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsStackStackItemStackItemDotTypesMod {
  import typings.atUifabricFoundation.libIComponentMod.IComponent
  import typings.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typings.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typings.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typings.atUifabricFoundation.libISlotsMod.ISlotProp
  import typings.std.Extract
  import typings.std.ReturnType

  type IStackItemComponent = IComponent[IStackItemProps, IStackItemTokens, IStackItemStyles, IStackItemProps, js.Object]
  type IStackItemSlot = ISlotProp[IStackItemProps, scala.Nothing]
  type IStackItemStyles = IComponentStyles[IStackItemSlots]
  type IStackItemStylesReturnType = ReturnType[
    Extract[
      IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles], 
      js.Function
    ]
  ]
  type IStackItemTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackItemProps, IStackItemTokens], js.Function]]
}
