package typings.moneyDashMath

import typings.moneyDashMath.moneyDashMathNumbers.`0`
import typings.moneyDashMath.moneyDashMathStrings.CHF
import typings.moneyDashMath.moneyDashMathStrings.CNY
import typings.moneyDashMath.moneyDashMathStrings.EUR
import typings.moneyDashMath.moneyDashMathStrings.GBP
import typings.moneyDashMath.moneyDashMathStrings.JPY
import typings.moneyDashMath.moneyDashMathStrings.LTL
import typings.moneyDashMath.moneyDashMathStrings.PLN
import typings.moneyDashMath.moneyDashMathStrings.SEK
import typings.moneyDashMath.moneyDashMathStrings.SKK
import typings.moneyDashMath.moneyDashMathStrings.UAH
import typings.moneyDashMath.moneyDashMathStrings.USD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("money-math", JSImport.Namespace)
@js.native
object moneyDashMathMod extends js.Object {
  def add(a: String, b: String): String = js.native
  def cmp(a: String, b: String): `0` | Double = js.native
  def div(a: String, b: String): String = js.native
  def floatToAmount(value: Double): String = js.native
  def format(currency: CHF | CNY | EUR | GBP | JPY | LTL | PLN | SEK | SKK | UAH | USD | String, value: String): String = js.native
  def isEqual(a: String, b: String): Boolean = js.native
  def isNegative(value: String): Boolean = js.native
  def isPositive(value: String): Boolean = js.native
  def isZero(value: String): Boolean = js.native
  def mul(a: String, b: String): String = js.native
  def percent(a: String, b: String): String = js.native
  def roundTo5Cents(value: String): String = js.native
  def roundUpTo5Cents(value: String): String = js.native
  def subtract(a: String, b: String): String = js.native
}

