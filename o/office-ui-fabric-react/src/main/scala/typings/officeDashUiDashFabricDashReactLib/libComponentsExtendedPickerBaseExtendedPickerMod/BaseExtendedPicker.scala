package typings
package officeDashUiDashFabricDashReactLib.libComponentsExtendedPickerBaseExtendedPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
@js.native
class BaseExtendedPicker[T, P /* <: officeDashUiDashFabricDashReactLib.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps[T] */] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[P, IBaseExtendedPickerState[T]]
     with officeDashUiDashFabricDashReactLib.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPicker[T] {
  def this(basePickerProps: P) = this()
  var floatingPickerProps: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[T] = js.native
  @JSName("floatingPicker")
  var floatingPicker_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentBaseFloatingPicker[T] = js.native
  val highlightedItems: js.Array[T] = js.native
  val inputElement: reactLib.HTMLInputElement | scala.Null = js.native
  @JSName("input")
  var input_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentAutofill = js.native
  /** Gets the current value of the input. */
  /* CompleteClass */
  override var items: js.UndefOr[js.Array[T]] = js.native
  @JSName("root")
  var root_Original: officeDashUiDashFabricDashReactLib.Anon_Component = js.native
  var selectedItemsListProps: officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[T] = js.native
  @JSName("selectedItemsList")
  var selectedItemsList_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentBaseSelectedItemsList[T] = js.native
  var selection: officeDashUiDashFabricDashReactLib.libSelectionMod.Selection = js.native
  /* private */ def _addProcessedItem(newItem: js.Any): js.Any = js.native
  /* protected */ def _onSelectedItemsChanged(): scala.Unit = js.native
  /* protected */ def _onSuggestionSelected(item: T): scala.Unit = js.native
  /* protected */ def canAddItems(): scala.Boolean = js.native
  def clearInput(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseExtendedPicker(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBaseExtendedPicker(newProps: P): scala.Unit = js.native
  def floatingPicker(): scala.Unit = js.native
  def floatingPicker(
    component: officeDashUiDashFabricDashReactLib.libFloatingPickerMod.BaseFloatingPicker[
      T, 
      officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[T]
    ]
  ): scala.Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
  /* protected */ def input(): scala.Unit = js.native
  /* protected */ def input(component: officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill): scala.Unit = js.native
  /* protected */ def onBackspace(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /* protected */ def onCopy(ev: reactLib.reactMod.ReactNs.ClipboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /* protected */ def onInputChange(value: java.lang.String): scala.Unit = js.native
  /* protected */ def onInputClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill
    ]
  ): scala.Unit = js.native
  /* protected */ def onInputFocus(
    ev: reactLib.reactMod.ReactNs.FocusEvent[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill
    ]
  ): scala.Unit = js.native
  /* protected */ def onPaste(
    ev: reactLib.reactMod.ReactNs.ClipboardEvent[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libAutofillMod.Autofill
    ]
  ): scala.Unit = js.native
  /* protected */ def onSelectionChange(): scala.Unit = js.native
  /* protected */ def renderSelectedItemsList(): reactLib.reactMod.Global.JSXNs.Element = js.native
  /* protected */ def renderSuggestions(): reactLib.reactMod.Global.JSXNs.Element = js.native
  /* protected */ def root(): scala.Unit = js.native
  /* protected */ def root(component: reactLib.HTMLDivElement): scala.Unit = js.native
  def selectedItemsList(): scala.Unit = js.native
  def selectedItemsList(
    component: officeDashUiDashFabricDashReactLib.libSelectedItemsListMod.BaseSelectedItemsList[
      T, 
      officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[T]
    ]
  ): scala.Unit = js.native
}

