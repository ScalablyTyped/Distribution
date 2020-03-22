package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationFunction extends js.Object

/**
  *
  * Aggregation Function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.AggregationFunction")
@js.native
object AggregationFunction extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregationFunction with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Average" */ @js.native
  object average extends TopLevel[average with String]
  
  /* "Count" */ @js.native
  object count extends TopLevel[count with String]
  
  /* "CountNumbers" */ @js.native
  object countNumbers extends TopLevel[countNumbers with String]
  
  /* "Max" */ @js.native
  object max extends TopLevel[max with String]
  
  /* "Min" */ @js.native
  object min extends TopLevel[min with String]
  
  /* "Product" */ @js.native
  object product extends TopLevel[product with String]
  
  /* "StandardDeviation" */ @js.native
  object standardDeviation extends TopLevel[standardDeviation with String]
  
  /* "StandardDeviationP" */ @js.native
  object standardDeviationP extends TopLevel[standardDeviationP with String]
  
  /* "Sum" */ @js.native
  object sum extends TopLevel[sum with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
  /* "Variance" */ @js.native
  object variance extends TopLevel[variance with String]
  
  /* "VarianceP" */ @js.native
  object varianceP extends TopLevel[varianceP with String]
  
}

