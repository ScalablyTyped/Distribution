package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/ExtendedPicker", "BaseExtendedPeoplePicker")
  @js.native
  class BaseExtendedPeoplePicker protected ()
    extends typings.officeUiFabricReact.extendedPickerMod.BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ExtendedPicker", "BaseExtendedPicker")
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.extendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ExtendedPicker", "ExtendedPeoplePicker")
  @js.native
  class ExtendedPeoplePicker protected ()
    extends typings.officeUiFabricReact.extendedPickerMod.ExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
}
