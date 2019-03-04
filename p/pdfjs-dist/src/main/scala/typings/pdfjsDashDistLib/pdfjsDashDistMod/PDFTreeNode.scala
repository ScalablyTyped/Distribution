package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFTreeNode extends js.Object {
  var bold: scala.Boolean
  var color: js.Array[scala.Double]
   // [r,g,b]
  var dest: js.Any
  var italic: scala.Boolean
  var items: js.Array[PDFTreeNode]
  var title: java.lang.String
}

object PDFTreeNode {
  @scala.inline
  def apply(
    bold: scala.Boolean,
    color: js.Array[scala.Double],
    dest: js.Any,
    italic: scala.Boolean,
    items: js.Array[PDFTreeNode],
    title: java.lang.String
  ): PDFTreeNode = {
    val __obj = js.Dynamic.literal(bold = bold, color = color, dest = dest, italic = italic, items = items, title = title)
  
    __obj.asInstanceOf[PDFTreeNode]
  }
}

