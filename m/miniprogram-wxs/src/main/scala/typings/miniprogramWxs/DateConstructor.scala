package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateConstructor extends StObject {
  
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
  def UTC(year: Double, month: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Unit,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Unit,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double): Double = js.native
  
  def now(): Double = js.native
  
  // new(): Date;
  // new(value: number | string): Date;
  // new(year: number, month: number, date?: number, hours?: number, minutes?: number, seconds?: number, ms?: number): Date;
  // (): string;
  // readonly prototype: Date;
  /**
    * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
    * @param s A date string
    */
  def parse(s: java.lang.String): Double = js.native
}
