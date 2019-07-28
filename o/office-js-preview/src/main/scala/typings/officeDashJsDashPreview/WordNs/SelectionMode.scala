package typings.officeDashJsDashPreview.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait end extends SelectionMode
  
  @js.native
  sealed trait select extends SelectionMode
  
  @js.native
  sealed trait start extends SelectionMode
  
  /* "End" */ val end: typings.officeDashJsDashPreview.WordNs.SelectionMode.end with String = js.native
  /* "Select" */ val select: typings.officeDashJsDashPreview.WordNs.SelectionMode.select with String = js.native
  /* "Start" */ val start: typings.officeDashJsDashPreview.WordNs.SelectionMode.start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionMode with String] = js.native
}

