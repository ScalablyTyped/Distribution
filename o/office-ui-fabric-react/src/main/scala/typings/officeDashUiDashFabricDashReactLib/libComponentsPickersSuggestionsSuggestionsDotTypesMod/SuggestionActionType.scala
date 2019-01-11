package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod

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
  sealed trait forceResolve
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType
  
  /** None of the actions is selected. */
  @js.native
  sealed trait none
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType
  
  /** SearchMore action is selected. */
  @js.native
  sealed trait searchMore
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType
  
  /* 1 */ val forceResolve: forceResolve with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val searchMore: searchMore with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType with scala.Double
  ] = js.native
}

