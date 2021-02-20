package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFullSizeTypesMod {
  
  @js.native
  trait IPreviewFullSize extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def showAt(second: Double): Unit = js.native
  }
  object IPreviewFullSize {
    
    @scala.inline
    def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, showAt: Double => Unit): IPreviewFullSize = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt))
      __obj.asInstanceOf[IPreviewFullSize]
    }
    
    @scala.inline
    implicit class IPreviewFullSizeMutableBuilder[Self <: IPreviewFullSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowAt(value: Double => Unit): Self = StObject.set(x, "showAt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IPreviewFullSizeViewStyles extends StObject {
    
    var container: String = js.native
    
    var frame: String = js.native
    
    var hidden: String = js.native
  }
  object IPreviewFullSizeViewStyles {
    
    @scala.inline
    def apply(container: String, frame: String, hidden: String): IPreviewFullSizeViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreviewFullSizeViewStyles]
    }
    
    @scala.inline
    implicit class IPreviewFullSizeViewStylesMutableBuilder[Self <: IPreviewFullSizeViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
