package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/BaseFloatingPicker", "BaseFloatingPicker")
@js.native
class BaseFloatingPicker[T, P /* <: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[T] */] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[P, IBaseFloatingPickerState]
     with officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPicker {
  def this(basePickerProps: P) = this()
  var SuggestionsControlOfProperType: ScalablyTyped.runtime.Instantiable1[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps[T], 
    officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl[T]
  ] = js.native
  var _onValidateInput: js.Any = js.native
  var currentPromise: stdLib.PromiseLike[_] = js.native
  val currentSelectedSuggestionIndex: scala.Double = js.native
  var root: reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLDivElement] = js.native
  var selection: stdLib.Selection = js.native
  var suggestionStore: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore[T] = js.native
  var suggestionsControl: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl[T] = js.native
  /* private */ def _bindToInputElement(): js.Any = js.native
  /* private */ def _onResolveSuggestions(updatedValue: js.Any): js.Any = js.native
  /* private */ def _unbindFromInputElement(): js.Any = js.native
  /* private */ def _updateActiveDescendant(): js.Any = js.native
  /* private */ def _updateSuggestionsVisible(shouldShow: js.Any): js.Any = js.native
  def completeSuggestion(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseFloatingPicker(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseFloatingPicker(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBaseFloatingPicker(newProps: P): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseFloatingPicker(): scala.Unit = js.native
  def forceResolveSuggestion(): scala.Unit = js.native
  /* protected */ def onChange(item: T): scala.Unit = js.native
  /* protected */ def onKeyDown(ev: reactLib.MouseEvent): scala.Unit = js.native
  /* protected */ def onSelectionChange(): scala.Unit = js.native
  /* protected */ def onSuggestionClick(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], item: T, index: scala.Double): scala.Unit = js.native
  /* protected */ def onSuggestionRemove(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], item: T, index: scala.Double): scala.Unit = js.native
  /* protected */ def renderSuggestions(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /* protected */ def updateSuggestionWithZeroState(): scala.Unit = js.native
  def updateSuggestions(suggestions: js.Array[T]): scala.Unit = js.native
  def updateSuggestions(suggestions: js.Array[T], forceUpdate: scala.Boolean): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): scala.Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: stdLib.PromiseLike[js.Array[T]]): scala.Unit = js.native
  /* protected */ def updateValue(updatedValue: java.lang.String): scala.Unit = js.native
}

