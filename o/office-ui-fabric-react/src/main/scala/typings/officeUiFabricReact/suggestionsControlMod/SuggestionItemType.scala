package typings.officeUiFabricReact.suggestionsControlMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SuggestionItemType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsControl", "SuggestionItemType")
@js.native
object SuggestionItemType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SuggestionItemType with Double] = js.native
  
  @js.native
  sealed trait footer extends SuggestionItemType
  /* 2 */ @js.native
  object footer extends TopLevel[footer with Double]
  
  @js.native
  sealed trait header extends SuggestionItemType
  /* 0 */ @js.native
  object header extends TopLevel[header with Double]
  
  @js.native
  sealed trait suggestion extends SuggestionItemType
  /* 1 */ @js.native
  object suggestion extends TopLevel[suggestion with Double]
}
