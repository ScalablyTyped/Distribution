package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupedListTypesMod {
  type IGroupedListStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with typings.officeUiFabricReact.AnonCompactIsCollapsed
}
