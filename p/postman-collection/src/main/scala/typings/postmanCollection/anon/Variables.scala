package typings.postmanCollection.anon

import typings.postmanCollection.mod.VariableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variables extends js.Object {
  var variables: VariableList = js.native
}

object Variables {
  @scala.inline
  def apply(variables: VariableList): Variables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
  @scala.inline
  implicit class VariablesOps[Self <: Variables] (val x: Self) extends AnyVal {
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
    def setVariables(value: VariableList): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

