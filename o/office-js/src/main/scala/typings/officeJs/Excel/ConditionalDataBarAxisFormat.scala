package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalDataBarAxisFormat extends StObject
/**
  *
  * Represents the format options for a Data Bar Axis.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarAxisFormat")
@js.native
object ConditionalDataBarAxisFormat extends StObject {
  
  @js.native
  sealed trait automatic
    extends StObject
       with ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait cellMidPoint
    extends StObject
       with ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait none
    extends StObject
       with ConditionalDataBarAxisFormat
}
