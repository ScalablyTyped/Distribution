package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateGenericItem extends js.Object {
  @JSName("createGenericItem")
  var createGenericItem_Original: js.Function2[
    /* name */ java.lang.String, 
    /* currentValidationState */ officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState, 
    officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem with Anon_Key_2068182360
  ] = js.native
  def createGenericItem(
    name: java.lang.String,
    currentValidationState: officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  ): officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem with Anon_Key_2068182360 = js.native
  def onRenderItem(
    props: officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onRenderSuggestionsItem(
    personaProps: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onRenderSuggestionsItem(
    personaProps: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps,
    suggestionsProps: officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IBasePickerSuggestionsProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
}

