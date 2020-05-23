package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorksheetPositionType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends js.Object {
  @js.native
  sealed trait after extends WorksheetPositionType
  
  @js.native
  sealed trait before extends WorksheetPositionType
  
  @js.native
  sealed trait beginning extends WorksheetPositionType
  
  @js.native
  sealed trait end extends WorksheetPositionType
  
  @js.native
  sealed trait none extends WorksheetPositionType
  
}

