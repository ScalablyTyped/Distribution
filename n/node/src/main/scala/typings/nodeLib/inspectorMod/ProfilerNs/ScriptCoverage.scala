package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a JavaScript script.
  */
trait ScriptCoverage extends js.Object {
  /**
    * Functions contained in the script that has coverage data.
    */
  var functions: js.Array[FunctionCoverage]
  /**
    * JavaScript script id.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object ScriptCoverage {
  @scala.inline
  def apply(
    functions: js.Array[FunctionCoverage],
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    url: java.lang.String
  ): ScriptCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("functions")(functions)
    __obj.updateDynamic("scriptId")(scriptId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ScriptCoverage]
  }
}

