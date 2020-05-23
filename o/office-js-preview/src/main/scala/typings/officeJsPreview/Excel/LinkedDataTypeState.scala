package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkedDataTypeState extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.LinkedDataTypeState")
@js.native
object LinkedDataTypeState extends js.Object {
  @js.native
  sealed trait brokenLinkedData extends LinkedDataTypeState
  
  @js.native
  sealed trait disambiguationNeeded extends LinkedDataTypeState
  
  @js.native
  sealed trait fetchingData extends LinkedDataTypeState
  
  @js.native
  sealed trait none extends LinkedDataTypeState
  
  @js.native
  sealed trait validLinkedData extends LinkedDataTypeState
  
}

