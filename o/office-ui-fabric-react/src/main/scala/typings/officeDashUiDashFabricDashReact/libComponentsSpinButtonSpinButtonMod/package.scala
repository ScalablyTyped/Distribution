package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsSpinButtonSpinButtonMod {
  import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod.ISpinButtonProps
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.decrementButtonIcon
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.incrementButtonIcon
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.label
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.labelPosition
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.max
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.min
  import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.step
  import typings.std.Pick
  import typings.std.Required

  type DefaultProps = Required[
    Pick[
      ISpinButtonProps, 
      step | min | max | disabled | labelPosition | label | incrementButtonIcon | decrementButtonIcon
    ]
  ]
}
