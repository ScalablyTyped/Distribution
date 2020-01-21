package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object peoplePickerItemTypesMod {
  type IPeoplePickerItemSelectedStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className | typings.officeUiFabricReact.officeUiFabricReactStrings.selected | typings.officeUiFabricReact.officeUiFabricReactStrings.disabled
  ]) with typings.officeUiFabricReact.AnonInvalid
  type IPeoplePickerItemSuggestionStyleProps = (typings.std.Required[
    typings.std.Pick[
      typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps, 
      typings.officeUiFabricReact.officeUiFabricReactStrings.theme
    ]
  ]) with (typings.std.Pick[
    typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps, 
    typings.officeUiFabricReact.officeUiFabricReactStrings.className
  ]) with js.Object
  type IPeoplePickerItemWithMenuProps = typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps[typings.officeUiFabricReact.peoplePickerItemTypesMod.IPersonaWithMenu]
}
