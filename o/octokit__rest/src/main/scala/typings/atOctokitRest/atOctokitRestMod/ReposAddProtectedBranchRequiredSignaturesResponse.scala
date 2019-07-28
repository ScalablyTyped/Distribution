package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchRequiredSignaturesResponse extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposAddProtectedBranchRequiredSignaturesResponse {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposAddProtectedBranchRequiredSignaturesResponse = {
    val __obj = js.Dynamic.literal(enabled = enabled, url = url)
  
    __obj.asInstanceOf[ReposAddProtectedBranchRequiredSignaturesResponse]
  }
}

