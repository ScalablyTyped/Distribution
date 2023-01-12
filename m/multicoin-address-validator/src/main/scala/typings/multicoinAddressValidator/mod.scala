package typings.multicoinAddressValidator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multicoin-address-validator", JSImport.Namespace)
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
  
  trait Currency
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var name: String
    
    var symbol: String
    
    var validator: Validator
  }
  object Currency {
    
    inline def apply(name: String, symbol: String, validator: Validator): Currency = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: Validator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidateOpts extends StObject {
    
    var networkType: js.UndefOr[String] = js.undefined
  }
  object ValidateOpts {
    
    inline def apply(): ValidateOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateOpts] (val x: Self) extends AnyVal {
      
      inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
      
      inline def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
    }
  }
  
  trait Validator extends StObject {
    
    def isValidAddress(address: String, currency: Currency, opts: ValidateOpts): Boolean
  }
  object Validator {
    
    inline def apply(isValidAddress: (String, Currency, ValidateOpts) => Boolean): Validator = {
      val __obj = js.Dynamic.literal(isValidAddress = js.Any.fromFunction3(isValidAddress))
      __obj.asInstanceOf[Validator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
      
      inline def setIsValidAddress(value: (String, Currency, ValidateOpts) => Boolean): Self = StObject.set(x, "isValidAddress", js.Any.fromFunction3(value))
    }
  }
}
