package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregationFunction extends StObject
/**
  *
  * Aggregation Function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.AggregationFunction")
@js.native
object AggregationFunction extends StObject {
  
  /**
    * Excel will automatically select the aggregation based on the data items.
    *
    */
  @js.native
  sealed trait automatic extends AggregationFunction
  
  /**
    * Aggregate using the average of the data, equivalent to the AVERAGE function.
    *
    */
  @js.native
  sealed trait average extends AggregationFunction
  
  /**
    * Aggregate using the count of items in the data, equivalent to the COUNTA function.
    *
    */
  @js.native
  sealed trait count extends AggregationFunction
  
  /**
    * Aggregate using the count of numbers in the data, equivalent to the COUNT function.
    *
    */
  @js.native
  sealed trait countNumbers extends AggregationFunction
  
  /**
    * Aggregate using the maximum value of the data, equivalent to the MAX function.
    *
    */
  @js.native
  sealed trait max extends AggregationFunction
  
  /**
    * Aggregate using the minimum value of the data, equivalent to the MIN function.
    *
    */
  @js.native
  sealed trait min extends AggregationFunction
  
  /**
    * Aggregate using the product of the data, equivalent to the PRODUCT function.
    *
    */
  @js.native
  sealed trait product extends AggregationFunction
  
  /**
    * Aggregate using the standard deviation of the data, equivalent to the STDEV function.
    *
    */
  @js.native
  sealed trait standardDeviation extends AggregationFunction
  
  /**
    * Aggregate using the standard deviation of the data, equivalent to the STDEVP function.
    *
    */
  @js.native
  sealed trait standardDeviationP extends AggregationFunction
  
  /**
    * Aggregate using the sum of the data, equivalent to the SUM function.
    *
    */
  @js.native
  sealed trait sum extends AggregationFunction
  
  /**
    * Aggregation function is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends AggregationFunction
  
  /**
    * Aggregate using the variance of the data, equivalent to the VAR function.
    *
    */
  @js.native
  sealed trait variance extends AggregationFunction
  
  /**
    * Aggregate using the variance of the data, equivalent to the VARP function.
    *
    */
  @js.native
  sealed trait varianceP extends AggregationFunction
}
