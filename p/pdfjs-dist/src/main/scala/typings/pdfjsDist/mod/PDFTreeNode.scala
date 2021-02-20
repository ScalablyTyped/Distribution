package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFTreeNode extends StObject {
  
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
  implicit class PDFTreeNodeMutableBuilder[Self <: PDFTreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDest(value: js.Any): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[PDFTreeNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PDFTreeNode*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
