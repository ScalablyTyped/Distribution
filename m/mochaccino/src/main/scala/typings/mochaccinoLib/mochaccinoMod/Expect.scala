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
    toBe: js.Any => scala.Unit,
    toBeDefined: () => scala.Unit,
    toBeFalsy: () => scala.Unit,
    toBeGreaterThan: scala.Double => scala.Unit,
    toBeLessThan: scala.Double => scala.Unit,
    toBeNull: () => scala.Unit,
    toBeTruthy: () => scala.Unit,
    toBeUndefined: () => scala.Unit,
    toContain: js.Any => scala.Unit,
    toEqual: js.Any => scala.Unit,
    toHaveBeenCalled: () => scala.Unit,
    toHaveBeenCalledTimes: scala.Double => scala.Unit,
    toHaveBeenCalledWith: /* repeated */ js.Any => scala.Unit,
    toMatch: js.Any => scala.Unit,
    toThrow: () => scala.Unit,
    toThrowError: js.Any => scala.Unit
  ): Expect = {
    val __obj = js.Dynamic.literal(not = not, toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toBeUndefined = js.Any.fromFunction0(toBeUndefined), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toHaveBeenCalled = js.Any.fromFunction0(toHaveBeenCalled), toHaveBeenCalledTimes = js.Any.fromFunction1(toHaveBeenCalledTimes), toHaveBeenCalledWith = js.Any.fromFunction1(toHaveBeenCalledWith), toMatch = js.Any.fromFunction1(toMatch), toThrow = js.Any.fromFunction0(toThrow), toThrowError = js.Any.fromFunction1(toThrowError))
  
    __obj.asInstanceOf[Expect]
  }
}

