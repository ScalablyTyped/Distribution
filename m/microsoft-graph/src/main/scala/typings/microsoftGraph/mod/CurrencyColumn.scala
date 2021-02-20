package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyColumn extends StObject {
  
  // Specifies the locale from which to infer the currency symbol.
  var locale: js.UndefOr[NullableOption[String]] = js.native
}
object CurrencyColumn {
  
  @scala.inline
  def apply(): CurrencyColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyColumn]
  }
  
  @scala.inline
  implicit class CurrencyColumnMutableBuilder[Self <: CurrencyColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: NullableOption[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
