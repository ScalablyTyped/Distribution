package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPickersTagPickerTagPickerDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.std.Pick
  import typings.std.Required

  type ITagItemStyleProps = (Required[Pick[ITagItemProps, theme]]) with (Pick[ITagItemProps, className | selected | disabled]) with js.Object
  type ITagItemSuggestionStyleProps = (Required[Pick[ITagItemSuggestionProps, theme]]) with (Pick[ITagItemSuggestionProps, className]) with js.Object
  type ITagPickerProps = IBasePickerProps[ITag]
}
