package typings.officeDashJsDashPreview.ExcelNs

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
    *
    * Excel will automatically select the aggregation based on the data items.
    *
    */
  @js.native
  sealed trait automatic extends AggregationFunction
  
  /**
    *
    * Aggregate using the average of the data, equivalent to the AVERAGE function.
    *
    */
  @js.native
  sealed trait average extends AggregationFunction
  
  /**
    *
    * Aggregate using the count of items in the data, equivalent to the COUNTA function.
    *
    */
  @js.native
  sealed trait count extends AggregationFunction
  
  /**
    *
    * Aggregate using the count of numbers in the data, equivalent to the COUNT function.
    *
    */
  @js.native
  sealed trait countNumbers extends AggregationFunction
  
  /**
    *
    * Aggregate using the maximum value of the data, equivalent to the MAX function.
    *
    */
  @js.native
  sealed trait max extends AggregationFunction
  
  /**
    *
    * Aggregate using the minimum value of the data, equivalent to the MIN function.
    *
    */
  @js.native
  sealed trait min extends AggregationFunction
  
  /**
    *
    * Aggregate using the product of the data, equivalent to the PRODUCT function.
    *
    */
  @js.native
  sealed trait product extends AggregationFunction
  
  /**
    *
    * Aggregate using the standard deviation of the data, equivalent to the STDEV function.
    *
    */
  @js.native
  sealed trait standardDeviation extends AggregationFunction
  
  /**
    *
    * Aggregate using the standard deviation of the data, equivalent to the STDEVP function.
    *
    */
  @js.native
  sealed trait standardDeviationP extends AggregationFunction
  
  /**
    *
    * Aggregate using the sum of the data, equivalent to the SUM function.
    *
    */
  @js.native
  sealed trait sum extends AggregationFunction
  
  /**
    *
    * Aggregation function is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends AggregationFunction
  
  /**
    *
    * Aggregate using the variance of the data, equivalent to the VAR function.
    *
    */
  @js.native
  sealed trait variance extends AggregationFunction
  
  /**
    *
    * Aggregate using the variance of the data, equivalent to the VARP function.
    *
    */
  @js.native
  sealed trait varianceP extends AggregationFunction
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.automatic with String = js.native
  /* "Average" */ val average: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.average with String = js.native
  /* "Count" */ val count: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.count with String = js.native
  /* "CountNumbers" */ val countNumbers: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.countNumbers with String = js.native
  /* "Max" */ val max: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.max with String = js.native
  /* "Min" */ val min: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.min with String = js.native
  /* "Product" */ val product: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.product with String = js.native
  /* "StandardDeviation" */ val standardDeviation: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.standardDeviation with String = js.native
  /* "StandardDeviationP" */ val standardDeviationP: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.standardDeviationP with String = js.native
  /* "Sum" */ val sum: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.sum with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.unknown with String = js.native
  /* "Variance" */ val variance: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.variance with String = js.native
  /* "VarianceP" */ val varianceP: typings.officeDashJsDashPreview.ExcelNs.AggregationFunction.varianceP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregationFunction with String] = js.native
}

