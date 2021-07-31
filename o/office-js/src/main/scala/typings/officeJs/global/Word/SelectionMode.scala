package typings.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enum sets where the cursor (insertion point) in the document is after a selection.
  * 
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.SelectionMode & String] = js.native
  
  /* "End" */ val end: typings.officeJs.Word.SelectionMode.end & String = js.native
  
  /* "Select" */ val select: typings.officeJs.Word.SelectionMode.select & String = js.native
  
  /* "Start" */ val start: typings.officeJs.Word.SelectionMode.start & String = js.native
}
