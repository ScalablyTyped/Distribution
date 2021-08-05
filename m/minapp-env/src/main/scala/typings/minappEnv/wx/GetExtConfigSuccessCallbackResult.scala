package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigSuccessCallbackResult extends StObject {
  
  /** 第三方平台自定义的数据 */
  var extConfig: js.Object
}
object GetExtConfigSuccessCallbackResult {
  
  inline def apply(extConfig: js.Object): GetExtConfigSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSuccessCallbackResult]
  }
  
  extension [Self <: GetExtConfigSuccessCallbackResult](x: Self) {
    
    inline def setExtConfig(value: js.Object): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
