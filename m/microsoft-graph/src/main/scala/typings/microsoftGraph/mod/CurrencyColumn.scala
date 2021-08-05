package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyColumn extends StObject {
  
  // Specifies the locale from which to infer the currency symbol.
  var locale: js.UndefOr[NullableOption[String]] = js.undefined
}
object CurrencyColumn {
  
  inline def apply(): CurrencyColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyColumn]
  }
  
  extension [Self <: CurrencyColumn](x: Self) {
    
    inline def setLocale(value: NullableOption[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
