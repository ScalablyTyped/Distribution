package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetProtectedBranchRequiredSignaturesResponse extends js.Object {
  var enabled: Boolean
  var url: String
}

object ReposGetProtectedBranchRequiredSignaturesResponse {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetProtectedBranchRequiredSignaturesResponse = {
    val __obj = js.Dynamic.literal(enabled = enabled, url = url)
  
    __obj.asInstanceOf[ReposGetProtectedBranchRequiredSignaturesResponse]
  }
}

