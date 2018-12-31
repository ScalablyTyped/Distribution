package typings
package officeDashJsLib.OneNoteNs

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
  sealed trait after
    extends officeDashJsLib.OneNoteNs.InsertLocation
  
  @js.native
  sealed trait before
    extends officeDashJsLib.OneNoteNs.InsertLocation
  
  /* "After" */ val after: after with java.lang.String = js.native
  /* "Before" */ val before: before with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OneNoteNs.InsertLocation with java.lang.String] = js.native
}

