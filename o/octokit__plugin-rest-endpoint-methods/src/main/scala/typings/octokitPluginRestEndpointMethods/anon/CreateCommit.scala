package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommit extends js.Object {
  var createBlob: `691` = js.native
  var createCommit: `692` = js.native
  var createRef: `693` = js.native
  var createTag: `694` = js.native
  var createTree: `695` = js.native
  var deleteRef: `696` = js.native
  var getBlob: `697` = js.native
  var getCommit: `698` = js.native
  var getRef: `699` = js.native
  var getTag: `700` = js.native
  var getTree: `701` = js.native
  var listMatchingRefs: `702` = js.native
  var updateRef: `703` = js.native
}

object CreateCommit {
  @scala.inline
  def apply(
    createBlob: `691`,
    createCommit: `692`,
    createRef: `693`,
    createTag: `694`,
    createTree: `695`,
    deleteRef: `696`,
    getBlob: `697`,
    getCommit: `698`,
    getRef: `699`,
    getTag: `700`,
    getTree: `701`,
    listMatchingRefs: `702`,
    updateRef: `703`
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
    def setCreateBlob(value: `691`): Self = this.set("createBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateCommit(value: `692`): Self = this.set("createCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateRef(value: `693`): Self = this.set("createRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTag(value: `694`): Self = this.set("createTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTree(value: `695`): Self = this.set("createTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteRef(value: `696`): Self = this.set("deleteRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBlob(value: `697`): Self = this.set("getBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommit(value: `698`): Self = this.set("getCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRef(value: `699`): Self = this.set("getRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTag(value: `700`): Self = this.set("getTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTree(value: `701`): Self = this.set("getTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setListMatchingRefs(value: `702`): Self = this.set("listMatchingRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateRef(value: `703`): Self = this.set("updateRef", value.asInstanceOf[js.Any])
  }
  
}

