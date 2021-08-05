package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFRenderImageLayer extends StObject {
  
  def appendImage(): Unit
  
  def beginLayout(): Unit
  
  def endLayout(): Unit
}
object PDFRenderImageLayer {
  
  inline def apply(appendImage: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal(appendImage = js.Any.fromFunction0(appendImage), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
  
  extension [Self <: PDFRenderImageLayer](x: Self) {
    
    inline def setAppendImage(value: () => Unit): Self = StObject.set(x, "appendImage", js.Any.fromFunction0(value))
    
    inline def setBeginLayout(value: () => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction0(value))
    
    inline def setEndLayout(value: () => Unit): Self = StObject.set(x, "endLayout", js.Any.fromFunction0(value))
  }
}
