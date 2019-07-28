package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchRequiredStatusChecksResponse extends js.Object {
  var contexts: js.Array[String]
  var contexts_url: String
  var strict: Boolean
  var url: String
}

object ReposGetProtectedBranchRequiredStatusChecksResponse {
  @scala.inline
  def apply(contexts: js.Array[String], contexts_url: String, strict: Boolean, url: String): ReposGetProtectedBranchRequiredStatusChecksResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts, contexts_url = contexts_url, strict = strict, url = url)
  
    __obj.asInstanceOf[ReposGetProtectedBranchRequiredStatusChecksResponse]
  }
}

