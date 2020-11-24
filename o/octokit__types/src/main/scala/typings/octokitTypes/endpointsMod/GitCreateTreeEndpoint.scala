package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateTreeEndpoint extends js.Object {
  
  /**
    * The SHA1 of the tree you want to update with new data. If you don't set this, the commit will be created on top of everything; however, it will only contain your change, the rest of your files will show up as deleted.
    */
  var base_tree: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
    */
  var tree: js.Array[GitCreateTreeParamsTree] = js.native
}
object GitCreateTreeEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, tree: js.Array[GitCreateTreeParamsTree]): GitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeEndpoint]
  }
  
  @scala.inline
  implicit class GitCreateTreeEndpointOps[Self <: GitCreateTreeEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeVarargs(value: GitCreateTreeParamsTree*): Self = this.set("tree", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: js.Array[GitCreateTreeParamsTree]): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_tree(value: String): Self = this.set("base_tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase_tree: Self = this.set("base_tree", js.undefined)
  }
}
