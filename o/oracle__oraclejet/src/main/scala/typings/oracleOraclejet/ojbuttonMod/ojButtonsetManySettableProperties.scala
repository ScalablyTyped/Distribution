package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
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

trait ojButtonsetManySettableProperties
  extends StObject
     with baseComponentSettableProperties {
  
  var chroming: full | half | outlined
  
  var disabled: Boolean
  
  var display: all | icons
  
  var focusManagement: oneTabstop | none
  
  var value: js.Array[Any] | Null
}
object ojButtonsetManySettableProperties {
  
  inline def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    focusManagement: oneTabstop | none
  ): ojButtonsetManySettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], focusManagement = focusManagement.asInstanceOf[js.Any], translations = null, value = null)
    __obj.asInstanceOf[ojButtonsetManySettableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojButtonsetManySettableProperties] (val x: Self) extends AnyVal {
    
    inline def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFocusManagement(value: oneTabstop | none): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
