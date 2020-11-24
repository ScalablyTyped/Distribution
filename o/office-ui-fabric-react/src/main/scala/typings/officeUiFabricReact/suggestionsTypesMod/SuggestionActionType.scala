package typings.officeUiFabricReact.suggestionsTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SuggestionActionType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types", "SuggestionActionType")
@js.native
object SuggestionActionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionActionType with Double] = js.native
  
  /** ForceResolve action is selected. */
  @js.native
  sealed trait forceResolve extends SuggestionActionType
  /* 1 */ @js.native
  object forceResolve extends TopLevel[forceResolve with Double]
  
  /** None of the actions is selected. */
  @js.native
  sealed trait none extends SuggestionActionType
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /** SearchMore action is selected. */
  @js.native
  sealed trait searchMore extends SuggestionActionType
  /* 2 */ @js.native
  object searchMore extends TopLevel[searchMore with Double]
}
