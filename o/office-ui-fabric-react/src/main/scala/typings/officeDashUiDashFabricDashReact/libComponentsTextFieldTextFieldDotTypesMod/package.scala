package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTextFieldTextFieldDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.Anon_Focused
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.autoAdjustHeight
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.borderless
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.inputClassName
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.multiline
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.required
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.resizable
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.underlined
  import typings.std.Pick
  import typings.std.Required

  type ITextFieldStyleProps = (Required[Pick[ITextFieldProps, theme]]) with (Pick[
    ITextFieldProps, 
    className | disabled | inputClassName | required | multiline | borderless | resizable | underlined | autoAdjustHeight
  ]) with Anon_Focused
}
