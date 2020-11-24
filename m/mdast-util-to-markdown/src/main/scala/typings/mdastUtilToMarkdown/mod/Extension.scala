package typings.mdastUtilToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends js.Object {
  
  var handlers: js.UndefOr[Handlers] = js.native
  
  var join: js.UndefOr[js.Array[Join]] = js.native
  
  var unsafe: js.UndefOr[js.Array[Unsafe]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: Handlers): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setJoinVarargs(value: Join*): Self = this.set("join", js.Array(value :_*))
    
    @scala.inline
    def setJoin(value: js.Array[Join]): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    
    @scala.inline
    def setUnsafeVarargs(value: Unsafe*): Self = this.set("unsafe", js.Array(value :_*))
    
    @scala.inline
    def setUnsafe(value: js.Array[Unsafe]): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
}
