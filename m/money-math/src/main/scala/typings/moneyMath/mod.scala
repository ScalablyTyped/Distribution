package typings.moneyMath

import typings.moneyMath.moneyMathNumbers.`0`
import typings.moneyMath.moneyMathStrings.CHF
import typings.moneyMath.moneyMathStrings.CNY
import typings.moneyMath.moneyMathStrings.EUR
import typings.moneyMath.moneyMathStrings.GBP
import typings.moneyMath.moneyMathStrings.JPY
import typings.moneyMath.moneyMathStrings.LTL
import typings.moneyMath.moneyMathStrings.PLN
import typings.moneyMath.moneyMathStrings.SEK
import typings.moneyMath.moneyMathStrings.SKK
import typings.moneyMath.moneyMathStrings.UAH
import typings.moneyMath.moneyMathStrings.USD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("money-math", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

