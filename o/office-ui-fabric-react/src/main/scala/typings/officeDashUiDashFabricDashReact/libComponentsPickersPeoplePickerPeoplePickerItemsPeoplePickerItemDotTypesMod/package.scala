package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.Anon_Invalid
  import typings.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.std.Pick
  import typings.std.Required

  type IPeoplePickerItemSelectedStyleProps = (Required[Pick[IPeoplePickerItemSelectedProps, theme]]) with (Pick[IPeoplePickerItemSelectedProps, className | selected | disabled]) with Anon_Invalid
  type IPeoplePickerItemSuggestionStyleProps = (Required[Pick[IPeoplePickerItemSuggestionProps, theme]]) with (Pick[IPeoplePickerItemSuggestionProps, className]) with js.Object
  type IPeoplePickerItemWithMenuProps = IPickerItemProps[IPersonaWithMenu]
}
