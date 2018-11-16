package typings
package moneyDashMathLib.moneyDashMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("money-math", JSImport.Namespace)
@js.native
object moneyDashMathModMembers extends js.Object {
  def add(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def cmp(a: java.lang.String, b: java.lang.String): moneyDashMathLib.moneyDashMathLibNumbers.`0` | scala.Double = js.native
  def div(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def floatToAmount(value: scala.Double): java.lang.String = js.native
  def format(
    currency: moneyDashMathLib.moneyDashMathLibStrings.CHF | moneyDashMathLib.moneyDashMathLibStrings.CNY | moneyDashMathLib.moneyDashMathLibStrings.EUR | moneyDashMathLib.moneyDashMathLibStrings.GBP | moneyDashMathLib.moneyDashMathLibStrings.JPY | moneyDashMathLib.moneyDashMathLibStrings.LTL | moneyDashMathLib.moneyDashMathLibStrings.PLN | moneyDashMathLib.moneyDashMathLibStrings.SEK | moneyDashMathLib.moneyDashMathLibStrings.SKK | moneyDashMathLib.moneyDashMathLibStrings.UAH | moneyDashMathLib.moneyDashMathLibStrings.USD | java.lang.String,
    value: java.lang.String
  ): java.lang.String = js.native
  def isEqual(a: java.lang.String, b: java.lang.String): scala.Boolean = js.native
  def isNegative(value: java.lang.String): scala.Boolean = js.native
  def isPositive(value: java.lang.String): scala.Boolean = js.native
  def isZero(value: java.lang.String): scala.Boolean = js.native
  def mul(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def percent(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
  def roundTo5Cents(value: java.lang.String): java.lang.String = js.native
  def roundUpTo5Cents(value: java.lang.String): java.lang.String = js.native
  def subtract(a: java.lang.String, b: java.lang.String): java.lang.String = js.native
}

