package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItemProtectionRequiredStatusChecks extends js.Object {
  var contexts: js.Array[String]
  var enforcement_level: String
}

object ReposListBranchesResponseItemProtectionRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], enforcement_level: String): ReposListBranchesResponseItemProtectionRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts, enforcement_level = enforcement_level)
  
    __obj.asInstanceOf[ReposListBranchesResponseItemProtectionRequiredStatusChecks]
  }
}

