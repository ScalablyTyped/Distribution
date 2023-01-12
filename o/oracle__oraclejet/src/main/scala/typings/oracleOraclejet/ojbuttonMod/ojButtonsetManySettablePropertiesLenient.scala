package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetManySettableProperties> */
trait ojButtonsetManySettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var chroming: js.UndefOr[full | half | outlined] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var display: js.UndefOr[all | icons] = js.undefined
  
  var focusManagement: js.UndefOr[oneTabstop | none] = js.undefined
  
  var translations: js.UndefOr[js.Object | Null] = js.undefined
  
  var value: js.UndefOr[js.Array[Any] | Null] = js.undefined
}
object ojButtonsetManySettablePropertiesLenient {
  
  inline def apply(): ojButtonsetManySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonsetManySettablePropertiesLenient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojButtonsetManySettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    inline def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    inline def setChromingUndefined: Self = StObject.set(x, "chroming", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFocusManagement(value: oneTabstop | none): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
    
    inline def setFocusManagementUndefined: Self = StObject.set(x, "focusManagement", js.undefined)
    
    inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsNull: Self = StObject.set(x, "translations", null)
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
