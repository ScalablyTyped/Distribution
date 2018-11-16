package typings
package officeDashJsLib.ExcelNs

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
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the average of the data, equivalent to the AVERAGE function.
           *
           */
  @js.native
  sealed trait average
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the count of items in the data, equivalent to the COUNTA function.
           *
           */
  @js.native
  sealed trait count
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the count of numbers in the data, equivalent to the COUNTA function.
           *
           */
  @js.native
  sealed trait countNumbers
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the maximum value of the data, equivalent to the MAX function.
           *
           */
  @js.native
  sealed trait max
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the minimum value of the data, equivalent to the MIN function.
           *
           */
  @js.native
  sealed trait min
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the product of the data, equivalent to the PRODUCT function.
           *
           */
  @js.native
  sealed trait product
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the standard deviation of the data, equivalent to the STDEV function.
           *
           */
  @js.native
  sealed trait standardDeviation
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the standard deviation of the data, equivalent to the STDEVP function.
           *
           */
  @js.native
  sealed trait standardDeviationP
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the sum of the data, equivalent to the SUM function.
           *
           */
  @js.native
  sealed trait sum
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregation function is unknown or unsupported.
           *
           */
  @js.native
  sealed trait unknown
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the variance of the data, equivalent to the VAR function.
           *
           */
  @js.native
  sealed trait variance
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /**
           *
           * Aggregate using the variance of the data, equivalent to the VARP function.
           *
           */
  @js.native
  sealed trait varianceP
    extends officeDashJsLib.ExcelNs.AggregationFunction
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Average" */ val average: average with java.lang.String = js.native
  /* "Count" */ val count: count with java.lang.String = js.native
  /* "CountNumbers" */ val countNumbers: countNumbers with java.lang.String = js.native
  /* "Max" */ val max: max with java.lang.String = js.native
  /* "Min" */ val min: min with java.lang.String = js.native
  /* "Product" */ val product: product with java.lang.String = js.native
  /* "StandardDeviation" */ val standardDeviation: standardDeviation with java.lang.String = js.native
  /* "StandardDeviationP" */ val standardDeviationP: standardDeviationP with java.lang.String = js.native
  /* "Sum" */ val sum: sum with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  /* "Variance" */ val variance: variance with java.lang.String = js.native
  /* "VarianceP" */ val varianceP: varianceP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.AggregationFunction with java.lang.String] = js.native
}

