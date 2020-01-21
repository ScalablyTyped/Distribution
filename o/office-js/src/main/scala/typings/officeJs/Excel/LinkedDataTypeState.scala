package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkedDataTypeState with String] = js.native
  /* "BrokenLinkedData" */ @js.native
  object brokenLinkedData extends TopLevel[brokenLinkedData with String]
  
  /* "DisambiguationNeeded" */ @js.native
  object disambiguationNeeded extends TopLevel[disambiguationNeeded with String]
  
  /* "FetchingData" */ @js.native
  object fetchingData extends TopLevel[fetchingData with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "ValidLinkedData" */ @js.native
  object validLinkedData extends TopLevel[validLinkedData with String]
  
}

