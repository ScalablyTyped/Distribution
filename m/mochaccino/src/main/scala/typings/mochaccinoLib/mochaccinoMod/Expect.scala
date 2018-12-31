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

