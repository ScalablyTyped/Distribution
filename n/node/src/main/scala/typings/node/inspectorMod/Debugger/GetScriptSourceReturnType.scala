package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptSourceReturnType extends js.Object {
  /**
    * Script source.
    */
  var scriptSource: java.lang.String
}

object GetScriptSourceReturnType {
  @scala.inline
  def apply(scriptSource: java.lang.String): GetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource)
  
    __obj.asInstanceOf[GetScriptSourceReturnType]
  }
}

