package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewThumbnailTypesMod {
  
  trait IPreviewThumbnail extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def setTime(time: String): Unit
    
    def showAt(second: Double): Unit
  }
  object IPreviewThumbnail {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      setTime: String => Unit,
      showAt: Double => Unit
    ): IPreviewThumbnail = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), setTime = js.Any.fromFunction1(setTime), showAt = js.Any.fromFunction1(showAt))
      __obj.asInstanceOf[IPreviewThumbnail]
    }
    
    extension [Self <: IPreviewThumbnail](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setSetTime(value: String => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
      
      inline def setShowAt(value: Double => Unit): Self = StObject.set(x, "showAt", js.Any.fromFunction1(value))
    }
  }
  
  trait IPreviewThumbnailViewStyles extends StObject {
    
    var container: String
    
    var empty: String
    
    var highQualityFrame: String
    
    var lowQualityFrame: String
    
    var thumbText: String
  }
  object IPreviewThumbnailViewStyles {
    
    inline def apply(
      container: String,
      empty: String,
      highQualityFrame: String,
      lowQualityFrame: String,
      thumbText: String
    ): IPreviewThumbnailViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], highQualityFrame = highQualityFrame.asInstanceOf[js.Any], lowQualityFrame = lowQualityFrame.asInstanceOf[js.Any], thumbText = thumbText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreviewThumbnailViewStyles]
    }
    
    extension [Self <: IPreviewThumbnailViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setHighQualityFrame(value: String): Self = StObject.set(x, "highQualityFrame", value.asInstanceOf[js.Any])
      
      inline def setLowQualityFrame(value: String): Self = StObject.set(x, "lowQualityFrame", value.asInstanceOf[js.Any])
      
      inline def setThumbText(value: String): Self = StObject.set(x, "thumbText", value.asInstanceOf[js.Any])
    }
  }
}
