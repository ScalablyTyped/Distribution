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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFStructureContent] (val x: Self) extends AnyVal {
    
    inline def setPush(value: PDFStructureContent => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
