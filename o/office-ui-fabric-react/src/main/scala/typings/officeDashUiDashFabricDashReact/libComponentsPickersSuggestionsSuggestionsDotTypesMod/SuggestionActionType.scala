package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.forceResolve
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.none
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.searchMore
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionActionType with Double] = js.native
  /* 1 */ @js.native
  object forceResolve extends TopLevel[forceResolve with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object searchMore extends TopLevel[searchMore with Double]
  
}

