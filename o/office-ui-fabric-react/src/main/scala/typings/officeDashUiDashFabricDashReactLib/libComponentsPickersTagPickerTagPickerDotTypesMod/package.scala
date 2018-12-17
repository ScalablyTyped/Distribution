package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPickersTagPickerTagPickerDotTypesMod {
  type ITagItemStyleProps = (stdLib.Required[
    stdLib.Pick[
      ITagItemProps, 
      officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.theme
    ]
  ]) with (stdLib.Pick[
    ITagItemProps, 
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.className | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.selected
  ]) with js.Object
  type ITagItemSuggestionStyleProps = (stdLib.Required[
    stdLib.Pick[
      ITagItemSuggestionProps, 
      officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.theme
    ]
  ]) with (stdLib.Pick[
    ITagItemSuggestionProps, 
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.className
  ]) with js.Object
  type ITagPickerProps = officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps[ITag]
}
