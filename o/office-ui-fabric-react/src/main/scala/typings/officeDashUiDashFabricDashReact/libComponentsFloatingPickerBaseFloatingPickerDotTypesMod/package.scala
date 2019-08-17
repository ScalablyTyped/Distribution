package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsFloatingPickerBaseFloatingPickerDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.footerItemsProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.headerItemsProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.shouldSelectFirstItem
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.showRemoveButtons
  import typings.std.Pick

  type IBaseFloatingPickerSuggestionProps = Pick[
    ISuggestionsControlProps[js.Any], 
    shouldSelectFirstItem | headerItemsProps | footerItemsProps | showRemoveButtons
  ]
}
