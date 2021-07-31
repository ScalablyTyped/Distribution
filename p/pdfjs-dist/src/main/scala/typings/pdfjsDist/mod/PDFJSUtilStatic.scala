package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFJSUtilStatic extends StObject {
  
  /**
    * Normalize rectangle so that (x1,y1) < (x2,y2)
    * @param {number[]} rect - the rectangle with [x1,y1,x2,y2]
    *
    * For coordinate systems whose origin lies in the bottom-left, this
    * means normalization to (BL,TR) ordering. For systems with origin in the
    * top-left, this means (TL,BR) ordering.
    **/
  def normalizeRect(rect: js.Array[Double]): js.Array[Double]
}
object PDFJSUtilStatic {
  
  @scala.inline
  def apply(normalizeRect: js.Array[Double] => js.Array[Double]): PDFJSUtilStatic = {
    val __obj = js.Dynamic.literal(normalizeRect = js.Any.fromFunction1(normalizeRect))
    __obj.asInstanceOf[PDFJSUtilStatic]
  }
  
  @scala.inline
  implicit class PDFJSUtilStaticMutableBuilder[Self <: PDFJSUtilStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizeRect(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "normalizeRect", js.Any.fromFunction1(value))
  }
}
