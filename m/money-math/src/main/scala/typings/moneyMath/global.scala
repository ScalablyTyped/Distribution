package typings.moneyMath

import typings.moneyMath.moneyMathInts.`0`
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

object global {
  
  object Money {
    
    @JSGlobal("Money")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def amountToCents(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("amountToCents")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def centsToAmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centsToAmount")().asInstanceOf[Unit]
    inline def centsToAmount(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("centsToAmount")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cmp(a: String, b: String): `0` | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`0` | Double]
    
    inline def div(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def floatToAmount(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("floatToAmount")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def format(currency: CHF | CNY | EUR | GBP | JPY | LTL | PLN | SEK | SKK | UAH | USD, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(currency: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(currency.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def integralPart(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("integralPart")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isEqual(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNegative(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPositive(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isZero(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def mul(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def percent(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("percent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def roundTo5Cents(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("roundTo5Cents")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def roundUpTo5Cents(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("roundUpTo5Cents")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def subtract(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
