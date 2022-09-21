package typings.nivoScales

import typings.nivoScales.timeHelpersMod.TIME_PRECISION
import typings.nivoScales.typesMod.AnyScale
import typings.nivoScales.typesMod.OtherScaleAxis
import typings.nivoScales.typesMod.Scale
import typings.nivoScales.typesMod.ScaleAxis
import typings.nivoScales.typesMod.ScaleSpec
import typings.nivoScales.typesMod.ScaleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nivoScalesStrings {
  
  @js.native
  sealed trait StackedXY extends StObject
  inline def StackedXY: StackedXY = "StackedXY".asInstanceOf[StackedXY]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait band
    extends StObject
       with ScaleType
  inline def band: band = "band".asInstanceOf[band]
  
  @js.native
  sealed trait base
    extends StObject
       with ScaleSpec
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait clamp
    extends StObject
       with ScaleSpec
  inline def clamp: clamp = "clamp".asInstanceOf[clamp]
  
  @js.native
  sealed trait constant
    extends StObject
       with ScaleSpec
  inline def constant: constant = "constant".asInstanceOf[constant]
  
  @js.native
  sealed trait day
    extends StObject
       with TIME_PRECISION
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait format
    extends StObject
       with ScaleSpec
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait hour
    extends StObject
       with TIME_PRECISION
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait linear
    extends StObject
       with ScaleType
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait log
    extends StObject
       with ScaleType
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait max
    extends StObject
       with ScaleSpec
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait millisecond
    extends StObject
       with TIME_PRECISION
  inline def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  
  @js.native
  sealed trait min
    extends StObject
       with ScaleSpec
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait minute
    extends StObject
       with TIME_PRECISION
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait month
    extends StObject
       with TIME_PRECISION
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait native extends StObject
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait nice
    extends StObject
       with ScaleSpec
  inline def nice: nice = "nice".asInstanceOf[nice]
  
  @js.native
  sealed trait point
    extends StObject
       with ScaleType
  inline def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait precision
    extends StObject
       with ScaleSpec
  inline def precision: precision = "precision".asInstanceOf[precision]
  
  @js.native
  sealed trait reverse
    extends StObject
       with ScaleSpec
  inline def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait round
    extends StObject
       with ScaleSpec
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait second
    extends StObject
       with TIME_PRECISION
  inline def second: second = "second".asInstanceOf[second]
  
  @js.native
  sealed trait stacked
    extends StObject
       with AnyScale
       with Scale[Any, Any]
       with ScaleSpec
  inline def stacked: stacked = "stacked".asInstanceOf[stacked]
  
  @js.native
  sealed trait symlog
    extends StObject
       with ScaleType
  inline def symlog: symlog = "symlog".asInstanceOf[symlog]
  
  @js.native
  sealed trait time
    extends StObject
       with ScaleType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait `type`
    extends StObject
       with AnyScale
       with Scale[Any, Any]
       with ScaleSpec
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait useUTC
    extends StObject
       with AnyScale
       with Scale[Any, Any]
       with ScaleSpec
  inline def useUTC: useUTC = "useUTC".asInstanceOf[useUTC]
  
  @js.native
  sealed trait x
    extends StObject
       with OtherScaleAxis[Any]
       with ScaleAxis
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y
    extends StObject
       with OtherScaleAxis[Any]
       with ScaleAxis
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait year
    extends StObject
       with TIME_PRECISION
  inline def year: year = "year".asInstanceOf[year]
}
