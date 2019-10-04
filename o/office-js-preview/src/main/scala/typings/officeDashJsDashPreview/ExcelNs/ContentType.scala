package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ContentType")
@js.native
object ContentType extends js.Object {
  /**
    *
    * Comment content containing mentions.
    *
    */
  @js.native
  sealed trait mention extends ContentType
  
  /**
    *
    * Indicates plain format type of the comment content.
    *
    */
  @js.native
  sealed trait plain extends ContentType
  
  /* "Mention" */ val mention: typings.officeDashJsDashPreview.ExcelNs.ContentType.mention with String = js.native
  /* "Plain" */ val plain: typings.officeDashJsDashPreview.ExcelNs.ContentType.plain with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
}

