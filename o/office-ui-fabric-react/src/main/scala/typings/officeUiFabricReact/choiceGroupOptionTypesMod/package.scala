package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object choiceGroupOptionTypesMod {
  
  type OnChangeCallback = js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[
        typings.react.mod.FormEvent[typings.std.HTMLElement | typings.std.HTMLInputElement]
      ], 
      /* props */ js.UndefOr[typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
      scala.Unit
    ]
  ]
  
  type OnFocusCallback = js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        typings.react.mod.FocusEvent[typings.std.HTMLElement | typings.std.HTMLInputElement]
      ], 
      /* props */ js.UndefOr[typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
      js.UndefOr[scala.Unit]
    ]
  ]
}
