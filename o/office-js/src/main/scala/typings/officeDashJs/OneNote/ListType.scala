package typings.officeDashJs.OneNote

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.OneNote.ListType.bullet
import typings.officeDashJs.OneNote.ListType.none
import typings.officeDashJs.OneNote.ListType.number
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListType with String] = js.native
  /* "Bullet" */ @js.native
  object bullet extends TopLevel[bullet with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
}

