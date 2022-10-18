package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewFullSizeTypesMod {
  
  trait IPreviewFullSize extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def showAt(second: Double): Unit
  }
  object IPreviewFullSize {
    
    inline def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, showAt: Double => Unit): IPreviewFullSize = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt))
      __obj.asInstanceOf[IPreviewFullSize]
    }
    
    extension [Self <: IPreviewFullSize](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShowAt(value: Double => Unit): Self = StObject.set(x, "showAt", js.Any.fromFunction1(value))
    }
  }
  
  trait IPreviewFullSizeViewStyles extends StObject {
    
    var container: String
    
    var frame: String
    
    var hidden: String
  }
  object IPreviewFullSizeViewStyles {
    
    inline def apply(container: String, frame: String, hidden: String): IPreviewFullSizeViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreviewFullSizeViewStyles]
    }
    
    extension [Self <: IPreviewFullSizeViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
