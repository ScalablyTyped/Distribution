package typings
package officeDashJsDashPreviewLib.OneNoteNs

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
    extends officeDashJsDashPreviewLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait ink
    extends officeDashJsDashPreviewLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait other
    extends officeDashJsDashPreviewLib.OneNoteNs.PageContentType
  
  @js.native
  sealed trait outline
    extends officeDashJsDashPreviewLib.OneNoteNs.PageContentType
  
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "Ink" */ val ink: ink with java.lang.String = js.native
  /* "Other" */ val other: other with java.lang.String = js.native
  /* "Outline" */ val outline: outline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.PageContentType with java.lang.String] = js.native
}

