package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SuggestionItemType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionItemType")
@js.native
object SuggestionItemType extends js.Object {
  @js.native
  sealed trait footer
    extends officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType
  
  @js.native
  sealed trait header
    extends officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType
  
  @js.native
  sealed trait suggestion
    extends officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType
  
  /* 2 */ val footer: footer with scala.Double = js.native
  /* 0 */ val header: header with scala.Double = js.native
  /* 1 */ val suggestion: suggestion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType with scala.Double
  ] = js.native
}

