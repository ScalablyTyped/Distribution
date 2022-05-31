package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetSettableProperties> */
trait ojButtonsetSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var translations: js.UndefOr[js.Object | Null] = js.undefined
}
object ojButtonsetSettablePropertiesLenient {
  
  inline def apply(): ojButtonsetSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonsetSettablePropertiesLenient]
  }
  
  extension [Self <: ojButtonsetSettablePropertiesLenient](x: Self) {
    
    inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
