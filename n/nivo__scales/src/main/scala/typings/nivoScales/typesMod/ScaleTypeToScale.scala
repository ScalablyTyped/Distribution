package typings.nivoScales.typesMod

import typings.d3Scale.mod.NumberValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTypeToScale[Input, Output] extends StObject {
  
  /**
    * Given a value in the input domain, returns the start of the corresponding band derived from the output range.
    * If the given value is not in the scale’s domain, returns undefined.
    *
    * @param x  A value from the domain.
    */
  def band(x: Input): js.UndefOr[Double]
  @JSName("band")
  var band_Original: ScaleBand[Input]
  
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A numeric value from the domain.
    */
  def linear(value: NumberValue): Output | scala.Nothing
  @JSName("linear")
  var linear_Original: ScaleLinear[Output]
  
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A numeric value from the domain.
    */
  def log(value: NumberValue): Double | scala.Nothing
  @JSName("log")
  var log_Original: ScaleLog
  
  /**
    * Given a value in the input domain, returns the corresponding point derived from the output range.
    * If the given value is not in the scale’s domain, returns undefined.
    *
    * @param x  A value from the domain.
    */
  def point(x: Input): js.UndefOr[Double]
  @JSName("point")
  var point_Original: ScalePoint[Input]
  
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A numeric value from the domain.
    */
  def symlog(value: NumberValue): Double | scala.Nothing
  @JSName("symlog")
  var symlog_Original: ScaleSymlog
  
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A temporal value from the domain. If the value is not a Date, it will be coerced to Date.
    */
  def time(value: js.Date): Double | scala.Nothing
  def time(value: NumberValue): Double | scala.Nothing
  @JSName("time")
  var time_Original: ScaleTime[Input]
}
object ScaleTypeToScale {
  
  inline def apply[Input, Output](
    band: ScaleBand[Input],
    linear: ScaleLinear[Output],
    log: ScaleLog,
    point: ScalePoint[Input],
    symlog: ScaleSymlog,
    time: ScaleTime[Input]
  ): ScaleTypeToScale[Input, Output] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], symlog = symlog.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTypeToScale[Input, Output]]
  }
  
  extension [Self <: ScaleTypeToScale[?, ?], Input, Output](x: Self & (ScaleTypeToScale[Input, Output])) {
    
    inline def setBand(value: ScaleBand[Input]): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: ScaleLinear[Output]): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLog(value: ScaleLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: ScalePoint[Input]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSymlog(value: ScaleSymlog): Self = StObject.set(x, "symlog", value.asInstanceOf[js.Any])
    
    inline def setTime(value: ScaleTime[Input]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
