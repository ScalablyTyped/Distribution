package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemWindowMod {
  
  trait WindowDetail extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var isShowing: Boolean
    
    var left: Double
    
    var name: String
    
    var right: Double
    
    var state: String
    
    var top: Double
    
    var width: Double
  }
  object WindowDetail {
    
    inline def apply(
      bottom: Double,
      height: Double,
      isShowing: Boolean,
      left: Double,
      name: String,
      right: Double,
      state: String,
      top: Double,
      width: Double
    ): WindowDetail = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isShowing = isShowing.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowDetail]
    }
    
    extension [Self <: WindowDetail](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsShowing(value: Boolean): Self = StObject.set(x, "isShowing", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowInfo extends StObject {
    
    var childWindows: js.Array[WindowDetail]
    
    var mainWindow: WindowDetail
    
    var uuid: String
  }
  object WindowInfo {
    
    inline def apply(childWindows: js.Array[WindowDetail], mainWindow: WindowDetail, uuid: String): WindowInfo = {
      val __obj = js.Dynamic.literal(childWindows = childWindows.asInstanceOf[js.Any], mainWindow = mainWindow.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowInfo]
    }
    
    extension [Self <: WindowInfo](x: Self) {
      
      inline def setChildWindows(value: js.Array[WindowDetail]): Self = StObject.set(x, "childWindows", value.asInstanceOf[js.Any])
      
      inline def setChildWindowsVarargs(value: WindowDetail*): Self = StObject.set(x, "childWindows", js.Array(value :_*))
      
      inline def setMainWindow(value: WindowDetail): Self = StObject.set(x, "mainWindow", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
