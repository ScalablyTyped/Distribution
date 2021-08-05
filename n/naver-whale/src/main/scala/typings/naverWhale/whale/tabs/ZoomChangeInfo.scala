package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomChangeInfo extends StObject {
  
  var newZoomFactor: Double
  
  var oldZoomFactor: Double
  
  var tabId: Double
  
  var zoomSettings: typings.chrome.chrome.tabs.ZoomSettings
}
object ZoomChangeInfo {
  
  inline def apply(
    newZoomFactor: Double,
    oldZoomFactor: Double,
    tabId: Double,
    zoomSettings: typings.chrome.chrome.tabs.ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeInfo]
  }
  
  extension [Self <: ZoomChangeInfo](x: Self) {
    
    inline def setNewZoomFactor(value: Double): Self = StObject.set(x, "newZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setOldZoomFactor(value: Double): Self = StObject.set(x, "oldZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setZoomSettings(value: typings.chrome.chrome.tabs.ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
  }
}
