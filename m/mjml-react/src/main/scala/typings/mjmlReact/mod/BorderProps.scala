package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderProps extends js.Object {
  
  var border: js.UndefOr[String] = js.native
  
  var borderBottom: js.UndefOr[String] = js.native
  
  var borderLeft: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var borderRight: js.UndefOr[String] = js.native
  
  var borderTop: js.UndefOr[String] = js.native
}
object BorderProps {
  
  @scala.inline
  def apply(): BorderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps]
  }
  
  @scala.inline
  implicit class BorderPropsOps[Self <: BorderProps] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: String): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: String): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRight(value: String): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: String): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
  }
}
