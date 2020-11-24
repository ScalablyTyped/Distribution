package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFJSUtilStatic extends js.Object {
  
  /**
    * Normalize rectangle so that (x1,y1) < (x2,y2)
    * @param {number[]} rect - the rectangle with [x1,y1,x2,y2]
    *
    * For coordinate systems whose origin lies in the bottom-left, this
    * means normalization to (BL,TR) ordering. For systems with origin in the
    * top-left, this means (TL,BR) ordering.
    **/
  def normalizeRect(rect: js.Array[Double]): js.Array[Double] = js.native
}
object PDFJSUtilStatic {
  
  @scala.inline
  def apply(normalizeRect: js.Array[Double] => js.Array[Double]): PDFJSUtilStatic = {
    val __obj = js.Dynamic.literal(normalizeRect = js.Any.fromFunction1(normalizeRect))
    __obj.asInstanceOf[PDFJSUtilStatic]
  }
  
  @scala.inline
  implicit class PDFJSUtilStaticOps[Self <: PDFJSUtilStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizeRect(value: js.Array[Double] => js.Array[Double]): Self = this.set("normalizeRect", js.Any.fromFunction1(value))
  }
}
