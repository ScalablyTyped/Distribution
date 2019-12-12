package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.OneNote.InsertLocation.after
import typings.officeDashJsDashPreview.OneNote.InsertLocation.before
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertLocation with String] = js.native
  /* "After" */ @js.native
  object after extends TopLevel[after with String]
  
  /* "Before" */ @js.native
  object before extends TopLevel[before with String]
  
}

