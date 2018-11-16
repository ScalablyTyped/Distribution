package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsStore", "SuggestionsStore")
@js.native
class SuggestionsStore[T] () extends js.Object {
  var suggestions: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
  ] = js.native
  /* private */ def _ensureSuggestionModel(suggestion: js.Any): js.Any = js.native
  /* private */ def _isSuggestionModel(value: js.Any): js.Any = js.native
  def convertSuggestionsToSuggestionItems(
    suggestions: js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T] | T
    ]
  ): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
  ] = js.native
  def getSuggestionAtIndex(index: scala.Double): officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T] = js.native
  def getSuggestions(): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
  ] = js.native
  def removeSuggestion(index: scala.Double): scala.Unit = js.native
  def updateSuggestions(newSuggestions: js.Array[T]): scala.Unit = js.native
}

