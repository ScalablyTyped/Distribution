package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions", "Suggestions")
@js.native
class Suggestions[T] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps[T], 
      ISuggestionsState
    ] {
  def this(suggestionsProps: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps[T]) = this()
  var SuggestionsItemOfProperType: js.Any = js.native
  var _classNames: js.Any = js.native
  var _forceResolve: js.Any = js.native
  var _forceResolveButton: reactLib.reactMod.ReactNs.RefObject[officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton] = js.native
  var _getMoreResults: js.Any = js.native
  var _onClickTypedSuggestionsItem: js.Any = js.native
  var _onRemoveTypedSuggestionsItem: js.Any = js.native
  var _refocusOnSuggestions: js.Any = js.native
  var _searchForMoreButton: reactLib.reactMod.ReactNs.RefObject[officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton] = js.native
  var _selectedElement: reactLib.reactMod.ReactNs.RefObject[reactLib.HTMLDivElement] = js.native
  var _shouldShowForceResolve: js.Any = js.native
  var activeSelectedElement: js.Any = js.native
  /* private */ def _renderSuggestions(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSuggestions(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggestions(): scala.Unit = js.native
  def executeSelectedAction(): scala.Unit = js.native
  def focusAboveSuggestions(): scala.Unit = js.native
  def focusBelowSuggestions(): scala.Unit = js.native
  def focusSearchForMoreButton(): scala.Unit = js.native
  def hasSuggestedAction(): scala.Boolean = js.native
  def hasSuggestedActionSelected(): scala.Boolean = js.native
  def scrollSelected(): scala.Unit = js.native
  /**
    * Returns true if the event was handled, false otherwise
    */
  def tryHandleKeyDown(keyCode: scala.Double, currentSuggestionIndex: scala.Double): scala.Boolean = js.native
}

