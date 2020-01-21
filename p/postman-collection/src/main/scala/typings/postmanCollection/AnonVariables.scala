package typings.postmanCollection

import typings.postmanCollection.mod.VariableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVariables extends js.Object {
  var variables: VariableList
}

object AnonVariables {
  @scala.inline
  def apply(variables: VariableList): AnonVariables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVariables]
  }
}

