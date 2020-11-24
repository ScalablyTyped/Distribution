package typings.minappEnv.App

import typings.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageNotFoundOption extends js.Object {
  
  /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
  var isEntryPage: Boolean = js.native
  
  /** 不存在页面的路径 */
  var path: String = js.native
  
  /** 打开不存在页面的 query */
  var query: IAnyObject = js.native
}
object IPageNotFoundOption {
  
  @scala.inline
  def apply(isEntryPage: Boolean, path: String, query: IAnyObject): IPageNotFoundOption = {
    val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageNotFoundOption]
  }
  
  @scala.inline
  implicit class IPageNotFoundOptionOps[Self <: IPageNotFoundOption] (val x: Self) extends AnyVal {
    
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
    def setIsEntryPage(value: Boolean): Self = this.set("isEntryPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: IAnyObject): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
