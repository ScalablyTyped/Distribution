package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PDFStructureContent */
trait PDFStructureContent
  extends StObject
     with _PDFStructureElementChild {
  
  def push(structContent: PDFStructureContent): Unit
}
object PDFStructureContent {
  
  inline def apply(push: PDFStructureContent => Unit): PDFStructureContent = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[PDFStructureContent]
  }
  
  extension [Self <: PDFStructureContent](x: Self) {
    
    inline def setPush(value: PDFStructureContent => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
