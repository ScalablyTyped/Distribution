package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stack entry for runtime errors and assertions.
  */
trait CallFrame extends js.Object {
  /**
    * JavaScript script column number (0-based).
    */
  var columnNumber: Double
  /**
    * JavaScript function name.
    */
  var functionName: String
  /**
    * JavaScript script line number (0-based).
    */
  var lineNumber: Double
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: String
}

object CallFrame {
  @scala.inline
  def apply(columnNumber: Double, functionName: String, lineNumber: Double, scriptId: ScriptId, url: String): CallFrame = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallFrame]
  }
}

