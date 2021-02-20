package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideLoadingArgs extends StObject {
  
  /**
    * Specifically it means the current page instance. In some
    * scenarios, it is required to specify the exact page for hideLoading.
    */
  var page: js.Any = js.native
}
object HideLoadingArgs {
  
  @scala.inline
  def apply(page: js.Any): HideLoadingArgs = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLoadingArgs]
  }
  
  @scala.inline
  implicit class HideLoadingArgsMutableBuilder[Self <: HideLoadingArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
