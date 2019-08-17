package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerSuggestionsProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateGenericItem extends js.Object {
  var createGenericItem: js.Function2[
    /* name */ String, 
    /* currentValidationState */ ValidationState, 
    IGenericItem with Anon_Key_207955917
  ] = js.native
  def onRenderItem(props: IPeoplePickerItemSelectedProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[_]): Element = js.native
}

