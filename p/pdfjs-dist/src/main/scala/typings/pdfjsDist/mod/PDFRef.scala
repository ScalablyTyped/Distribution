package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRef extends js.Object {
  var gen: js.Any
  var num: Double
}

object PDFRef {
  @scala.inline
  def apply(gen: js.Any, num: Double): PDFRef = {
    val __obj = js.Dynamic.literal(gen = gen.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRef]
  }
}

