package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object detailsListTypesMod {
  type IDetailsListCheckboxProps = typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
  type IDetailsListStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with typings.officeUiFabricReact.AnonCompactIsFixed
}
