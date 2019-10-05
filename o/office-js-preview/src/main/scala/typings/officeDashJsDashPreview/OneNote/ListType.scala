package typings.officeDashJsDashPreview.OneNote

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
  sealed trait bullet extends ListType
  
  @js.native
  sealed trait none extends ListType
  
  @js.native
  sealed trait number extends ListType
  
  /* "Bullet" */ val bullet: typings.officeDashJsDashPreview.OneNote.ListType.bullet with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.OneNote.ListType.none with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.OneNote.ListType.number with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListType with String] = js.native
}

