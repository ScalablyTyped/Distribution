package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SuggestionItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionItemType")
@js.native
object SuggestionItemType extends js.Object {
  @js.native
  sealed trait footer extends SuggestionItemType
  
  @js.native
  sealed trait header extends SuggestionItemType
  
  @js.native
  sealed trait suggestion extends SuggestionItemType
  
  /* 2 */ val footer: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.footer with Double = js.native
  /* 0 */ val header: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.header with Double = js.native
  /* 1 */ val suggestion: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionItemType with Double] = js.native
}

