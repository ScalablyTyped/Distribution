package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseProtectionRequiredStatusChecks extends js.Object {
  var contexts: js.Array[java.lang.String]
  var enforcement_level: java.lang.String
}

object ReposGetBranchResponseProtectionRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[java.lang.String], enforcement_level: java.lang.String): ReposGetBranchResponseProtectionRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts, enforcement_level = enforcement_level)
  
    __obj.asInstanceOf[ReposGetBranchResponseProtectionRequiredStatusChecks]
  }
}

