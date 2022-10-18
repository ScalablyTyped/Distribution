package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.IExtendedPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPeoplePicker")
  @js.native
  open class BaseExtendedPeoplePicker protected ()
    extends typings.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPicker")
  @js.native
  open class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "ExtendedPeoplePicker")
  @js.native
  open class ExtendedPeoplePicker protected ()
    extends typings.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.ExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
}
