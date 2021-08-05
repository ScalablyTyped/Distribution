package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingStringXml
  extends StObject
     with OmaSetting {
  
  // File name associated with the Value property (.xml).
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value. (UTF8 encoded byte array)
  var value: js.UndefOr[Double] = js.undefined
}
object OmaSettingStringXml {
  
  inline def apply(): OmaSettingStringXml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingStringXml]
  }
  
  extension [Self <: OmaSettingStringXml](x: Self) {
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
