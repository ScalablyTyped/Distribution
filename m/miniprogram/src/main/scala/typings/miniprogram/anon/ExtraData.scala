package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraData extends StObject {
  
  var appId: String
  
  var extraData: Any
  
  var sourceServiceId: String
}
object ExtraData {
  
  inline def apply(appId: String, extraData: Any, sourceServiceId: String): ExtraData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], sourceServiceId = sourceServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraData] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setSourceServiceId(value: String): Self = StObject.set(x, "sourceServiceId", value.asInstanceOf[js.Any])
  }
}
