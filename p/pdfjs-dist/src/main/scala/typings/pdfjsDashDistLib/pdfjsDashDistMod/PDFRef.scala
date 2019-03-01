package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRef extends js.Object {
  var gen: js.Any
  var num: scala.Double
}

object PDFRef {
  @scala.inline
  def apply(gen: js.Any, num: scala.Double): PDFRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gen")(gen)
    __obj.updateDynamic("num")(num)
    __obj.asInstanceOf[PDFRef]
  }
}

