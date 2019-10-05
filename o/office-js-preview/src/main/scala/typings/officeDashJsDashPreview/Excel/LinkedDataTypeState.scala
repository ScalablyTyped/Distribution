package typings.officeDashJsDashPreview.Excel

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
  
  /* "BrokenLinkedData" */ val brokenLinkedData: typings.officeDashJsDashPreview.Excel.LinkedDataTypeState.brokenLinkedData with String = js.native
  /* "DisambiguationNeeded" */ val disambiguationNeeded: typings.officeDashJsDashPreview.Excel.LinkedDataTypeState.disambiguationNeeded with String = js.native
  /* "FetchingData" */ val fetchingData: typings.officeDashJsDashPreview.Excel.LinkedDataTypeState.fetchingData with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.LinkedDataTypeState.none with String = js.native
  /* "ValidLinkedData" */ val validLinkedData: typings.officeDashJsDashPreview.Excel.LinkedDataTypeState.validLinkedData with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkedDataTypeState with String] = js.native
}

