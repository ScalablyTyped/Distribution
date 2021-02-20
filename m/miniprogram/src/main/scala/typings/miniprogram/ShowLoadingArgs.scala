package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowLoadingArgs extends AsyncCallback[Unit] {
  
  /**
    * Text contents of loading.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Displaying delay, in ms, 0 by default If my.hideLoading was
    * called before this time, it is not displayed.
    */
  var delay: js.UndefOr[Double] = js.native
}
object ShowLoadingArgs {
  
  @scala.inline
  def apply(): ShowLoadingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowLoadingArgs]
  }
  
  @scala.inline
  implicit class ShowLoadingArgsMutableBuilder[Self <: ShowLoadingArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
