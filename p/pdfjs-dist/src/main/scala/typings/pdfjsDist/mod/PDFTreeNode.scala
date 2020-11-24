package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFTreeNode extends js.Object {
  
  var bold: Boolean = js.native
  
  var color: js.Array[Double] = js.native
  
   // [r,g,b]
  var dest: js.Any = js.native
  
  var italic: Boolean = js.native
  
  var items: js.Array[PDFTreeNode] = js.native
  
  var title: String = js.native
}
object PDFTreeNode {
  
  @scala.inline
  def apply(
    bold: Boolean,
    color: js.Array[Double],
    dest: js.Any,
    italic: Boolean,
    items: js.Array[PDFTreeNode],
    title: String
  ): PDFTreeNode = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFTreeNode]
  }
  
  @scala.inline
  implicit class PDFTreeNodeOps[Self <: PDFTreeNode] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDest(value: js.Any): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PDFTreeNode*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PDFTreeNode]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
