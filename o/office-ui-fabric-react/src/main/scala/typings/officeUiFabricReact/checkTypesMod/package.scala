package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkTypesMod {
  type ICheckStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.checkTypesMod.ICheckProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.checkTypesMod.ICheckProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.checked
  ]) with typings.officeUiFabricReact.AnonCheckBoxHeight
}
