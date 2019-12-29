package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageContentType with String] = js.native
  /* "Image" */ @js.native
  object image extends TopLevel[image with String]
  
  /* "Ink" */ @js.native
  object ink extends TopLevel[ink with String]
  
  /* "Other" */ @js.native
  object other extends TopLevel[other with String]
  
  /* "Outline" */ @js.native
  object outline extends TopLevel[outline with String]
  
}

