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
  
  @scala.inline
  def apply(appendText: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
  
  @scala.inline
  implicit class PDFRenderTextLayerMutableBuilder[Self <: PDFRenderTextLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendText(value: () => Unit): Self = StObject.set(x, "appendText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginLayout(value: () => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndLayout(value: () => Unit): Self = StObject.set(x, "endLayout", js.Any.fromFunction0(value))
  }
}
