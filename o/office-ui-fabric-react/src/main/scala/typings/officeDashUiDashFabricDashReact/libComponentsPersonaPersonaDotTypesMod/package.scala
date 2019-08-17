package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPersonaPersonaDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isOutOfOffice
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.presence
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.size
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typings.std.Pick
  import typings.std.Required

  type IPersonaPresenceStyleProps = (Required[Pick[IPersonaSharedProps, theme]]) with (Pick[IPersonaSharedProps, presence | isOutOfOffice | size]) with (Pick[IPersonaProps, className])
}
