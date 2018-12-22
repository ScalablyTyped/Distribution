package typings
package officeDashJsDashPreviewLib.OneNoteNs

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
    extends officeDashJsDashPreviewLib.OneNoteNs.ListType
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.OneNoteNs.ListType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.OneNoteNs.ListType
  
  /* "Bullet" */ val bullet: bullet with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.ListType with java.lang.String] = js.native
}

