package typings.orchestrator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dep extends js.Object {
  var dep: js.Array[String]
}

object Dep {
  @scala.inline
  def apply(dep: js.Array[String]): Dep = {
    val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dep]
  }
}

