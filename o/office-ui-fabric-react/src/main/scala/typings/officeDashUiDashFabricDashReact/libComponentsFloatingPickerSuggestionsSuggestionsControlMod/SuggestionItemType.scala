package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionItemType with Double] = js.native
  /* 2 */ @js.native
  object footer extends TopLevel[footer with Double]
  
  /* 0 */ @js.native
  object header extends TopLevel[header with Double]
  
  /* 1 */ @js.native
  object suggestion extends TopLevel[suggestion with Double]
  
}

