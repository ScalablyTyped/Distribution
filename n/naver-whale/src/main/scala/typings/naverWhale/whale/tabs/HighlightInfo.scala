package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightInfo extends StObject {
  
  /** One or more tab indices to highlight. */
  var tabs: Double | js.Array[Double] = js.native
  
  /** Optional. The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.native
}
object HighlightInfo {
  
  @scala.inline
  def apply(tabs: Double | js.Array[Double]): HighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightInfo]
  }
  
  @scala.inline
  implicit class HighlightInfoMutableBuilder[Self <: HighlightInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabs(value: Double | js.Array[Double]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: Double*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
