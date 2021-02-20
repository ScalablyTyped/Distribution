package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkedDataTypeState extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.LinkedDataTypeState")
@js.native
object LinkedDataTypeState extends StObject {
  
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
