package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackTypesMod {
  type IStackComponent = typings.uifabricFoundation.libIcomponentMod.IComponent[
    typings.officeUiFabricReact.stackTypesMod.IStackProps, 
    typings.officeUiFabricReact.stackTypesMod.IStackTokens, 
    typings.officeUiFabricReact.stackTypesMod.IStackStyles, 
    typings.officeUiFabricReact.stackTypesMod.IStackProps, 
    js.Object
  ]
  type IStackSlot = typings.uifabricFoundation.libIslotsMod.ISlotProp[typings.officeUiFabricReact.stackTypesMod.IStackProps, scala.Nothing]
  type IStackStylesReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typings.officeUiFabricReact.stackTypesMod.IStackProps, 
        typings.officeUiFabricReact.stackTypesMod.IStackTokens, 
        typings.officeUiFabricReact.stackTypesMod.IStackStyles
      ], 
      js.Function
    ]
  ]
  type IStackTokenReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typings.officeUiFabricReact.stackTypesMod.IStackProps, 
        typings.officeUiFabricReact.stackTypesMod.IStackTokens
      ], 
      js.Function
    ]
  ]
}
