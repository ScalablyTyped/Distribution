package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrder extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintOrder")
@js.native
object PrintOrder extends StObject {
  
  /**
    * Process down the rows before processing across pages or page fields to the right.
    *
    */
  @js.native
  sealed trait downThenOver
    extends StObject
       with PrintOrder
  
  /**
    * Process across pages or page fields to the right before moving down the rows.
    *
    */
  @js.native
  sealed trait overThenDown
    extends StObject
       with PrintOrder
}
