package typings.mochaccino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect_ extends js.Object {
  var not: Expect_
  def toBe(arg: js.Any): Unit
  def toBeDefined(): Unit
  def toBeFalsy(): Unit
  def toBeGreaterThan(other: Double): Unit
  def toBeLessThan(other: Double): Unit
  def toBeNull(): Unit
  def toBeTruthy(): Unit
  def toBeUndefined(): Unit
  def toContain(arg: js.Any): Unit
  def toEqual(arg: js.Any): Unit
  def toHaveBeenCalled(): Unit
  def toHaveBeenCalledTimes(callCount: Double): Unit
  def toHaveBeenCalledWith(arg: js.Any*): Unit
  def toMatch(matchExpression: js.Any): Unit
  def toThrow(): Unit
  def toThrowError(errType: js.Any): Unit
}

object Expect_ {
  @scala.inline
  def apply(
    not: Expect_,
    toBe: js.Any => Unit,
    toBeDefined: () => Unit,
    toBeFalsy: () => Unit,
    toBeGreaterThan: Double => Unit,
    toBeLessThan: Double => Unit,
    toBeNull: () => Unit,
    toBeTruthy: () => Unit,
    toBeUndefined: () => Unit,
    toContain: js.Any => Unit,
    toEqual: js.Any => Unit,
    toHaveBeenCalled: () => Unit,
    toHaveBeenCalledTimes: Double => Unit,
    toHaveBeenCalledWith: /* repeated */ js.Any => Unit,
    toMatch: js.Any => Unit,
    toThrow: () => Unit,
    toThrowError: js.Any => Unit
  ): Expect_ = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toBeUndefined = js.Any.fromFunction0(toBeUndefined), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toHaveBeenCalled = js.Any.fromFunction0(toHaveBeenCalled), toHaveBeenCalledTimes = js.Any.fromFunction1(toHaveBeenCalledTimes), toHaveBeenCalledWith = js.Any.fromFunction1(toHaveBeenCalledWith), toMatch = js.Any.fromFunction1(toMatch), toThrow = js.Any.fromFunction0(toThrow), toThrowError = js.Any.fromFunction1(toThrowError))
    __obj.asInstanceOf[Expect_]
  }
}

