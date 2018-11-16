package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListType extends js.Object

/**
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.ListType")
@js.native
object ListType extends js.Object {
  @js.native
  sealed trait bullet
    extends officeDashJsLib.OneNoteNs.ListType
  
  @js.native
  sealed trait none
    extends officeDashJsLib.OneNoteNs.ListType
  
  @js.native
  sealed trait number
    extends officeDashJsLib.OneNoteNs.ListType
  
  /* "Bullet" */ val bullet: bullet with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OneNoteNs.ListType with java.lang.String] = js.native
}

