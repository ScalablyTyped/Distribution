package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFJSUtilStatic extends js.Object {
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
}

