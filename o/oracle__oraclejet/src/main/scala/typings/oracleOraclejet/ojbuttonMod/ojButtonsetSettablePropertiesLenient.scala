package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetSettableProperties> */
@js.native
trait ojButtonsetSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var translations: js.UndefOr[js.Object | Null] = js.native
}
object ojButtonsetSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojButtonsetSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonsetSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojButtonsetSettablePropertiesLenientMutableBuilder[Self <: ojButtonsetSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsNull: Self = StObject.set(x, "translations", null)
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
