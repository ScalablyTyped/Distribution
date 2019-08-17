package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SuggestionActionType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types", "SuggestionActionType")
@js.native
object SuggestionActionType extends js.Object {
  /** ForceResolve action is selected. */
  @js.native
  sealed trait forceResolve extends SuggestionActionType
  
  /** None of the actions is selected. */
  @js.native
  sealed trait none extends SuggestionActionType
  
  /** SearchMore action is selected. */
  @js.native
  sealed trait searchMore extends SuggestionActionType
  
  /* 1 */ val forceResolve: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.forceResolve with Double = js.native
  /* 0 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.none with Double = js.native
  /* 2 */ val searchMore: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.searchMore with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionActionType with Double] = js.native
}

