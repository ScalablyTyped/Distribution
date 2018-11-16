package typings
package officeDashJsLib.OneNoteNs

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
  sealed trait image
    extends officeDashJsLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait ink
    extends officeDashJsLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait other
    extends officeDashJsLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait outline
    extends officeDashJsLib.OneNoteNs.PageContentType
  
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "Ink" */ val ink: ink with java.lang.String = js.native
  /* "Other" */ val other: other with java.lang.String = js.native
  /* "Outline" */ val outline: outline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OneNoteNs.PageContentType with java.lang.String] = js.native
}

