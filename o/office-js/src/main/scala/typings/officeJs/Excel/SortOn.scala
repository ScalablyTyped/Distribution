package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOn extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOn")
@js.native
object SortOn extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait cellColor
    extends StObject
       with SortOn
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait fontColor
    extends StObject
       with SortOn
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait icon
    extends StObject
       with SortOn
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  @js.native
  sealed trait value
    extends StObject
       with SortOn
}
