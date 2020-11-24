package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubflowInputs extends js.Object {
  
  var links: js.Array[js.Object] = js.native
  
  var subflowInputs: js.Array[js.Object] = js.native
}
object SubflowInputs {
  
  @scala.inline
  def apply(links: js.Array[js.Object], subflowInputs: js.Array[js.Object]): SubflowInputs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], subflowInputs = subflowInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowInputs]
  }
  
  @scala.inline
  implicit class SubflowInputsOps[Self <: SubflowInputs] (val x: Self) extends AnyVal {
    
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
    def setLinksVarargs(value: js.Object*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowInputsVarargs(value: js.Object*): Self = this.set("subflowInputs", js.Array(value :_*))
    
    @scala.inline
    def setSubflowInputs(value: js.Array[js.Object]): Self = this.set("subflowInputs", value.asInstanceOf[js.Any])
  }
}
