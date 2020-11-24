package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateTreeResponseData extends js.Object {
  
  var sha: String = js.native
  
  var tree: js.Array[Mode] = js.native
  
  var url: String = js.native
}
object GitCreateTreeResponseData {
  
  @scala.inline
  def apply(sha: String, tree: js.Array[Mode], url: String): GitCreateTreeResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeResponseData]
  }
  
  @scala.inline
  implicit class GitCreateTreeResponseDataOps[Self <: GitCreateTreeResponseData] (val x: Self) extends AnyVal {
    
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
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: Mode*): Self = this.set("tree", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: js.Array[Mode]): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
