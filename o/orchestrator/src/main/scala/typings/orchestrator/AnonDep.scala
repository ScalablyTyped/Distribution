package typings.orchestrator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDep extends js.Object {
  var dep: js.Array[String]
}

object AnonDep {
  @scala.inline
  def apply(dep: js.Array[String]): AnonDep = {
    val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDep]
  }
}

