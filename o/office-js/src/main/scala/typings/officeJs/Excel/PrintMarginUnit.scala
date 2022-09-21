package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintMarginUnit extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintMarginUnit")
@js.native
object PrintMarginUnit extends StObject {
  
  /**
    * Assign the page margins in centimeters.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait centimeters
    extends StObject
       with PrintMarginUnit
  
  /**
    * Assign the page margins in inches.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait inches
    extends StObject
       with PrintMarginUnit
  
  /**
    * Assign the page margins in points. A point is 1/72 of an inch.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait points
    extends StObject
       with PrintMarginUnit
}
