package typings
package officeDashJsLib.ExcelNs

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
  sealed trait brokenLinkedData
    extends officeDashJsLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait disambiguationNeeded
    extends officeDashJsLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait fetchingData
    extends officeDashJsLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait validLinkedData
    extends officeDashJsLib.ExcelNs.LinkedDataTypeState
  
  /* "BrokenLinkedData" */ val brokenLinkedData: brokenLinkedData with java.lang.String = js.native
  /* "DisambiguationNeeded" */ val disambiguationNeeded: disambiguationNeeded with java.lang.String = js.native
  /* "FetchingData" */ val fetchingData: fetchingData with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "ValidLinkedData" */ val validLinkedData: validLinkedData with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.LinkedDataTypeState with java.lang.String] = js.native
}

