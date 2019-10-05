package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileScriptReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Id of the script.
    */
  var scriptId: js.UndefOr[ScriptId] = js.undefined
}

object CompileScriptReturnType {
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails = null, scriptId: ScriptId = null): CompileScriptReturnType = {
    val __obj = js.Dynamic.literal()
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId)
    __obj.asInstanceOf[CompileScriptReturnType]
  }
}

