package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tagPickerTypesMod {
  type ITagItemStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.selected | typings.officeUiFabricReact.officeUiFabricReactStrings.disabled
  ]) with js.Object
  type ITagItemSuggestionStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with js.Object
  type ITagPickerProps = typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps[typings.officeUiFabricReact.tagPickerTypesMod.ITag]
}
