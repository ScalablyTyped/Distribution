package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToMiniProgramArgs extends AsyncCallback[Unit] {
  
  var appId: String = js.native
  
  /**
    * The extra data that needs to be passed to the target Mini Program,
    * and the target Mini Program can get it in `App.onLaunch()` or `App.onShow()`.
    */
  var extraData: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object NavigateToMiniProgramArgs {
  
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramArgs = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramArgs]
  }
  
  @scala.inline
  implicit class NavigateToMiniProgramArgsMutableBuilder[Self <: NavigateToMiniProgramArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
