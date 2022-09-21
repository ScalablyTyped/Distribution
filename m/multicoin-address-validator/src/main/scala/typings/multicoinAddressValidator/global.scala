package typings.multicoinAddressValidator

import typings.multicoinAddressValidator.mod.Currency
import typings.multicoinAddressValidator.mod.ValidateOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WAValidator {
    
    @JSGlobal("WAValidator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findCurrency(symbol: String): Currency | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findCurrency")(symbol.asInstanceOf[js.Any]).asInstanceOf[Currency | Null]
    
    inline def getCurrencies(): js.Array[Currency] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencies")().asInstanceOf[js.Array[Currency]]
    
    inline def validate(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def validate(address: String, currencyNameOrSymbol: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any], currencyNameOrSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(address: String, currencyNameOrSymbol: String, opts: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any], currencyNameOrSymbol.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(address: String, currencyNameOrSymbol: String, opts: ValidateOpts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any], currencyNameOrSymbol.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(address: String, currencyNameOrSymbol: Unit, opts: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any], currencyNameOrSymbol.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def validate(address: String, currencyNameOrSymbol: Unit, opts: ValidateOpts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(address.asInstanceOf[js.Any], currencyNameOrSymbol.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
