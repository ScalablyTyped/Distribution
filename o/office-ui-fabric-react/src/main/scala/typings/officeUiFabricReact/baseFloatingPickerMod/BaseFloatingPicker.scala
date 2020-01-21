package typings.officeUiFabricReact.baseFloatingPickerMod

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPicker
import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.suggestionsControlMod.SuggestionsControl
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.RefObject
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/BaseFloatingPicker", "BaseFloatingPicker")
@js.native
class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
  extends BaseComponent[P, IBaseFloatingPickerState]
     with IBaseFloatingPicker {
  def this(basePickerProps: P) = this()
  var SuggestionsControlOfProperType: Instantiable1[/* props */ ISuggestionsControlProps[T], SuggestionsControl[T]] = js.native
  var _bindToInputElement: js.Any = js.native
  var _onResolveSuggestions: js.Any = js.native
  var _onValidateInput: js.Any = js.native
  var _unbindFromInputElement: js.Any = js.native
  var _updateActiveDescendant: js.Any = js.native
  var _updateSuggestionsVisible: js.Any = js.native
  var currentPromise: js.Thenable[js.Array[T]] = js.native
  val currentSelectedSuggestionIndex: Double = js.native
  var isComponentMounted: Boolean = js.native
  var root: RefObject[HTMLDivElement] = js.native
  var selection: Selection = js.native
  var suggestionStore: SuggestionsStore[T] = js.native
  var suggestionsControl: RefObject[SuggestionsControl[T]] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseFloatingPicker(newProps: IBaseFloatingPickerProps[T]): Unit = js.native
  def completeSuggestion(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseFloatingPicker(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseFloatingPicker(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseFloatingPicker(): Unit = js.native
  def forceResolveSuggestion(): Unit = js.native
  /* protected */ def onChange(item: T): Unit = js.native
  /* protected */ def onKeyDown(ev: MouseEvent): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def onSuggestionClick(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
  /* protected */ def onSuggestionRemove(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent], item: T, index: Double): Unit = js.native
  /* protected */ def renderSuggestions(): Element | Null = js.native
  /* protected */ def updateSuggestionWithZeroState(): Unit = js.native
  def updateSuggestions(suggestions: js.Array[T]): Unit = js.native
  def updateSuggestions(suggestions: js.Array[T], forceUpdate: Boolean): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
  /* protected */ def updateValue(updatedValue: String): Unit = js.native
}

