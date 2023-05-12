package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregationFunction extends StObject
/**
  * Aggregation function for the `DataPivotHierarchy`.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.AggregationFunction")
@js.native
object AggregationFunction extends StObject {
  
  /**
    * Excel will automatically select the aggregation based on the data items.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait automatic
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the average of the data, equivalent to the AVERAGE function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait average
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the count of items in the data, equivalent to the COUNTA function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait count
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the count of numbers in the data, equivalent to the COUNT function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait countNumbers
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the maximum value of the data, equivalent to the MAX function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait max
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the minimum value of the data, equivalent to the MIN function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait min
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the product of the data, equivalent to the PRODUCT function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait product
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the standard deviation of the data, equivalent to the STDEV function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait standardDeviation
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the standard deviation of the data, equivalent to the STDEVP function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait standardDeviationP
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the sum of the data, equivalent to the SUM function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait sum
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregation function is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the variance of the data, equivalent to the VAR function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait variance
    extends StObject
       with AggregationFunction
  
  /**
    * Aggregate using the variance of the data, equivalent to the VARP function.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait varianceP
    extends StObject
       with AggregationFunction
}
