package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarAxisFormat extends js.Object

/**
  *
  * Represents the format options for a Data Bar Axis.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarAxisFormat")
@js.native
object ConditionalDataBarAxisFormat extends js.Object {
  @js.native
  sealed trait automatic extends ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait cellMidPoint extends ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait none extends ConditionalDataBarAxisFormat
  
}

