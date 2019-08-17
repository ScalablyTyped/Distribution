package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsCheckCheckDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.Anon_CheckBoxHeight
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.checked
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.std.Pick
  import typings.std.Required

  type ICheckStyleProps = (Required[Pick[ICheckProps, theme]]) with (Pick[ICheckProps, className | checked]) with Anon_CheckBoxHeight
}
