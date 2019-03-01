package typings
package pdfjsDashDistLib.pdfjsDashDistMod

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
  def normalizeRect(rect: js.Array[scala.Double]): js.Array[scala.Double]
}

object PDFJSUtilStatic {
  @scala.inline
  def apply(normalizeRect: js.Function1[js.Array[scala.Double], js.Array[scala.Double]]): PDFJSUtilStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("normalizeRect")(normalizeRect)
    __obj.asInstanceOf[PDFJSUtilStatic]
  }
}

