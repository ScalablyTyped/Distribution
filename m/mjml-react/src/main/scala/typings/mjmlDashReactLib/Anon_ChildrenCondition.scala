package typings
package mjmlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenCondition extends js.Object {
  var children: java.lang.String
  var condition: java.lang.String
}

object Anon_ChildrenCondition {
  @scala.inline
  def apply(children: java.lang.String, condition: java.lang.String): Anon_ChildrenCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("condition")(condition)
    __obj.asInstanceOf[Anon_ChildrenCondition]
  }
}

