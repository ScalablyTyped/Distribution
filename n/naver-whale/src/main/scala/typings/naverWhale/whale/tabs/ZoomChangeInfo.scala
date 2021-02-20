package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomChangeInfo extends StObject {
  
  var newZoomFactor: Double = js.native
  
  var oldZoomFactor: Double = js.native
  
  var tabId: Double = js.native
  
  var zoomSettings: typings.chrome.chrome.tabs.ZoomSettings = js.native
}
object ZoomChangeInfo {
  
  @scala.inline
  def apply(
    newZoomFactor: Double,
    oldZoomFactor: Double,
    tabId: Double,
    zoomSettings: typings.chrome.chrome.tabs.ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeInfo]
  }
  
  @scala.inline
  implicit class ZoomChangeInfoMutableBuilder[Self <: ZoomChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewZoomFactor(value: Double): Self = StObject.set(x, "newZoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldZoomFactor(value: Double): Self = StObject.set(x, "oldZoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomSettings(value: typings.chrome.chrome.tabs.ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
  }
}
