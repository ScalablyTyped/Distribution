package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOfContent extends js.Object {
  
  var id: js.UndefOr[String] = js.native
  
  var numberStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var textMargin: js.UndefOr[Margins] = js.native
  
  var textStyle: js.UndefOr[String | js.Array[String] | Style] = js.native
  
  var title: js.UndefOr[Content] = js.native
}
object TableOfContent {
  
  @scala.inline
  def apply(): TableOfContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOfContent]
  }
  
  @scala.inline
  implicit class TableOfContentOps[Self <: TableOfContent] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNumberStyleVarargs(value: String*): Self = this.set("numberStyle", js.Array(value :_*))
    
    @scala.inline
    def setNumberStyle(value: String | js.Array[String] | Style): Self = this.set("numberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberStyle: Self = this.set("numberStyle", js.undefined)
    
    @scala.inline
    def setTextMargin(value: Margins): Self = this.set("textMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMargin: Self = this.set("textMargin", js.undefined)
    
    @scala.inline
    def setTextStyleVarargs(value: String*): Self = this.set("textStyle", js.Array(value :_*))
    
    @scala.inline
    def setTextStyle(value: String | js.Array[String] | Style): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: Content): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
