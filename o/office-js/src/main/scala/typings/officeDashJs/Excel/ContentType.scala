package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/**
  * [Api set: ExcelApi 1.10]
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
  
  /* "Mention" */ val mention: typings.officeDashJs.Excel.ContentType.mention with String = js.native
  /* "Plain" */ val plain: typings.officeDashJs.Excel.ContentType.plain with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentType with String] = js.native
}

