package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPingHookParams extends js.Object {
  var hook_id: scala.Double
  var org: java.lang.String
}

object OrgsPingHookParams {
  @scala.inline
  def apply(hook_id: scala.Double, org: java.lang.String): OrgsPingHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, org = org)
  
    __obj.asInstanceOf[OrgsPingHookParams]
  }
}

