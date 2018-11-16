package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsController", "SuggestionsController")
@js.native
class SuggestionsController[T] () extends js.Object {
  var _ensureSuggestionModel: js.Any = js.native
  var _isSuggestionModel: js.Any = js.native
  var currentIndex: scala.Double = js.native
  var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
  def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
  def createGenericSuggestion(itemToConvert: T): scala.Unit = js.native
  def createGenericSuggestion(itemToConvert: ISuggestionModel[T]): scala.Unit = js.native
  def deselectAllSuggestions(): scala.Unit = js.native
  def getCurrentItem(): ISuggestionModel[T] = js.native
  def getSuggestionAtIndex(index: scala.Double): ISuggestionModel[T] = js.native
  def getSuggestions(): js.Array[ISuggestionModel[T]] = js.native
  def hasSelectedSuggestion(): scala.Boolean = js.native
  /**
       * Increments the suggestion index and gets the next suggestion in the list.
       */
  def nextSuggestion(): scala.Boolean = js.native
  /**
       * Decrements the suggestion index and gets the previous suggestion in the list.
       */
  def previousSuggestion(): scala.Boolean = js.native
  def removeSuggestion(index: scala.Double): scala.Unit = js.native
  def setSelectedSuggestion(index: scala.Double): scala.Unit = js.native
  def updateSuggestions(newSuggestions: js.Array[T]): scala.Unit = js.native
  def updateSuggestions(newSuggestions: js.Array[T], selectedIndex: scala.Double): scala.Unit = js.native
}

