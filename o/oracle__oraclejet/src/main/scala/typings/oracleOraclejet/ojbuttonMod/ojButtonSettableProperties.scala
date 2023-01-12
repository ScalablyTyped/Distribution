package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojButtonSettableProperties
  extends StObject
     with baseComponentSettableProperties {
  
  var chroming: full | half | outlined
  
  var disabled: Boolean
  
  var display: all | icons
}
object ojButtonSettableProperties {
  
  inline def apply(chroming: full | half | outlined, disabled: Boolean, display: all | icons): ojButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], translations = null)
    __obj.asInstanceOf[ojButtonSettableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojButtonSettableProperties] (val x: Self) extends AnyVal {
    
    inline def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
  }
}
