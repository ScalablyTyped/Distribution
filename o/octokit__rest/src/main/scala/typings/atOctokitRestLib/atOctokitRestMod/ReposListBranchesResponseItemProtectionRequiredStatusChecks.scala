package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesResponseItemProtectionRequiredStatusChecks extends js.Object {
  var contexts: js.Array[java.lang.String]
  var enforcement_level: java.lang.String
}

object ReposListBranchesResponseItemProtectionRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[java.lang.String], enforcement_level: java.lang.String): ReposListBranchesResponseItemProtectionRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts, enforcement_level = enforcement_level)
  
    __obj.asInstanceOf[ReposListBranchesResponseItemProtectionRequiredStatusChecks]
  }
}

