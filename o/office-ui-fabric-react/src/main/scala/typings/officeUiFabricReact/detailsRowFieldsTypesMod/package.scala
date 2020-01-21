package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object detailsRowFieldsTypesMod {
  type IOverrideColumnRenderProps = (typings.std.Pick[
    typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.onRenderItemColumn | typings.officeUiFabricReact.officeUiFabricReactStrings.getCellValueKey
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.cellsByColumn
  ])
}
