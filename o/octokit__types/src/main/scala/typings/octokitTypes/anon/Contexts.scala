package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contexts extends js.Object {
  var contexts: js.Array[String] = js.native
  var enforcement_level: String = js.native
}

object Contexts {
  @scala.inline
  def apply(contexts: js.Array[String], enforcement_level: String): Contexts = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], enforcement_level = enforcement_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
  @scala.inline
  implicit class ContextsOps[Self <: Contexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnforcement_level(value: String): Self = this.set("enforcement_level", value.asInstanceOf[js.Any])
  }
  
}

