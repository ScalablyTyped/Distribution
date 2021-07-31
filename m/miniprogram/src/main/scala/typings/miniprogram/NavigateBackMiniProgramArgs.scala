package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackMiniProgramArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * The extra data that needs to be returned to the target Mini Program,
    *  and the target Mini Program can get it in `App.onLaunch()` or `App.onShow()`.
    */
  var extraData: js.Any
}
object NavigateBackMiniProgramArgs {
  
  @scala.inline
  def apply(extraData: js.Any): NavigateBackMiniProgramArgs = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateBackMiniProgramArgs]
  }
  
  @scala.inline
  implicit class NavigateBackMiniProgramArgsMutableBuilder[Self <: NavigateBackMiniProgramArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
  }
}
