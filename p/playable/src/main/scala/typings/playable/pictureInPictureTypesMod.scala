package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureTypesMod {
  
  @js.native
  trait IPictureInPicture extends StObject {
    
    def destroy(): Unit = js.native
    
    def disablePictureInPicture(): Unit = js.native
    
    def enablePictureInPicture(): Unit = js.native
    
    def enterPictureInPicture(): Unit = js.native
    
    def exitPictureInPicture(): Unit = js.native
    
    var isEnabled: Boolean = js.native
    
    var isInPictureInPicture: Boolean = js.native
  }
  object IPictureInPicture {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IPictureInPictureMutableBuilder[Self <: IPictureInPicture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisablePictureInPicture(value: () => Unit): Self = StObject.set(x, "disablePictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnablePictureInPicture(value: () => Unit): Self = StObject.set(x, "enablePictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnterPictureInPicture(value: () => Unit): Self = StObject.set(x, "enterPictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExitPictureInPicture(value: () => Unit): Self = StObject.set(x, "exitPictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPictureInPictureAPI extends StObject {
    
    var disablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
    
    var enablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
    
    var enterPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
    
    var exitPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.native
    
    var isInPictureInPicture: js.UndefOr[Boolean] = js.native
  }
  object IPictureInPictureAPI {
    
    @scala.inline
    def apply(): IPictureInPictureAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPictureInPictureAPI]
    }
    
    @scala.inline
    implicit class IPictureInPictureAPIMutableBuilder[Self <: IPictureInPictureAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePictureInPicture(value: () => Unit): Self = StObject.set(x, "disablePictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
      
      @scala.inline
      def setEnablePictureInPicture(value: () => Unit): Self = StObject.set(x, "enablePictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnablePictureInPictureUndefined: Self = StObject.set(x, "enablePictureInPicture", js.undefined)
      
      @scala.inline
      def setEnterPictureInPicture(value: () => Unit): Self = StObject.set(x, "enterPictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnterPictureInPictureUndefined: Self = StObject.set(x, "enterPictureInPicture", js.undefined)
      
      @scala.inline
      def setExitPictureInPicture(value: () => Unit): Self = StObject.set(x, "exitPictureInPicture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExitPictureInPictureUndefined: Self = StObject.set(x, "exitPictureInPicture", js.undefined)
      
      @scala.inline
      def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInPictureInPictureUndefined: Self = StObject.set(x, "isInPictureInPicture", js.undefined)
    }
  }
  
  @js.native
  trait IPictureInPictureHelper extends StObject {
    
    def destroy(): Unit = js.native
    
    def exit(): Unit = js.native
    
    var isEnabled: Boolean = js.native
    
    var isInPictureInPicture: Boolean = js.native
    
    def request(): Unit = js.native
  }
  object IPictureInPictureHelper {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      exit: () => Unit,
      isEnabled: Boolean,
      isInPictureInPicture: Boolean,
      request: () => Unit
    ): IPictureInPictureHelper = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exit = js.Any.fromFunction0(exit), isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any], request = js.Any.fromFunction0(request))
      __obj.asInstanceOf[IPictureInPictureHelper]
    }
    
    @scala.inline
    implicit class IPictureInPictureHelperMutableBuilder[Self <: IPictureInPictureHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: () => Unit): Self = StObject.set(x, "request", js.Any.fromFunction0(value))
    }
  }
}
