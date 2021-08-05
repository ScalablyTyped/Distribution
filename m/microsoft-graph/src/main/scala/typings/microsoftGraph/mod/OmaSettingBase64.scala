package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingBase64
  extends StObject
     with OmaSetting {
  
  // File name associated with the Value property (.cer
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value. (Base64 encoded string)
  var value: js.UndefOr[String] = js.undefined
}
object OmaSettingBase64 {
  
  inline def apply(): OmaSettingBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingBase64]
  }
  
  extension [Self <: OmaSettingBase64](x: Self) {
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
