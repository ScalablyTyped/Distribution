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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOneSettableProperties> */
@js.native
trait ojButtonsetOneSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var chroming: js.UndefOr[full | half | outlined] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var display: js.UndefOr[all | icons] = js.native
  
  var focusManagement: js.UndefOr[oneTabstop | none] = js.native
  
  var translations: js.UndefOr[js.Object | Null] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ojButtonsetOneSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojButtonsetOneSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonsetOneSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojButtonsetOneSettablePropertiesLenientMutableBuilder[Self <: ojButtonsetOneSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromingUndefined: Self = StObject.set(x, "chroming", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFocusManagement(value: oneTabstop | none): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusManagementUndefined: Self = StObject.set(x, "focusManagement", js.undefined)
    
    @scala.inline
    def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsNull: Self = StObject.set(x, "translations", null)
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
