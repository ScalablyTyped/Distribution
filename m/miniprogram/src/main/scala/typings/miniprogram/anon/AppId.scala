package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppId extends StObject {
  
  var appId: String
  
  var extraData: js.Any
  
  var sourceServiceId: String
}
object AppId {
  
  inline def apply(appId: String, extraData: js.Any, sourceServiceId: String): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], sourceServiceId = sourceServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  
  extension [Self <: AppId](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setSourceServiceId(value: String): Self = StObject.set(x, "sourceServiceId", value.asInstanceOf[js.Any])
  }
}
