package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsDetailsListDetailsRowCheckDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.Anon_IsVisible
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.anySelected
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.canSelect
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.compact
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isHeader
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.std.Pick
  import typings.std.Required

  type IDetailsRowCheckStyleProps = (Required[Pick[IDetailsRowCheckProps, theme]]) with (Pick[
    IDetailsRowCheckProps, 
    compact | isHeader | selected | anySelected | canSelect | className
  ]) with Anon_IsVisible
}
