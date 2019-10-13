package typings.objectDashAssignDashDeep.objectDashAssignDashDeepMod

import typings.objectDashAssignDashDeep.objectDashAssignDashDeepStrings.merge
import typings.objectDashAssignDashDeep.objectDashAssignDashDeepStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayBehaviour: replace | merge
}

object Options {
  @scala.inline
  def apply(arrayBehaviour: replace | merge): Options = {
    val __obj = js.Dynamic.literal(arrayBehaviour = arrayBehaviour.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

