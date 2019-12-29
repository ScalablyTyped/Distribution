package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalLexicalScopeNamesReturnType extends js.Object {
  var names: js.Array[String]
}

object GlobalLexicalScopeNamesReturnType {
  @scala.inline
  def apply(names: js.Array[String]): GlobalLexicalScopeNamesReturnType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalLexicalScopeNamesReturnType]
  }
}

