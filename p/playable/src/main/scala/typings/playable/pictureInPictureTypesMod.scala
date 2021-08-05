package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureTypesMod {
  
  trait IPictureInPicture extends StObject {
    
    def destroy(): Unit
    
    def disablePictureInPicture(): Unit
    
    def enablePictureInPicture(): Unit
    
    def enterPictureInPicture(): Unit
    
    def exitPictureInPicture(): Unit
    
    var isEnabled: Boolean
    
    var isInPictureInPicture: Boolean
  }
  object IPictureInPicture {
    
    inline def apply(
      destroy: () => Unit,
      disablePictureInPicture: () => Unit,
      enablePictureInPicture: () => Unit,
      enterPictureInPicture: () => Unit,
      exitPictureInPicture: () => Unit,
      isEnabled: Boolean,
      isInPictureInPicture: Boolean
    ): IPictureInPicture = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disablePictureInPicture = js.Any.fromFunction0(disablePictureInPicture), enablePictureInPicture = js.Any.fromFunction0(enablePictureInPicture), enterPictureInPicture = js.Any.fromFunction0(enterPictureInPicture), exitPictureInPicture = js.Any.fromFunction0(exitPictureInPicture), isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPicture]
    }
    
    extension [Self <: IPictureInPicture](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisablePictureInPicture(value: () => Unit): Self = StObject.set(x, "disablePictureInPicture", js.Any.fromFunction0(value))
      
      inline def setEnablePictureInPicture(value: () => Unit): Self = StObject.set(x, "enablePictureInPicture", js.Any.fromFunction0(value))
      
      inline def setEnterPictureInPicture(value: () => Unit): Self = StObject.set(x, "enterPictureInPicture", js.Any.fromFunction0(value))
      
      inline def setExitPictureInPicture(value: () => Unit): Self = StObject.set(x, "exitPictureInPicture", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPictureInPictureAPI extends StObject {
    
    var disablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enterPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var exitPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var isInPictureInPicture: js.UndefOr[Boolean] = js.undefined
  }
  object IPictureInPictureAPI {
    
    inline def apply(): IPictureInPictureAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPictureInPictureAPI]
    }
    
    extension [Self <: IPictureInPictureAPI](x: Self) {
      
      inline def setDisablePictureInPicture(value: () => Unit): Self = StObject.set(x, "disablePictureInPicture", js.Any.fromFunction0(value))
      
      inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
      
      inline def setEnablePictureInPicture(value: () => Unit): Self = StObject.set(x, "enablePictureInPicture", js.Any.fromFunction0(value))
      
      inline def setEnablePictureInPictureUndefined: Self = StObject.set(x, "enablePictureInPicture", js.undefined)
      
      inline def setEnterPictureInPicture(value: () => Unit): Self = StObject.set(x, "enterPictureInPicture", js.Any.fromFunction0(value))
      
      inline def setEnterPictureInPictureUndefined: Self = StObject.set(x, "enterPictureInPicture", js.undefined)
      
      inline def setExitPictureInPicture(value: () => Unit): Self = StObject.set(x, "exitPictureInPicture", js.Any.fromFunction0(value))
      
      inline def setExitPictureInPictureUndefined: Self = StObject.set(x, "exitPictureInPicture", js.undefined)
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPictureUndefined: Self = StObject.set(x, "isInPictureInPicture", js.undefined)
    }
  }
  
  trait IPictureInPictureHelper extends StObject {
    
    def destroy(): Unit
    
    def exit(): Unit
    
    var isEnabled: Boolean
    
    var isInPictureInPicture: Boolean
    
    def request(): Unit
  }
  object IPictureInPictureHelper {
    
    inline def apply(
      destroy: () => Unit,
      exit: () => Unit,
      isEnabled: Boolean,
      isInPictureInPicture: Boolean,
      request: () => Unit
    ): IPictureInPictureHelper = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exit = js.Any.fromFunction0(exit), isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any], request = js.Any.fromFunction0(request))
      __obj.asInstanceOf[IPictureInPictureHelper]
    }
    
    extension [Self <: IPictureInPictureHelper](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: () => Unit): Self = StObject.set(x, "request", js.Any.fromFunction0(value))
    }
  }
}
