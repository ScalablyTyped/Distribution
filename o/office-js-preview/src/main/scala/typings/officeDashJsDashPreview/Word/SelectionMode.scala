package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.SelectionMode.end
import typings.officeDashJsDashPreview.Word.SelectionMode.select
import typings.officeDashJsDashPreview.Word.SelectionMode.start
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionMode with String] = js.native
  /* "End" */ @js.native
  object end extends TopLevel[end with String]
  
  /* "Select" */ @js.native
  object select extends TopLevel[select with String]
  
  /* "Start" */ @js.native
  object start extends TopLevel[start with String]
  
}

