package typings
package mochaccinoLib.mochaccinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect extends js.Object {
  var not: Expect
  def toBe(arg: js.Any): scala.Unit
  def toBeDefined(): scala.Unit
  def toBeFalsy(): scala.Unit
  def toBeGreaterThan(other: scala.Double): scala.Unit
  def toBeLessThan(other: scala.Double): scala.Unit
  def toBeNull(): scala.Unit
  def toBeTruthy(): scala.Unit
  def toBeUndefined(): scala.Unit
  def toContain(arg: js.Any): scala.Unit
  def toEqual(arg: js.Any): scala.Unit
  def toHaveBeenCalled(): scala.Unit
  def toHaveBeenCalledTimes(callCount: scala.Double): scala.Unit
  def toHaveBeenCalledWith(arg: js.Any*): scala.Unit
  def toMatch(matchExpression: js.Any): scala.Unit
  def toThrow(): scala.Unit
  def toThrowError(errType: js.Any): scala.Unit
}

object Expect {
  @scala.inline
  def apply(
    not: Expect,
    toBe: js.Function1[js.Any, scala.Unit],
    toBeDefined: js.Function0[scala.Unit],
    toBeFalsy: js.Function0[scala.Unit],
    toBeGreaterThan: js.Function1[scala.Double, scala.Unit],
    toBeLessThan: js.Function1[scala.Double, scala.Unit],
    toBeNull: js.Function0[scala.Unit],
    toBeTruthy: js.Function0[scala.Unit],
    toBeUndefined: js.Function0[scala.Unit],
    toContain: js.Function1[js.Any, scala.Unit],
    toEqual: js.Function1[js.Any, scala.Unit],
    toHaveBeenCalled: js.Function0[scala.Unit],
    toHaveBeenCalledTimes: js.Function1[scala.Double, scala.Unit],
    toHaveBeenCalledWith: js.Function1[/* repeated */ js.Any, scala.Unit],
    toMatch: js.Function1[js.Any, scala.Unit],
    toThrow: js.Function0[scala.Unit],
    toThrowError: js.Function1[js.Any, scala.Unit]
  ): Expect = {
    val __obj = js.Dynamic.literal(not = not, toBe = toBe, toBeDefined = toBeDefined, toBeFalsy = toBeFalsy, toBeGreaterThan = toBeGreaterThan, toBeLessThan = toBeLessThan, toBeNull = toBeNull, toBeTruthy = toBeTruthy, toBeUndefined = toBeUndefined, toContain = toContain, toEqual = toEqual, toHaveBeenCalled = toHaveBeenCalled, toHaveBeenCalledTimes = toHaveBeenCalledTimes, toHaveBeenCalledWith = toHaveBeenCalledWith, toMatch = toMatch, toThrow = toThrow, toThrowError = toThrowError)
  
    __obj.asInstanceOf[Expect]
  }
}

