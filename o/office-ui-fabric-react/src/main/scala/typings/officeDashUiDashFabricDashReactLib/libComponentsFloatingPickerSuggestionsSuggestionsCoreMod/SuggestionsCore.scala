package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsCore", "SuggestionsCore")
@js.native
class SuggestionsCore[T] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsCoreProps[T], 
      js.Object
    ] {
  def this(suggestionsProps: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsCoreProps[T]) = this()
  var SuggestionsItemOfProperType: js.Any = js.native
  var _selectedElement: reactLib.HTMLDivElement = js.native
  var currentIndex: scala.Double = js.native
  var currentSuggestion: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
  ] = js.native
  val selectedElement: js.UndefOr[reactLib.HTMLDivElement] = js.native
  /* private */ def _onClickTypedSuggestionsItem(item: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _onRemoveTypedSuggestionsItem(item: js.Any, index: js.Any): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggestionsCore(): scala.Unit = js.native
  def deselectAllSuggestions(): scala.Unit = js.native
  def getCurrentItem(): officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T] = js.native
  def getSuggestionAtIndex(index: scala.Double): officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T] = js.native
  def hasSuggestionSelected(): scala.Boolean = js.native
  /**
    * Increments the selected suggestion index
    */
  def nextSuggestion(): scala.Boolean = js.native
  /**
    * Decrements the selected suggestion index
    */
  def previousSuggestion(): scala.Boolean = js.native
  def removeSuggestion(index: scala.Double): scala.Unit = js.native
  def scrollSelected(): scala.Unit = js.native
  def setSelectedSuggestion(index: scala.Double): scala.Unit = js.native
}

