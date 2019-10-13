package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", JSImport.Namespace)
@js.native
object libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod extends js.Object {
  @js.native
  class BaseFloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class FloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  type IPeopleFloatingPickerProps = IBaseFloatingPickerProps[IPersonaProps]
}

