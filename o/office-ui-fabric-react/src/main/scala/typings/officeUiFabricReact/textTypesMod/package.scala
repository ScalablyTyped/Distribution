package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textTypesMod {
  type ITextComponent = typings.uifabricFoundation.libIcomponentMod.IComponent[
    typings.officeUiFabricReact.textTypesMod.ITextProps, 
    typings.officeUiFabricReact.textTypesMod.ITextTokens, 
    typings.officeUiFabricReact.textTypesMod.ITextStyles, 
    typings.officeUiFabricReact.textTypesMod.ITextProps, 
    js.Object
  ]
  type ITextSlot = typings.uifabricFoundation.libIslotsMod.ISlotProp[typings.officeUiFabricReact.textTypesMod.ITextProps, java.lang.String]
  type ITextStyles = typings.uifabricFoundation.libIcomponentMod.IComponentStyles[typings.officeUiFabricReact.textTypesMod.ITextSlots]
  type ITextStylesReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typings.officeUiFabricReact.textTypesMod.ITextProps, 
        typings.officeUiFabricReact.textTypesMod.ITextTokens, 
        typings.officeUiFabricReact.textTypesMod.ITextStyles
      ], 
      js.Function
    ]
  ]
  type ITextTokenReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typings.officeUiFabricReact.textTypesMod.ITextProps, 
        typings.officeUiFabricReact.textTypesMod.ITextTokens
      ], 
      js.Function
    ]
  ]
}
