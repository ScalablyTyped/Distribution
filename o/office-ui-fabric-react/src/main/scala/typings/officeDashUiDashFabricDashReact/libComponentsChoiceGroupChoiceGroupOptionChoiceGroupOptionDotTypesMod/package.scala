package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod {
  import typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption
  import typings.react.reactMod.ChangeEventHandler
  import typings.react.reactMod.FocusEvent
  import typings.react.reactMod.FocusEventHandler
  import typings.react.reactMod.FormEvent
  import typings.std.HTMLElement
  import typings.std.HTMLInputElement

  type OnChangeCallback = (js.Function2[
    /* evt */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
    /* props */ js.UndefOr[IChoiceGroupOption], 
    Unit
  ]) with (js.UndefOr[ChangeEventHandler[HTMLElement | HTMLInputElement]])
  type OnFocusCallback = (js.Function2[
    /* ev */ js.UndefOr[FocusEvent[HTMLElement | HTMLInputElement]], 
    /* props */ js.UndefOr[IChoiceGroupOption], 
    js.UndefOr[Unit]
  ]) with (js.UndefOr[FocusEventHandler[HTMLElement | HTMLInputElement]])
}
