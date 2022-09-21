package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadingOrder extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ReadingOrder")
@js.native
object ReadingOrder extends StObject {
  
  /**
    * Reading order is determined by the language of the first character entered.
    If a right-to-left language character is entered first, reading order is right to left.
    If a left-to-right language character is entered first, reading order is left to right.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait context
    extends StObject
       with ReadingOrder
  
  /**
    * Left to right reading order
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait leftToRight
    extends StObject
       with ReadingOrder
  
  /**
    * Right to left reading order
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait rightToLeft
    extends StObject
       with ReadingOrder
}
