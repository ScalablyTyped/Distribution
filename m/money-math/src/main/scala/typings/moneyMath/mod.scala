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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("money-math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def cmp(a: String, b: String): `0` | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`0` | Double]
  
  @scala.inline
  def div(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def floatToAmount(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("floatToAmount")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def format(currency: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_CHF(currency: CHF, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_CNY(currency: CNY, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_EUR(currency: EUR, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_GBP(currency: GBP, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_JPY(currency: JPY, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_LTL(currency: LTL, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_PLN(currency: PLN, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_SEK(currency: SEK, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_SKK(currency: SKK, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_UAH(currency: UAH, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format_USD(currency: USD, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isEqual(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNegative(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPositive(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isZero(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mul(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def percent(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("percent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def roundTo5Cents(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("roundTo5Cents")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def roundUpTo5Cents(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("roundUpTo5Cents")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def subtract(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
}
