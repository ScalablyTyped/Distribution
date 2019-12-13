package typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod

import typings.officeDashUiDashFabricDashReact.libAutofillMod.Autofill
import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPicker
import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps
import typings.officeDashUiDashFabricDashReact.libFloatingPickerMod.BaseFloatingPicker
import typings.officeDashUiDashFabricDashReact.libSelectedItemsListMod.BaseSelectedItemsList
import typings.officeDashUiDashFabricDashReact.libSelectionMod.Selection
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.RefObject
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
@js.native
class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
  extends BaseComponent[P, IBaseExtendedPickerState[T]]
     with IBaseExtendedPicker[T] {
  def this(basePickerProps: P) = this()
  var _addProcessedItem: js.Any = js.native
  /**
    * The floating picker is the source of truth for if the menu has been opened or not.
    *
    * Because this isn't tracked inside the state of this component, we need to
    * force an update here to keep the rendered output that depends on the picker being open
    * in sync with the state
    *
    * Called when the suggestions is shown or closed
    */
  var _onSuggestionsShownOrHidden: js.Any = js.native
  var floatingPicker: RefObject[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
  var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
  val highlightedItems: js.Array[T] = js.native
  var input: RefObject[Autofill] = js.native
  val inputElement: HTMLInputElement | Null = js.native
  var root: RefObject[HTMLDivElement] = js.native
  var selectedItemsList: RefObject[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
  var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
  var selection: Selection = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
  /* protected */ def _onSelectedItemsChanged(): Unit = js.native
  /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
  /* protected */ def canAddItems(): Boolean = js.native
  def clearInput(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseExtendedPicker(): Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /* protected */ def onBackspace(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onCopy(ev: ClipboardEvent[HTMLElement]): Unit = js.native
  /* protected */ def onInputChange(value: String): Unit = js.native
  /* protected */ def onInputChange(value: String, composing: Boolean): Unit = js.native
  /* protected */ def onInputClick(ev: typings.react.reactMod.MouseEvent[HTMLInputElement | Autofill, MouseEvent]): Unit = js.native
  /* protected */ def onInputFocus(ev: FocusEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onPaste(ev: ClipboardEvent[HTMLInputElement | Autofill]): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def renderFloatingPicker(): Element = js.native
  /* protected */ def renderSelectedItemsList(): Element = js.native
}

