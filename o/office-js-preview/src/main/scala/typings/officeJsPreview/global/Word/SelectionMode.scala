package typings.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enum sets where the cursor (insertion point) in the document is after a selection.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.SelectionMode with String] = js.native
  
  /* "End" */ val end: typings.officeJsPreview.Word.SelectionMode.end with String = js.native
  
  /* "Select" */ val select: typings.officeJsPreview.Word.SelectionMode.select with String = js.native
  
  /* "Start" */ val start: typings.officeJsPreview.Word.SelectionMode.start with String = js.native
}
