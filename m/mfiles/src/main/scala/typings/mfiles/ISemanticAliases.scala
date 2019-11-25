package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticAliases extends js.Object {
  var Value: String
  def Clone(): ISemanticAliases
}

object ISemanticAliases {
  @scala.inline
  def apply(Clone: () => ISemanticAliases, Value: String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISemanticAliases]
  }
}

