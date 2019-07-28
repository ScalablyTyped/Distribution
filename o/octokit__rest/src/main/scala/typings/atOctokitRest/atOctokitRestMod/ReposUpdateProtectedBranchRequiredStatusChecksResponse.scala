package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchRequiredStatusChecksResponse extends js.Object {
  var contexts: js.Array[String]
  var contexts_url: String
  var strict: Boolean
  var url: String
}

object ReposUpdateProtectedBranchRequiredStatusChecksResponse {
  @scala.inline
  def apply(contexts: js.Array[String], contexts_url: String, strict: Boolean, url: String): ReposUpdateProtectedBranchRequiredStatusChecksResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts, contexts_url = contexts_url, strict = strict, url = url)
  
    __obj.asInstanceOf[ReposUpdateProtectedBranchRequiredStatusChecksResponse]
  }
}

