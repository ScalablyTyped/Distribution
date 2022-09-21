package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartErrorBarsType extends StObject
/**
  * Represents the range type for error bars.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait custom
    extends StObject
       with ChartErrorBarsType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fixedValue
    extends StObject
       with ChartErrorBarsType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait percent
    extends StObject
       with ChartErrorBarsType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait stDev
    extends StObject
       with ChartErrorBarsType
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait stError
    extends StObject
       with ChartErrorBarsType
}
