package typings.officeJsPreview.Excel

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
    * Comment content containing mentions.
    *
    */
  @js.native
  sealed trait mention extends ContentType
  
  /**
    * Indicates plain format type of the comment content.
    *
    */
  @js.native
  sealed trait plain extends ContentType
  
}

