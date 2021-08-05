package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFRenderTextLayer extends StObject {
  
  def appendText(): Unit
  
  def beginLayout(): Unit
  
  def endLayout(): Unit
}
object PDFRenderTextLayer {
  
  inline def apply(appendText: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
  
  extension [Self <: PDFRenderTextLayer](x: Self) {
    
    inline def setAppendText(value: () => Unit): Self = StObject.set(x, "appendText", js.Any.fromFunction0(value))
    
    inline def setBeginLayout(value: () => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction0(value))
    
    inline def setEndLayout(value: () => Unit): Self = StObject.set(x, "endLayout", js.Any.fromFunction0(value))
  }
}
