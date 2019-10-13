package typings.officeDashUiDashFabricDashReact

import typings.atUifabricExampleDashData.IExampleExtendedPersonaPropskeystringnumber
import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.IExtendedPeoplePickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ExtendedPicker", JSImport.Namespace)
@js.native
object libExtendedPickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedPeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  val groupOne: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val groupTwo: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val mru: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val people: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
}

