package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsModalModalDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.Anon_HasBeenOpened
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.containerClassName
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isModeless
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.scrollableContentClassName
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.topOffsetFixed
  import typings.std.Pick
  import typings.std.Required

  type IModalStyleProps = (Required[Pick[IModalProps, theme]]) with (Pick[
    IModalProps, 
    className | containerClassName | scrollableContentClassName | topOffsetFixed | isModeless
  ]) with Anon_HasBeenOpened
}
