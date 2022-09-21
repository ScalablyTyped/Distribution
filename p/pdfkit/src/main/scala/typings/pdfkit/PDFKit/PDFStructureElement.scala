package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PDFStructureElement */
trait PDFStructureElement
  extends StObject
     with _PDFStructureElementChild {
  
  def add(el: PDFStructureElementChild): PDFStructureElement
  
  def end(): Unit
  
  def setAttached(): Unit
  
  def setParent(parentRef: PDFKitReference): Unit
}
object PDFStructureElement {
  
  inline def apply(
    add: PDFStructureElementChild => PDFStructureElement,
    end: () => Unit,
    setAttached: () => Unit,
    setParent: PDFKitReference => Unit
  ): PDFStructureElement = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), end = js.Any.fromFunction0(end), setAttached = js.Any.fromFunction0(setAttached), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[PDFStructureElement]
  }
  
  extension [Self <: PDFStructureElement](x: Self) {
    
    inline def setAdd(value: PDFStructureElementChild => PDFStructureElement): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setSetAttached(value: () => Unit): Self = StObject.set(x, "setAttached", js.Any.fromFunction0(value))
    
    inline def setSetParent(value: PDFKitReference => Unit): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
  }
}
