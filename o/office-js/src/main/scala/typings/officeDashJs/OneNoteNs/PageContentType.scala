package typings.officeDashJs.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageContentType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends js.Object {
  @js.native
  sealed trait image extends PageContentType
  
  @js.native
  sealed trait ink extends PageContentType
  
  @js.native
  sealed trait other extends PageContentType
  
  @js.native
  sealed trait outline extends PageContentType
  
  /* "Image" */ val image: typings.officeDashJs.OneNoteNs.PageContentType.image with String = js.native
  /* "Ink" */ val ink: typings.officeDashJs.OneNoteNs.PageContentType.ink with String = js.native
  /* "Other" */ val other: typings.officeDashJs.OneNoteNs.PageContentType.other with String = js.native
  /* "Outline" */ val outline: typings.officeDashJs.OneNoteNs.PageContentType.outline with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageContentType with String] = js.native
}

