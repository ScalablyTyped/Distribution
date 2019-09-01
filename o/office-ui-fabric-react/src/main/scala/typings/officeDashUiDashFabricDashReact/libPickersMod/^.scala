package typings.officeDashUiDashFabricDashReact.libPickersMod

import typings.officeDashUiDashFabricDashReact.Anon_Key
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSuggestionProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemSuggestionProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagPickerProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pickers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = js.native
  def TagItemBase(props: ITagItemProps): Element = js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = js.native
  def createGenericItem(
    name: String,
    currentValidationState: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
  ): IGenericItem with Anon_Key = js.native
}

