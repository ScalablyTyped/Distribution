package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkedDataTypeState extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.LinkedDataTypeState")
@js.native
object LinkedDataTypeState extends js.Object {
  @js.native
  sealed trait brokenLinkedData
    extends officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait disambiguationNeeded
    extends officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait fetchingData
    extends officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState
  
  @js.native
  sealed trait validLinkedData
    extends officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState
  
  /* "BrokenLinkedData" */ val brokenLinkedData: brokenLinkedData with java.lang.String = js.native
  /* "DisambiguationNeeded" */ val disambiguationNeeded: disambiguationNeeded with java.lang.String = js.native
  /* "FetchingData" */ val fetchingData: fetchingData with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "ValidLinkedData" */ val validLinkedData: validLinkedData with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.LinkedDataTypeState with java.lang.String] = js.native
}

