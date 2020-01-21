package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupHeaderTypesMod {
  type IGroupHeaderStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.selected | typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with typings.officeUiFabricReact.AnonCompactIsCollapsed
}
