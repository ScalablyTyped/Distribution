package typings.nwJs

import typings.nwJs.mod.global.NWJSHelpers.CookiesOnChangedCallbackChangeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddListener extends StObject {
    
    /**
      * Add a new listener for onChanged event.
      *
      * @param callback {function(changeInfo?)} The callback when cookie has been changed.
      * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
      */
    def addListener(callback: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit]): Unit
  }
  object AddListener {
    
    inline def apply(addListener: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): AddListener = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
      __obj.asInstanceOf[AddListener]
    }
    
    extension [Self <: AddListener](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
