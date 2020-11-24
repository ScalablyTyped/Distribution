package typings.minappEnv.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabItemTapOption extends js.Object {
  
  /** 被点击tabItem的序号，从0开始，最低基础库： `1.9.0` */
  var index: String = js.native
  
  /** 被点击tabItem的页面路径，最低基础库： `1.9.0` */
  var pagePath: String = js.native
  
  /** 被点击tabItem的按钮文字，最低基础库： `1.9.0` */
  var text: String = js.native
}
object ITabItemTapOption {
  
  @scala.inline
  def apply(index: String, pagePath: String, text: String): ITabItemTapOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabItemTapOption]
  }
  
  @scala.inline
  implicit class ITabItemTapOptionOps[Self <: ITabItemTapOption] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePath(value: String): Self = this.set("pagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
