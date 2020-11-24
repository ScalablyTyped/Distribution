package typings.miniprogram

import typings.miniprogram.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiLevelSelectArgs extends AsyncCallback[Result] {
  
  var list: js.Array[_] = js.native
  
  var name: String = js.native
  
  var subList: js.UndefOr[js.Array[_]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object MultiLevelSelectArgs {
  
  @scala.inline
  def apply(list: js.Array[_], name: String): MultiLevelSelectArgs = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectArgs]
  }
  
  @scala.inline
  implicit class MultiLevelSelectArgsOps[Self <: MultiLevelSelectArgs] (val x: Self) extends AnyVal {
    
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
    def setListVarargs(value: js.Any*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[_]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubListVarargs(value: js.Any*): Self = this.set("subList", js.Array(value :_*))
    
    @scala.inline
    def setSubList(value: js.Array[_]): Self = this.set("subList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubList: Self = this.set("subList", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
