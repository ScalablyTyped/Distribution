package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersPickerItemDottypesMod.IPickerItemProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "BaseExtendedPeoplePicker")
  @js.native
  open class BaseExtendedPeoplePicker protected () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps] {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "ExtendedPeoplePicker")
  @js.native
  open class ExtendedPeoplePicker protected () extends BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}
