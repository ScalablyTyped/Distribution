package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateBlob extends js.Object {
  var createBlob: AnonMethodParamsUrlAnonContent
  var createCommit: AnonMethodParamsUrlAnonAuthor
  var createRef: AnonMethodParamsUrlAnonOwnerRef
  var createTag: AnonMethodParamsUrlAnonMessage
  var createTree: AnonMethodParamsUrlAnonBasetree
  var deleteRef: AnonMethodParamsUrlAnonOwnerRefRepo
  var getBlob: AnonMethodParamsUrlAnonFilesha
  var getCommit: AnonMethodParamsUrlAnonCommitsha
  var getRef: AnonMethodParamsUrlAnonOwnerRefRepo
  var getTag: AnonMethodParamsUrlAnonOwnerRepoTagsha
  var getTree: AnonMethodParamsUrlAnonOwnerRecursive
  var listMatchingRefs: AnonMethodParamsUrlAnonOwnerPagePerpageRef
  var listRefs: AnonMethodParamsUrlAnonNamespace
  var updateRef: AnonMethodParamsUrlAnonForce
}

object AnonCreateBlob {
  @scala.inline
  def apply(
    createBlob: AnonMethodParamsUrlAnonContent,
    createCommit: AnonMethodParamsUrlAnonAuthor,
    createRef: AnonMethodParamsUrlAnonOwnerRef,
    createTag: AnonMethodParamsUrlAnonMessage,
    createTree: AnonMethodParamsUrlAnonBasetree,
    deleteRef: AnonMethodParamsUrlAnonOwnerRefRepo,
    getBlob: AnonMethodParamsUrlAnonFilesha,
    getCommit: AnonMethodParamsUrlAnonCommitsha,
    getRef: AnonMethodParamsUrlAnonOwnerRefRepo,
    getTag: AnonMethodParamsUrlAnonOwnerRepoTagsha,
    getTree: AnonMethodParamsUrlAnonOwnerRecursive,
    listMatchingRefs: AnonMethodParamsUrlAnonOwnerPagePerpageRef,
    listRefs: AnonMethodParamsUrlAnonNamespace,
    updateRef: AnonMethodParamsUrlAnonForce
  ): AnonCreateBlob = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], listRefs = listRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreateBlob]
  }
}

