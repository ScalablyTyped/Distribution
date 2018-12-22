package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphType extends js.Object

/**
     * [Api set: OneNoteApi 1.1]
     */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends js.Object {
  @js.native
  sealed trait image
    extends officeDashJsDashPreviewLib.OneNoteNs.ParagraphType
  
  @js.native
  sealed trait ink
    extends officeDashJsDashPreviewLib.OneNoteNs.ParagraphType
  
  @js.native
  sealed trait other
    extends officeDashJsDashPreviewLib.OneNoteNs.ParagraphType
  
  @js.native
  sealed trait richText
    extends officeDashJsDashPreviewLib.OneNoteNs.ParagraphType
  
  @js.native
  sealed trait table
    extends officeDashJsDashPreviewLib.OneNoteNs.ParagraphType
  
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "Ink" */ val ink: ink with java.lang.String = js.native
  /* "Other" */ val other: other with java.lang.String = js.native
  /* "RichText" */ val richText: richText with java.lang.String = js.native
  /* "Table" */ val table: table with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.ParagraphType with java.lang.String] = js.native
}

