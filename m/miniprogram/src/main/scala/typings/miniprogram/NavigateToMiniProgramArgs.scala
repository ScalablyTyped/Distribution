package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToMiniProgramArgs
  extends StObject
     with AsyncVoidCallback {
  
  var appId: String
  
  /**
    * The extra data that needs to be passed to the target Mini Program,
    * and the target Mini Program can get it in `App.onLaunch()` or `App.onShow()`.
    */
  var extraData: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object NavigateToMiniProgramArgs {
  
  inline def apply(appId: String): NavigateToMiniProgramArgs = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateToMiniProgramArgs] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
