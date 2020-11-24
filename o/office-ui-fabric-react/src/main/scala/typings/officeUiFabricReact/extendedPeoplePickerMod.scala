package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker
import typings.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", JSImport.Namespace)
@js.native
object extendedPeoplePickerMod extends js.Object {
  
  @js.native
  class BaseExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class ExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}
