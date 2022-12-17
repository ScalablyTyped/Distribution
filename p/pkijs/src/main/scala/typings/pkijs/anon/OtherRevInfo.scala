package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherRevInfo extends StObject {
  
  var otherRevInfo: js.UndefOr[String] = js.undefined
  
  var otherRevInfoFormat: js.UndefOr[String] = js.undefined
}
object OtherRevInfo {
  
  inline def apply(): OtherRevInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRevInfo]
  }
  
  extension [Self <: OtherRevInfo](x: Self) {
    
    inline def setOtherRevInfo(value: String): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormatUndefined: Self = StObject.set(x, "otherRevInfoFormat", js.undefined)
    
    inline def setOtherRevInfoUndefined: Self = StObject.set(x, "otherRevInfo", js.undefined)
  }
}
