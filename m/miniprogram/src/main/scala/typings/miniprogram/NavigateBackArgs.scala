package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackArgs extends AsyncCallback[Unit] {
  
  /**
    * Number of pages to return. If delta is greater than the number
    * of open pages, it returns to the home page. Default value is 1
    */
  var delta: js.UndefOr[Double] = js.native
}
object NavigateBackArgs {
  
  @scala.inline
  def apply(): NavigateBackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackArgs]
  }
  
  @scala.inline
  implicit class NavigateBackArgsMutableBuilder[Self <: NavigateBackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
  }
}
