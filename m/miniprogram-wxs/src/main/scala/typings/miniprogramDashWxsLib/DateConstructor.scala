package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConstructor extends js.Object {
  /**
    * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
    * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
    * @param month The month as an number between 0 and 11 (January to December).
    * @param date The date as an number between 1 and 31.
    * @param hours Must be supplied if minutes is supplied. An number from 0 to 23 (midnight to 11pm) that specifies the hour.
    * @param minutes Must be supplied if seconds is supplied. An number from 0 to 59 that specifies the minutes.
    * @param seconds Must be supplied if milliseconds is supplied. An number from 0 to 59 that specifies the seconds.
    * @param ms An number from 0 to 999 that specifies the milliseconds.
    */
  def UTC(year: scala.Double, month: scala.Double): scala.Double = js.native
  def UTC(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  def UTC(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double,
    ms: scala.Double
  ): scala.Double = js.native
  def now(): scala.Double = js.native
  // new(): Date;
  // new(value: number | string): Date;
  // new(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number, ms?: number): Date;
  // (): string;
  // readonly prototype: Date;
  /**
    * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
    * @param s A date string
    */
  def parse(s: java.lang.String): scala.Double = js.native
}

