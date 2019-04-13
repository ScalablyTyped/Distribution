package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchRequiredStatusChecksResponse extends js.Object {
  var contexts: js.Array[java.lang.String]
  var contexts_url: java.lang.String
  var strict: scala.Boolean
  var url: java.lang.String
}

object ReposGetProtectedBranchRequiredStatusChecksResponse {
  @scala.inline
  def apply(
    contexts: js.Array[java.lang.String],
    contexts_url: java.lang.String,
    strict: scala.Boolean,
    url: java.lang.String
  ): ReposGetProtectedBranchRequiredStatusChecksResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts, contexts_url = contexts_url, strict = strict, url = url)
  
    __obj.asInstanceOf[ReposGetProtectedBranchRequiredStatusChecksResponse]
  }
}

