package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupFooterTypesMod {
  type IGroupFooterStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.selected | typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with typings.officeUiFabricReact.AnonIsCollapsed
}
