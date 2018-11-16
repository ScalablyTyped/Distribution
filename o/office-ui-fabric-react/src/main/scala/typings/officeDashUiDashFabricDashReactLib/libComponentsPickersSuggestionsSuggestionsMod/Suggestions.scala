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
  var _forceResolve: js.Any = js.native
  @JSName("_forceResolveButton")
  var _forceResolveButton_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentIButton = js.native
  var _getMoreResults: js.Any = js.native
  var _onClickTypedSuggestionsItem: js.Any = js.native
  var _onRemoveTypedSuggestionsItem: js.Any = js.native
  var _refocusOnSuggestions: js.Any = js.native
  @JSName("_searchForMoreButton")
  var _searchForMoreButton_Original: officeDashUiDashFabricDashReactLib.Anon_ComponentValueCurrentIButton = js.native
  @JSName("_selectedElement")
  var _selectedElement_Original: officeDashUiDashFabricDashReactLib.Anon_Component = js.native
  var _shouldShowForceResolve: js.Any = js.native
  var activeSelectedElement: js.Any = js.native
  /* protected */ def _forceResolveButton(): scala.Unit = js.native
  /* protected */ def _forceResolveButton(component: officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton): scala.Unit = js.native
  /* private */ def _renderSuggestions(): js.Any = js.native
  /* protected */ def _searchForMoreButton(): scala.Unit = js.native
  /* protected */ def _searchForMoreButton(component: officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButton): scala.Unit = js.native
  /* protected */ def _selectedElement(): scala.Unit = js.native
  /* protected */ def _selectedElement(component: reactLib.HTMLDivElement): scala.Unit = js.native
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

