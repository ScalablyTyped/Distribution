package typings.plottable

import typings.d3Time.mod.CountableTimeInterval
import typings.plottable.quantitativeScaleMod.QuantitativeScale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeScaleMod {
  
  @JSImport("plottable/build/src/scales/timeScale", "Time")
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  class Time () extends QuantitativeScale[Date] {
    
    var _d3Scale: js.Any = js.native
    
    /**
      * Returns an array of ticks values separated by the specified interval.
      *
      * @param {string} interval A string specifying the interval unit.
      * @param {number?} [step] The number of multiples of the interval between consecutive ticks.
      * @return {Date[]}
      */
    def tickInterval(interval: String): js.Array[Date] = js.native
    def tickInterval(interval: String, step: js.UndefOr[scala.Nothing], useUTC: Boolean): js.Array[Date] = js.native
    def tickInterval(interval: String, step: Double): js.Array[Date] = js.native
    def tickInterval(interval: String, step: Double, useUTC: Boolean): js.Array[Date] = js.native
  }
  /* static members */
  object Time {
    
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    @JSImport("plottable/build/src/scales/timeScale", "Time.timeIntervalToD3Time")
    @js.native
    def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = js.native
  }
}
