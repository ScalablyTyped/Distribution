package typings.officeDashJsDashPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InsertLocation extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InsertLocation")
@js.native
object InsertLocation extends js.Object {
  @js.native
  sealed trait after extends InsertLocation
  
  @js.native
  sealed trait before extends InsertLocation
  
  /* "After" */ val after: typings.officeDashJsDashPreview.OneNote.InsertLocation.after with String = js.native
  /* "Before" */ val before: typings.officeDashJsDashPreview.OneNote.InsertLocation.before with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertLocation with String] = js.native
}

