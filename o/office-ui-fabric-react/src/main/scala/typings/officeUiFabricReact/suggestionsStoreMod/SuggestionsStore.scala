package typings.officeUiFabricReact.suggestionsStoreMod

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsStore", "SuggestionsStore")
@js.native
class SuggestionsStore[T] () extends js.Object {
  def this(options: SuggestionsStoreOptions[T]) = this()
  var _ensureSuggestionModel: js.Any = js.native
  var _isSuggestionModel: js.Any = js.native
  var getAriaLabel: js.UndefOr[js.Any] = js.native
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
  def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
  def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
  def getSuggestions(): js.Array[ISuggestionModel[T]] = js.native
  def removeSuggestion(index: Double): Unit = js.native
  def updateSuggestions(newSuggestions: js.Array[T]): Unit = js.native
}

