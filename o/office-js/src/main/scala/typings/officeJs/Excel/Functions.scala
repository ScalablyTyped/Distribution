package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object for evaluating Excel functions.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait Functions extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Functions: RequestContext = js.native
  /**
    * Returns the absolute value of a number, a number without its sign.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the real number for which you want the absolute value.
    */
  def abs(number: Double): FunctionResult[Double] = js.native
  def abs(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def abs(number: Range): FunctionResult[Double] = js.native
  def abs(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the accrued interest for a security that pays periodic interest.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param firstInterest Is the security's first interest date, expressed as a serial date number.
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param rate Is the security's annual coupon rate.
    * @param par Is the security's par value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    * @param calcMethod Is a logical value: to accrued interest from issue date = TRUE or omitted; to calculate from last coupon payment date = FALSE.
    */
  def accrInt(
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    par: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def accrInt(
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    par: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def accrInt(
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    par: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    calcMethod: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the accrued interest for a security that pays interest at maturity.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param settlement Is the security's maturity date, expressed as a serial date number.
    * @param rate Is the security's annual coupon rate.
    * @param par Is the security's par value.
    * @param basis Is the type of day count basis to use.
    */
  def accrIntM(
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    par: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def accrIntM(
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    par: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the arccosine of a number, in radians in the range 0 to Pi. The arccosine is the angle whose cosine is Number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the cosine of the angle you want and must be from -1 to 1.
    */
  def acos(number: Double): FunctionResult[Double] = js.native
  def acos(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def acos(number: Range): FunctionResult[Double] = js.native
  def acos(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse hyperbolic cosine of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number equal to or greater than 1.
    */
  def acosh(number: Double): FunctionResult[Double] = js.native
  def acosh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def acosh(number: Range): FunctionResult[Double] = js.native
  def acosh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the arccotangent of a number, in radians in the range 0 to Pi.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the cotangent of the angle you want.
    */
  def acot(number: Double): FunctionResult[Double] = js.native
  def acot(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def acot(number: Range): FunctionResult[Double] = js.native
  def acot(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse hyperbolic cotangent of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the hyperbolic cotangent of the angle that you want.
    */
  def acoth(number: Double): FunctionResult[Double] = js.native
  def acoth(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def acoth(number: Range): FunctionResult[Double] = js.native
  def acoth(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the prorated linear depreciation of an asset for each accounting period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the cost of the asset.
    * @param datePurchased Is the date the asset is purchased.
    * @param firstPeriod Is the date of the end of the first period.
    * @param salvage Is the salvage value at the end of life of the asset.
    * @param period Is the period.
    * @param rate Is the rate of depreciation.
    * @param basis Year_basis : 0 for year of 360 days, 1 for actual, 3 for year of 365 days.
    */
  def amorDegrc(
    cost: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    datePurchased: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    salvage: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    period: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def amorDegrc(
    cost: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    datePurchased: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    salvage: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    period: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the prorated linear depreciation of an asset for each accounting period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the cost of the asset.
    * @param datePurchased Is the date the asset is purchased.
    * @param firstPeriod Is the date of the end of the first period.
    * @param salvage Is the salvage value at the end of life of the asset.
    * @param period Is the period.
    * @param rate Is the rate of depreciation.
    * @param basis Year_basis : 0 for year of 360 days, 1 for actual, 3 for year of 365 days.
    */
  def amorLinc(
    cost: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    datePurchased: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    salvage: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    period: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def amorLinc(
    cost: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    datePurchased: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    salvage: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    period: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Checks whether all arguments are TRUE, and returns TRUE if all arguments are TRUE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 conditions you want to test that can be either TRUE or FALSE and can be logical values, arrays, or references.
    */
  def and(values: (Boolean | Range | RangeReference | FunctionResult[_])*): FunctionResult[Boolean] = js.native
  /**
    * Converts a Roman numeral to Arabic.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the Roman numeral you want to convert.
    */
  def arabic(text: String): FunctionResult[Double] = js.native
  def arabic(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def arabic(text: Range): FunctionResult[Double] = js.native
  def arabic(text: RangeReference): FunctionResult[Double] = js.native
  def areas(reference: FunctionResult[_]): FunctionResult[Double] = js.native
  /**
    * Returns the number of areas in a reference. An area is a range of contiguous cells or a single cell.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param reference Is a reference to a cell or range of cells and can refer to multiple areas.
    */
  def areas(reference: Range): FunctionResult[Double] = js.native
  def areas(reference: RangeReference): FunctionResult[Double] = js.native
  /**
    * Changes full-width (double-byte) characters to half-width (single-byte) characters. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is a text, or a reference to a cell containing a text.
    */
  def asc(text: String): FunctionResult[String] = js.native
  def asc(text: FunctionResult[_]): FunctionResult[String] = js.native
  def asc(text: Range): FunctionResult[String] = js.native
  def asc(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the arcsine of a number in radians, in the range -Pi/2 to Pi/2.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the sine of the angle you want and must be from -1 to 1.
    */
  def asin(number: Double): FunctionResult[Double] = js.native
  def asin(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def asin(number: Range): FunctionResult[Double] = js.native
  def asin(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse hyperbolic sine of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number equal to or greater than 1.
    */
  def asinh(number: Double): FunctionResult[Double] = js.native
  def asinh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def asinh(number: Range): FunctionResult[Double] = js.native
  def asinh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the arctangent of a number in radians, in the range -Pi/2 to Pi/2.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the tangent of the angle you want.
    */
  def atan(number: Double): FunctionResult[Double] = js.native
  def atan(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def atan(number: Range): FunctionResult[Double] = js.native
  def atan(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the arctangent of the specified x- and y- coordinates, in radians between -Pi and Pi, excluding -Pi.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param xNum Is the x-coordinate of the point.
    * @param yNum Is the y-coordinate of the point.
    */
  def atan2(xNum: Double, yNum: Double): FunctionResult[Double] = js.native
  def atan2(xNum: Double, yNum: FunctionResult[_]): FunctionResult[Double] = js.native
  def atan2(xNum: Double, yNum: Range): FunctionResult[Double] = js.native
  def atan2(xNum: Double, yNum: RangeReference): FunctionResult[Double] = js.native
  def atan2(xNum: FunctionResult[_], yNum: Double): FunctionResult[Double] = js.native
  def atan2(xNum: FunctionResult[_], yNum: FunctionResult[_]): FunctionResult[Double] = js.native
  def atan2(xNum: FunctionResult[_], yNum: Range): FunctionResult[Double] = js.native
  def atan2(xNum: FunctionResult[_], yNum: RangeReference): FunctionResult[Double] = js.native
  def atan2(xNum: RangeReference, yNum: Double): FunctionResult[Double] = js.native
  def atan2(xNum: RangeReference, yNum: FunctionResult[_]): FunctionResult[Double] = js.native
  def atan2(xNum: RangeReference, yNum: Range): FunctionResult[Double] = js.native
  def atan2(xNum: RangeReference, yNum: RangeReference): FunctionResult[Double] = js.native
  def atan2(xNum: Range, yNum: Double): FunctionResult[Double] = js.native
  def atan2(xNum: Range, yNum: FunctionResult[_]): FunctionResult[Double] = js.native
  def atan2(xNum: Range, yNum: Range): FunctionResult[Double] = js.native
  def atan2(xNum: Range, yNum: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse hyperbolic tangent of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number between -1 and 1 excluding -1 and 1.
    */
  def atanh(number: Double): FunctionResult[Double] = js.native
  def atanh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def atanh(number: Range): FunctionResult[Double] = js.native
  def atanh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the average of the absolute deviations of data points from their mean. Arguments can be numbers or names, arrays, or references that contain numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 arguments for which you want the average of the absolute deviations.
    */
  def aveDev(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the average (arithmetic mean) of its arguments, which can be numbers or names, arrays, or references that contain numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numeric arguments for which you want the average.
    */
  def average(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the average (arithmetic mean) of its arguments, evaluating text and FALSE in arguments as 0; TRUE evaluates as 1. Arguments can be numbers, names, arrays, or references.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 arguments for which you want the average.
    */
  def averageA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Finds average(arithmetic mean) for the cells specified by a given condition or criteria.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param range Is the range of cells you want evaluated.
    * @param criteria Is the condition or criteria in the form of a number, expression, or text that defines which cells will be used to find the average.
    * @param averageRange Are the actual cells to be used to find the average. If omitted, the cells in range are used.
    */
  def averageIf(
    range: Range | RangeReference | FunctionResult[_],
    criteria: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def averageIf(
    range: Range | RangeReference | FunctionResult[_],
    criteria: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    averageRange: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def averageIfs(
    averageRange: FunctionResult[_],
    values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*
  ): FunctionResult[Double] = js.native
  def averageIfs(
    averageRange: RangeReference,
    values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*
  ): FunctionResult[Double] = js.native
  /**
    * Finds average(arithmetic mean) for the cells specified by a given set of conditions or criteria.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param averageRange Are the actual cells to be used to find the average.
    * @param values List of parameters, where the first element of each pair is the Is the range of cells you want evaluated for the particular condition , and the second element is is the condition or criteria in the form of a number, expression, or text that defines which cells will be used to find the average.
    */
  def averageIfs(
    averageRange: Range,
    values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*
  ): FunctionResult[Double] = js.native
  /**
    * Converts a number to text (baht).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is a number that you want to convert.
    */
  def bahtText(number: Double): FunctionResult[String] = js.native
  def bahtText(number: FunctionResult[_]): FunctionResult[String] = js.native
  def bahtText(number: Range): FunctionResult[String] = js.native
  def bahtText(number: RangeReference): FunctionResult[String] = js.native
  /**
    * Converts a number into a text representation with the given radix (base).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number that you want to convert.
    * @param radix Is the base Radix that you want to convert the number into.
    * @param minLength Is the minimum length of the returned string.  If omitted leading zeros are not added.
    */
  def base(
    number: Double | Range | RangeReference | FunctionResult[_],
    radix: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  def base(
    number: Double | Range | RangeReference | FunctionResult[_],
    radix: Double | Range | RangeReference | FunctionResult[_],
    minLength: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Returns the modified Bessel function In(x).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function.
    * @param n Is the order of the Bessel function.
    */
  def besselI(
    x: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    n: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the Bessel function Jn(x).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function.
    * @param n Is the order of the Bessel function.
    */
  def besselJ(
    x: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    n: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the modified Bessel function Kn(x).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function.
    * @param n Is the order of the function.
    */
  def besselK(
    x: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    n: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the Bessel function Yn(x).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function.
    * @param n Is the order of the function.
    */
  def besselY(
    x: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    n: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the beta probability distribution function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value between A and B at which to evaluate the function.
    * @param alpha Is a parameter to the distribution and must be greater than 0.
    * @param beta Is a parameter to the distribution and must be greater than 0.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability density function, use FALSE.
    * @param A Is an optional lower bound to the interval of x. If omitted, A = 0.
    * @param B Is an optional upper bound to the interval of x. If omitted, B = 1.
    */
  def beta_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def beta_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_],
    A: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def beta_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_],
    A: Double | Range | RangeReference | FunctionResult[_],
    B: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the cumulative beta probability density function (BETA.DIST).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the beta distribution.
    * @param alpha Is a parameter to the distribution and must be greater than 0.
    * @param beta Is a parameter to the distribution and must be greater than 0.
    * @param A Is an optional lower bound to the interval of x. If omitted, A = 0.
    * @param B Is an optional upper bound to the interval of x. If omitted, B = 1.
    */
  def beta_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def beta_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    A: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def beta_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    A: Double | Range | RangeReference | FunctionResult[_],
    B: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def bin2Dec(number: String): FunctionResult[Double] = js.native
  def bin2Dec(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Converts a binary number to decimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the binary number you want to convert.
    */
  def bin2Dec(number: Double): FunctionResult[Double] = js.native
  def bin2Dec(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def bin2Dec(number: Range): FunctionResult[Double] = js.native
  def bin2Dec(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts a binary number to hexadecimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the binary number you want to convert.
    * @param places Is the number of characters to use.
    */
  def bin2Hex(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def bin2Hex(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a binary number to octal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the binary number you want to convert.
    * @param places Is the number of characters to use.
    */
  def bin2Oct(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def bin2Oct(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the individual term binomial distribution probability.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param numberS Is the number of successes in trials.
    * @param trials Is the number of independent trials.
    * @param probabilityS Is the probability of success on each trial.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability mass function, use FALSE.
    */
  def binom_Dist(
    numberS: Double | Range | RangeReference | FunctionResult[_],
    trials: Double | Range | RangeReference | FunctionResult[_],
    probabilityS: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the probability of a trial result using a binomial distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param trials Is the number of independent trials.
    * @param probabilityS Is the probability of success on each trial.
    * @param numberS Is the number of successes in trials.
    * @param numberS2 If provided this function returns the probability that the number of successful trials shall lie between numberS and numberS2.
    */
  def binom_Dist_Range(
    trials: Double | Range | RangeReference | FunctionResult[_],
    probabilityS: Double | Range | RangeReference | FunctionResult[_],
    numberS: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def binom_Dist_Range(
    trials: Double | Range | RangeReference | FunctionResult[_],
    probabilityS: Double | Range | RangeReference | FunctionResult[_],
    numberS: Double | Range | RangeReference | FunctionResult[_],
    numberS2: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the smallest value for which the cumulative binomial distribution is greater than or equal to a criterion value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param trials Is the number of Bernoulli trials.
    * @param probabilityS Is the probability of success on each trial, a number between 0 and 1 inclusive.
    * @param alpha Is the criterion value, a number between 0 and 1 inclusive.
    */
  def binom_Inv(
    trials: Double | Range | RangeReference | FunctionResult[_],
    probabilityS: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns a bitwise 'And' of two numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number1 Is the decimal representation of the binary number you want to evaluate.
    * @param number2 Is the decimal representation of the binary number you want to evaluate.
    */
  def bitand(number1: Double, number2: Double): FunctionResult[Double] = js.native
  def bitand(number1: Double, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitand(number1: Double, number2: Range): FunctionResult[Double] = js.native
  def bitand(number1: Double, number2: RangeReference): FunctionResult[Double] = js.native
  def bitand(number1: FunctionResult[_], number2: Double): FunctionResult[Double] = js.native
  def bitand(number1: FunctionResult[_], number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitand(number1: FunctionResult[_], number2: Range): FunctionResult[Double] = js.native
  def bitand(number1: FunctionResult[_], number2: RangeReference): FunctionResult[Double] = js.native
  def bitand(number1: RangeReference, number2: Double): FunctionResult[Double] = js.native
  def bitand(number1: RangeReference, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitand(number1: RangeReference, number2: Range): FunctionResult[Double] = js.native
  def bitand(number1: RangeReference, number2: RangeReference): FunctionResult[Double] = js.native
  def bitand(number1: Range, number2: Double): FunctionResult[Double] = js.native
  def bitand(number1: Range, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitand(number1: Range, number2: Range): FunctionResult[Double] = js.native
  def bitand(number1: Range, number2: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a number shifted left by shift_amount bits.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the decimal representation of the binary number you want to evaluate.
    * @param shiftAmount Is the number of bits that you want to shift Number left by.
    */
  def bitlshift(number: Double, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitlshift(number: Double, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitlshift(number: Double, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitlshift(number: Double, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitlshift(number: FunctionResult[_], shiftAmount: Double): FunctionResult[Double] = js.native
  def bitlshift(number: FunctionResult[_], shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitlshift(number: FunctionResult[_], shiftAmount: Range): FunctionResult[Double] = js.native
  def bitlshift(number: FunctionResult[_], shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitlshift(number: RangeReference, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitlshift(number: RangeReference, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitlshift(number: RangeReference, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitlshift(number: RangeReference, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitlshift(number: Range, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitlshift(number: Range, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitlshift(number: Range, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitlshift(number: Range, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a bitwise 'Or' of two numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number1 Is the decimal representation of the binary number you want to evaluate.
    * @param number2 Is the decimal representation of the binary number you want to evaluate.
    */
  def bitor(number1: Double, number2: Double): FunctionResult[Double] = js.native
  def bitor(number1: Double, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitor(number1: Double, number2: Range): FunctionResult[Double] = js.native
  def bitor(number1: Double, number2: RangeReference): FunctionResult[Double] = js.native
  def bitor(number1: FunctionResult[_], number2: Double): FunctionResult[Double] = js.native
  def bitor(number1: FunctionResult[_], number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitor(number1: FunctionResult[_], number2: Range): FunctionResult[Double] = js.native
  def bitor(number1: FunctionResult[_], number2: RangeReference): FunctionResult[Double] = js.native
  def bitor(number1: RangeReference, number2: Double): FunctionResult[Double] = js.native
  def bitor(number1: RangeReference, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitor(number1: RangeReference, number2: Range): FunctionResult[Double] = js.native
  def bitor(number1: RangeReference, number2: RangeReference): FunctionResult[Double] = js.native
  def bitor(number1: Range, number2: Double): FunctionResult[Double] = js.native
  def bitor(number1: Range, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitor(number1: Range, number2: Range): FunctionResult[Double] = js.native
  def bitor(number1: Range, number2: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a number shifted right by shift_amount bits.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the decimal representation of the binary number you want to evaluate.
    * @param shiftAmount Is the number of bits that you want to shift Number right by.
    */
  def bitrshift(number: Double, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitrshift(number: Double, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitrshift(number: Double, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitrshift(number: Double, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitrshift(number: FunctionResult[_], shiftAmount: Double): FunctionResult[Double] = js.native
  def bitrshift(number: FunctionResult[_], shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitrshift(number: FunctionResult[_], shiftAmount: Range): FunctionResult[Double] = js.native
  def bitrshift(number: FunctionResult[_], shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitrshift(number: RangeReference, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitrshift(number: RangeReference, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitrshift(number: RangeReference, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitrshift(number: RangeReference, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  def bitrshift(number: Range, shiftAmount: Double): FunctionResult[Double] = js.native
  def bitrshift(number: Range, shiftAmount: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitrshift(number: Range, shiftAmount: Range): FunctionResult[Double] = js.native
  def bitrshift(number: Range, shiftAmount: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a bitwise 'Exclusive Or' of two numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number1 Is the decimal representation of the binary number you want to evaluate.
    * @param number2 Is the decimal representation of the binary number you want to evaluate.
    */
  def bitxor(number1: Double, number2: Double): FunctionResult[Double] = js.native
  def bitxor(number1: Double, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitxor(number1: Double, number2: Range): FunctionResult[Double] = js.native
  def bitxor(number1: Double, number2: RangeReference): FunctionResult[Double] = js.native
  def bitxor(number1: FunctionResult[_], number2: Double): FunctionResult[Double] = js.native
  def bitxor(number1: FunctionResult[_], number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitxor(number1: FunctionResult[_], number2: Range): FunctionResult[Double] = js.native
  def bitxor(number1: FunctionResult[_], number2: RangeReference): FunctionResult[Double] = js.native
  def bitxor(number1: RangeReference, number2: Double): FunctionResult[Double] = js.native
  def bitxor(number1: RangeReference, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitxor(number1: RangeReference, number2: Range): FunctionResult[Double] = js.native
  def bitxor(number1: RangeReference, number2: RangeReference): FunctionResult[Double] = js.native
  def bitxor(number1: Range, number2: Double): FunctionResult[Double] = js.native
  def bitxor(number1: Range, number2: FunctionResult[_]): FunctionResult[Double] = js.native
  def bitxor(number1: Range, number2: Range): FunctionResult[Double] = js.native
  def bitxor(number1: Range, number2: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number up, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value you want to round.
    * @param significance Is the multiple to which you want to round.
    * @param mode When given and nonzero this function will round away from zero.
    */
  def ceiling_Math(number: Double | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Math(
    number: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ceiling_Math(
    number: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_],
    mode: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Rounds a number up, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value you want to round.
    * @param significance Is the multiple to which you want to round.
    */
  def ceiling_Precise(number: Double): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Double, significance: Double): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Double, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Double, significance: Range): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Double, significance: RangeReference): FunctionResult[Double] = js.native
  def ceiling_Precise(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Precise(number: FunctionResult[_], significance: Double): FunctionResult[Double] = js.native
  def ceiling_Precise(number: FunctionResult[_], significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Precise(number: FunctionResult[_], significance: Range): FunctionResult[Double] = js.native
  def ceiling_Precise(number: FunctionResult[_], significance: RangeReference): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Range): FunctionResult[Double] = js.native
  def ceiling_Precise(number: RangeReference): FunctionResult[Double] = js.native
  def ceiling_Precise(number: RangeReference, significance: Double): FunctionResult[Double] = js.native
  def ceiling_Precise(number: RangeReference, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Precise(number: RangeReference, significance: Range): FunctionResult[Double] = js.native
  def ceiling_Precise(number: RangeReference, significance: RangeReference): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Range, significance: Double): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Range, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Range, significance: Range): FunctionResult[Double] = js.native
  def ceiling_Precise(number: Range, significance: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the character specified by the code number from the character set for your computer.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is a number between 1 and 255 specifying which character you want.
    */
  def char(number: Double): FunctionResult[String] = js.native
  def char(number: FunctionResult[_]): FunctionResult[String] = js.native
  def char(number: Range): FunctionResult[String] = js.native
  def char(number: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the left-tailed probability of the chi-squared distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which you want to evaluate the distribution, a nonnegative number.
    * @param degFreedom Is the number of degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param cumulative Is a logical value for the function to return: the cumulative distribution function = TRUE; the probability density function = FALSE.
    */
  def chiSq_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    degFreedom: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the right-tailed probability of the chi-squared distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which you want to evaluate the distribution, a nonnegative number.
    * @param degFreedom Is the number of degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def chiSq_Dist_RT(x: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Dist_RT(x: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the left-tailed probability of the chi-squared distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the chi-squared distribution, a value between 0 and 1 inclusive.
    * @param degFreedom Is the number of degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def chiSq_Inv(probability: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv(probability: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the right-tailed probability of the chi-squared distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the chi-squared distribution, a value between 0 and 1 inclusive.
    * @param degFreedom Is the number of degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def chiSq_Inv_RT(probability: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def chiSq_Inv_RT(probability: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Chooses a value or action to perform from a list of values, based on an index number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param indexNum Specifies which value argument is selected. indexNum must be between 1 and 254, or a formula or a reference to a number between 1 and 254.
    * @param values List of parameters, whose elements are 1 to 254 numbers, cell references, defined names, formulas, functions, or text arguments from which CHOOSE selects.
    */
  def choose(
    indexNum: Double,
    values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*
  ): FunctionResult[Double | String | Boolean] = js.native
  def choose(
    indexNum: FunctionResult[_],
    values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*
  ): FunctionResult[Double | String | Boolean] = js.native
  def choose(
    indexNum: RangeReference,
    values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*
  ): FunctionResult[Double | String | Boolean] = js.native
  def choose(indexNum: Range, values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double | String | Boolean] = js.native
  /**
    * Removes all nonprintable characters from text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is any worksheet information from which you want to remove nonprintable characters.
    */
  def clean(text: String): FunctionResult[String] = js.native
  def clean(text: FunctionResult[_]): FunctionResult[String] = js.native
  def clean(text: Range): FunctionResult[String] = js.native
  def clean(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns a numeric code for the first character in a text string, in the character set used by your computer.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text for which you want the code of the first character.
    */
  def code(text: String): FunctionResult[Double] = js.native
  def code(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def code(text: Range): FunctionResult[Double] = js.native
  def code(text: RangeReference): FunctionResult[Double] = js.native
  def columns(array: FunctionResult[_]): FunctionResult[Double] = js.native
  /**
    * Returns the number of columns in an array or reference.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is an array or array formula, or a reference to a range of cells for which you want the number of columns.
    */
  def columns(array: Range): FunctionResult[Double] = js.native
  def columns(array: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of combinations for a given number of items.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the total number of items.
    * @param numberChosen Is the number of items in each combination.
    */
  def combin(number: Double, numberChosen: Double): FunctionResult[Double] = js.native
  def combin(number: Double, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combin(number: Double, numberChosen: Range): FunctionResult[Double] = js.native
  def combin(number: Double, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combin(number: FunctionResult[_], numberChosen: Double): FunctionResult[Double] = js.native
  def combin(number: FunctionResult[_], numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combin(number: FunctionResult[_], numberChosen: Range): FunctionResult[Double] = js.native
  def combin(number: FunctionResult[_], numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combin(number: RangeReference, numberChosen: Double): FunctionResult[Double] = js.native
  def combin(number: RangeReference, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combin(number: RangeReference, numberChosen: Range): FunctionResult[Double] = js.native
  def combin(number: RangeReference, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combin(number: Range, numberChosen: Double): FunctionResult[Double] = js.native
  def combin(number: Range, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combin(number: Range, numberChosen: Range): FunctionResult[Double] = js.native
  def combin(number: Range, numberChosen: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of combinations with repetitions for a given number of items.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the total number of items.
    * @param numberChosen Is the number of items in each combination.
    */
  def combina(number: Double, numberChosen: Double): FunctionResult[Double] = js.native
  def combina(number: Double, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combina(number: Double, numberChosen: Range): FunctionResult[Double] = js.native
  def combina(number: Double, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combina(number: FunctionResult[_], numberChosen: Double): FunctionResult[Double] = js.native
  def combina(number: FunctionResult[_], numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combina(number: FunctionResult[_], numberChosen: Range): FunctionResult[Double] = js.native
  def combina(number: FunctionResult[_], numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combina(number: RangeReference, numberChosen: Double): FunctionResult[Double] = js.native
  def combina(number: RangeReference, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combina(number: RangeReference, numberChosen: Range): FunctionResult[Double] = js.native
  def combina(number: RangeReference, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def combina(number: Range, numberChosen: Double): FunctionResult[Double] = js.native
  def combina(number: Range, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def combina(number: Range, numberChosen: Range): FunctionResult[Double] = js.native
  def combina(number: Range, numberChosen: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts real and imaginary coefficients into a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param realNum Is the real coefficient of the complex number.
    * @param iNum Is the imaginary coefficient of the complex number.
    * @param suffix Is the suffix for the imaginary component of the complex number.
    */
  def complex(
    realNum: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    iNum: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def complex(
    realNum: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    iNum: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    suffix: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Joins several text strings into one text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 text strings to be joined into a single text string and can be text strings, numbers, or single-cell references.
    */
  def concatenate(values: (String | Range | RangeReference | FunctionResult[_])*): FunctionResult[String] = js.native
  /**
    * Returns the confidence interval for a population mean, using a normal distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param alpha Is the significance level used to compute the confidence level, a number greater than 0 and less than 1.
    * @param standardDev Is the population standard deviation for the data range and is assumed to be known. standardDev must be greater than 0.
    * @param size Is the sample size.
    */
  def confidence_Norm(
    alpha: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_],
    size: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the confidence interval for a population mean, using a Student's T distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param alpha Is the significance level used to compute the confidence level, a number greater than 0 and less than 1.
    * @param standardDev Is the population standard deviation for the data range and is assumed to be known. standardDev must be greater than 0.
    * @param size Is the sample size.
    */
  def confidence_T(
    alpha: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_],
    size: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a number from one measurement system to another.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value in from_units to convert.
    * @param fromUnit Is the units for number.
    * @param toUnit Is the units for the result.
    */
  def convert(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    fromUnit: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    toUnit: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the cosine of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the cosine.
    */
  def cos(number: Double): FunctionResult[Double] = js.native
  def cos(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def cos(number: Range): FunctionResult[Double] = js.native
  def cos(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic cosine of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number.
    */
  def cosh(number: Double): FunctionResult[Double] = js.native
  def cosh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def cosh(number: Range): FunctionResult[Double] = js.native
  def cosh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the cotangent of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the cotangent.
    */
  def cot(number: Double): FunctionResult[Double] = js.native
  def cot(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def cot(number: Range): FunctionResult[Double] = js.native
  def cot(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic cotangent of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the hyperbolic cotangent.
    */
  def coth(number: Double): FunctionResult[Double] = js.native
  def coth(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def coth(number: Range): FunctionResult[Double] = js.native
  def coth(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Counts the number of cells in a range that contain numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 arguments that can contain or refer to a variety of different types of data, but only numbers are counted.
    */
  def count(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Counts the number of cells in a range that are not empty.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 arguments representing the values and cells you want to count. Values can be any type of information.
    */
  def countA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def countBlank(range: FunctionResult[_]): FunctionResult[Double] = js.native
  /**
    * Counts the number of empty cells in a specified range of cells.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param range Is the range from which you want to count the empty cells.
    */
  def countBlank(range: Range): FunctionResult[Double] = js.native
  def countBlank(range: RangeReference): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: String): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: Boolean): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: Double): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: FunctionResult[_]): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: Range): FunctionResult[Double] = js.native
  def countIf(range: FunctionResult[_], criteria: RangeReference): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: String): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: Boolean): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: Double): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: FunctionResult[_]): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: Range): FunctionResult[Double] = js.native
  def countIf(range: RangeReference, criteria: RangeReference): FunctionResult[Double] = js.native
  def countIf(range: Range, criteria: String): FunctionResult[Double] = js.native
  def countIf(range: Range, criteria: Boolean): FunctionResult[Double] = js.native
  /**
    * Counts the number of cells within a range that meet the given condition.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param range Is the range of cells from which you want to count nonblank cells.
    * @param criteria Is the condition in the form of a number, expression, or text that defines which cells will be counted.
    */
  def countIf(range: Range, criteria: Double): FunctionResult[Double] = js.native
  def countIf(range: Range, criteria: FunctionResult[_]): FunctionResult[Double] = js.native
  def countIf(range: Range, criteria: Range): FunctionResult[Double] = js.native
  def countIf(range: Range, criteria: RangeReference): FunctionResult[Double] = js.native
  /**
    * Counts the number of cells specified by a given set of conditions or criteria.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, where the first element of each pair is the Is the range of cells you want evaluated for the particular condition , and the second element is is the condition in the form of a number, expression, or text that defines which cells will be counted.
    */
  def countIfs(values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*): FunctionResult[Double] = js.native
  /**
    * Returns the number of days from the beginning of the coupon period to the settlement date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupDayBs(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupDayBs(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of days in the coupon period that contains the settlement date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupDays(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupDays(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of days from the settlement date to the next coupon date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupDaysNc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupDaysNc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the next coupon date after the settlement date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupNcd(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupNcd(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of coupons payable between the settlement date and maturity date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupNum(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupNum(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the previous coupon date before the settlement date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def coupPcd(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def coupPcd(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the cosecant of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the cosecant.
    */
  def csc(number: Double): FunctionResult[Double] = js.native
  def csc(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def csc(number: Range): FunctionResult[Double] = js.native
  def csc(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic cosecant of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the hyperbolic cosecant.
    */
  def csch(number: Double): FunctionResult[Double] = js.native
  def csch(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def csch(number: Range): FunctionResult[Double] = js.native
  def csch(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the cumulative interest paid between two periods.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate.
    * @param nper Is the total number of payment periods.
    * @param pv Is the present value.
    * @param startPeriod Is the first period in the calculation.
    * @param endPeriod Is the last period in the calculation.
    * @param type Is the timing of the payment.
    */
  def cumIPmt(
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    nper: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pv: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    startPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    `type`: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the cumulative principal paid on a loan between two periods.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate.
    * @param nper Is the total number of payment periods.
    * @param pv Is the present value.
    * @param startPeriod Is the first period in the calculation.
    * @param endPeriod Is the last period in the calculation.
    * @param type Is the timing of the payment.
    */
  def cumPrinc(
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    nper: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pv: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    startPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endPeriod: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    `type`: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number that represents the date in Microsoft Excel date-time code.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param year Is a number from 1900 or 1904 (depending on the workbook's date system) to 9999.
    * @param month Is a number from 1 to 12 representing the month of the year.
    * @param day Is a number from 1 to 31 representing the day of the month.
    */
  def date(
    year: Double | Range | RangeReference | FunctionResult[_],
    month: Double | Range | RangeReference | FunctionResult[_],
    day: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a date in the form of text to a number that represents the date in Microsoft Excel date-time code.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param dateText Is text that represents a date in a Microsoft Excel date format, between 1/1/1900 or 1/1/1904 (depending on the workbook's date system) and 12/31/9999.
    */
  def datevalue(dateText: String): FunctionResult[Double] = js.native
  def datevalue(dateText: Double): FunctionResult[Double] = js.native
  def datevalue(dateText: FunctionResult[_]): FunctionResult[Double] = js.native
  def datevalue(dateText: Range): FunctionResult[Double] = js.native
  def datevalue(dateText: RangeReference): FunctionResult[Double] = js.native
  /**
    * Averages the values in a column in a list or database that match conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def daverage(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the day of the month, a number from 1 to 31.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel.
    */
  def day(serialNumber: Double): FunctionResult[Double] = js.native
  def day(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def day(serialNumber: Range): FunctionResult[Double] = js.native
  def day(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of days between the two dates.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param endDate startDate and endDate are the two dates between which you want to know the number of days.
    * @param startDate startDate and endDate are the two dates between which you want to know the number of days.
    */
  def days(
    endDate: String | Double | Range | RangeReference | FunctionResult[_],
    startDate: String | Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of days between two dates based on a 360-day year (twelve 30-day months).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate startDate and endDate are the two dates between which you want to know the number of days.
    * @param endDate startDate and endDate are the two dates between which you want to know the number of days.
    * @param method Is a logical value specifying the calculation method: U.S. (NASD) = FALSE or omitted; European = TRUE.
    */
  def days360(
    startDate: Double | Range | RangeReference | FunctionResult[_],
    endDate: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def days360(
    startDate: Double | Range | RangeReference | FunctionResult[_],
    endDate: Double | Range | RangeReference | FunctionResult[_],
    method: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the depreciation of an asset for a specified period using the fixed-declining balance method.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the initial cost of the asset.
    * @param salvage Is the salvage value at the end of the life of the asset.
    * @param life Is the number of periods over which the asset is being depreciated (sometimes called the useful life of the asset).
    * @param period Is the period for which you want to calculate the depreciation. Period must use the same units as Life.
    * @param month Is the number of months in the first year. If month is omitted, it is assumed to be 12.
    */
  def db(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    period: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def db(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    period: Double | Range | RangeReference | FunctionResult[_],
    month: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Changes half-width (single-byte) characters within a character string to full-width (double-byte) characters. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is a text, or a reference to a cell containing a text.
    */
  def dbcs(text: String): FunctionResult[String] = js.native
  def dbcs(text: FunctionResult[_]): FunctionResult[String] = js.native
  def dbcs(text: Range): FunctionResult[String] = js.native
  def dbcs(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Counts the cells containing numbers in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dcount(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Counts nonblank cells in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dcountA(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the depreciation of an asset for a specified period using the double-declining balance method or some other method you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the initial cost of the asset.
    * @param salvage Is the salvage value at the end of the life of the asset.
    * @param life Is the number of periods over which the asset is being depreciated (sometimes called the useful life of the asset).
    * @param period Is the period for which you want to calculate the depreciation. Period must use the same units as Life.
    * @param factor Is the rate at which the balance declines. If Factor is omitted, it is assumed to be 2 (the double-declining balance method).
    */
  def ddb(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    period: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ddb(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    period: Double | Range | RangeReference | FunctionResult[_],
    factor: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a decimal number to binary.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the decimal integer you want to convert.
    * @param places Is the number of characters to use.
    */
  def dec2Bin(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def dec2Bin(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a decimal number to hexadecimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the decimal integer you want to convert.
    * @param places Is the number of characters to use.
    */
  def dec2Hex(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def dec2Hex(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a decimal number to octal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the decimal integer you want to convert.
    * @param places Is the number of characters to use.
    */
  def dec2Oct(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def dec2Oct(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a text representation of a number in a given base into a decimal number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number that you want to convert.
    * @param radix Is the base Radix of the number you are converting.
    */
  def decimal(number: String, radix: Double): FunctionResult[Double] = js.native
  def decimal(number: String, radix: FunctionResult[_]): FunctionResult[Double] = js.native
  def decimal(number: String, radix: Range): FunctionResult[Double] = js.native
  def decimal(number: String, radix: RangeReference): FunctionResult[Double] = js.native
  def decimal(number: FunctionResult[_], radix: Double): FunctionResult[Double] = js.native
  def decimal(number: FunctionResult[_], radix: FunctionResult[_]): FunctionResult[Double] = js.native
  def decimal(number: FunctionResult[_], radix: Range): FunctionResult[Double] = js.native
  def decimal(number: FunctionResult[_], radix: RangeReference): FunctionResult[Double] = js.native
  def decimal(number: RangeReference, radix: Double): FunctionResult[Double] = js.native
  def decimal(number: RangeReference, radix: FunctionResult[_]): FunctionResult[Double] = js.native
  def decimal(number: RangeReference, radix: Range): FunctionResult[Double] = js.native
  def decimal(number: RangeReference, radix: RangeReference): FunctionResult[Double] = js.native
  def decimal(number: Range, radix: Double): FunctionResult[Double] = js.native
  def decimal(number: Range, radix: FunctionResult[_]): FunctionResult[Double] = js.native
  def decimal(number: Range, radix: Range): FunctionResult[Double] = js.native
  def decimal(number: Range, radix: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts radians to degrees.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param angle Is the angle in radians that you want to convert.
    */
  def degrees(angle: Double): FunctionResult[Double] = js.native
  def degrees(angle: FunctionResult[_]): FunctionResult[Double] = js.native
  def degrees(angle: Range): FunctionResult[Double] = js.native
  def degrees(angle: RangeReference): FunctionResult[Double] = js.native
  /**
    * Tests whether two numbers are equal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number1 Is the first number.
    * @param number2 Is the second number.
    */
  def delta(number1: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def delta(
    number1: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    number2: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the sum of squares of deviations of data points from their sample mean.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 arguments, or an array or array reference, on which you want DEVSQ to calculate.
    */
  def devSq(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Extracts from a database a single record that matches the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dget(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | Boolean | String] = js.native
  /**
    * Returns the discount rate for a security.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param pr Is the security's price per $100 face value.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param basis Is the type of day count basis to use.
    */
  def disc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def disc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the largest number in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dmax(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the smallest number in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dmin(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a number to text, using currency format.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is a number, a reference to a cell containing a number, or a formula that evaluates to a number.
    * @param decimals Is the number of digits to the right of the decimal point. The number is rounded as necessary; if omitted, Decimals = 2.
    */
  def dollar(number: Double): FunctionResult[String] = js.native
  def dollar(number: Double, decimals: Double): FunctionResult[String] = js.native
  def dollar(number: Double, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def dollar(number: Double, decimals: Range): FunctionResult[String] = js.native
  def dollar(number: Double, decimals: RangeReference): FunctionResult[String] = js.native
  def dollar(number: FunctionResult[_]): FunctionResult[String] = js.native
  def dollar(number: FunctionResult[_], decimals: Double): FunctionResult[String] = js.native
  def dollar(number: FunctionResult[_], decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def dollar(number: FunctionResult[_], decimals: Range): FunctionResult[String] = js.native
  def dollar(number: FunctionResult[_], decimals: RangeReference): FunctionResult[String] = js.native
  def dollar(number: Range): FunctionResult[String] = js.native
  def dollar(number: RangeReference): FunctionResult[String] = js.native
  def dollar(number: RangeReference, decimals: Double): FunctionResult[String] = js.native
  def dollar(number: RangeReference, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def dollar(number: RangeReference, decimals: Range): FunctionResult[String] = js.native
  def dollar(number: RangeReference, decimals: RangeReference): FunctionResult[String] = js.native
  def dollar(number: Range, decimals: Double): FunctionResult[String] = js.native
  def dollar(number: Range, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def dollar(number: Range, decimals: Range): FunctionResult[String] = js.native
  def dollar(number: Range, decimals: RangeReference): FunctionResult[String] = js.native
  /**
    * Converts a dollar price, expressed as a fraction, into a dollar price, expressed as a decimal number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param fractionalDollar Is a number expressed as a fraction.
    * @param fraction Is the integer to use in the denominator of the fraction.
    */
  def dollarDe(
    fractionalDollar: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    fraction: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a dollar price, expressed as a decimal number, into a dollar price, expressed as a fraction.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param decimalDollar Is a decimal number.
    * @param fraction Is the integer to use in the denominator of a fraction.
    */
  def dollarFr(
    decimalDollar: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    fraction: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Multiplies the values in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dproduct(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Estimates the standard deviation based on a sample from selected database entries.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dstDev(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Calculates the standard deviation based on the entire population of selected database entries.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dstDevP(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Adds the numbers in the field (column) of records in the database that match the conditions you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dsum(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the annual duration of a security with periodic interest payments.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param coupon Is the security's annual coupon rate.
    * @param yld Is the security's annual yield.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def duration(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    coupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def duration(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    coupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Estimates variance based on a sample from selected database entries.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dvar(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Calculates variance based on the entire population of selected database entries.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param database Is the range of cells that makes up the list or database. A database is a list of related data.
    * @param field Is either the label of the column in double quotation marks or a number that represents the column's position in the list.
    * @param criteria Is the range of cells that contains the conditions you specify. The range includes a column label and one cell below the label for a condition.
    */
  def dvarP(
    database: Range | RangeReference | FunctionResult[_],
    field: Double | String | Range | RangeReference | FunctionResult[_],
    criteria: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Rounds a number up, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value you want to round.
    * @param significance Is the multiple to which you want to round.
    */
  def ecma_Ceiling(number: Double, significance: Double): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Double, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Double, significance: Range): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Double, significance: RangeReference): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: FunctionResult[_], significance: Double): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: FunctionResult[_], significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: FunctionResult[_], significance: Range): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: FunctionResult[_], significance: RangeReference): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: RangeReference, significance: Double): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: RangeReference, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: RangeReference, significance: Range): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: RangeReference, significance: RangeReference): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Range, significance: Double): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Range, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Range, significance: Range): FunctionResult[Double] = js.native
  def ecma_Ceiling(number: Range, significance: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the serial number of the date that is the indicated number of months before or after the start date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param months Is the number of months before or after startDate.
    */
  def edate(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    months: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the effective annual interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param nominalRate Is the nominal interest rate.
    * @param npery Is the number of compounding periods per year.
    */
  def effect(
    nominalRate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    npery: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the serial number of the last day of the month before or after a specified number of months.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param months Is the number of months before or after the startDate.
    */
  def eoMonth(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    months: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the error function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param lowerLimit Is the lower bound for integrating ERF.
    * @param upperLimit Is the upper bound for integrating ERF.
    */
  def erf(lowerLimit: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def erf(
    lowerLimit: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    upperLimit: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def erfC(x: String): FunctionResult[Double] = js.native
  def erfC(x: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the complementary error function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the lower bound for integrating ERF.
    */
  def erfC(x: Double): FunctionResult[Double] = js.native
  def erfC(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def erfC(x: Range): FunctionResult[Double] = js.native
  def erfC(x: RangeReference): FunctionResult[Double] = js.native
  def erfC_Precise(X: String): FunctionResult[Double] = js.native
  def erfC_Precise(X: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the complementary error function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param X Is the lower bound for integrating ERFC.PRECISE.
    */
  def erfC_Precise(X: Double): FunctionResult[Double] = js.native
  def erfC_Precise(X: FunctionResult[_]): FunctionResult[Double] = js.native
  def erfC_Precise(X: Range): FunctionResult[Double] = js.native
  def erfC_Precise(X: RangeReference): FunctionResult[Double] = js.native
  def erf_Precise(X: String): FunctionResult[Double] = js.native
  def erf_Precise(X: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the error function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param X Is the lower bound for integrating ERF.PRECISE.
    */
  def erf_Precise(X: Double): FunctionResult[Double] = js.native
  def erf_Precise(X: FunctionResult[_]): FunctionResult[Double] = js.native
  def erf_Precise(X: Range): FunctionResult[Double] = js.native
  def erf_Precise(X: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a number matching an error value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param errorVal Is the error value for which you want the identifying number, and can be an actual error value or a reference to a cell containing an error value.
    */
  def error_Type(errorVal: String): FunctionResult[Double] = js.native
  def error_Type(errorVal: Boolean): FunctionResult[Double] = js.native
  def error_Type(errorVal: Double): FunctionResult[Double] = js.native
  def error_Type(errorVal: FunctionResult[_]): FunctionResult[Double] = js.native
  def error_Type(errorVal: Range): FunctionResult[Double] = js.native
  def error_Type(errorVal: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a positive number up and negative number down to the nearest even integer.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to round.
    */
  def even(number: Double): FunctionResult[Double] = js.native
  def even(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def even(number: Range): FunctionResult[Double] = js.native
  def even(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Checks whether two text strings are exactly the same, and returns TRUE or FALSE. EXACT is case-sensitive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text1 Is the first text string.
    * @param text2 Is the second text string.
    */
  def exact(text1: String, text2: String): FunctionResult[Boolean] = js.native
  def exact(text1: String, text2: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def exact(text1: String, text2: Range): FunctionResult[Boolean] = js.native
  def exact(text1: String, text2: RangeReference): FunctionResult[Boolean] = js.native
  def exact(text1: FunctionResult[_], text2: String): FunctionResult[Boolean] = js.native
  def exact(text1: FunctionResult[_], text2: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def exact(text1: FunctionResult[_], text2: Range): FunctionResult[Boolean] = js.native
  def exact(text1: FunctionResult[_], text2: RangeReference): FunctionResult[Boolean] = js.native
  def exact(text1: RangeReference, text2: String): FunctionResult[Boolean] = js.native
  def exact(text1: RangeReference, text2: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def exact(text1: RangeReference, text2: Range): FunctionResult[Boolean] = js.native
  def exact(text1: RangeReference, text2: RangeReference): FunctionResult[Boolean] = js.native
  def exact(text1: Range, text2: String): FunctionResult[Boolean] = js.native
  def exact(text1: Range, text2: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def exact(text1: Range, text2: Range): FunctionResult[Boolean] = js.native
  def exact(text1: Range, text2: RangeReference): FunctionResult[Boolean] = js.native
  /**
    * Returns e raised to the power of a given number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the exponent applied to the base e. The constant e equals 2.71828182845904, the base of the natural logarithm.
    */
  def exp(number: Double): FunctionResult[Double] = js.native
  def exp(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def exp(number: Range): FunctionResult[Double] = js.native
  def exp(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the exponential distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value of the function, a nonnegative number.
    * @param lambda Is the parameter value, a positive number.
    * @param cumulative Is a logical value for the function to return: the cumulative distribution function = TRUE; the probability density function = FALSE.
    */
  def expon_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    lambda: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the (left-tailed) F probability distribution (degree of diversity) for two data sets.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function, a nonnegative number.
    * @param degFreedom1 Is the numerator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param degFreedom2 Is the denominator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param cumulative Is a logical value for the function to return: the cumulative distribution function = TRUE; the probability density function = FALSE.
    */
  def f_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    degFreedom1: Double | Range | RangeReference | FunctionResult[_],
    degFreedom2: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the (right-tailed) F probability distribution (degree of diversity) for two data sets.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function, a nonnegative number.
    * @param degFreedom1 Is the numerator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param degFreedom2 Is the denominator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def f_Dist_RT(
    x: Double | Range | RangeReference | FunctionResult[_],
    degFreedom1: Double | Range | RangeReference | FunctionResult[_],
    degFreedom2: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the (left-tailed) F probability distribution: if p = F.DIST(x,...), then F.INV(p,...) = x.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the F cumulative distribution, a number between 0 and 1 inclusive.
    * @param degFreedom1 Is the numerator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param degFreedom2 Is the denominator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def f_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    degFreedom1: Double | Range | RangeReference | FunctionResult[_],
    degFreedom2: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the (right-tailed) F probability distribution: if p = F.DIST.RT(x,...), then F.INV.RT(p,...) = x.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the F cumulative distribution, a number between 0 and 1 inclusive.
    * @param degFreedom1 Is the numerator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    * @param degFreedom2 Is the denominator degrees of freedom, a number between 1 and 10^10, excluding 10^10.
    */
  def f_Inv_RT(
    probability: Double | Range | RangeReference | FunctionResult[_],
    degFreedom1: Double | Range | RangeReference | FunctionResult[_],
    degFreedom2: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the factorial of a number, equal to 1*2*3*...* Number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the nonnegative number you want the factorial of.
    */
  def fact(number: Double): FunctionResult[Double] = js.native
  def fact(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def fact(number: Range): FunctionResult[Double] = js.native
  def fact(number: RangeReference): FunctionResult[Double] = js.native
  def factDouble(number: String): FunctionResult[Double] = js.native
  def factDouble(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the double factorial of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value for which to return the double factorial.
    */
  def factDouble(number: Double): FunctionResult[Double] = js.native
  def factDouble(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def factDouble(number: Range): FunctionResult[Double] = js.native
  def factDouble(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the logical value FALSE.
    *
    * [Api set: ExcelApi 1.2]
    */
  def `false`(): FunctionResult[Boolean] = js.native
  /**
    * Returns the starting position of one text string within another text string. FIND is case-sensitive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param findText Is the text you want to find. Use double quotes (empty text) to match the first character in withinText; wildcard characters not allowed.
    * @param withinText Is the text containing the text you want to find.
    * @param startNum Specifies the character at which to start the search. The first character in withinText is character number 1. If omitted, startNum = 1.
    */
  def find(
    findText: String | Range | RangeReference | FunctionResult[_],
    withinText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def find(
    findText: String | Range | RangeReference | FunctionResult[_],
    withinText: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Finds the starting position of one text string within another text string. FINDB is case-sensitive. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param findText Is the text you want to find.
    * @param withinText Is the text containing the text you want to find.
    * @param startNum Specifies the character at which to start the search.
    */
  def findB(
    findText: String | Range | RangeReference | FunctionResult[_],
    withinText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def findB(
    findText: String | Range | RangeReference | FunctionResult[_],
    withinText: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the Fisher transformation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want the transformation, a number between -1 and 1, excluding -1 and 1.
    */
  def fisher(x: Double): FunctionResult[Double] = js.native
  def fisher(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def fisher(x: Range): FunctionResult[Double] = js.native
  def fisher(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the Fisher transformation: if y = FISHER(x), then FISHERINV(y) = x.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param y Is the value for which you want to perform the inverse of the transformation.
    */
  def fisherInv(y: Double): FunctionResult[Double] = js.native
  def fisherInv(y: FunctionResult[_]): FunctionResult[Double] = js.native
  def fisherInv(y: Range): FunctionResult[Double] = js.native
  def fisherInv(y: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number to the specified number of decimals and returns the result as text with or without commas.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number you want to round and convert to text.
    * @param decimals Is the number of digits to the right of the decimal point. If omitted, Decimals = 2.
    * @param noCommas Is a logical value: do not display commas in the returned text = TRUE; do display commas in the returned text = FALSE or omitted.
    */
  def fixed(number: Double | Range | RangeReference | FunctionResult[_]): FunctionResult[String] = js.native
  def fixed(
    number: Double | Range | RangeReference | FunctionResult[_],
    decimals: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  def fixed(
    number: Double | Range | RangeReference | FunctionResult[_],
    decimals: Double | Range | RangeReference | FunctionResult[_],
    noCommas: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Rounds a number down, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value you want to round.
    * @param significance Is the multiple to which you want to round.
    * @param mode When given and nonzero this function will round towards zero.
    */
  def floor_Math(number: Double | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Math(
    number: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def floor_Math(
    number: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_],
    mode: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Rounds a number down, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the numeric value you want to round.
    * @param significance Is the multiple to which you want to round.
    */
  def floor_Precise(number: Double): FunctionResult[Double] = js.native
  def floor_Precise(number: Double, significance: Double): FunctionResult[Double] = js.native
  def floor_Precise(number: Double, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Precise(number: Double, significance: Range): FunctionResult[Double] = js.native
  def floor_Precise(number: Double, significance: RangeReference): FunctionResult[Double] = js.native
  def floor_Precise(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Precise(number: FunctionResult[_], significance: Double): FunctionResult[Double] = js.native
  def floor_Precise(number: FunctionResult[_], significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Precise(number: FunctionResult[_], significance: Range): FunctionResult[Double] = js.native
  def floor_Precise(number: FunctionResult[_], significance: RangeReference): FunctionResult[Double] = js.native
  def floor_Precise(number: Range): FunctionResult[Double] = js.native
  def floor_Precise(number: RangeReference): FunctionResult[Double] = js.native
  def floor_Precise(number: RangeReference, significance: Double): FunctionResult[Double] = js.native
  def floor_Precise(number: RangeReference, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Precise(number: RangeReference, significance: Range): FunctionResult[Double] = js.native
  def floor_Precise(number: RangeReference, significance: RangeReference): FunctionResult[Double] = js.native
  def floor_Precise(number: Range, significance: Double): FunctionResult[Double] = js.native
  def floor_Precise(number: Range, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def floor_Precise(number: Range, significance: Range): FunctionResult[Double] = js.native
  def floor_Precise(number: Range, significance: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the future value of an investment based on periodic, constant payments and a constant interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param nper Is the total number of payment periods in the investment.
    * @param pmt Is the payment made each period; it cannot change over the life of the investment.
    * @param pv Is the present value, or the lump-sum amount that a series of future payments is worth now. If omitted, Pv = 0.
    * @param type Is a value representing the timing of payment: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    */
  def fv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def fv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def fv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the future value of an initial principal after applying a series of compound interest rates.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param principal Is the present value.
    * @param schedule Is an array of interest rates to apply.
    */
  def fvschedule(
    principal: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    schedule: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the Gamma function value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want to calculate Gamma.
    */
  def gamma(x: Double): FunctionResult[Double] = js.native
  def gamma(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def gamma(x: Range): FunctionResult[Double] = js.native
  def gamma(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the natural logarithm of the gamma function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want to calculate GAMMALN, a positive number.
    */
  def gammaLn(x: Double): FunctionResult[Double] = js.native
  def gammaLn(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def gammaLn(x: Range): FunctionResult[Double] = js.native
  def gammaLn(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the natural logarithm of the gamma function.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want to calculate GAMMALN.PRECISE, a positive number.
    */
  def gammaLn_Precise(x: Double): FunctionResult[Double] = js.native
  def gammaLn_Precise(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def gammaLn_Precise(x: Range): FunctionResult[Double] = js.native
  def gammaLn_Precise(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the gamma distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which you want to evaluate the distribution, a nonnegative number.
    * @param alpha Is a parameter to the distribution, a positive number.
    * @param beta Is a parameter to the distribution, a positive number. If beta = 1, GAMMA.DIST returns the standard gamma distribution.
    * @param cumulative Is a logical value: return the cumulative distribution function = TRUE; return the probability mass function = FALSE or omitted.
    */
  def gamma_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the gamma cumulative distribution: if p = GAMMA.DIST(x,...), then GAMMA.INV(p,...) = x.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is the probability associated with the gamma distribution, a number between 0 and 1, inclusive.
    * @param alpha Is a parameter to the distribution, a positive number.
    * @param beta Is a parameter to the distribution, a positive number. If beta = 1, GAMMA.INV returns the inverse of the standard gamma distribution.
    */
  def gamma_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns 0.5 less than the standard normal cumulative distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want the distribution.
    */
  def gauss(x: Double): FunctionResult[Double] = js.native
  def gauss(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def gauss(x: Range): FunctionResult[Double] = js.native
  def gauss(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the greatest common divisor.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 values.
    */
  def gcd(values: (Double | String | Range | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Tests whether a number is greater than a threshold value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to test against step.
    * @param step Is the threshold value.
    */
  def geStep(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def geStep(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    step: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the geometric mean of an array or range of positive numeric data.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers or names, arrays, or references that contain numbers for which you want the mean.
    */
  def geoMean(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the harmonic mean of a data set of positive numbers: the reciprocal of the arithmetic mean of reciprocals.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers or names, arrays, or references that contain numbers for which you want the harmonic mean.
    */
  def harMean(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Converts a Hexadecimal number to binary.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the hexadecimal number you want to convert.
    * @param places Is the number of characters to use.
    */
  def hex2Bin(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def hex2Bin(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def hex2Dec(number: String): FunctionResult[Double] = js.native
  def hex2Dec(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Converts a hexadecimal number to decimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the hexadecimal number you want to convert.
    */
  def hex2Dec(number: Double): FunctionResult[Double] = js.native
  def hex2Dec(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def hex2Dec(number: Range): FunctionResult[Double] = js.native
  def hex2Dec(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts a hexadecimal number to octal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the hexadecimal number you want to convert.
    * @param places Is the number of characters to use.
    */
  def hex2Oct(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def hex2Oct(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Looks for a value in the top row of a table or array of values and returns the value in the same column from a row you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param lookupValue Is the value to be found in the first row of the table and can be a value, a reference, or a text string.
    * @param tableArray Is a table of text, numbers, or logical values in which data is looked up. tableArray can be a reference to a range or a range name.
    * @param rowIndexNum Is the row number in tableArray from which the matching value should be returned. The first row of values in the table is row 1.
    * @param rangeLookup Is a logical value: to find the closest match in the top row (sorted in ascending order) = TRUE or omitted; find an exact match = FALSE.
    */
  def hlookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    tableArray: Range | Double | RangeReference | FunctionResult[_],
    rowIndexNum: Range | Double | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  def hlookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    tableArray: Range | Double | RangeReference | FunctionResult[_],
    rowIndexNum: Range | Double | RangeReference | FunctionResult[_],
    rangeLookup: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  /**
    * Returns the hour as a number from 0 (12:00 A.M.) to 23 (11:00 P.M.).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel, or text in time format, such as 16:48:00 or 4:48:00 PM.
    */
  def hour(serialNumber: Double): FunctionResult[Double] = js.native
  def hour(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def hour(serialNumber: Range): FunctionResult[Double] = js.native
  def hour(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hypergeometric distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param sampleS Is the number of successes in the sample.
    * @param numberSample Is the size of the sample.
    * @param populationS Is the number of successes in the population.
    * @param numberPop Is the population size.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability density function, use FALSE.
    */
  def hypGeom_Dist(
    sampleS: Double | Range | RangeReference | FunctionResult[_],
    numberSample: Double | Range | RangeReference | FunctionResult[_],
    populationS: Double | Range | RangeReference | FunctionResult[_],
    numberPop: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Creates a shortcut or jump that opens a document stored on your hard drive, a network server, or on the Internet.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param linkLocation Is the text giving the path and file name to the document to be opened, a hard drive location, UNC address, or URL path.
    * @param friendlyName Is text or a number that is displayed in the cell. If omitted, the cell displays the linkLocation text.
    */
  def hyperlink(linkLocation: String | Range | RangeReference | FunctionResult[_]): FunctionResult[Double | String | Boolean] = js.native
  def hyperlink(
    linkLocation: String | Range | RangeReference | FunctionResult[_],
    friendlyName: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  /**
    * Checks whether a condition is met, and returns one value if TRUE, and another value if FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param logicalTest Is any value or expression that can be evaluated to TRUE or FALSE.
    * @param valueIfTrue Is the value that is returned if logicalTest is TRUE. If omitted, TRUE is returned. You can nest up to seven IF functions.
    * @param valueIfFalse Is the value that is returned if logicalTest is FALSE. If omitted, FALSE is returned.
    */
  def `if`(logicalTest: Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double | String | Boolean] = js.native
  def `if`(
    logicalTest: Boolean | Range | RangeReference | FunctionResult[_],
    valueIfTrue: Range | Double | String | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  def `if`(
    logicalTest: Boolean | Range | RangeReference | FunctionResult[_],
    valueIfTrue: Range | Double | String | Boolean | RangeReference | FunctionResult[_],
    valueIfFalse: Range | Double | String | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  def imAbs(inumber: String): FunctionResult[Double] = js.native
  def imAbs(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the absolute value (modulus) of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the absolute value.
    */
  def imAbs(inumber: Double): FunctionResult[Double] = js.native
  def imAbs(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imAbs(inumber: Range): FunctionResult[Double] = js.native
  def imAbs(inumber: RangeReference): FunctionResult[Double] = js.native
  def imArgument(inumber: String): FunctionResult[Double] = js.native
  def imArgument(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the argument q, an angle expressed in radians.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the argument.
    */
  def imArgument(inumber: Double): FunctionResult[Double] = js.native
  def imArgument(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imArgument(inumber: Range): FunctionResult[Double] = js.native
  def imArgument(inumber: RangeReference): FunctionResult[Double] = js.native
  def imConjugate(inumber: String): FunctionResult[Double] = js.native
  def imConjugate(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the complex conjugate of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the conjugate.
    */
  def imConjugate(inumber: Double): FunctionResult[Double] = js.native
  def imConjugate(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imConjugate(inumber: Range): FunctionResult[Double] = js.native
  def imConjugate(inumber: RangeReference): FunctionResult[Double] = js.native
  def imCos(inumber: String): FunctionResult[Double] = js.native
  def imCos(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the cosine of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the cosine.
    */
  def imCos(inumber: Double): FunctionResult[Double] = js.native
  def imCos(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imCos(inumber: Range): FunctionResult[Double] = js.native
  def imCos(inumber: RangeReference): FunctionResult[Double] = js.native
  def imCosh(inumber: String): FunctionResult[Double] = js.native
  def imCosh(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic cosine of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the hyperbolic cosine.
    */
  def imCosh(inumber: Double): FunctionResult[Double] = js.native
  def imCosh(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imCosh(inumber: Range): FunctionResult[Double] = js.native
  def imCosh(inumber: RangeReference): FunctionResult[Double] = js.native
  def imCot(inumber: String): FunctionResult[Double] = js.native
  def imCot(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the cotangent of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the cotangent.
    */
  def imCot(inumber: Double): FunctionResult[Double] = js.native
  def imCot(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imCot(inumber: Range): FunctionResult[Double] = js.native
  def imCot(inumber: RangeReference): FunctionResult[Double] = js.native
  def imCsc(inumber: String): FunctionResult[Double] = js.native
  def imCsc(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the cosecant of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the cosecant.
    */
  def imCsc(inumber: Double): FunctionResult[Double] = js.native
  def imCsc(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imCsc(inumber: Range): FunctionResult[Double] = js.native
  def imCsc(inumber: RangeReference): FunctionResult[Double] = js.native
  def imCsch(inumber: String): FunctionResult[Double] = js.native
  def imCsch(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic cosecant of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the hyperbolic cosecant.
    */
  def imCsch(inumber: Double): FunctionResult[Double] = js.native
  def imCsch(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imCsch(inumber: Range): FunctionResult[Double] = js.native
  def imCsch(inumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the quotient of two complex numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber1 Is the complex numerator or dividend.
    * @param inumber2 Is the complex denominator or divisor.
    */
  def imDiv(
    inumber1: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    inumber2: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def imExp(inumber: String): FunctionResult[Double] = js.native
  def imExp(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the exponential of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the exponential.
    */
  def imExp(inumber: Double): FunctionResult[Double] = js.native
  def imExp(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imExp(inumber: Range): FunctionResult[Double] = js.native
  def imExp(inumber: RangeReference): FunctionResult[Double] = js.native
  def imLn(inumber: String): FunctionResult[Double] = js.native
  def imLn(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the natural logarithm of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the natural logarithm.
    */
  def imLn(inumber: Double): FunctionResult[Double] = js.native
  def imLn(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imLn(inumber: Range): FunctionResult[Double] = js.native
  def imLn(inumber: RangeReference): FunctionResult[Double] = js.native
  def imLog10(inumber: String): FunctionResult[Double] = js.native
  def imLog10(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the base-10 logarithm of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the common logarithm.
    */
  def imLog10(inumber: Double): FunctionResult[Double] = js.native
  def imLog10(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imLog10(inumber: Range): FunctionResult[Double] = js.native
  def imLog10(inumber: RangeReference): FunctionResult[Double] = js.native
  def imLog2(inumber: String): FunctionResult[Double] = js.native
  def imLog2(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the base-2 logarithm of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the base-2 logarithm.
    */
  def imLog2(inumber: Double): FunctionResult[Double] = js.native
  def imLog2(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imLog2(inumber: Range): FunctionResult[Double] = js.native
  def imLog2(inumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a complex number raised to an integer power.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number you want to raise to a power.
    * @param number Is the power to which you want to raise the complex number.
    */
  def imPower(
    inumber: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the product of 1 to 255 complex numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values Inumber1, Inumber2,... are from 1 to 255 complex numbers to multiply.
    */
  def imProduct(values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def imReal(inumber: String): FunctionResult[Double] = js.native
  def imReal(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the real coefficient of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the real coefficient.
    */
  def imReal(inumber: Double): FunctionResult[Double] = js.native
  def imReal(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imReal(inumber: Range): FunctionResult[Double] = js.native
  def imReal(inumber: RangeReference): FunctionResult[Double] = js.native
  def imSec(inumber: String): FunctionResult[Double] = js.native
  def imSec(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the secant of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the secant.
    */
  def imSec(inumber: Double): FunctionResult[Double] = js.native
  def imSec(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imSec(inumber: Range): FunctionResult[Double] = js.native
  def imSec(inumber: RangeReference): FunctionResult[Double] = js.native
  def imSech(inumber: String): FunctionResult[Double] = js.native
  def imSech(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic secant of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the hyperbolic secant.
    */
  def imSech(inumber: Double): FunctionResult[Double] = js.native
  def imSech(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imSech(inumber: Range): FunctionResult[Double] = js.native
  def imSech(inumber: RangeReference): FunctionResult[Double] = js.native
  def imSin(inumber: String): FunctionResult[Double] = js.native
  def imSin(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the sine of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the sine.
    */
  def imSin(inumber: Double): FunctionResult[Double] = js.native
  def imSin(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imSin(inumber: Range): FunctionResult[Double] = js.native
  def imSin(inumber: RangeReference): FunctionResult[Double] = js.native
  def imSinh(inumber: String): FunctionResult[Double] = js.native
  def imSinh(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic sine of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the hyperbolic sine.
    */
  def imSinh(inumber: Double): FunctionResult[Double] = js.native
  def imSinh(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imSinh(inumber: Range): FunctionResult[Double] = js.native
  def imSinh(inumber: RangeReference): FunctionResult[Double] = js.native
  def imSqrt(inumber: String): FunctionResult[Double] = js.native
  def imSqrt(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the square root of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the square root.
    */
  def imSqrt(inumber: Double): FunctionResult[Double] = js.native
  def imSqrt(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imSqrt(inumber: Range): FunctionResult[Double] = js.native
  def imSqrt(inumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the difference of two complex numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber1 Is the complex number from which to subtract inumber2.
    * @param inumber2 Is the complex number to subtract from inumber1.
    */
  def imSub(
    inumber1: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    inumber2: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the sum of complex numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are from 1 to 255 complex numbers to add.
    */
  def imSum(values: (Range | Double | String | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def imTan(inumber: String): FunctionResult[Double] = js.native
  def imTan(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the tangent of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the tangent.
    */
  def imTan(inumber: Double): FunctionResult[Double] = js.native
  def imTan(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imTan(inumber: Range): FunctionResult[Double] = js.native
  def imTan(inumber: RangeReference): FunctionResult[Double] = js.native
  def imaginary(inumber: String): FunctionResult[Double] = js.native
  def imaginary(inumber: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the imaginary coefficient of a complex number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param inumber Is a complex number for which you want the imaginary coefficient.
    */
  def imaginary(inumber: Double): FunctionResult[Double] = js.native
  def imaginary(inumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def imaginary(inumber: Range): FunctionResult[Double] = js.native
  def imaginary(inumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number down to the nearest integer.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the real number you want to round down to an integer.
    */
  def int(number: Double): FunctionResult[Double] = js.native
  def int(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def int(number: Range): FunctionResult[Double] = js.native
  def int(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the interest rate for a fully invested security.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param investment Is the amount invested in the security.
    * @param redemption Is the amount to be received at maturity.
    * @param basis Is the type of day count basis to use.
    */
  def intRate(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    investment: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def intRate(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    investment: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the interest payment for a given period for an investment, based on periodic, constant payments and a constant interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param per Is the period for which you want to find the interest and must be in the range 1 to Nper.
    * @param nper Is the total number of payment periods in an investment.
    * @param pv Is the present value, or the lump-sum amount that a series of future payments is worth now.
    * @param fv Is the future value, or a cash balance you want to attain after the last payment is made. If omitted, Fv = 0.
    * @param type Is a logical value representing the timing of payment: at the end of the period = 0 or omitted, at the beginning of the period = 1.
    */
  def ipmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ipmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ipmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def irr(values: FunctionResult[_]): FunctionResult[Double] = js.native
  def irr(values: FunctionResult[_], guess: Double): FunctionResult[Double] = js.native
  def irr(values: FunctionResult[_], guess: FunctionResult[_]): FunctionResult[Double] = js.native
  def irr(values: FunctionResult[_], guess: Range): FunctionResult[Double] = js.native
  def irr(values: FunctionResult[_], guess: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the internal rate of return for a series of cash flows.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values Is an array or a reference to cells that contain numbers for which you want to calculate the internal rate of return.
    * @param guess Is a number that you guess is close to the result of IRR; 0.1 (10 percent) if omitted.
    */
  def irr(values: Range): FunctionResult[Double] = js.native
  def irr(values: RangeReference): FunctionResult[Double] = js.native
  def irr(values: RangeReference, guess: Double): FunctionResult[Double] = js.native
  def irr(values: RangeReference, guess: FunctionResult[_]): FunctionResult[Double] = js.native
  def irr(values: RangeReference, guess: Range): FunctionResult[Double] = js.native
  def irr(values: RangeReference, guess: RangeReference): FunctionResult[Double] = js.native
  def irr(values: Range, guess: Double): FunctionResult[Double] = js.native
  def irr(values: Range, guess: FunctionResult[_]): FunctionResult[Double] = js.native
  def irr(values: Range, guess: Range): FunctionResult[Double] = js.native
  def irr(values: Range, guess: RangeReference): FunctionResult[Double] = js.native
  def isErr(value: String): FunctionResult[Boolean] = js.native
  def isErr(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is an error (#VALUE!, #REF!, #DIV/0!, #NUM!, #NAME?, or #NULL!) excluding #N/A, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isErr(value: Double): FunctionResult[Boolean] = js.native
  def isErr(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isErr(value: Range): FunctionResult[Boolean] = js.native
  def isErr(value: RangeReference): FunctionResult[Boolean] = js.native
  def isError(value: String): FunctionResult[Boolean] = js.native
  def isError(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is an error (#N/A, #VALUE!, #REF!, #DIV/0!, #NUM!, #NAME?, or #NULL!), and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isError(value: Double): FunctionResult[Boolean] = js.native
  def isError(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isError(value: Range): FunctionResult[Boolean] = js.native
  def isError(value: RangeReference): FunctionResult[Boolean] = js.native
  def isEven(number: String): FunctionResult[Double] = js.native
  def isEven(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns TRUE if the number is even.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to test.
    */
  def isEven(number: Double): FunctionResult[Double] = js.native
  def isEven(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def isEven(number: Range): FunctionResult[Double] = js.native
  def isEven(number: RangeReference): FunctionResult[Double] = js.native
  def isFormula(reference: FunctionResult[_]): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a reference is to a cell containing a formula, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param reference Is a reference to the cell you want to test.  Reference can be a cell reference, a formula, or name that refers to a cell.
    */
  def isFormula(reference: Range): FunctionResult[Boolean] = js.native
  def isFormula(reference: RangeReference): FunctionResult[Boolean] = js.native
  def isLogical(value: String): FunctionResult[Boolean] = js.native
  def isLogical(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is a logical value (TRUE or FALSE), and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isLogical(value: Double): FunctionResult[Boolean] = js.native
  def isLogical(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isLogical(value: Range): FunctionResult[Boolean] = js.native
  def isLogical(value: RangeReference): FunctionResult[Boolean] = js.native
  def isNA(value: String): FunctionResult[Boolean] = js.native
  def isNA(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is #N/A, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isNA(value: Double): FunctionResult[Boolean] = js.native
  def isNA(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isNA(value: Range): FunctionResult[Boolean] = js.native
  def isNA(value: RangeReference): FunctionResult[Boolean] = js.native
  def isNonText(value: String): FunctionResult[Boolean] = js.native
  def isNonText(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is not text (blank cells are not text), and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want tested: a cell; a formula; or a name referring to a cell, formula, or value.
    */
  def isNonText(value: Double): FunctionResult[Boolean] = js.native
  def isNonText(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isNonText(value: Range): FunctionResult[Boolean] = js.native
  def isNonText(value: RangeReference): FunctionResult[Boolean] = js.native
  def isNumber(value: String): FunctionResult[Boolean] = js.native
  def isNumber(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is a number, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isNumber(value: Double): FunctionResult[Boolean] = js.native
  def isNumber(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isNumber(value: Range): FunctionResult[Boolean] = js.native
  def isNumber(value: RangeReference): FunctionResult[Boolean] = js.native
  def isOdd(number: String): FunctionResult[Double] = js.native
  def isOdd(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns TRUE if the number is odd.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to test.
    */
  def isOdd(number: Double): FunctionResult[Double] = js.native
  def isOdd(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def isOdd(number: Range): FunctionResult[Double] = js.native
  def isOdd(number: RangeReference): FunctionResult[Double] = js.native
  def isText(value: String): FunctionResult[Boolean] = js.native
  def isText(value: Boolean): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is text, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isText(value: Double): FunctionResult[Boolean] = js.native
  def isText(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def isText(value: Range): FunctionResult[Boolean] = js.native
  def isText(value: RangeReference): FunctionResult[Boolean] = js.native
  /**
    * Returns the ISO week number in the year for a given date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param date Is the date-time code used by Microsoft Excel for date and time calculation.
    */
  def isoWeekNum(date: Double): FunctionResult[Double] = js.native
  def isoWeekNum(date: FunctionResult[_]): FunctionResult[Double] = js.native
  def isoWeekNum(date: Range): FunctionResult[Double] = js.native
  def isoWeekNum(date: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number up, to the nearest integer or to the nearest multiple of significance.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value you want to round.
    * @param significance Is the optional multiple to which you want to round.
    */
  def iso_Ceiling(number: Double): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Double, significance: Double): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Double, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Double, significance: Range): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Double, significance: RangeReference): FunctionResult[Double] = js.native
  def iso_Ceiling(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def iso_Ceiling(number: FunctionResult[_], significance: Double): FunctionResult[Double] = js.native
  def iso_Ceiling(number: FunctionResult[_], significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def iso_Ceiling(number: FunctionResult[_], significance: Range): FunctionResult[Double] = js.native
  def iso_Ceiling(number: FunctionResult[_], significance: RangeReference): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Range): FunctionResult[Double] = js.native
  def iso_Ceiling(number: RangeReference): FunctionResult[Double] = js.native
  def iso_Ceiling(number: RangeReference, significance: Double): FunctionResult[Double] = js.native
  def iso_Ceiling(number: RangeReference, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def iso_Ceiling(number: RangeReference, significance: Range): FunctionResult[Double] = js.native
  def iso_Ceiling(number: RangeReference, significance: RangeReference): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Range, significance: Double): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Range, significance: FunctionResult[_]): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Range, significance: Range): FunctionResult[Double] = js.native
  def iso_Ceiling(number: Range, significance: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the interest paid during a specific period of an investment.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param per Period for which you want to find the interest.
    * @param nper Number of payment periods in an investment.
    * @param pv Lump sum amount that a series of future payments is right now.
    */
  def ispmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def isref(value: String): FunctionResult[Boolean] = js.native
  def isref(value: Boolean): FunctionResult[Boolean] = js.native
  def isref(value: Double): FunctionResult[Boolean] = js.native
  def isref(value: FunctionResult[_]): FunctionResult[Boolean] = js.native
  /**
    * Checks whether a value is a reference, and returns TRUE or FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want to test. Value can refer to a cell, a formula, or a name that refers to a cell, formula, or value.
    */
  def isref(value: Range): FunctionResult[Boolean] = js.native
  def isref(value: RangeReference): FunctionResult[Boolean] = js.native
  /**
    * Returns the kurtosis of a data set.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers or names, arrays, or references that contain numbers for which you want the kurtosis.
    */
  def kurt(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the k-th largest value in a data set. For example, the fifth largest number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data for which you want to determine the k-th largest value.
    * @param k Is the position (from the largest) in the array or cell range of the value to return.
    */
  def large(array: Double, k: Double): FunctionResult[Double] = js.native
  def large(array: Double, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def large(array: Double, k: Range): FunctionResult[Double] = js.native
  def large(array: Double, k: RangeReference): FunctionResult[Double] = js.native
  def large(array: FunctionResult[_], k: Double): FunctionResult[Double] = js.native
  def large(array: FunctionResult[_], k: FunctionResult[_]): FunctionResult[Double] = js.native
  def large(array: FunctionResult[_], k: Range): FunctionResult[Double] = js.native
  def large(array: FunctionResult[_], k: RangeReference): FunctionResult[Double] = js.native
  def large(array: RangeReference, k: Double): FunctionResult[Double] = js.native
  def large(array: RangeReference, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def large(array: RangeReference, k: Range): FunctionResult[Double] = js.native
  def large(array: RangeReference, k: RangeReference): FunctionResult[Double] = js.native
  def large(array: Range, k: Double): FunctionResult[Double] = js.native
  def large(array: Range, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def large(array: Range, k: Range): FunctionResult[Double] = js.native
  def large(array: Range, k: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the least common multiple.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 values for which you want the least common multiple.
    */
  def lcm(values: (Double | String | Range | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the specified number of characters from the start of a text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string containing the characters you want to extract.
    * @param numChars Specifies how many characters you want LEFT to extract; 1 if omitted.
    */
  def left(text: String): FunctionResult[String] = js.native
  def left(text: String, numChars: Double): FunctionResult[String] = js.native
  def left(text: String, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def left(text: String, numChars: Range): FunctionResult[String] = js.native
  def left(text: String, numChars: RangeReference): FunctionResult[String] = js.native
  def left(text: FunctionResult[_]): FunctionResult[String] = js.native
  def left(text: FunctionResult[_], numChars: Double): FunctionResult[String] = js.native
  def left(text: FunctionResult[_], numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def left(text: FunctionResult[_], numChars: Range): FunctionResult[String] = js.native
  def left(text: FunctionResult[_], numChars: RangeReference): FunctionResult[String] = js.native
  def left(text: Range): FunctionResult[String] = js.native
  def left(text: RangeReference): FunctionResult[String] = js.native
  def left(text: RangeReference, numChars: Double): FunctionResult[String] = js.native
  def left(text: RangeReference, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def left(text: RangeReference, numChars: Range): FunctionResult[String] = js.native
  def left(text: RangeReference, numChars: RangeReference): FunctionResult[String] = js.native
  def left(text: Range, numChars: Double): FunctionResult[String] = js.native
  def left(text: Range, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def left(text: Range, numChars: Range): FunctionResult[String] = js.native
  def left(text: Range, numChars: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the specified number of characters from the start of a text string. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string containing the characters you want to extract.
    * @param numBytes Specifies how many characters you want LEFT to return.
    */
  def leftb(text: String): FunctionResult[String] = js.native
  def leftb(text: String, numBytes: Double): FunctionResult[String] = js.native
  def leftb(text: String, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def leftb(text: String, numBytes: Range): FunctionResult[String] = js.native
  def leftb(text: String, numBytes: RangeReference): FunctionResult[String] = js.native
  def leftb(text: FunctionResult[_]): FunctionResult[String] = js.native
  def leftb(text: FunctionResult[_], numBytes: Double): FunctionResult[String] = js.native
  def leftb(text: FunctionResult[_], numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def leftb(text: FunctionResult[_], numBytes: Range): FunctionResult[String] = js.native
  def leftb(text: FunctionResult[_], numBytes: RangeReference): FunctionResult[String] = js.native
  def leftb(text: Range): FunctionResult[String] = js.native
  def leftb(text: RangeReference): FunctionResult[String] = js.native
  def leftb(text: RangeReference, numBytes: Double): FunctionResult[String] = js.native
  def leftb(text: RangeReference, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def leftb(text: RangeReference, numBytes: Range): FunctionResult[String] = js.native
  def leftb(text: RangeReference, numBytes: RangeReference): FunctionResult[String] = js.native
  def leftb(text: Range, numBytes: Double): FunctionResult[String] = js.native
  def leftb(text: Range, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def leftb(text: Range, numBytes: Range): FunctionResult[String] = js.native
  def leftb(text: Range, numBytes: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the number of characters in a text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text whose length you want to find. Spaces count as characters.
    */
  def len(text: String): FunctionResult[Double] = js.native
  def len(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def len(text: Range): FunctionResult[Double] = js.native
  def len(text: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of characters in a text string. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text whose length you want to find.
    */
  def lenb(text: String): FunctionResult[Double] = js.native
  def lenb(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def lenb(text: Range): FunctionResult[Double] = js.native
  def lenb(text: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the natural logarithm of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the positive real number for which you want the natural logarithm.
    */
  def ln(number: Double): FunctionResult[Double] = js.native
  def ln(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def ln(number: Range): FunctionResult[Double] = js.native
  def ln(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the logarithm of a number to the base you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the positive real number for which you want the logarithm.
    * @param base Is the base of the logarithm; 10 if omitted.
    */
  def log(number: Double): FunctionResult[Double] = js.native
  def log(number: Double, base: Double): FunctionResult[Double] = js.native
  def log(number: Double, base: FunctionResult[_]): FunctionResult[Double] = js.native
  def log(number: Double, base: Range): FunctionResult[Double] = js.native
  def log(number: Double, base: RangeReference): FunctionResult[Double] = js.native
  def log(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def log(number: FunctionResult[_], base: Double): FunctionResult[Double] = js.native
  def log(number: FunctionResult[_], base: FunctionResult[_]): FunctionResult[Double] = js.native
  def log(number: FunctionResult[_], base: Range): FunctionResult[Double] = js.native
  def log(number: FunctionResult[_], base: RangeReference): FunctionResult[Double] = js.native
  def log(number: Range): FunctionResult[Double] = js.native
  def log(number: RangeReference): FunctionResult[Double] = js.native
  def log(number: RangeReference, base: Double): FunctionResult[Double] = js.native
  def log(number: RangeReference, base: FunctionResult[_]): FunctionResult[Double] = js.native
  def log(number: RangeReference, base: Range): FunctionResult[Double] = js.native
  def log(number: RangeReference, base: RangeReference): FunctionResult[Double] = js.native
  def log(number: Range, base: Double): FunctionResult[Double] = js.native
  def log(number: Range, base: FunctionResult[_]): FunctionResult[Double] = js.native
  def log(number: Range, base: Range): FunctionResult[Double] = js.native
  def log(number: Range, base: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the base-10 logarithm of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the positive real number for which you want the base-10 logarithm.
    */
  def log10(number: Double): FunctionResult[Double] = js.native
  def log10(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def log10(number: Range): FunctionResult[Double] = js.native
  def log10(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the lognormal distribution of x, where ln(x) is normally distributed with parameters Mean and Standard_dev.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function, a positive number.
    * @param mean Is the mean of ln(x).
    * @param standardDev Is the standard deviation of ln(x), a positive number.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability density function, use FALSE.
    */
  def logNorm_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the lognormal cumulative distribution function of x, where ln(x) is normally distributed with parameters Mean and Standard_dev.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability associated with the lognormal distribution, a number between 0 and 1, inclusive.
    * @param mean Is the mean of ln(x).
    * @param standardDev Is the standard deviation of ln(x), a positive number.
    */
  def logNorm_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Looks up a value either from a one-row or one-column range or from an array. Provided for backward compatibility.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param lookupValue Is a value that LOOKUP searches for in lookupVector and can be a number, text, a logical value, or a name or reference to a value.
    * @param lookupVector Is a range that contains only one row or one column of text, numbers, or logical values, placed in ascending order.
    * @param resultVector Is a range that contains only one row or column, the same size as lookupVector.
    */
  def lookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lookupVector: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  def lookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lookupVector: Range | RangeReference | FunctionResult[_],
    resultVector: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  /**
    * Converts all letters in a text string to lowercase.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text you want to convert to lowercase. Characters in Text that are not letters are not changed.
    */
  def lower(text: String): FunctionResult[String] = js.native
  def lower(text: FunctionResult[_]): FunctionResult[String] = js.native
  def lower(text: Range): FunctionResult[String] = js.native
  def lower(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the relative position of an item in an array that matches a specified value in a specified order.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param lookupValue Is the value you use to find the value you want in the array, a number, text, or logical value, or a reference to one of these.
    * @param lookupArray Is a contiguous range of cells containing possible lookup values, an array of values, or a reference to an array.
    * @param matchType Is a number 1, 0, or -1 indicating which value to return.
    */
  def `match`(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lookupArray: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def `match`(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lookupArray: Double | Range | RangeReference | FunctionResult[_],
    matchType: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the largest value in a set of values. Ignores logical values and text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, empty cells, logical values, or text numbers for which you want the maximum.
    */
  def max(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the largest value in a set of values. Does not ignore logical values and text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, empty cells, logical values, or text numbers for which you want the maximum.
    */
  def maxA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the Macauley modified duration for a security with an assumed par value of $100.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param coupon Is the security's annual coupon rate.
    * @param yld Is the security's annual yield.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def mduration(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    coupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def mduration(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    coupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the median, or the number in the middle of the set of given numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers or names, arrays, or references that contain numbers for which you want the median.
    */
  def median(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the characters from the middle of a text string, given a starting position and length.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string from which you want to extract the characters.
    * @param startNum Is the position of the first character you want to extract. The first character in Text is 1.
    * @param numChars Specifies how many characters to return from Text.
    */
  def mid(
    text: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_],
    numChars: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Returns characters from the middle of a text string, given a starting position and length. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string containing the characters you want to extract.
    * @param startNum Is the position of the first character you want to extract in text.
    * @param numBytes Specifies how many characters to return from text.
    */
  def midb(
    text: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_],
    numBytes: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Returns the smallest number in a set of values. Ignores logical values and text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, empty cells, logical values, or text numbers for which you want the minimum.
    */
  def min(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the smallest value in a set of values. Does not ignore logical values and text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, empty cells, logical values, or text numbers for which you want the minimum.
    */
  def minA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the minute, a number from 0 to 59.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel or text in time format, such as 16:48:00 or 4:48:00 PM.
    */
  def minute(serialNumber: Double): FunctionResult[Double] = js.native
  def minute(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def minute(serialNumber: Range): FunctionResult[Double] = js.native
  def minute(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the internal rate of return for a series of periodic cash flows, considering both cost of investment and interest on reinvestment of cash.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values Is an array or a reference to cells that contain numbers that represent a series of payments (negative) and income (positive) at regular periods.
    * @param financeRate Is the interest rate you pay on the money used in the cash flows.
    * @param reinvestRate Is the interest rate you receive on the cash flows as you reinvest them.
    */
  def mirr(
    values: Range | RangeReference | FunctionResult[_],
    financeRate: Double | Range | RangeReference | FunctionResult[_],
    reinvestRate: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the remainder after a number is divided by a divisor.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number for which you want to find the remainder after the division is performed.
    * @param divisor Is the number by which you want to divide Number.
    */
  def mod(number: Double, divisor: Double): FunctionResult[Double] = js.native
  def mod(number: Double, divisor: FunctionResult[_]): FunctionResult[Double] = js.native
  def mod(number: Double, divisor: Range): FunctionResult[Double] = js.native
  def mod(number: Double, divisor: RangeReference): FunctionResult[Double] = js.native
  def mod(number: FunctionResult[_], divisor: Double): FunctionResult[Double] = js.native
  def mod(number: FunctionResult[_], divisor: FunctionResult[_]): FunctionResult[Double] = js.native
  def mod(number: FunctionResult[_], divisor: Range): FunctionResult[Double] = js.native
  def mod(number: FunctionResult[_], divisor: RangeReference): FunctionResult[Double] = js.native
  def mod(number: RangeReference, divisor: Double): FunctionResult[Double] = js.native
  def mod(number: RangeReference, divisor: FunctionResult[_]): FunctionResult[Double] = js.native
  def mod(number: RangeReference, divisor: Range): FunctionResult[Double] = js.native
  def mod(number: RangeReference, divisor: RangeReference): FunctionResult[Double] = js.native
  def mod(number: Range, divisor: Double): FunctionResult[Double] = js.native
  def mod(number: Range, divisor: FunctionResult[_]): FunctionResult[Double] = js.native
  def mod(number: Range, divisor: Range): FunctionResult[Double] = js.native
  def mod(number: Range, divisor: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the month, a number from 1 (January) to 12 (December).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel.
    */
  def month(serialNumber: Double): FunctionResult[Double] = js.native
  def month(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def month(serialNumber: Range): FunctionResult[Double] = js.native
  def month(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a number rounded to the desired multiple.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to round.
    * @param multiple Is the multiple to which you want to round number.
    */
  def mround(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    multiple: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the multinomial of a set of numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 values for which you want the multinomial.
    */
  def multiNomial(values: (Double | String | Range | Boolean | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def n(value: String): FunctionResult[Double] = js.native
  def n(value: Boolean): FunctionResult[Double] = js.native
  /**
    * Converts non-number value to a number, dates to serial numbers, TRUE to 1, anything else to 0 (zero).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value you want converted.
    */
  def n(value: Double): FunctionResult[Double] = js.native
  def n(value: FunctionResult[_]): FunctionResult[Double] = js.native
  def n(value: Range): FunctionResult[Double] = js.native
  def n(value: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the error value #N/A (value not available).
    *
    * [Api set: ExcelApi 1.2]
    */
  def na(): FunctionResult[Double | String] = js.native
  /**
    * Returns the negative binomial distribution, the probability that there will be Number_f failures before the Number_s-th success, with Probability_s probability of a success.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param numberF Is the number of failures.
    * @param numberS Is the threshold number of successes.
    * @param probabilityS Is the probability of a success; a number between 0 and 1.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability mass function, use FALSE.
    */
  def negBinom_Dist(
    numberF: Double | Range | RangeReference | FunctionResult[_],
    numberS: Double | Range | RangeReference | FunctionResult[_],
    probabilityS: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of whole workdays between two dates.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param endDate Is a serial date number that represents the end date.
    * @param holidays Is an optional set of one or more serial date numbers to exclude from the working calendar, such as state and federal holidays and floating holidays.
    */
  def networkDays(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def networkDays(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    holidays: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the number of whole workdays between two dates with custom weekend parameters.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param endDate Is a serial date number that represents the end date.
    * @param weekend Is a number or string specifying when weekends occur.
    * @param holidays Is an optional set of one or more serial date numbers to exclude from the working calendar, such as state and federal holidays and floating holidays.
    */
  def networkDays_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def networkDays_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    weekend: Double | String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def networkDays_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    weekend: Double | String | Range | RangeReference | FunctionResult[_],
    holidays: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the annual nominal interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param effectRate Is the effective interest rate.
    * @param npery Is the number of compounding periods per year.
    */
  def nominal(
    effectRate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    npery: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the normal distribution for the specified mean and standard deviation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value for which you want the distribution.
    * @param mean Is the arithmetic mean of the distribution.
    * @param standardDev Is the standard deviation of the distribution, a positive number.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability density function, use FALSE.
    */
  def norm_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the normal cumulative distribution for the specified mean and standard deviation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability corresponding to the normal distribution, a number between 0 and 1 inclusive.
    * @param mean Is the arithmetic mean of the distribution.
    * @param standardDev Is the standard deviation of the distribution, a positive number.
    */
  def norm_Inv(
    probability: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the standard normal distribution (has a mean of zero and a standard deviation of one).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param z Is the value for which you want the distribution.
    * @param cumulative Is a logical value for the function to return: the cumulative distribution function = TRUE; the probability density function = FALSE.
    */
  def norm_S_Dist(z: Double, cumulative: Boolean): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Double, cumulative: FunctionResult[_]): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Double, cumulative: Range): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Double, cumulative: RangeReference): FunctionResult[Double] = js.native
  def norm_S_Dist(z: FunctionResult[_], cumulative: Boolean): FunctionResult[Double] = js.native
  def norm_S_Dist(z: FunctionResult[_], cumulative: FunctionResult[_]): FunctionResult[Double] = js.native
  def norm_S_Dist(z: FunctionResult[_], cumulative: Range): FunctionResult[Double] = js.native
  def norm_S_Dist(z: FunctionResult[_], cumulative: RangeReference): FunctionResult[Double] = js.native
  def norm_S_Dist(z: RangeReference, cumulative: Boolean): FunctionResult[Double] = js.native
  def norm_S_Dist(z: RangeReference, cumulative: FunctionResult[_]): FunctionResult[Double] = js.native
  def norm_S_Dist(z: RangeReference, cumulative: Range): FunctionResult[Double] = js.native
  def norm_S_Dist(z: RangeReference, cumulative: RangeReference): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Range, cumulative: Boolean): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Range, cumulative: FunctionResult[_]): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Range, cumulative: Range): FunctionResult[Double] = js.native
  def norm_S_Dist(z: Range, cumulative: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the inverse of the standard normal cumulative distribution (has a mean of zero and a standard deviation of one).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is a probability corresponding to the normal distribution, a number between 0 and 1 inclusive.
    */
  def norm_S_Inv(probability: Double): FunctionResult[Double] = js.native
  def norm_S_Inv(probability: FunctionResult[_]): FunctionResult[Double] = js.native
  def norm_S_Inv(probability: Range): FunctionResult[Double] = js.native
  def norm_S_Inv(probability: RangeReference): FunctionResult[Double] = js.native
  /**
    * Changes FALSE to TRUE, or TRUE to FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param logical Is a value or expression that can be evaluated to TRUE or FALSE.
    */
  def not(logical: Boolean): FunctionResult[Boolean] = js.native
  def not(logical: FunctionResult[_]): FunctionResult[Boolean] = js.native
  def not(logical: Range): FunctionResult[Boolean] = js.native
  def not(logical: RangeReference): FunctionResult[Boolean] = js.native
  /**
    * Returns the current date and time formatted as a date and time.
    *
    * [Api set: ExcelApi 1.2]
    */
  def now(): FunctionResult[Double] = js.native
  /**
    * Returns the number of periods for an investment based on periodic, constant payments and a constant interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param pmt Is the payment made each period; it cannot change over the life of the investment.
    * @param pv Is the present value, or the lump-sum amount that a series of future payments is worth now.
    * @param fv Is the future value, or a cash balance you want to attain after the last payment is made. If omitted, zero is used.
    * @param type Is a logical value: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    */
  def nper(
    rate: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def nper(
    rate: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def nper(
    rate: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the net present value of an investment based on a discount rate and a series of future payments (negative values) and income (positive values).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the rate of discount over the length of one period.
    * @param values List of parameters, whose elements are 1 to 254 payments and income, equally spaced in time and occurring at the end of each period.
    */
  def npv(rate: Double, values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def npv(rate: FunctionResult[_], values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def npv(rate: RangeReference, values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def npv(rate: Range, values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Converts text to number in a locale-independent manner.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the string representing the number you want to convert.
    * @param decimalSeparator Is the character used as the decimal separator in the string.
    * @param groupSeparator Is the character used as the group separator in the string.
    */
  def numberValue(text: String | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def numberValue(
    text: String | Range | RangeReference | FunctionResult[_],
    decimalSeparator: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def numberValue(
    text: String | Range | RangeReference | FunctionResult[_],
    decimalSeparator: String | Range | RangeReference | FunctionResult[_],
    groupSeparator: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts an octal number to binary.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the octal number you want to convert.
    * @param places Is the number of characters to use.
    */
  def oct2Bin(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def oct2Bin(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def oct2Dec(number: String): FunctionResult[Double] = js.native
  def oct2Dec(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Converts an octal number to decimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the octal number you want to convert.
    */
  def oct2Dec(number: Double): FunctionResult[Double] = js.native
  def oct2Dec(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def oct2Dec(number: Range): FunctionResult[Double] = js.native
  def oct2Dec(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts an octal number to hexadecimal.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the octal number you want to convert.
    * @param places Is the number of characters to use.
    */
  def oct2Hex(number: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def oct2Hex(
    number: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    places: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Rounds a positive number up and negative number down to the nearest odd integer.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the value to round.
    */
  def odd(number: Double): FunctionResult[Double] = js.native
  def odd(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def odd(number: Range): FunctionResult[Double] = js.native
  def odd(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value of a security with an odd first period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param firstCoupon Is the security's first coupon date, expressed as a serial date number.
    * @param rate Is the security's interest rate.
    * @param yld Is the security's annual yield.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def oddFPrice(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstCoupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def oddFPrice(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstCoupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the yield of a security with an odd first period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param firstCoupon Is the security's first coupon date, expressed as a serial date number.
    * @param rate Is the security's interest rate.
    * @param pr Is the security's price.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def oddFYield(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstCoupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def oddFYield(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    firstCoupon: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value of a security with an odd last period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param lastInterest Is the security's last coupon date, expressed as a serial date number.
    * @param rate Is the security's interest rate.
    * @param yld Is the security's annual yield.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def oddLPrice(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lastInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def oddLPrice(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lastInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the yield of a security with an odd last period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param lastInterest Is the security's last coupon date, expressed as a serial date number.
    * @param rate Is the security's interest rate.
    * @param pr Is the security's price.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def oddLYield(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lastInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def oddLYield(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    lastInterest: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Checks whether any of the arguments are TRUE, and returns TRUE or FALSE. Returns FALSE only if all arguments are FALSE.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 conditions that you want to test that can be either TRUE or FALSE.
    */
  def or(values: (Boolean | Range | RangeReference | FunctionResult[_])*): FunctionResult[Boolean] = js.native
  /**
    * Returns the number of periods required by an investment to reach a specified value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period.
    * @param pv Is the present value of the investment.
    * @param fv Is the desired future value of the investment.
    */
  def pduration(
    rate: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the rank of a value in a data set as a percentage of the data set as a percentage (0..1, exclusive) of the data set.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data with numeric values that defines relative standing.
    * @param x Is the value for which you want to know the rank.
    * @param significance Is an optional value that identifies the number of significant digits for the returned percentage, three digits if omitted (0.xxx%).
    */
  def percentRank_Exc(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def percentRank_Exc(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the rank of a value in a data set as a percentage of the data set as a percentage (0..1, inclusive) of the data set.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data with numeric values that defines relative standing.
    * @param x Is the value for which you want to know the rank.
    * @param significance Is an optional value that identifies the number of significant digits for the returned percentage, three digits if omitted (0.xxx%).
    */
  def percentRank_Inc(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def percentRank_Inc(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_],
    significance: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the k-th percentile of values in a range, where k is in the range 0..1, exclusive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data that defines relative standing.
    * @param k Is the percentile value that is between 0 through 1, inclusive.
    */
  def percentile_Exc(array: Double, k: Double): FunctionResult[Double] = js.native
  def percentile_Exc(array: Double, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Exc(array: Double, k: Range): FunctionResult[Double] = js.native
  def percentile_Exc(array: Double, k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Exc(array: FunctionResult[_], k: Double): FunctionResult[Double] = js.native
  def percentile_Exc(array: FunctionResult[_], k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Exc(array: FunctionResult[_], k: Range): FunctionResult[Double] = js.native
  def percentile_Exc(array: FunctionResult[_], k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Exc(array: RangeReference, k: Double): FunctionResult[Double] = js.native
  def percentile_Exc(array: RangeReference, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Exc(array: RangeReference, k: Range): FunctionResult[Double] = js.native
  def percentile_Exc(array: RangeReference, k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Exc(array: Range, k: Double): FunctionResult[Double] = js.native
  def percentile_Exc(array: Range, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Exc(array: Range, k: Range): FunctionResult[Double] = js.native
  def percentile_Exc(array: Range, k: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the k-th percentile of values in a range, where k is in the range 0..1, inclusive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data that defines relative standing.
    * @param k Is the percentile value that is between 0 through 1, inclusive.
    */
  def percentile_Inc(array: Double, k: Double): FunctionResult[Double] = js.native
  def percentile_Inc(array: Double, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Inc(array: Double, k: Range): FunctionResult[Double] = js.native
  def percentile_Inc(array: Double, k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Inc(array: FunctionResult[_], k: Double): FunctionResult[Double] = js.native
  def percentile_Inc(array: FunctionResult[_], k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Inc(array: FunctionResult[_], k: Range): FunctionResult[Double] = js.native
  def percentile_Inc(array: FunctionResult[_], k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Inc(array: RangeReference, k: Double): FunctionResult[Double] = js.native
  def percentile_Inc(array: RangeReference, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Inc(array: RangeReference, k: Range): FunctionResult[Double] = js.native
  def percentile_Inc(array: RangeReference, k: RangeReference): FunctionResult[Double] = js.native
  def percentile_Inc(array: Range, k: Double): FunctionResult[Double] = js.native
  def percentile_Inc(array: Range, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def percentile_Inc(array: Range, k: Range): FunctionResult[Double] = js.native
  def percentile_Inc(array: Range, k: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of permutations for a given number of objects that can be selected from the total objects.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the total number of objects.
    * @param numberChosen Is the number of objects in each permutation.
    */
  def permut(number: Double, numberChosen: Double): FunctionResult[Double] = js.native
  def permut(number: Double, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permut(number: Double, numberChosen: Range): FunctionResult[Double] = js.native
  def permut(number: Double, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permut(number: FunctionResult[_], numberChosen: Double): FunctionResult[Double] = js.native
  def permut(number: FunctionResult[_], numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permut(number: FunctionResult[_], numberChosen: Range): FunctionResult[Double] = js.native
  def permut(number: FunctionResult[_], numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permut(number: RangeReference, numberChosen: Double): FunctionResult[Double] = js.native
  def permut(number: RangeReference, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permut(number: RangeReference, numberChosen: Range): FunctionResult[Double] = js.native
  def permut(number: RangeReference, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permut(number: Range, numberChosen: Double): FunctionResult[Double] = js.native
  def permut(number: Range, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permut(number: Range, numberChosen: Range): FunctionResult[Double] = js.native
  def permut(number: Range, numberChosen: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of permutations for a given number of objects (with repetitions) that can be selected from the total objects.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the total number of objects.
    * @param numberChosen Is the number of objects in each permutation.
    */
  def permutationa(number: Double, numberChosen: Double): FunctionResult[Double] = js.native
  def permutationa(number: Double, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permutationa(number: Double, numberChosen: Range): FunctionResult[Double] = js.native
  def permutationa(number: Double, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permutationa(number: FunctionResult[_], numberChosen: Double): FunctionResult[Double] = js.native
  def permutationa(number: FunctionResult[_], numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permutationa(number: FunctionResult[_], numberChosen: Range): FunctionResult[Double] = js.native
  def permutationa(number: FunctionResult[_], numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permutationa(number: RangeReference, numberChosen: Double): FunctionResult[Double] = js.native
  def permutationa(number: RangeReference, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permutationa(number: RangeReference, numberChosen: Range): FunctionResult[Double] = js.native
  def permutationa(number: RangeReference, numberChosen: RangeReference): FunctionResult[Double] = js.native
  def permutationa(number: Range, numberChosen: Double): FunctionResult[Double] = js.native
  def permutationa(number: Range, numberChosen: FunctionResult[_]): FunctionResult[Double] = js.native
  def permutationa(number: Range, numberChosen: Range): FunctionResult[Double] = js.native
  def permutationa(number: Range, numberChosen: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the value of the density function for a standard normal distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the number for which you want the density of the standard normal distribution.
    */
  def phi(x: Double): FunctionResult[Double] = js.native
  def phi(x: FunctionResult[_]): FunctionResult[Double] = js.native
  def phi(x: Range): FunctionResult[Double] = js.native
  def phi(x: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the value of Pi, 3.14159265358979, accurate to 15 digits.
    *
    * [Api set: ExcelApi 1.2]
    */
  def pi(): FunctionResult[Double] = js.native
  /**
    * Calculates the payment for a loan based on constant payments and a constant interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period for the loan. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param nper Is the total number of payments for the loan.
    * @param pv Is the present value: the total amount that a series of future payments is worth now.
    * @param fv Is the future value, or a cash balance you want to attain after the last payment is made, 0 (zero) if omitted.
    * @param type Is a logical value: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    */
  def pmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def pmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def pmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the Poisson distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the number of events.
    * @param mean Is the expected numeric value, a positive number.
    * @param cumulative Is a logical value: for the cumulative Poisson probability, use TRUE; for the Poisson probability mass function, use FALSE.
    */
  def poisson_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the result of a number raised to a power.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the base number, any real number.
    * @param power Is the exponent, to which the base number is raised.
    */
  def power(number: Double, power: Double): FunctionResult[Double] = js.native
  def power(number: Double, power: FunctionResult[_]): FunctionResult[Double] = js.native
  def power(number: Double, power: Range): FunctionResult[Double] = js.native
  def power(number: Double, power: RangeReference): FunctionResult[Double] = js.native
  def power(number: FunctionResult[_], power: Double): FunctionResult[Double] = js.native
  def power(number: FunctionResult[_], power: FunctionResult[_]): FunctionResult[Double] = js.native
  def power(number: FunctionResult[_], power: Range): FunctionResult[Double] = js.native
  def power(number: FunctionResult[_], power: RangeReference): FunctionResult[Double] = js.native
  def power(number: RangeReference, power: Double): FunctionResult[Double] = js.native
  def power(number: RangeReference, power: FunctionResult[_]): FunctionResult[Double] = js.native
  def power(number: RangeReference, power: Range): FunctionResult[Double] = js.native
  def power(number: RangeReference, power: RangeReference): FunctionResult[Double] = js.native
  def power(number: Range, power: Double): FunctionResult[Double] = js.native
  def power(number: Range, power: FunctionResult[_]): FunctionResult[Double] = js.native
  def power(number: Range, power: Range): FunctionResult[Double] = js.native
  def power(number: Range, power: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the payment on the principal for a given investment based on periodic, constant payments and a constant interest rate.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param per Specifies the period and must be in the range 1 to nper.
    * @param nper Is the total number of payment periods in an investment.
    * @param pv Is the present value: the total amount that a series of future payments is worth now.
    * @param fv Is the future value, or cash balance you want to attain after the last payment is made.
    * @param type Is a logical value: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    */
  def ppmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ppmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def ppmt(
    rate: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value of a security that pays periodic interest.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param rate Is the security's annual coupon rate.
    * @param yld Is the security's annual yield.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def price(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def price(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value of a discounted security.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param discount Is the security's discount rate.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param basis Is the type of day count basis to use.
    */
  def priceDisc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def priceDisc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value of a security that pays interest at maturity.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param rate Is the security's interest rate at date of issue.
    * @param yld Is the security's annual yield.
    * @param basis Is the type of day count basis to use.
    */
  def priceMat(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def priceMat(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    yld: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Multiplies all the numbers given as arguments.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, logical values, or text representations of numbers that you want to multiply.
    */
  def product(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Converts a text string to proper case; the first letter in each word to uppercase, and all other letters to lowercase.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is text enclosed in quotation marks, a formula that returns text, or a reference to a cell containing text to partially capitalize.
    */
  def proper(text: String): FunctionResult[String] = js.native
  def proper(text: FunctionResult[_]): FunctionResult[String] = js.native
  def proper(text: Range): FunctionResult[String] = js.native
  def proper(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the present value of an investment: the total amount that a series of future payments is worth now.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the interest rate per period. For example, use 6%/4 for quarterly payments at 6% APR.
    * @param nper Is the total number of payment periods in an investment.
    * @param pmt Is the payment made each period and cannot change over the life of the investment.
    * @param fv Is the future value, or a cash balance you want to attain after the last payment is made.
    * @param type Is a logical value: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    */
  def pv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def pv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def pv(
    rate: Double | Range | RangeReference | FunctionResult[_],
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the quartile of a data set, based on percentile values from 0..1, exclusive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or cell range of numeric values for which you want the quartile value.
    * @param quart Is a number: minimum value = 0; 1st quartile = 1; median value = 2; 3rd quartile = 3; maximum value = 4.
    */
  def quartile_Exc(array: Double, quart: Double): FunctionResult[Double] = js.native
  def quartile_Exc(array: Double, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Exc(array: Double, quart: Range): FunctionResult[Double] = js.native
  def quartile_Exc(array: Double, quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Exc(array: FunctionResult[_], quart: Double): FunctionResult[Double] = js.native
  def quartile_Exc(array: FunctionResult[_], quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Exc(array: FunctionResult[_], quart: Range): FunctionResult[Double] = js.native
  def quartile_Exc(array: FunctionResult[_], quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Exc(array: RangeReference, quart: Double): FunctionResult[Double] = js.native
  def quartile_Exc(array: RangeReference, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Exc(array: RangeReference, quart: Range): FunctionResult[Double] = js.native
  def quartile_Exc(array: RangeReference, quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Exc(array: Range, quart: Double): FunctionResult[Double] = js.native
  def quartile_Exc(array: Range, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Exc(array: Range, quart: Range): FunctionResult[Double] = js.native
  def quartile_Exc(array: Range, quart: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the quartile of a data set, based on percentile values from 0..1, inclusive.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or cell range of numeric values for which you want the quartile value.
    * @param quart Is a number: minimum value = 0; 1st quartile = 1; median value = 2; 3rd quartile = 3; maximum value = 4.
    */
  def quartile_Inc(array: Double, quart: Double): FunctionResult[Double] = js.native
  def quartile_Inc(array: Double, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Inc(array: Double, quart: Range): FunctionResult[Double] = js.native
  def quartile_Inc(array: Double, quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Inc(array: FunctionResult[_], quart: Double): FunctionResult[Double] = js.native
  def quartile_Inc(array: FunctionResult[_], quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Inc(array: FunctionResult[_], quart: Range): FunctionResult[Double] = js.native
  def quartile_Inc(array: FunctionResult[_], quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Inc(array: RangeReference, quart: Double): FunctionResult[Double] = js.native
  def quartile_Inc(array: RangeReference, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Inc(array: RangeReference, quart: Range): FunctionResult[Double] = js.native
  def quartile_Inc(array: RangeReference, quart: RangeReference): FunctionResult[Double] = js.native
  def quartile_Inc(array: Range, quart: Double): FunctionResult[Double] = js.native
  def quartile_Inc(array: Range, quart: FunctionResult[_]): FunctionResult[Double] = js.native
  def quartile_Inc(array: Range, quart: Range): FunctionResult[Double] = js.native
  def quartile_Inc(array: Range, quart: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the integer portion of a division.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param numerator Is the dividend.
    * @param denominator Is the divisor.
    */
  def quotient(
    numerator: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    denominator: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts degrees to radians.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param angle Is an angle in degrees that you want to convert.
    */
  def radians(angle: Double): FunctionResult[Double] = js.native
  def radians(angle: FunctionResult[_]): FunctionResult[Double] = js.native
  def radians(angle: Range): FunctionResult[Double] = js.native
  def radians(angle: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns a random number greater than or equal to 0 and less than 1, evenly distributed (changes on recalculation).
    *
    * [Api set: ExcelApi 1.2]
    */
  def rand(): FunctionResult[Double] = js.native
  /**
    * Returns a random number between the numbers you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param bottom Is the smallest integer RANDBETWEEN will return.
    * @param top Is the largest integer RANDBETWEEN will return.
    */
  def randBetween(
    bottom: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    top: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the rank of a number in a list of numbers: its size relative to other values in the list; if more than one value has the same rank, the average rank is returned.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number for which you want to find the rank.
    * @param ref Is an array of, or a reference to, a list of numbers. Nonnumeric values are ignored.
    * @param order Is a number: rank in the list sorted descending = 0 or omitted; rank in the list sorted ascending = any nonzero value.
    */
  def rank_Avg(
    number: Double | Range | RangeReference | FunctionResult[_],
    ref: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def rank_Avg(
    number: Double | Range | RangeReference | FunctionResult[_],
    ref: Range | RangeReference | FunctionResult[_],
    order: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the rank of a number in a list of numbers: its size relative to other values in the list; if more than one value has the same rank, the top rank of that set of values is returned.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number for which you want to find the rank.
    * @param ref Is an array of, or a reference to, a list of numbers. Nonnumeric values are ignored.
    * @param order Is a number: rank in the list sorted descending = 0 or omitted; rank in the list sorted ascending = any nonzero value.
    */
  def rank_Eq(
    number: Double | Range | RangeReference | FunctionResult[_],
    ref: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def rank_Eq(
    number: Double | Range | RangeReference | FunctionResult[_],
    ref: Range | RangeReference | FunctionResult[_],
    order: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the interest rate per period of a loan or an investment. For example, use 6%/4 for quarterly payments at 6% APR.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param nper Is the total number of payment periods for the loan or investment.
    * @param pmt Is the payment made each period and cannot change over the life of the loan or investment.
    * @param pv Is the present value: the total amount that a series of future payments is worth now.
    * @param fv Is the future value, or a cash balance you want to attain after the last payment is made. If omitted, uses Fv = 0.
    * @param type Is a logical value: payment at the beginning of the period = 1; payment at the end of the period = 0 or omitted.
    * @param guess Is your guess for what the rate will be; if omitted, Guess = 0.1 (10 percent).
    */
  def rate(
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def rate(
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def rate(
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def rate(
    nper: Double | Range | RangeReference | FunctionResult[_],
    pmt: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_],
    `type`: Double | Range | RangeReference | FunctionResult[_],
    guess: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the amount received at maturity for a fully invested security.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param investment Is the amount invested in the security.
    * @param discount Is the security's discount rate.
    * @param basis Is the type of day count basis to use.
    */
  def received(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    investment: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def received(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    investment: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Replaces part of a text string with a different text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param oldText Is text in which you want to replace some characters.
    * @param startNum Is the position of the character in oldText that you want to replace with newText.
    * @param numChars Is the number of characters in oldText that you want to replace.
    * @param newText Is the text that will replace characters in oldText.
    */
  def replace(
    oldText: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_],
    numChars: Double | Range | RangeReference | FunctionResult[_],
    newText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Replaces part of a text string with a different text string. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param oldText Is text in which you want to replace some characters.
    * @param startNum Is the position of the character in oldText that you want to replace with newText.
    * @param numBytes Is the number of characters in oldText that you want to replace with newText.
    * @param newText Is the text that will replace characters in oldText.
    */
  def replaceB(
    oldText: String | Range | RangeReference | FunctionResult[_],
    startNum: Double | Range | RangeReference | FunctionResult[_],
    numBytes: Double | Range | RangeReference | FunctionResult[_],
    newText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Repeats text a given number of times. Use REPT to fill a cell with a number of instances of a text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text you want to repeat.
    * @param numberTimes Is a positive number specifying the number of times to repeat text.
    */
  def rept(text: String, numberTimes: Double): FunctionResult[String] = js.native
  def rept(text: String, numberTimes: FunctionResult[_]): FunctionResult[String] = js.native
  def rept(text: String, numberTimes: Range): FunctionResult[String] = js.native
  def rept(text: String, numberTimes: RangeReference): FunctionResult[String] = js.native
  def rept(text: FunctionResult[_], numberTimes: Double): FunctionResult[String] = js.native
  def rept(text: FunctionResult[_], numberTimes: FunctionResult[_]): FunctionResult[String] = js.native
  def rept(text: FunctionResult[_], numberTimes: Range): FunctionResult[String] = js.native
  def rept(text: FunctionResult[_], numberTimes: RangeReference): FunctionResult[String] = js.native
  def rept(text: RangeReference, numberTimes: Double): FunctionResult[String] = js.native
  def rept(text: RangeReference, numberTimes: FunctionResult[_]): FunctionResult[String] = js.native
  def rept(text: RangeReference, numberTimes: Range): FunctionResult[String] = js.native
  def rept(text: RangeReference, numberTimes: RangeReference): FunctionResult[String] = js.native
  def rept(text: Range, numberTimes: Double): FunctionResult[String] = js.native
  def rept(text: Range, numberTimes: FunctionResult[_]): FunctionResult[String] = js.native
  def rept(text: Range, numberTimes: Range): FunctionResult[String] = js.native
  def rept(text: Range, numberTimes: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the specified number of characters from the end of a text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string that contains the characters you want to extract.
    * @param numChars Specifies how many characters you want to extract, 1 if omitted.
    */
  def right(text: String): FunctionResult[String] = js.native
  def right(text: String, numChars: Double): FunctionResult[String] = js.native
  def right(text: String, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def right(text: String, numChars: Range): FunctionResult[String] = js.native
  def right(text: String, numChars: RangeReference): FunctionResult[String] = js.native
  def right(text: FunctionResult[_]): FunctionResult[String] = js.native
  def right(text: FunctionResult[_], numChars: Double): FunctionResult[String] = js.native
  def right(text: FunctionResult[_], numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def right(text: FunctionResult[_], numChars: Range): FunctionResult[String] = js.native
  def right(text: FunctionResult[_], numChars: RangeReference): FunctionResult[String] = js.native
  def right(text: Range): FunctionResult[String] = js.native
  def right(text: RangeReference): FunctionResult[String] = js.native
  def right(text: RangeReference, numChars: Double): FunctionResult[String] = js.native
  def right(text: RangeReference, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def right(text: RangeReference, numChars: Range): FunctionResult[String] = js.native
  def right(text: RangeReference, numChars: RangeReference): FunctionResult[String] = js.native
  def right(text: Range, numChars: Double): FunctionResult[String] = js.native
  def right(text: Range, numChars: FunctionResult[_]): FunctionResult[String] = js.native
  def right(text: Range, numChars: Range): FunctionResult[String] = js.native
  def right(text: Range, numChars: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the specified number of characters from the end of a text string. Use with double-byte character sets (DBCS).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text string containing the characters you want to extract.
    * @param numBytes Specifies how many characters you want to extract.
    */
  def rightb(text: String): FunctionResult[String] = js.native
  def rightb(text: String, numBytes: Double): FunctionResult[String] = js.native
  def rightb(text: String, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def rightb(text: String, numBytes: Range): FunctionResult[String] = js.native
  def rightb(text: String, numBytes: RangeReference): FunctionResult[String] = js.native
  def rightb(text: FunctionResult[_]): FunctionResult[String] = js.native
  def rightb(text: FunctionResult[_], numBytes: Double): FunctionResult[String] = js.native
  def rightb(text: FunctionResult[_], numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def rightb(text: FunctionResult[_], numBytes: Range): FunctionResult[String] = js.native
  def rightb(text: FunctionResult[_], numBytes: RangeReference): FunctionResult[String] = js.native
  def rightb(text: Range): FunctionResult[String] = js.native
  def rightb(text: RangeReference): FunctionResult[String] = js.native
  def rightb(text: RangeReference, numBytes: Double): FunctionResult[String] = js.native
  def rightb(text: RangeReference, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def rightb(text: RangeReference, numBytes: Range): FunctionResult[String] = js.native
  def rightb(text: RangeReference, numBytes: RangeReference): FunctionResult[String] = js.native
  def rightb(text: Range, numBytes: Double): FunctionResult[String] = js.native
  def rightb(text: Range, numBytes: FunctionResult[_]): FunctionResult[String] = js.native
  def rightb(text: Range, numBytes: Range): FunctionResult[String] = js.native
  def rightb(text: Range, numBytes: RangeReference): FunctionResult[String] = js.native
  /**
    * Converts an Arabic numeral to Roman, as text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the Arabic numeral you want to convert.
    * @param form Is the number specifying the type of Roman numeral you want.
    */
  def roman(number: Double): FunctionResult[String] = js.native
  def roman(number: Double, form: Boolean): FunctionResult[String] = js.native
  def roman(number: Double, form: Double): FunctionResult[String] = js.native
  def roman(number: Double, form: FunctionResult[_]): FunctionResult[String] = js.native
  def roman(number: Double, form: Range): FunctionResult[String] = js.native
  def roman(number: Double, form: RangeReference): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_]): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_], form: Boolean): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_], form: Double): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_], form: FunctionResult[_]): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_], form: Range): FunctionResult[String] = js.native
  def roman(number: FunctionResult[_], form: RangeReference): FunctionResult[String] = js.native
  def roman(number: Range): FunctionResult[String] = js.native
  def roman(number: RangeReference): FunctionResult[String] = js.native
  def roman(number: RangeReference, form: Boolean): FunctionResult[String] = js.native
  def roman(number: RangeReference, form: Double): FunctionResult[String] = js.native
  def roman(number: RangeReference, form: FunctionResult[_]): FunctionResult[String] = js.native
  def roman(number: RangeReference, form: Range): FunctionResult[String] = js.native
  def roman(number: RangeReference, form: RangeReference): FunctionResult[String] = js.native
  def roman(number: Range, form: Boolean): FunctionResult[String] = js.native
  def roman(number: Range, form: Double): FunctionResult[String] = js.native
  def roman(number: Range, form: FunctionResult[_]): FunctionResult[String] = js.native
  def roman(number: Range, form: Range): FunctionResult[String] = js.native
  def roman(number: Range, form: RangeReference): FunctionResult[String] = js.native
  /**
    * Rounds a number to a specified number of digits.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number you want to round.
    * @param numDigits Is the number of digits to which you want to round. Negative rounds to the left of the decimal point; zero to the nearest integer.
    */
  def round(number: Double, numDigits: Double): FunctionResult[Double] = js.native
  def round(number: Double, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def round(number: Double, numDigits: Range): FunctionResult[Double] = js.native
  def round(number: Double, numDigits: RangeReference): FunctionResult[Double] = js.native
  def round(number: FunctionResult[_], numDigits: Double): FunctionResult[Double] = js.native
  def round(number: FunctionResult[_], numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def round(number: FunctionResult[_], numDigits: Range): FunctionResult[Double] = js.native
  def round(number: FunctionResult[_], numDigits: RangeReference): FunctionResult[Double] = js.native
  def round(number: RangeReference, numDigits: Double): FunctionResult[Double] = js.native
  def round(number: RangeReference, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def round(number: RangeReference, numDigits: Range): FunctionResult[Double] = js.native
  def round(number: RangeReference, numDigits: RangeReference): FunctionResult[Double] = js.native
  def round(number: Range, numDigits: Double): FunctionResult[Double] = js.native
  def round(number: Range, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def round(number: Range, numDigits: Range): FunctionResult[Double] = js.native
  def round(number: Range, numDigits: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number down, toward zero.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number that you want rounded down.
    * @param numDigits Is the number of digits to which you want to round. Negative rounds to the left of the decimal point; zero or omitted, to the nearest integer.
    */
  def roundDown(number: Double, numDigits: Double): FunctionResult[Double] = js.native
  def roundDown(number: Double, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundDown(number: Double, numDigits: Range): FunctionResult[Double] = js.native
  def roundDown(number: Double, numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundDown(number: FunctionResult[_], numDigits: Double): FunctionResult[Double] = js.native
  def roundDown(number: FunctionResult[_], numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundDown(number: FunctionResult[_], numDigits: Range): FunctionResult[Double] = js.native
  def roundDown(number: FunctionResult[_], numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundDown(number: RangeReference, numDigits: Double): FunctionResult[Double] = js.native
  def roundDown(number: RangeReference, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundDown(number: RangeReference, numDigits: Range): FunctionResult[Double] = js.native
  def roundDown(number: RangeReference, numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundDown(number: Range, numDigits: Double): FunctionResult[Double] = js.native
  def roundDown(number: Range, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundDown(number: Range, numDigits: Range): FunctionResult[Double] = js.native
  def roundDown(number: Range, numDigits: RangeReference): FunctionResult[Double] = js.native
  /**
    * Rounds a number up, away from zero.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number that you want rounded up.
    * @param numDigits Is the number of digits to which you want to round. Negative rounds to the left of the decimal point; zero or omitted, to the nearest integer.
    */
  def roundUp(number: Double, numDigits: Double): FunctionResult[Double] = js.native
  def roundUp(number: Double, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundUp(number: Double, numDigits: Range): FunctionResult[Double] = js.native
  def roundUp(number: Double, numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundUp(number: FunctionResult[_], numDigits: Double): FunctionResult[Double] = js.native
  def roundUp(number: FunctionResult[_], numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundUp(number: FunctionResult[_], numDigits: Range): FunctionResult[Double] = js.native
  def roundUp(number: FunctionResult[_], numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundUp(number: RangeReference, numDigits: Double): FunctionResult[Double] = js.native
  def roundUp(number: RangeReference, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundUp(number: RangeReference, numDigits: Range): FunctionResult[Double] = js.native
  def roundUp(number: RangeReference, numDigits: RangeReference): FunctionResult[Double] = js.native
  def roundUp(number: Range, numDigits: Double): FunctionResult[Double] = js.native
  def roundUp(number: Range, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def roundUp(number: Range, numDigits: Range): FunctionResult[Double] = js.native
  def roundUp(number: Range, numDigits: RangeReference): FunctionResult[Double] = js.native
  def rows(array: FunctionResult[_]): FunctionResult[Double] = js.native
  /**
    * Returns the number of rows in a reference or array.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is an array, an array formula, or a reference to a range of cells for which you want the number of rows.
    */
  def rows(array: Range): FunctionResult[Double] = js.native
  def rows(array: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns an equivalent interest rate for the growth of an investment.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param nper Is the number of periods for the investment.
    * @param pv Is the present value of the investment.
    * @param fv Is the future value of the investment.
    */
  def rri(
    nper: Double | Range | RangeReference | FunctionResult[_],
    pv: Double | Range | RangeReference | FunctionResult[_],
    fv: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the secant of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the secant.
    */
  def sec(number: Double): FunctionResult[Double] = js.native
  def sec(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sec(number: Range): FunctionResult[Double] = js.native
  def sec(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic secant of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the hyperbolic secant.
    */
  def sech(number: Double): FunctionResult[Double] = js.native
  def sech(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sech(number: Range): FunctionResult[Double] = js.native
  def sech(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the second, a number from 0 to 59.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel or text in time format, such as 16:48:23 or 4:48:47 PM.
    */
  def second(serialNumber: Double): FunctionResult[Double] = js.native
  def second(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def second(serialNumber: Range): FunctionResult[Double] = js.native
  def second(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the sum of a power series based on the formula.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the input value to the power series.
    * @param n Is the initial power to which you want to raise x.
    * @param m Is the step by which to increase n for each term in the series.
    * @param coefficients Is a set of coefficients by which each successive power of x is multiplied.
    */
  def seriesSum(
    x: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    n: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    m: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    coefficients: Range | String | Double | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the sheet number of the referenced sheet.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the name of a sheet or a reference that you want the sheet number of.  If omitted the number of the sheet containing the function is returned.
    */
  def sheet(): FunctionResult[Double] = js.native
  def sheet(value: String): FunctionResult[Double] = js.native
  def sheet(value: FunctionResult[_]): FunctionResult[Double] = js.native
  def sheet(value: Range): FunctionResult[Double] = js.native
  def sheet(value: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the number of sheets in a reference.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param reference Is a reference for which you want to know the number of sheets it contains.  If omitted the number of sheets in the workbook containing the function is returned.
    */
  def sheets(): FunctionResult[Double] = js.native
  def sheets(reference: FunctionResult[_]): FunctionResult[Double] = js.native
  def sheets(reference: Range): FunctionResult[Double] = js.native
  def sheets(reference: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the sign of a number: 1 if the number is positive, zero if the number is zero, or -1 if the number is negative.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number.
    */
  def sign(number: Double): FunctionResult[Double] = js.native
  def sign(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sign(number: Range): FunctionResult[Double] = js.native
  def sign(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the sine of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the sine. Degrees * PI()/180 = radians.
    */
  def sin(number: Double): FunctionResult[Double] = js.native
  def sin(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sin(number: Range): FunctionResult[Double] = js.native
  def sin(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic sine of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number.
    */
  def sinh(number: Double): FunctionResult[Double] = js.native
  def sinh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sinh(number: Range): FunctionResult[Double] = js.native
  def sinh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the skewness of a distribution: a characterization of the degree of asymmetry of a distribution around its mean.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers or names, arrays, or references that contain numbers for which you want the skewness.
    */
  def skew(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the skewness of a distribution based on a population: a characterization of the degree of asymmetry of a distribution around its mean.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 254 numbers or names, arrays, or references that contain numbers for which you want the population skewness.
    */
  def skew_p(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the straight-line depreciation of an asset for one period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the initial cost of the asset.
    * @param salvage Is the salvage value at the end of the life of the asset.
    * @param life Is the number of periods over which the asset is being depreciated (sometimes called the useful life of the asset).
    */
  def sln(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the k-th smallest value in a data set. For example, the fifth smallest number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is an array or range of numerical data for which you want to determine the k-th smallest value.
    * @param k Is the position (from the smallest) in the array or range of the value to return.
    */
  def small(array: Double, k: Double): FunctionResult[Double] = js.native
  def small(array: Double, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def small(array: Double, k: Range): FunctionResult[Double] = js.native
  def small(array: Double, k: RangeReference): FunctionResult[Double] = js.native
  def small(array: FunctionResult[_], k: Double): FunctionResult[Double] = js.native
  def small(array: FunctionResult[_], k: FunctionResult[_]): FunctionResult[Double] = js.native
  def small(array: FunctionResult[_], k: Range): FunctionResult[Double] = js.native
  def small(array: FunctionResult[_], k: RangeReference): FunctionResult[Double] = js.native
  def small(array: RangeReference, k: Double): FunctionResult[Double] = js.native
  def small(array: RangeReference, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def small(array: RangeReference, k: Range): FunctionResult[Double] = js.native
  def small(array: RangeReference, k: RangeReference): FunctionResult[Double] = js.native
  def small(array: Range, k: Double): FunctionResult[Double] = js.native
  def small(array: Range, k: FunctionResult[_]): FunctionResult[Double] = js.native
  def small(array: Range, k: Range): FunctionResult[Double] = js.native
  def small(array: Range, k: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the square root of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number for which you want the square root.
    */
  def sqrt(number: Double): FunctionResult[Double] = js.native
  def sqrt(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sqrt(number: Range): FunctionResult[Double] = js.native
  def sqrt(number: RangeReference): FunctionResult[Double] = js.native
  def sqrtPi(number: String): FunctionResult[Double] = js.native
  def sqrtPi(number: Boolean): FunctionResult[Double] = js.native
  /**
    * Returns the square root of (number * Pi).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number by which p is multiplied.
    */
  def sqrtPi(number: Double): FunctionResult[Double] = js.native
  def sqrtPi(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def sqrtPi(number: Range): FunctionResult[Double] = js.native
  def sqrtPi(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Estimates standard deviation based on a sample, including logical values and text. Text and the logical value FALSE have the value 0; the logical value TRUE has the value 1.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 values corresponding to a sample of a population and can be values or names or references to values.
    */
  def stDevA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Calculates standard deviation based on an entire population, including logical values and text. Text and the logical value FALSE have the value 0; the logical value TRUE has the value 1.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 values corresponding to a population and can be values, names, arrays, or references that contain values.
    */
  def stDevPA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Calculates standard deviation based on the entire population given as arguments (ignores logical values and text).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers corresponding to a population and can be numbers or references that contain numbers.
    */
  def stDev_P(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Estimates standard deviation based on a sample (ignores logical values and text in the sample).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers corresponding to a sample of a population and can be numbers or references that contain numbers.
    */
  def stDev_S(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns a normalized value from a distribution characterized by a mean and standard deviation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value you want to normalize.
    * @param mean Is the arithmetic mean of the distribution.
    * @param standardDev Is the standard deviation of the distribution, a positive number.
    */
  def standardize(
    x: Double | Range | RangeReference | FunctionResult[_],
    mean: Double | Range | RangeReference | FunctionResult[_],
    standardDev: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Replaces existing text with new text in a text string.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text or the reference to a cell containing text in which you want to substitute characters.
    * @param oldText Is the existing text you want to replace. If the case of oldText does not match the case of text, SUBSTITUTE will not replace the text.
    * @param newText Is the text you want to replace oldText with.
    * @param instanceNum Specifies which occurrence of oldText you want to replace. If omitted, every instance of oldText is replaced.
    */
  def substitute(
    text: String | Range | RangeReference | FunctionResult[_],
    oldText: String | Range | RangeReference | FunctionResult[_],
    newText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  def substitute(
    text: String | Range | RangeReference | FunctionResult[_],
    oldText: String | Range | RangeReference | FunctionResult[_],
    newText: String | Range | RangeReference | FunctionResult[_],
    instanceNum: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Returns a subtotal in a list or database.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param functionNum Is the number 1 to 11 that specifies the summary function for the subtotal.
    * @param values List of parameters, whose elements are 1 to 254 ranges or references for which you want the subtotal.
    */
  def subtotal(functionNum: Double, values: (Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def subtotal(functionNum: FunctionResult[_], values: (Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def subtotal(functionNum: RangeReference, values: (Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  def subtotal(functionNum: Range, values: (Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Adds all the numbers in a range of cells.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers to sum. Logical values and text are ignored in cells, included if typed as arguments.
    */
  def sum(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Adds the cells specified by a given condition or criteria.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param range Is the range of cells you want evaluated.
    * @param criteria Is the condition or criteria in the form of a number, expression, or text that defines which cells will be added.
    * @param sumRange Are the actual cells to sum. If omitted, the cells in range are used.
    */
  def sumIf(
    range: Range | RangeReference | FunctionResult[_],
    criteria: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def sumIf(
    range: Range | RangeReference | FunctionResult[_],
    criteria: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    sumRange: Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def sumIfs(
    sumRange: FunctionResult[_],
    values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*
  ): FunctionResult[Double] = js.native
  def sumIfs(
    sumRange: RangeReference,
    values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*
  ): FunctionResult[Double] = js.native
  /**
    * Adds the cells specified by a given set of conditions or criteria.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param sumRange Are the actual cells to sum.
    * @param values List of parameters, where the first element of each pair is the Is the range of cells you want evaluated for the particular condition , and the second element is is the condition or criteria in the form of a number, expression, or text that defines which cells will be added.
    */
  def sumIfs(sumRange: Range, values: (Range | RangeReference | FunctionResult[_] | Double | String | Boolean)*): FunctionResult[Double] = js.native
  /**
    * Returns the sum of the squares of the arguments. The arguments can be numbers, arrays, names, or references to cells that contain numbers.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numbers, arrays, names, or references to arrays for which you want the sum of the squares.
    */
  def sumSq(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the sum-of-years' digits depreciation of an asset for a specified period.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the initial cost of the asset.
    * @param salvage Is the salvage value at the end of the life of the asset.
    * @param life Is the number of periods over which the asset is being depreciated (sometimes called the useful life of the asset).
    * @param per Is the period and must use the same units as Life.
    */
  def syd(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    per: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def t(value: String): FunctionResult[String] = js.native
  def t(value: Boolean): FunctionResult[String] = js.native
  /**
    * Checks whether a value is text, and returns the text if it is, or returns double quotes (empty text) if it is not.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is the value to test.
    */
  def t(value: Double): FunctionResult[String] = js.native
  def t(value: FunctionResult[_]): FunctionResult[String] = js.native
  def t(value: Range): FunctionResult[String] = js.native
  def t(value: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the left-tailed Student's t-distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the numeric value at which to evaluate the distribution.
    * @param degFreedom Is an integer indicating the number of degrees of freedom that characterize the distribution.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability density function, use FALSE.
    */
  def t_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    degFreedom: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the two-tailed Student's t-distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the numeric value at which to evaluate the distribution.
    * @param degFreedom Is an integer indicating the number of degrees of freedom that characterize the distribution.
    */
  def t_Dist_2T(x: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_2T(x: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_2T(x: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_2T(x: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_2T(x: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_2T(x: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_2T(x: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_2T(x: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_2T(x: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_2T(x: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the right-tailed Student's t-distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the numeric value at which to evaluate the distribution.
    * @param degFreedom Is an integer indicating the number of degrees of freedom that characterize the distribution.
    */
  def t_Dist_RT(x: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_RT(x: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_RT(x: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_RT(x: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_RT(x: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_RT(x: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_RT(x: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_RT(x: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_RT(x: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Dist_RT(x: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the left-tailed inverse of the Student's t-distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is the probability associated with the two-tailed Student's t-distribution, a number between 0 and 1 inclusive.
    * @param degFreedom Is a positive integer indicating the number of degrees of freedom to characterize the distribution.
    */
  def t_Inv(probability: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv(probability: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv(probability: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv(probability: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv(probability: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv(probability: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv(probability: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv(probability: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv(probability: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv(probability: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv(probability: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv(probability: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv(probability: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv(probability: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv(probability: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv(probability: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the two-tailed inverse of the Student's t-distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param probability Is the probability associated with the two-tailed Student's t-distribution, a number between 0 and 1 inclusive.
    * @param degFreedom Is a positive integer indicating the number of degrees of freedom to characterize the distribution.
    */
  def t_Inv_2T(probability: Double, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Double, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Double, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Double, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: FunctionResult[_], degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: FunctionResult[_], degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: FunctionResult[_], degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: FunctionResult[_], degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: RangeReference, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: RangeReference, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: RangeReference, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: RangeReference, degFreedom: RangeReference): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Range, degFreedom: Double): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Range, degFreedom: FunctionResult[_]): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Range, degFreedom: Range): FunctionResult[Double] = js.native
  def t_Inv_2T(probability: Range, degFreedom: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the tangent of an angle.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the angle in radians for which you want the tangent. Degrees * PI()/180 = radians.
    */
  def tan(number: Double): FunctionResult[Double] = js.native
  def tan(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def tan(number: Range): FunctionResult[Double] = js.native
  def tan(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the hyperbolic tangent of a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is any real number.
    */
  def tanh(number: Double): FunctionResult[Double] = js.native
  def tanh(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def tanh(number: Range): FunctionResult[Double] = js.native
  def tanh(number: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the bond-equivalent yield for a treasury bill.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the Treasury bill's settlement date, expressed as a serial date number.
    * @param maturity Is the Treasury bill's maturity date, expressed as a serial date number.
    * @param discount Is the Treasury bill's discount rate.
    */
  def tbillEq(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the price per $100 face value for a treasury bill.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the Treasury bill's settlement date, expressed as a serial date number.
    * @param maturity Is the Treasury bill's maturity date, expressed as a serial date number.
    * @param discount Is the Treasury bill's discount rate.
    */
  def tbillPrice(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    discount: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the yield for a treasury bill.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the Treasury bill's settlement date, expressed as a serial date number.
    * @param maturity Is the Treasury bill's maturity date, expressed as a serial date number.
    * @param pr Is the Treasury Bill's price per $100 face value.
    */
  def tbillYield(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a value to text in a specific number format.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Is a number, a formula that evaluates to a numeric value, or a reference to a cell containing a numeric value.
    * @param formatText Is a number format in text form from the Category box on the Number tab in the Format Cells dialog box (not General).
    */
  def text(
    value: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    formatText: String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[String] = js.native
  /**
    * Converts hours, minutes, and seconds given as numbers to an Excel serial number, formatted with a time format.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param hour Is a number from 0 to 23 representing the hour.
    * @param minute Is a number from 0 to 59 representing the minute.
    * @param second Is a number from 0 to 59 representing the second.
    */
  def time(
    hour: Double | Range | RangeReference | FunctionResult[_],
    minute: Double | Range | RangeReference | FunctionResult[_],
    second: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Converts a text time to an Excel serial number for a time, a number from 0 (12:00:00 AM) to 0.999988426 (11:59:59 PM). Format the number with a time format after entering the formula.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param timeText Is a text string that gives a time in any one of the Microsoft Excel time formats (date information in the string is ignored).
    */
  def timevalue(timeText: String): FunctionResult[Double] = js.native
  def timevalue(timeText: Double): FunctionResult[Double] = js.native
  def timevalue(timeText: FunctionResult[_]): FunctionResult[Double] = js.native
  def timevalue(timeText: Range): FunctionResult[Double] = js.native
  def timevalue(timeText: RangeReference): FunctionResult[Double] = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Functions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FunctionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
  /**
    * Returns the current date formatted as a date.
    *
    * [Api set: ExcelApi 1.2]
    */
  def today(): FunctionResult[Double] = js.native
  /**
    * Removes all spaces from a text string except for single spaces between words.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text from which you want spaces removed.
    */
  def trim(text: String): FunctionResult[String] = js.native
  def trim(text: FunctionResult[_]): FunctionResult[String] = js.native
  def trim(text: Range): FunctionResult[String] = js.native
  def trim(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the mean of the interior portion of a set of data values.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the range or array of values to trim and average.
    * @param percent Is the fractional number of data points to exclude from the top and bottom of the data set.
    */
  def trimMean(array: Double, percent: Double): FunctionResult[Double] = js.native
  def trimMean(array: Double, percent: FunctionResult[_]): FunctionResult[Double] = js.native
  def trimMean(array: Double, percent: Range): FunctionResult[Double] = js.native
  def trimMean(array: Double, percent: RangeReference): FunctionResult[Double] = js.native
  def trimMean(array: FunctionResult[_], percent: Double): FunctionResult[Double] = js.native
  def trimMean(array: FunctionResult[_], percent: FunctionResult[_]): FunctionResult[Double] = js.native
  def trimMean(array: FunctionResult[_], percent: Range): FunctionResult[Double] = js.native
  def trimMean(array: FunctionResult[_], percent: RangeReference): FunctionResult[Double] = js.native
  def trimMean(array: RangeReference, percent: Double): FunctionResult[Double] = js.native
  def trimMean(array: RangeReference, percent: FunctionResult[_]): FunctionResult[Double] = js.native
  def trimMean(array: RangeReference, percent: Range): FunctionResult[Double] = js.native
  def trimMean(array: RangeReference, percent: RangeReference): FunctionResult[Double] = js.native
  def trimMean(array: Range, percent: Double): FunctionResult[Double] = js.native
  def trimMean(array: Range, percent: FunctionResult[_]): FunctionResult[Double] = js.native
  def trimMean(array: Range, percent: Range): FunctionResult[Double] = js.native
  def trimMean(array: Range, percent: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the logical value TRUE.
    *
    * [Api set: ExcelApi 1.2]
    */
  def `true`(): FunctionResult[Boolean] = js.native
  /**
    * Truncates a number to an integer by removing the decimal, or fractional, part of the number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the number you want to truncate.
    * @param numDigits Is a number specifying the precision of the truncation, 0 (zero) if omitted.
    */
  def trunc(number: Double): FunctionResult[Double] = js.native
  def trunc(number: Double, numDigits: Double): FunctionResult[Double] = js.native
  def trunc(number: Double, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def trunc(number: Double, numDigits: Range): FunctionResult[Double] = js.native
  def trunc(number: Double, numDigits: RangeReference): FunctionResult[Double] = js.native
  def trunc(number: FunctionResult[_]): FunctionResult[Double] = js.native
  def trunc(number: FunctionResult[_], numDigits: Double): FunctionResult[Double] = js.native
  def trunc(number: FunctionResult[_], numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def trunc(number: FunctionResult[_], numDigits: Range): FunctionResult[Double] = js.native
  def trunc(number: FunctionResult[_], numDigits: RangeReference): FunctionResult[Double] = js.native
  def trunc(number: Range): FunctionResult[Double] = js.native
  def trunc(number: RangeReference): FunctionResult[Double] = js.native
  def trunc(number: RangeReference, numDigits: Double): FunctionResult[Double] = js.native
  def trunc(number: RangeReference, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def trunc(number: RangeReference, numDigits: Range): FunctionResult[Double] = js.native
  def trunc(number: RangeReference, numDigits: RangeReference): FunctionResult[Double] = js.native
  def trunc(number: Range, numDigits: Double): FunctionResult[Double] = js.native
  def trunc(number: Range, numDigits: FunctionResult[_]): FunctionResult[Double] = js.native
  def trunc(number: Range, numDigits: Range): FunctionResult[Double] = js.native
  def trunc(number: Range, numDigits: RangeReference): FunctionResult[Double] = js.native
  def `type`(value: String): FunctionResult[Double] = js.native
  /**
    * Returns an integer representing the data type of a value: number = 1; text = 2; logical value = 4; error value = 16; array = 64.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param value Can be any value.
    */
  def `type`(value: Boolean): FunctionResult[Double] = js.native
  def `type`(value: Double): FunctionResult[Double] = js.native
  def `type`(value: FunctionResult[_]): FunctionResult[Double] = js.native
  def `type`(value: Range): FunctionResult[Double] = js.native
  def `type`(value: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the Unicode character referenced by the given numeric value.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is the Unicode number representing a character.
    */
  def unichar(number: Double): FunctionResult[String] = js.native
  def unichar(number: FunctionResult[_]): FunctionResult[String] = js.native
  def unichar(number: Range): FunctionResult[String] = js.native
  def unichar(number: RangeReference): FunctionResult[String] = js.native
  /**
    * Returns the number (code point) corresponding to the first character of the text.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the character that you want the Unicode value of.
    */
  def unicode(text: String): FunctionResult[Double] = js.native
  def unicode(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def unicode(text: Range): FunctionResult[Double] = js.native
  def unicode(text: RangeReference): FunctionResult[Double] = js.native
  /**
    * Converts a text string to all uppercase letters.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text you want converted to uppercase, a reference or a text string.
    */
  def upper(text: String): FunctionResult[String] = js.native
  def upper(text: FunctionResult[_]): FunctionResult[String] = js.native
  def upper(text: Range): FunctionResult[String] = js.native
  def upper(text: RangeReference): FunctionResult[String] = js.native
  /**
    * Converts a number to text, using currency format.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param number Is a number, a reference to a cell containing a number, or a formula that evaluates to a number.
    * @param decimals Is the number of digits to the right of the decimal point.
    */
  def usdollar(number: Double): FunctionResult[String] = js.native
  def usdollar(number: Double, decimals: Double): FunctionResult[String] = js.native
  def usdollar(number: Double, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def usdollar(number: Double, decimals: Range): FunctionResult[String] = js.native
  def usdollar(number: Double, decimals: RangeReference): FunctionResult[String] = js.native
  def usdollar(number: FunctionResult[_]): FunctionResult[String] = js.native
  def usdollar(number: FunctionResult[_], decimals: Double): FunctionResult[String] = js.native
  def usdollar(number: FunctionResult[_], decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def usdollar(number: FunctionResult[_], decimals: Range): FunctionResult[String] = js.native
  def usdollar(number: FunctionResult[_], decimals: RangeReference): FunctionResult[String] = js.native
  def usdollar(number: Range): FunctionResult[String] = js.native
  def usdollar(number: RangeReference): FunctionResult[String] = js.native
  def usdollar(number: RangeReference, decimals: Double): FunctionResult[String] = js.native
  def usdollar(number: RangeReference, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def usdollar(number: RangeReference, decimals: Range): FunctionResult[String] = js.native
  def usdollar(number: RangeReference, decimals: RangeReference): FunctionResult[String] = js.native
  def usdollar(number: Range, decimals: Double): FunctionResult[String] = js.native
  def usdollar(number: Range, decimals: FunctionResult[_]): FunctionResult[String] = js.native
  def usdollar(number: Range, decimals: Range): FunctionResult[String] = js.native
  def usdollar(number: Range, decimals: RangeReference): FunctionResult[String] = js.native
  /**
    * Converts a text string that represents a number to a number.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param text Is the text enclosed in quotation marks or a reference to a cell containing the text you want to convert.
    */
  def value(text: String): FunctionResult[Double] = js.native
  def value(text: Boolean): FunctionResult[Double] = js.native
  def value(text: Double): FunctionResult[Double] = js.native
  def value(text: FunctionResult[_]): FunctionResult[Double] = js.native
  def value(text: Range): FunctionResult[Double] = js.native
  def value(text: RangeReference): FunctionResult[Double] = js.native
  /**
    * Estimates variance based on a sample, including logical values and text. Text and the logical value FALSE have the value 0; the logical value TRUE has the value 1.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 value arguments corresponding to a sample of a population.
    */
  def varA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Calculates variance based on the entire population, including logical values and text. Text and the logical value FALSE have the value 0; the logical value TRUE has the value 1.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 value arguments corresponding to a population.
    */
  def varPA(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Calculates variance based on the entire population (ignores logical values and text in the population).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numeric arguments corresponding to a population.
    */
  def var_P(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Estimates variance based on a sample (ignores logical values and text in the sample).
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 255 numeric arguments corresponding to a sample of a population.
    */
  def var_S(values: (Double | Range | RangeReference | FunctionResult[_])*): FunctionResult[Double] = js.native
  /**
    * Returns the depreciation of an asset for any period you specify, including partial periods, using the double-declining balance method or some other method you specify.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param cost Is the initial cost of the asset.
    * @param salvage Is the salvage value at the end of the life of the asset.
    * @param life Is the number of periods over which the asset is being depreciated (sometimes called the useful life of the asset).
    * @param startPeriod Is the starting period for which you want to calculate the depreciation, in the same units as Life.
    * @param endPeriod Is the ending period for which you want to calculate the depreciation, in the same units as Life.
    * @param factor Is the rate at which the balance declines, 2 (double-declining balance) if omitted.
    * @param noSwitch Switch to straight-line depreciation when depreciation is greater than the declining balance = FALSE or omitted; do not switch = TRUE.
    */
  def vdb(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    startPeriod: Double | Range | RangeReference | FunctionResult[_],
    endPeriod: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def vdb(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    startPeriod: Double | Range | RangeReference | FunctionResult[_],
    endPeriod: Double | Range | RangeReference | FunctionResult[_],
    factor: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def vdb(
    cost: Double | Range | RangeReference | FunctionResult[_],
    salvage: Double | Range | RangeReference | FunctionResult[_],
    life: Double | Range | RangeReference | FunctionResult[_],
    startPeriod: Double | Range | RangeReference | FunctionResult[_],
    endPeriod: Double | Range | RangeReference | FunctionResult[_],
    factor: Double | Range | RangeReference | FunctionResult[_],
    noSwitch: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Looks for a value in the leftmost column of a table, and then returns a value in the same row from a column you specify. By default, the table must be sorted in an ascending order.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param lookupValue Is the value to be found in the first column of the table, and can be a value, a reference, or a text string.
    * @param tableArray Is a table of text, numbers, or logical values, in which data is retrieved. tableArray can be a reference to a range or a range name.
    * @param colIndexNum Is the column number in tableArray from which the matching value should be returned. The first column of values in the table is column 1.
    * @param rangeLookup Is a logical value: to find the closest match in the first column (sorted in ascending order) = TRUE or omitted; find an exact match = FALSE.
    */
  def vlookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    tableArray: Range | Double | RangeReference | FunctionResult[_],
    colIndexNum: Range | Double | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  def vlookup(
    lookupValue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    tableArray: Range | Double | RangeReference | FunctionResult[_],
    colIndexNum: Range | Double | RangeReference | FunctionResult[_],
    rangeLookup: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double | String | Boolean] = js.native
  /**
    * Returns the week number in the year.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is the date-time code used by Microsoft Excel for date and time calculation.
    * @param returnType Is a number (1 or 2) that determines the type of the return value.
    */
  def weekNum(serialNumber: Double | String | Boolean | Range | RangeReference | FunctionResult[_]): FunctionResult[Double] = js.native
  def weekNum(
    serialNumber: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    returnType: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns a number from 1 to 7 identifying the day of the week of a date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number that represents a date.
    * @param returnType Is a number: for Sunday=1 through Saturday=7, use 1; for Monday=1 through Sunday=7, use 2; for Monday=0 through Sunday=6, use 3.
    */
  def weekday(serialNumber: Double): FunctionResult[Double] = js.native
  def weekday(serialNumber: Double, returnType: Double): FunctionResult[Double] = js.native
  def weekday(serialNumber: Double, returnType: FunctionResult[_]): FunctionResult[Double] = js.native
  def weekday(serialNumber: Double, returnType: Range): FunctionResult[Double] = js.native
  def weekday(serialNumber: Double, returnType: RangeReference): FunctionResult[Double] = js.native
  def weekday(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def weekday(serialNumber: FunctionResult[_], returnType: Double): FunctionResult[Double] = js.native
  def weekday(serialNumber: FunctionResult[_], returnType: FunctionResult[_]): FunctionResult[Double] = js.native
  def weekday(serialNumber: FunctionResult[_], returnType: Range): FunctionResult[Double] = js.native
  def weekday(serialNumber: FunctionResult[_], returnType: RangeReference): FunctionResult[Double] = js.native
  def weekday(serialNumber: Range): FunctionResult[Double] = js.native
  def weekday(serialNumber: RangeReference): FunctionResult[Double] = js.native
  def weekday(serialNumber: RangeReference, returnType: Double): FunctionResult[Double] = js.native
  def weekday(serialNumber: RangeReference, returnType: FunctionResult[_]): FunctionResult[Double] = js.native
  def weekday(serialNumber: RangeReference, returnType: Range): FunctionResult[Double] = js.native
  def weekday(serialNumber: RangeReference, returnType: RangeReference): FunctionResult[Double] = js.native
  def weekday(serialNumber: Range, returnType: Double): FunctionResult[Double] = js.native
  def weekday(serialNumber: Range, returnType: FunctionResult[_]): FunctionResult[Double] = js.native
  def weekday(serialNumber: Range, returnType: Range): FunctionResult[Double] = js.native
  def weekday(serialNumber: Range, returnType: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the Weibull distribution.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param x Is the value at which to evaluate the function, a nonnegative number.
    * @param alpha Is a parameter to the distribution, a positive number.
    * @param beta Is a parameter to the distribution, a positive number.
    * @param cumulative Is a logical value: for the cumulative distribution function, use TRUE; for the probability mass function, use FALSE.
    */
  def weibull_Dist(
    x: Double | Range | RangeReference | FunctionResult[_],
    alpha: Double | Range | RangeReference | FunctionResult[_],
    beta: Double | Range | RangeReference | FunctionResult[_],
    cumulative: Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the serial number of the date before or after a specified number of workdays.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param days Is the number of nonweekend and non-holiday days before or after startDate.
    * @param holidays Is an optional array of one or more serial date numbers to exclude from the working calendar, such as state and federal holidays and floating holidays.
    */
  def workDay(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    days: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def workDay(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    days: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    holidays: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the serial number of the date before or after a specified number of workdays with custom weekend parameters.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param days Is the number of nonweekend and non-holiday days before or after startDate.
    * @param weekend Is a number or string specifying when weekends occur.
    * @param holidays Is an optional array of one or more serial date numbers to exclude from the working calendar, such as state and federal holidays and floating holidays.
    */
  def workDay_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    days: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def workDay_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    days: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    weekend: Double | String | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def workDay_Intl(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    days: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    weekend: Double | String | Range | RangeReference | FunctionResult[_],
    holidays: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the internal rate of return for a schedule of cash flows.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values Is a series of cash flows that correspond to a schedule of payments in dates.
    * @param dates Is a schedule of payment dates that corresponds to the cash flow payments.
    * @param guess Is a number that you guess is close to the result of XIRR.
    */
  def xirr(
    values: Double | String | Range | Boolean | RangeReference | FunctionResult[_],
    dates: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def xirr(
    values: Double | String | Range | Boolean | RangeReference | FunctionResult[_],
    dates: Double | String | Range | Boolean | RangeReference | FunctionResult[_],
    guess: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the net present value for a schedule of cash flows.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param rate Is the discount rate to apply to the cash flows.
    * @param values Is a series of cash flows that correspond to a schedule of payments in dates.
    * @param dates Is a schedule of payment dates that corresponds to the cash flow payments.
    */
  def xnpv(
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    values: Double | String | Range | Boolean | RangeReference | FunctionResult[_],
    dates: Double | String | Range | Boolean | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns a logical 'Exclusive Or' of all arguments.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values List of parameters, whose elements are 1 to 254 conditions you want to test that can be either TRUE or FALSE and can be logical values, arrays, or references.
    */
  def xor(values: (Boolean | Range | RangeReference | FunctionResult[_])*): FunctionResult[Boolean] = js.native
  /**
    * Returns the year of a date, an integer in the range 1900 - 9999.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param serialNumber Is a number in the date-time code used by Microsoft Excel.
    */
  def year(serialNumber: Double): FunctionResult[Double] = js.native
  def year(serialNumber: FunctionResult[_]): FunctionResult[Double] = js.native
  def year(serialNumber: Range): FunctionResult[Double] = js.native
  def year(serialNumber: RangeReference): FunctionResult[Double] = js.native
  /**
    * Returns the year fraction representing the number of whole days between start_date and end_date.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param startDate Is a serial date number that represents the start date.
    * @param endDate Is a serial date number that represents the end date.
    * @param basis Is the type of day count basis to use.
    */
  def yearFrac(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def yearFrac(
    startDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    endDate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the yield on a security that pays periodic interest.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param rate Is the security's annual coupon rate.
    * @param pr Is the security's price per $100 face value.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param frequency Is the number of coupon payments per year.
    * @param basis Is the type of day count basis to use.
    */
  def `yield`(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def `yield`(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    frequency: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the annual yield for a discounted security. For example, a treasury bill.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param pr Is the security's price per $100 face value.
    * @param redemption Is the security's redemption value per $100 face value.
    * @param basis Is the type of day count basis to use.
    */
  def yieldDisc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def yieldDisc(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    redemption: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the annual yield of a security that pays interest at maturity.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param settlement Is the security's settlement date, expressed as a serial date number.
    * @param maturity Is the security's maturity date, expressed as a serial date number.
    * @param issue Is the security's issue date, expressed as a serial date number.
    * @param rate Is the security's interest rate at date of issue.
    * @param pr Is the security's price per $100 face value.
    * @param basis Is the type of day count basis to use.
    */
  def yieldMat(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def yieldMat(
    settlement: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    maturity: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    issue: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    rate: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    pr: Double | String | Boolean | Range | RangeReference | FunctionResult[_],
    basis: Double | String | Boolean | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  /**
    * Returns the one-tailed P-value of a z-test.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param array Is the array or range of data against which to test X.
    * @param x Is the value to test.
    * @param sigma Is the population (known) standard deviation. If omitted, the sample standard deviation is used.
    */
  def z_Test(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
  def z_Test(
    array: Double | Range | RangeReference | FunctionResult[_],
    x: Double | Range | RangeReference | FunctionResult[_],
    sigma: Double | Range | RangeReference | FunctionResult[_]
  ): FunctionResult[Double] = js.native
}

