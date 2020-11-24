package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCommit extends js.Object {
  
  var createBlob: `697` = js.native
  
  var createCommit: `698` = js.native
  
  var createRef: `699` = js.native
  
  var createTag: `700` = js.native
  
  var createTree: `701` = js.native
  
  var deleteRef: `702` = js.native
  
  var getBlob: `703` = js.native
  
  var getCommit: `704` = js.native
  
  var getRef: `705` = js.native
  
  var getTag: `706` = js.native
  
  var getTree: `707` = js.native
  
  var listMatchingRefs: `708` = js.native
  
  var updateRef: `709` = js.native
}
object CreateCommit {
  
  @scala.inline
  def apply(
    createBlob: `697`,
    createCommit: `698`,
    createRef: `699`,
    createTag: `700`,
    createTree: `701`,
    deleteRef: `702`,
    getBlob: `703`,
    getCommit: `704`,
    getRef: `705`,
    getTag: `706`,
    getTree: `707`,
    listMatchingRefs: `708`,
    updateRef: `709`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  @scala.inline
  implicit class CreateCommitOps[Self <: CreateCommit] (val x: Self) extends AnyVal {
    
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
    def setCreateBlob(value: `697`): Self = this.set("createBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCommit(value: `698`): Self = this.set("createCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRef(value: `699`): Self = this.set("createRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTag(value: `700`): Self = this.set("createTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTree(value: `701`): Self = this.set("createTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRef(value: `702`): Self = this.set("deleteRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBlob(value: `703`): Self = this.set("getBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCommit(value: `704`): Self = this.set("getCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRef(value: `705`): Self = this.set("getRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTag(value: `706`): Self = this.set("getTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTree(value: `707`): Self = this.set("getTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMatchingRefs(value: `708`): Self = this.set("listMatchingRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRef(value: `709`): Self = this.set("updateRef", value.asInstanceOf[js.Any])
  }
}
