package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object suggestionsTypesMod {
  type ISuggestionsStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[_], 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[_], 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.suggestionsClassName
  ]) with typings.officeUiFabricReact.AnonForceResolveButtonSelected
}
