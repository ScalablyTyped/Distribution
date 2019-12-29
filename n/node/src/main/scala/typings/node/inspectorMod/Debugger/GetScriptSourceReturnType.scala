package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptSourceReturnType extends js.Object {
  /**
    * Script source.
    */
  var scriptSource: String
}

object GetScriptSourceReturnType {
  @scala.inline
  def apply(scriptSource: String): GetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetScriptSourceReturnType]
  }
}

