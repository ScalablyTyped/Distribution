package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object choiceGroupOptionTypesMod {
  type OnChangeCallback = (js.Function2[
    /* evt */ js.UndefOr[
      typings.react.mod.FormEvent[typings.std.HTMLElement | typings.std.HTMLInputElement]
    ], 
    /* props */ js.UndefOr[typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    scala.Unit
  ]) with (js.UndefOr[
    typings.react.mod.ChangeEventHandler[typings.std.HTMLElement | typings.std.HTMLInputElement]
  ])
  type OnFocusCallback = (js.Function2[
    /* ev */ js.UndefOr[
      typings.react.mod.FocusEvent[typings.std.HTMLElement | typings.std.HTMLInputElement]
    ], 
    /* props */ js.UndefOr[typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    js.UndefOr[scala.Unit]
  ]) with (js.UndefOr[
    typings.react.mod.FocusEventHandler[typings.std.HTMLElement | typings.std.HTMLInputElement]
  ])
}
