package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends StObject
/**
  * This enum sets where the cursor (insertion point) in the document is after a selection.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  /**
    * The cursor is at the end of the selection (just after the end of the selected range).
    */
  @js.native
  sealed trait end extends SelectionMode
  
  /**
    * The entire range is selected.
    */
  @js.native
  sealed trait select extends SelectionMode
  
  /**
    * The cursor is at the beginning of the selection (just before the start of the selected range).
    */
  @js.native
  sealed trait start extends SelectionMode
}
