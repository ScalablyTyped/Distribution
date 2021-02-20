package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastManagerTypesMod {
  
  @js.native
  trait IChromecastManager extends StObject {
    
    def destroy(): Unit = js.native
    
    var isCasting: Boolean = js.native
    
    var isEnabled: Boolean = js.native
  }
  object IChromecastManager {
    
    @scala.inline
    def apply(destroy: () => Unit, isCasting: Boolean, isEnabled: Boolean): IChromecastManager = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastManager]
    }
    
    @scala.inline
    implicit class IChromecastManagerMutableBuilder[Self <: IChromecastManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCasting(value: Boolean): Self = StObject.set(x, "isCasting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
