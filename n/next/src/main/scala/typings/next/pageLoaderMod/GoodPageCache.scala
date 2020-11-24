package typings.next.pageLoaderMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoodPageCache extends js.Object {
  
  var mod: js.Any = js.native
  
  var page: ComponentType[js.Object] = js.native
  
  var styleSheets: js.Array[StyleSheetTuple] = js.native
}
object GoodPageCache {
  
  @scala.inline
  def apply(mod: js.Any, page: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): GoodPageCache = {
    val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoodPageCache]
  }
  
  @scala.inline
  implicit class GoodPageCacheOps[Self <: GoodPageCache] (val x: Self) extends AnyVal {
    
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
    def setMod(value: js.Any): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: ComponentType[js.Object]): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = this.set("styleSheets", js.Array(value :_*))
    
    @scala.inline
    def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = this.set("styleSheets", value.asInstanceOf[js.Any])
  }
}
