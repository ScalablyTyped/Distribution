package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptDefinition extends PropertyDefinition {
  
  var exec: js.UndefOr[String | js.Array[String]] = js.native
  
  var src: js.UndefOr[String | Url] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ScriptDefinition {
  
  @scala.inline
  def apply(): ScriptDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptDefinition]
  }
  
  @scala.inline
  implicit class ScriptDefinitionOps[Self <: ScriptDefinition] (val x: Self) extends AnyVal {
    
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
    def setExecVarargs(value: String*): Self = this.set("exec", js.Array(value :_*))
    
    @scala.inline
    def setExec(value: String | js.Array[String]): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setSrc(value: String | Url): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
