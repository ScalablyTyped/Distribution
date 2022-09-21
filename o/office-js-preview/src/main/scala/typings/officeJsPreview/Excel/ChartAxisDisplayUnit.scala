package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisDisplayUnit extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisDisplayUnit")
@js.native
object ChartAxisDisplayUnit extends StObject {
  
  /**
    * This will set the axis in units of billions.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait billions
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of custom value.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait custom
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds of millions.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait hundredMillions
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds of thousands.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait hundredThousands
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of hundreds.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait hundreds
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of millions.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait millions
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * Default option. This will reset display unit to the axis, and set unit label invisible.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait none
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of tens of millions.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tenMillions
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of tens of thousands.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tenThousands
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of thousands.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait thousands
    extends StObject
       with ChartAxisDisplayUnit
  
  /**
    * This will set the axis in units of trillions.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait trillions
    extends StObject
       with ChartAxisDisplayUnit
}
