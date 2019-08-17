package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsDetailsListDetailsRowFieldsDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
  import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.cellsByColumn
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.getCellValueKey
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.onRenderItemColumn
  import typings.std.Pick

  type IOverrideColumnRenderProps = (Pick[IDetailsListProps, onRenderItemColumn | getCellValueKey]) with (Pick[IDetailsRowProps, cellsByColumn])
}
