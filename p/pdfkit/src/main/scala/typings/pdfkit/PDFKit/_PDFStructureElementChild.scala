package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _PDFStructureElementChild extends StObject
object _PDFStructureElementChild {
  
  inline def PDFStructureContent(push: typings.pdfkit.PDFKit.PDFStructureContent => Unit): typings.pdfkit.PDFKit.PDFStructureContent = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[typings.pdfkit.PDFKit.PDFStructureContent]
  }
  
  inline def PDFStructureElement(
    add: PDFStructureElementChild => typings.pdfkit.PDFKit.PDFStructureElement,
    end: () => Unit,
    setAttached: () => Unit,
    setParent: PDFKitReference => Unit
  ): typings.pdfkit.PDFKit.PDFStructureElement = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), end = js.Any.fromFunction0(end), setAttached = js.Any.fromFunction0(setAttached), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[typings.pdfkit.PDFKit.PDFStructureElement]
  }
}
