package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowLoadingArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * Text contents of loading.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Displaying delay, in ms, 0 by default If my.hideLoading was
    * called before this time, it is not displayed.
    */
  var delay: js.UndefOr[Double] = js.undefined
}
object ShowLoadingArgs {
  
  inline def apply(): ShowLoadingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowLoadingArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowLoadingArgs] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
