package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Table extends StObject
/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of 
  * {@link https://learn.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends StObject {
  
  /**
    * The entire table, including column headers, data, and totals (if any).
    */
  @js.native
  sealed trait All
    extends StObject
       with Table
  
  /**
    * Only the data (no headers and totals).
    */
  @js.native
  sealed trait Data
    extends StObject
       with Table
  
  /**
    * Only the header row.
    */
  @js.native
  sealed trait Headers
    extends StObject
       with Table
}
