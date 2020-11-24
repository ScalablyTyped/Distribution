package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTocItem
  extends ContentBase
     with _Content {
  
  var text: String | ContentTocItem = js.native
  
  var tocItem: Boolean | String | js.Array[String] = js.native
  
  var tocMargin: js.UndefOr[Margins] = js.native
  
  var tocNumberStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var tocStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
}
object ContentTocItem {
  
  @scala.inline
  def apply(text: String | ContentTocItem, tocItem: Boolean | String | js.Array[String]): ContentTocItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tocItem = tocItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTocItem]
  }
  
  @scala.inline
  implicit class ContentTocItemOps[Self <: ContentTocItem] (val x: Self) extends AnyVal {
    
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
    def setText(value: String | ContentTocItem): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocItemVarargs(value: String*): Self = this.set("tocItem", js.Array(value :_*))
    
    @scala.inline
    def setTocItem(value: Boolean | String | js.Array[String]): Self = this.set("tocItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocMargin(value: Margins): Self = this.set("tocMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocMargin: Self = this.set("tocMargin", js.undefined)
    
    @scala.inline
    def setTocNumberStyleVarargs(value: String*): Self = this.set("tocNumberStyle", js.Array(value :_*))
    
    @scala.inline
    def setTocNumberStyle(value: String | js.Array[String] | Style): Self = this.set("tocNumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocNumberStyle: Self = this.set("tocNumberStyle", js.undefined)
    
    @scala.inline
    def setTocStyleVarargs(value: String*): Self = this.set("tocStyle", js.Array(value :_*))
    
    @scala.inline
    def setTocStyle(value: String | js.Array[String] | Style): Self = this.set("tocStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocStyle: Self = this.set("tocStyle", js.undefined)
  }
}
