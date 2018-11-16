package typings
package plottableLib.buildSrcScalesTimeScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales/timeScale", "Time")
@js.native
class Time ()
  extends plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[stdLib.Date] {
  var _d3Scale: js.Any = js.native
  /**
       * Returns an array of ticks values separated by the specified interval.
       *
       * @param {string} interval A string specifying the interval unit.
       * @param {number?} [step] The number of multiples of the interval between consecutive ticks.
       * @return {Date[]}
       */
  def tickInterval(interval: java.lang.String): js.Array[stdLib.Date] = js.native
  /**
       * Returns an array of ticks values separated by the specified interval.
       *
       * @param {string} interval A string specifying the interval unit.
       * @param {number?} [step] The number of multiples of the interval between consecutive ticks.
       * @return {Date[]}
       */
  def tickInterval(interval: java.lang.String, step: scala.Double): js.Array[stdLib.Date] = js.native
  /**
       * Returns an array of ticks values separated by the specified interval.
       *
       * @param {string} interval A string specifying the interval unit.
       * @param {number?} [step] The number of multiples of the interval between consecutive ticks.
       * @return {Date[]}
       */
  def tickInterval(interval: java.lang.String, step: scala.Double, useUTC: scala.Boolean): js.Array[stdLib.Date] = js.native
}

@JSImport("plottable/build/src/scales/timeScale", "Time")
@js.native
object Time extends js.Object {
  /**
       * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
       * If the provided TimeInterval is incorrect, the default is d3.timeYear
       */
  def timeIntervalToD3Time(timeInterval: java.lang.String, useUTC: scala.Boolean): d3DashTimeLib.d3DashTimeMod.CountableTimeInterval = js.native
}

