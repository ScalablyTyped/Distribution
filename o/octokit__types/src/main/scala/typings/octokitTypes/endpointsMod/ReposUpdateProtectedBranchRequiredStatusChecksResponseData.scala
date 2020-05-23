package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksResponseData extends js.Object {
  var contexts: js.Array[String]
  var contexts_url: String
  var strict: Boolean
  var url: String
}

object ReposUpdateProtectedBranchRequiredStatusChecksResponseData {
  @scala.inline
  def apply(contexts: js.Array[String], contexts_url: String, strict: Boolean, url: String): ReposUpdateProtectedBranchRequiredStatusChecksResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], contexts_url = contexts_url.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksResponseData]
  }
}

